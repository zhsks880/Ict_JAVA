package mymain;

import java.util.Scanner;

public class Q2_teacher {

	public static void main(String[] args) {
		int su1, su2;
		String op;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� + - * / �� 1���� �����ڸ� �Է��ϼ���>>");
		su1 = scanner.nextInt();
		su2 = scanner.nextInt();
		op = scanner.next();
		
		if((op.equals("%") || op.equals("/")) && su2==0)
		{
			System.out.println("�Ҵ��Դϴ�(0���� ������ �����ϴ�)");
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
				System.out.printf("%d %% %d = %d\n", su1, su2, su1%su2);	//������ ���굵 �߰��غ�
		}
		
		scanner.close();
	}

}
