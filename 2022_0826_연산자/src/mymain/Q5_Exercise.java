package mymain;

import java.util.Scanner;

public class Q5_Exercise {

	public static void main(String[] args) {
		//90~100���� A , 80~89:B, 70~79:C, 60~69:D, 59����:Fail
		
		Scanner scanner = new Scanner(System.in);
		
		int student;
		String grade = "";
		
		System.out.print("�����Է� : ");
		student = scanner.nextInt();
		
		if(student>=90 && student<=100)
			grade ="A";
			
			else if(student>=80 && student<=89)
				grade = "B";
			else if(student>=70 && student<=79)
				grade = "C";
			else if(student>=60 && student<=69)
				grade = "D";
			else grade = "FAIL";
		
		System.out.printf("����=[%d]\n���=[%s]\n", student, grade);
		scanner.close();
		
	}

}
