package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		/*
		# BUffered I/O
		- 버퍼를 이용해서 읽기/쓰기 성능을 향상시키는 클래스
		- 버퍼: 데이터를 입/출력 하기전에 임시로 저장해 두는 배열 형태의 공간
		
		# 버퍼을 이용해야 하는 이유
		- 버퍼를 사용하지 않으면 입/출력이 너무 자주 일어난다.
		ex) 
			"Java Programming"을 쓰는 경우
			->기본 OutputStream을 사용하면 한 글자씩 16번의 출력이 발생함.
			->배열 형태에 저장해 놓고 한번에 파일에 접근하여 작성하면 한번의 출력만으로 끝낼수 있다.
		*/
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/Work/file/test.txt");
			bw = new BufferedWriter(fw);
			
			System.out.print("첫 문장: ");
			String str1 = sc.nextLine();
			
			System.out.print("두번째 문장: ");
			String str2 = sc.nextLine();
			
			bw.write(str1 + "\r\n" + str2);
			System.out.println("파일 정상 출력 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
