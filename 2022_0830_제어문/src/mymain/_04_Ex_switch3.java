package mymain;

import java.util.Scanner;

public class _04_Ex_switch3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor;
		String grade;
		System.out.print("����: ");
		kor = scanner.nextInt();
		
		
		if(kor>=0 && kor<=100) {
			switch(kor / 10) { // ������ �����°Ŷ� 93/10=9�� ������. 83/10=8�̷���~
				case 10: 
				case 9:	grade = "A"; break;
				case 8: grade = "B";	break;
				case 7: grade = "C";	break;
				case 6: grade = "D";	break;
				default: grade = "F";
			}
			System.out.printf("����:%d ���:%s\n", kor, grade);
		
		}else {
			System.out.println("0~100�������� �Է��ϼ���~");
		}
		scanner.close();
		
	}

}
