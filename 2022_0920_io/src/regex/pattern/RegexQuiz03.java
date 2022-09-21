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
	       1. day, store, grade[], detail(��޿��� ���ݻ���), price�� ����� ���� 
	       Product Ŭ������ �����մϴ�.
	       2. ����(ĸ��ȭ)�� �̿��ؼ� Ŭ������ �������մϴ�.
	       3. MainClass�� Product Ÿ���� ���� ArrayList�� �����մϴ�.
	       4. BufferedReader�� ���ؼ� �Ǵ�.txt������ �о���̼���.
	       (���ڵ� ��� -> UTF-8)
	       5. while�� �ȿ����� readLine()�޼��带 �̿��ؼ� 
	        �� �پ� �е��� ó���մϴ�.
	       6. ��¥, ����, ���, ��, ���� ���� �м��� ���ؼ� 
	        Product�� ������ ����Ʈ�� �߰��մϴ�.
	        �� ���� ��쿡�� ���� ǥ���� �������� �����ϱ� ����� �� �ֱ� ������
	        ��������� ������ ~ ���������� �������� �̸����� �κ����� �Ͻô� ����
	        ��õ�帳�ϴ�. (substring(begin, end))
	        
	        ���� �Ϸ� �� ��ü�� ����Ʈ�� ��Ⱑ �Ϸ�� �Ŀ�
	        �� ��ü�� �� ������ ����� �ּ���.
	        (Product�� toString�� �̿��ؼ� �����ϰ� ����� �ּ���)
	        
	       7. �ܺ� ���̺귯���� ����ؼ� �м��� ������ xlsx ���� ���Ϸ�
	        �����Ͻø� �˴ϴ�.
	        �������ϰ�ü ���� �Ŀ� FileOutputStream�� ����Ͽ� 
	        ������ �ۼ��Ͻø� �˴ϴ�. (Ȯ���ڴ� xlsx)
	       */
		//substring(begin, end)
		//matcher�� �̿��ؼ� ����ǥ���� ���۰� ���� �ؼ� ��޳����°�+1 �����ؼ� ���������Խ� ���� ��-1����
		
		//����Ʈ ����
		List<Product> list = new ArrayList<>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/Work/�Ǵ�.txt"),"UTF-8"));
			
			String line;
			
			//5������ �ش��ϴ°����� while �� �ȿ� ���� ä�� ������ while�� ����� �������� ó��
			while((line = br.readLine()) != null) {
				//����ǥ����
				String pattern1 = "\\d{8}-\\d{2}-\\d{12,13}"; 	//��¥ ����
				String pattern2 = "[��-�R]+ [��-�R]+";			//���� ����
				String pattern3 = "\\[[A-Z��-�R]*\\]";			//��� ����
				String pattern4 = "\\d+,*\\d+��";				//���� ����
				
				Matcher m1 = Pattern.compile(pattern1).matcher(line);
				Matcher m2 = Pattern.compile(pattern2).matcher(line);
				Matcher m3 = Pattern.compile(pattern3).matcher(line);
				Matcher m4 = Pattern.compile(pattern4).matcher(line);
				
				if(m1.find() && m2.find() && m3.find() && m4.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					//��������� ������+1~���������� ��������-1
					String detail = line.substring(m3.end() + 1, m4.start() -1);	//detail ����
					String price = m4.group();
					
					//Product ��ü�� ����ؼ� �����ϱ�
					Product p = new Product(day, store, grade, detail, price);
					list.add(p);
					
					//���� ������ ���� ���� ���ϰ� �ϴ� ���
//					list.add(new Product(
//							m1.group(), 
//							m2.group(), 
//							m3.group(), 
//							line.substring(m3.end() + 1, m4.start() -1), 
//							m4.group()));
					
				}
			}	//end while
			
			//for������ ����غ���
//			for(Product p : list) {
//				System.out.println("------------------------------");
//				System.out.println(p);
//			}
			
			//���� ������ ���ٽ����� ����
			list.stream().forEach((data) -> {
				System.out.println("------------------------------");
				System.out.println(data);
			});
			
			excel(list);			//���� �޼��带 ȣ���ؼ� ���� ������ ����. 
			
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
	
	//���� ��� �޼���(���� ��½� ���ٽ� ���� �ּ� ó�� �ؾ���)
	public static void excel(List<Product> list) {
		//��ũ�� ����
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//��ũ��Ʈ ����
		XSSFSheet sheet = wb.createSheet("�Ǵ�");
		
		//�� ����
		XSSFRow row = sheet.createRow(0);
		
		//�� ����
		XSSFCell cell;
		
		//��� ���� ����
		cell = row.createCell(0);
		cell.setCellValue("��¥");
		
		cell = row.createCell(1);
		cell.setCellValue("����");
		
		cell = row.createCell(2);
		cell.setCellValue("���");
		
		cell = row.createCell(3);
		cell.setCellValue("��");
		
		cell = row.createCell(4);
		cell.setCellValue("����");
		
		//����Ʈ�� size ��ŭ�� row�� ����
		Product vo;
		for(int i=0; i<list.size(); i++) {
			vo = list.get(i);
			//�����
			row = sheet.createRow(i+1);
			//��ä���
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
		//���� ����
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/Work/�Ǵ�.xlsx");
			wb.write(fos);
			System.out.println("�����ۼ� �Ϸ�");
			
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
