package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BuffredQuiz01 {

	public static void main(String[] args) {
		
		String str = "안녕하세요. 요즘 날씨가 오락가락 하네요~\n 감기 조심하세요~ 안녕~!";
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd a hh:mm:ss");
		String today = sdf.format(date);
		System.out.println(today);
		
		/*
	       1. Date클래스와 SimpleDateFormat클래스를 활용하여
	        file 경로에 20220920.txt이름으로 파일을 씁니다.
	       2. 내용은 아무거나 작성하셔도 무방합니다.
	       3. 파일을 정상적으로 썼다면 BufferedReader를 통해
	        파일을 읽어들이세요.
	      */
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fw = new FileWriter("c:/Work/file/20220921.txt");
			bw = new BufferedWriter(fw);
			System.out.print("문장입력: ");
			String str1 = sc.nextLine();
			bw.write(str1);
			System.out.println("파일출력 완료");
			
		} catch (Exception e) {
		
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	///////////// 읽어오기
			try {
				fr = new FileReader("c:/Work/file/20220921.txt");
				br = new BufferedReader(fr);
				
				String str3;
				while((str3 = br.readLine()) != null) {
					System.out.println("==출력해보즈아==");
					System.out.println(str3);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
			
			
			
		}
		
		
		
		
			
		}

	}

