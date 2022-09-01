package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _09_Ex_while2 {

	public static void main(String[] args) throws Exception {
		//반복횟수를 모를때
		FileReader	fr = new FileReader("a.txt");
		
		int count = 0;
		int alpha_upper_count = 0;//대문자갯수
		int alpha_lower_count = 0;//소문자갯수
		int number_count = 0; //숫자갯수
		int white_char_count = 0; //화이트문자(공백 \r\n 탭)
		int etc_count=0; //특수문자
		
		//for(int i=0; i<38; i++)
		while(true)	//조건이 true라서 무한 loop
		{
			//파일로부터 1글자씩 읽어오는 코드
			int ch = fr.read();
			//파일의 끝이면 탈출해라(끝= -1)
			if(ch==-1) break;
			//대문자냐?
			if(ch>=65 && ch<=90) 				// 'A' 'Z' 해도됨
				alpha_upper_count++;
			//소문자냐?
			else if (ch>=65+32 && ch<=90+32)	// 'a' 'z' 해도됨
				alpha_lower_count++;
			//숫자냐?
			else if (ch>='0' && ch<='9')		// ' ' <표시 박아줘야 숫자 읽힘
				number_count++;
			//화이트문자냐?
			else if (ch=='\r' || ch=='\n' || ch==32 || ch=='\t' || ch==' ')
				white_char_count++;
			//기타
			else
				etc_count++;
			//txt파일을 모두다 읽어오는 명령어
			System.out.printf("%c", ch);
			count++;
		}
		System.out.println();
		System.out.println("★★★★★★★★★[글자수를 세어보자]★★★★★★★★★");
		System.out.printf("총글자수:%d(개)\n", count);
		System.out.printf("대문자:%d(개)\n", alpha_upper_count);
		System.out.printf("소문자:%d(개)\n", alpha_lower_count);
		System.out.printf("숫  자:%d(개)\n", number_count);
		System.out.printf("화이트:%d(개)\n", white_char_count);
		System.out.printf("기  타:%d(개)\n", etc_count);
		
		fr.close();
				
	}

}
