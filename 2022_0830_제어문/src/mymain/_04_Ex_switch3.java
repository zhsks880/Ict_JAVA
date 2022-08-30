package mymain;

import java.util.Scanner;

public class _04_Ex_switch3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor;
		String grade;
		System.out.print("국어: ");
		kor = scanner.nextInt();
		
		
		if(kor>=0 && kor<=100) {
			switch(kor / 10) { // 정수로 나누는거라 93/10=9만 떨어짐. 83/10=8이렇게~
				case 10: 
				case 9:	grade = "A"; break;
				case 8: grade = "B";	break;
				case 7: grade = "C";	break;
				case 6: grade = "D";	break;
				default: grade = "F";
			}
			System.out.printf("점수:%d 등급:%s\n", kor, grade);
		
		}else {
			System.out.println("0~100점까지만 입력하세요~");
		}
		scanner.close();
		
	}

}
