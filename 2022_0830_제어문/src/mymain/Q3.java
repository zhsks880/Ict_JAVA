package mymain;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String ch;
		String result = "";
		
		System.out.print("���� �Ѱ��� �Է��ϼ���.>> ");
		ch = scanner.next();
		
		if (ch.equals("a") || ch.equals("A")) {
			System.out.printf("%s�� ����� America", ch);
		}else if(ch.equals("b") || ch.equals("B")) {
			System.out.printf("%s�� ����� Brazil", ch);
		}else if(ch.equals("c") || ch.equals("C")) {
			System.out.printf("%s�� ����� Canada", ch);
		}
		
		scanner.close();
		
		
	}

}
