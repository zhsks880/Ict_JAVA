package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedQuiz02_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		File file = new File("c:/Work/file/" + today + "file");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더생성완료");
		}
		
		BufferedWriter bw = null;
		String str = null;
		
		System.out.println("파일명을 입력하세요: ");
		String name = sc.nextLine();
		
		try {
			bw = new BufferedWriter(new FileWriter("c:/Work/file/" + today+ "file/" + name + ".txt"));
			System.out.println("'그만' 이라고 입력하면 중지합니다.");
			
			while(true) {
				System.out.print("하실 말씀: ");
				String text = sc.nextLine();
				
				if(text.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}
				text += "\r\n";
				bw.write(text);
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/////////////////////////

		
		
		
			
		}
		
		
		
		
	}

