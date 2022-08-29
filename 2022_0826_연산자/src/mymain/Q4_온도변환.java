package mymain;

import java.util.Scanner;

public class Q4_온도변환 {

	public static void main(String[] args) {
		//섭씨(C) <-> 화씨(F)
		
		//F공식: F=9/5*(C+32)
		//C공식: C=5/9*(F-32)
		//섭씨 몇도는 화씨 몇도 입니다. 화씨 몇도는 섭씨 몇도 입니다.
		
		//변수선언100
		double temp_c;
		double temp_f;
		
		double result_tem_f;
		double result_tem_c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("섭씨/화씨:");
		temp_c = scanner.nextDouble();
		temp_f = scanner.nextDouble();
		
		result_tem_f = (temp_c * 9/5) + 32;
		//result_tem_f = 9/5*temp_c + 32;  이건 틀린답.연산순서에 의해서 9/5부터 시작함
		//result_tem_f = 9.0/5.0*temp_c + 32.0; 으로 적어야지 정답됨(자료형 계산을 조심해라) int 와 double 을 항시 조심
		result_tem_c = (temp_f - 32) * 5/9;
		//result_temp_c = 5.0/9.0*(temp_f-32.); 으로 적어야지 정답
		System.out.printf("입력한 섭씨[%.2f(C)]를 화씨로 변환하면[%.2f(F)]\n입력한 화씨[%.2f(F)를 섭씨로 변환하면[%.2f(C)]\n", temp_c, result_tem_f, temp_f, result_tem_c);
		
		
		
		
		
		
		scanner.close();
		
		
	}

}
