package mymain;

import java.util.Scanner;

public class _07_일반논리연산자2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.print("나이를입력하시오 :");
		age= scanner.nextInt();
		
		//성년의 조건(나이>=20)
		if(age>=20)
			System.out.println("성년입니다:" + age + "살");
		else 
			System.out.println("미성년입니다" + age + "살");
			System.out.println();
		
		int su = 3;
		//짝수냐? 홀수냐?
		if (su%2==0)
			System.out.printf("[%d]는(은) 짝수\n", su);
		else
			System.out.printf("[%d]는(은) 홀수\n", su);
		//3의배수냐?
		if (su%3==0)
			System.out.printf("[%d]은(는) 3의배수\n", su);
		else
			System.out.printf("[%d]은(는) 3의배수가 아닙니다\n", su);
		//2와 3의 배수냐?
		//조건1: 2의배수
		//조건2: 3의배수
		//if(조건1 %% 조건2)
		if (su%2==0 && su%3==0)
			System.out.printf("[%d]은(는) 2와 3의 배수 입니다\n", su);
		else
			System.out.printf("[%d]은(는) 2와 3의 배수가 아닙니다\n", su);
		//2또는 3의 배수냐?
		//조건1: 2의배수
		//조건2: 3의배수
		//if(조건1 || 조건2)
		if(su%2==0 || su%3==0)
			System.out.printf("[%d]는 2또는 3의 배수입니다\n", su);
		else
			System.out.printf("[%d]는 2또는 3의 배수가 아닙니다\n", su);
		

	}
}
