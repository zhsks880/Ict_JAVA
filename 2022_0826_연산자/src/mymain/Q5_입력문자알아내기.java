package mymain;

import java.io.IOException;
import java.util.Scanner;

public class Q5_입력문자알아내기 {

	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		//변수선언
		char ch;
		String result ="";
		
		System.out.print("문자 1개를 입력하세요:");
		ch = (char) System.in.read();//scanner.next().charAt(0);
		
		//입력받은 문자가 대문자/소문자/숫자/탭/기타
		if(ch>='A' && ch<='Z')
			result ="대문자";
		else if (ch>='a' && ch<='z')
			result ="소문자";
		else if (ch=='\t' || ch==32 || ch=='\r' || ch=='\n')
			result ="화이트문자";
		else if (ch>='0' && ch<='9')
			result = "숫자";
		else result = "기타";
		
		System.out.printf("[%s] : %c\n", result, ch);
		
		
		//scanner.close();
		
		
	}

}
