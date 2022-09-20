package api.io.buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedQuiz02 {

	public static void main(String[] args) {
		/*
	       1. Date클래스를 이용해서 file폴더 내에 하위 경로로
	        오늘 날짜 20211111file 이라는 이름으로 "폴더"
	        를 생성하세요.
	       2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
	       3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
	        파일을 작성합니다. 
	        (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
	         연결해 주시면 됩니다.)
	       4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
	        파일을 읽어서 콘솔에 출력해 보세요.
	       */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		File file = new File("c:/Work/file/" + today + "file1");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더생성완료");
		}else {
			System.out.println("해당 폴더 이미 존재");
		}
		
		Scanner sc = new Scanner(System.in);
		String fileName;
		System.out.print("파일명 입력: ");
		fileName = sc.next();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/Work/file/" + today+ "file1/" + fileName + ".txt");
			bw = new BufferedWriter(fw);
			System.out.println("'stop'이라고 하면 중지합니다.");
			
			while(true) {
				System.out.print("문장입력: ");
				String str1 = sc.nextLine();
				String stop;
				if(str1.equals("stop")) {
					System.out.println("종료됩니다");
					break;
				}
				str1 += "\r\n";
				bw.write(str1);
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			};
		}
		
		
	}

}
