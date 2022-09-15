package mymain;

import java.io.FileReader;
import java.io.IOException;

public class _04_MyMain_finally {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {							//본코드영역
			fr = new FileReader("a.txt");
			
			while(true) {
				int ch = fr.read();
				if(ch==-1) break;		//파일의 끝이면 종료해라
				System.out.printf("%c", ch);
			}
			
		} catch (Exception e) {			//예외처리영역
			e.printStackTrace();
			
		}finally {						//정상 또는 예외와 상관없이 무조건 실행되는 영역(try catch 를 묶어주는 상징성)
			
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}//end-finally
		
		System.out.println("\n--정상종료--");
	}

}
