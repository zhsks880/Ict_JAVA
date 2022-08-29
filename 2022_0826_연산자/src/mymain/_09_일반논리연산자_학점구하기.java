package mymain;

import java.util.Scanner;

public class _09_일반논리연산자_학점구하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor;
		String grade="F";  //기본값 F 등급임
		
		System.out.print("국어점수입력: ");
		kor = scanner.nextInt();
		
		//A학점조건 : 90~100점 사이
		if(kor>=90 && kor<=100) grade ="A";
			
		//B학점조건 : 80~89점 사이
		if(kor>=80 && kor<=89) grade ="B";
		
		if(kor>=70 && kor<=79) grade ="C";
		if(kor>=60 && kor<=69) grade ="D";

		
		System.out.printf("니놈의 학점은[%d]점이고\n등급은[%s]\n", kor, grade);
					
		scanner.close();
		
		
	}

}
