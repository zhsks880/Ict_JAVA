package mymain;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String ch;
		String result = "";
		
		System.out.print("문자 한개를 입력하세요.>> ");
		ch = scanner.next();
		
		if (ch.equals("a") || ch.equals("A")) {
			System.out.printf("%s의 나라는 America", ch);
		}else if(ch.equals("b") || ch.equals("B")) {
			System.out.printf("%s의 나라는 Brazil", ch);
		}else if(ch.equals("c") || ch.equals("C")) {
			System.out.printf("%s의 나라는 Canada", ch);
		}
		
		scanner.close();
		
		
	}

}
