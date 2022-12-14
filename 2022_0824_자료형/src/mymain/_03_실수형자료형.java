package mymain;

public class _03_실수형자료형 {

	public static void main(String[] args) {
        // 실수(소숫점이 있는수): float  double(기본형)
		// 상수    :  0.0 (double)  0.0F (float)
		// 출력서식:  %f(실수형식) : 소숫점이하 6자리까지 출력
		//            %e %E(지수형식) : 소숫점이하 6자리까지 출력 
		//            %g(일반형식) : 자릿수가 적은쪽으로 출력
		
		double d = 123.456;
		System.out.printf("%f\n", d);
		System.out.printf("%e\n", d);
		System.out.printf("%E\n", d);
		System.out.printf("%g\n", d);
		
		// %n.mf : n(전체자릿수) m(소숫점이하출력자릿수)
		
		System.out.printf("[%10.2f]\n", d);
		System.out.printf("[%010.2f]\n", d);
		System.out.printf("[%-10.2f]\n", d);
		
		//소숫점이하 자릿수는 우선지켜진다
		System.out.printf("[%3.1f]\n", d);
		System.out.printf("[%.1f]\n", d);
		
		System.out.println("---[실수형 범위]---");
		System.out.printf("float  : %e ~ %e\n", Float.MIN_VALUE,  Float.MAX_VALUE);
		System.out.printf("double : %e ~ %e\n", Double.MIN_VALUE, Double.MAX_VALUE);

		
	}

}
