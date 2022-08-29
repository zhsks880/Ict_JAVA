package mymain;

import java.util.Scanner;

public class Q3_체질량지수 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//변수
		double height;  //키
		double weight;  //몸무게
		double bmi;     //body mass index = 몸무게/키*키(m)
		String body_info="";
		
		System.out.printf("키/몸무게:");
		height = scanner.nextDouble();
		weight = scanner.nextDouble();
		double height_m = height / 100.0;  // cm->m 변환
		
		//1.bmi계산
		//bmi = weight / ((0.01*height) * (0.01*height));
		bmi = weight / (height_m * height_m);
		
		if(bmi<18.5) 
			body_info="저체중";
		else if(bmi>=18.5 && bmi<=22.9) // else if 문 안에서 실행이 한개라 {} <애가 필요없음 
			body_info="정상";
		else if(bmi>=23 && bmi<=25.0)
			body_info="과체중";
		else if(bmi>=25 && bmi<=29.9)
			body_info="1단계 비만";
		else if(bmi>=30 && bmi<=34.9) 
			body_info="2단계 비만";
		else if(bmi>35) 
			body_info="고도비만";
			
		System.out.printf("당신의 bmi는 [%.1f] 이며, 비만도결과는 [%s] 입니다.\n", bmi, body_info);
		
		scanner.close();
	}

}
