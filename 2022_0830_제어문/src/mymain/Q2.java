package mymain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		int result = 0;
		String yunsan;
		
		System.out.printf("두 정수와 +,-,*,/ 중 하나의 연산자를 입력하세요>>");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		yunsan = scanner.next();
		
			if(yunsan.equals("+")) {
				result = num1 + num2;
				System.out.printf("%d + %d = %d\n", num1, num2, result);
			
			}else if(yunsan.equals("-")) {
				result = num1 - num2;
				System.out.printf("%d - %d = %d\n", num1, num2, result);
				
			}else if(yunsan.equals("*")) {
				result = num1 * num2;
				System.out.printf("%d * %d = %d\n", num1, num2, result);
			
			}else if((num2==0) || (yunsan.equals("/"))) {
				result = num1 / num2;
				System.out.printf("%d / %d = %d\n", num1, num2, result);
			}		
		scanner.close();
		
		
	}

}
