package mymain;

import java.util.Scanner;

public class Q2_teacher {

	public static void main(String[] args) {
		int su1, su2;
		String op;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두정수와 + - * / 중 1개의 연산자를 입력하세요>>");
		su1 = scanner.nextInt();
		su2 = scanner.nextInt();
		op = scanner.next();
		
		if((op.equals("%") || op.equals("/")) && su2==0)
		{
			System.out.println("불능입니다(0으로 나눌수 없습니다)");
		}else {
			if(op.equals("+"))
				System.out.printf("%d + %d = %d\n", su1, su2, su1+su2);
			else if(op.equals("-"))
				System.out.printf("%d - %d = %d\n", su1, su2, su1-su2);
			else if(op.equals("*"))
				System.out.printf("%d * %d = %d\n", su1, su2, su1*su2);
			else if(op.equals("/"))
				System.out.printf("%d / %d = %d\n", su1, su2, su1/su2);
			else if(op.equals("%"))
				System.out.printf("%d %% %d = %d\n", su1, su2, su1%su2);	//나머지 연산도 추가해봄
		}
		
		scanner.close();
	}

}
