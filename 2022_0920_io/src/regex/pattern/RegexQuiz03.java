package regex.pattern;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
	       1. day, store, grade[], detail(등급에서 가격사이), price를 멤버로 갖는 
	       Product 클래스를 선언합니다.
	       2. 은닉(캡슐화)을 이용해서 클래스를 디자인합니다.
	       3. MainClass에 Product 타입을 갖는 ArrayList를 생성합니다.
	       4. BufferedReader를 통해서 건담.txt파일을 읽어들이세요.
	       (인코딩 방식 -> UTF-8)
	       5. while문 안에서는 readLine()메서드를 이용해서 
	        한 줄씩 읽도록 처리합니다.
	       6. 날짜, 지점, 등급, 상세, 가격 패턴 분석을 통해서 
	        Product에 저장후 리스트에 추가합니다.
	        상세 같은 경우에는 정규 표현식 패턴으로 구분하기 어려울 수 있기 때문에
	        등급패턴의 끝지점 ~ 가격패턴의 시작지점 미만까지 부분추출 하시는 것을
	        추천드립니다. (substring(begin, end))
	        
	        추출 완료 후 객체를 리스트에 담기가 완료된 후에
	        각 객체의 상세 내용을 출력해 주세요.
	        (Product의 toString을 이용해서 간단하게 출력해 주세요)
	        
	       7. 외부 라이브러리를 사용해서 분석한 패턴을 xlsx 엑셀 파일로
	        추출하시면 됩니다.
	        엑셀파일객체 생성 후에 FileOutputStream을 사용하여 
	        파일을 작성하시면 됩니다. (확장자는 xlsx)
	       */
		//substring(begin, end)
		//matcher를 이용해서 정규표현식 시작과 끝을 해서 등급끝나는곳+1 시작해서 가격의정규식 시작 전-1까지
		
		//리스트 선언
		List<Product> list = new ArrayList<>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/Work/건담.txt"),"UTF-8"));
			
			String line;
			
			//5번문제 해당하는것으로 while 문 안에 식을 채운 다음에 while을 씌우는 형식으로 처리
			while((line = br.readLine()) != null) {
				//정규표현식
				String pattern1 = "\\d{8}-\\d{2}-\\d{12,13}"; 	//날짜 패턴
				String pattern2 = "[가-힣]+ [가-힣]+";			//가게 패턴
				String pattern3 = "\\[[A-Z가-힣]*\\]";			//등급 패턴
				String pattern4 = "\\d+,*\\d+원";				//가격 패턴
				
				Matcher m1 = Pattern.compile(pattern1).matcher(line);
				Matcher m2 = Pattern.compile(pattern2).matcher(line);
				Matcher m3 = Pattern.compile(pattern3).matcher(line);
				Matcher m4 = Pattern.compile(pattern4).matcher(line);
				
				if(m1.find() && m2.find() && m3.find() && m4.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					//등급패턴의 끝지점+1~가격패턴의 시작지점-1
					String detail = line.substring(m3.end() + 1, m4.start() -1);	//detail 패턴
					String price = m4.group();
					
					//Product 객체를 사용해서 포장하기
					Product p = new Product(day, store, grade, detail, price);
					list.add(p);
					
					//위와 같지만 변수 선언 안하고 하는 방법
//					list.add(new Product(
//							m1.group(), 
//							m2.group(), 
//							m3.group(), 
//							line.substring(m3.end() + 1, m4.start() -1), 
//							m4.group()));
					
				}
			}	//end while
			
			//for문으로 출력해보기
//			for(Product p : list) {
//				System.out.println("------------------------------");
//				System.out.println(p);
//			}
			
			//위와 같은거 람다식으로 변형
			list.stream().forEach((data) -> {
				System.out.println("------------------------------");
				System.out.println(data);
			});
			
			excel(list);			//엑셀 메서드를 호출해서 엑셀 파일을 생성. 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		

	}	//end main
	
	//엑셀 출력 메서드(엑셀 출력시 람다식 저거 주석 처리 해야함)
	public static void excel(List<Product> list) {
		//워크북 생성
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//워크시트 생성
		XSSFSheet sheet = wb.createSheet("건담");
		
		//행 생성
		XSSFRow row = sheet.createRow(0);
		
		//셀 생성
		XSSFCell cell;
		
		//헤더 정보 구성
		cell = row.createCell(0);
		cell.setCellValue("날짜");
		
		cell = row.createCell(1);
		cell.setCellValue("지점");
		
		cell = row.createCell(2);
		cell.setCellValue("등급");
		
		cell = row.createCell(3);
		cell.setCellValue("상세");
		
		cell = row.createCell(4);
		cell.setCellValue("가격");
		
		//리스트의 size 만큼의 row를 생성
		Product vo;
		for(int i=0; i<list.size(); i++) {
			vo = list.get(i);
			//행생성
			row = sheet.createRow(i+1);
			//셀채우기
			cell = row.createCell(0);
			cell.setCellValue(vo.getDay());
			cell = row.createCell(1);
			cell.setCellValue(vo.getStore());
			cell = row.createCell(2);
			cell.setCellValue(vo.getGrade());
			cell = row.createCell(3);
			cell.setCellValue(vo.getDetail());
			cell = row.createCell(4);
			cell.setCellValue(vo.getPrice());
		}
		//파일 쓰기
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/Work/건담.xlsx");
			wb.write(fos);
			System.out.println("파일작성 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
