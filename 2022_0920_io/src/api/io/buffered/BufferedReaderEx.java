package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("c:/Work/file/test.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader 에는 readline() 메서드가 있고,
			//한 중를 통째로 읽어서 String 으로 리턴해 줍니다.
			
//			System.out.println(br.readLine());	//한줄씩 읽어오는 방식
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());	//txt파일 안에 3번째 줄 글 없어서 null 뜸
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
