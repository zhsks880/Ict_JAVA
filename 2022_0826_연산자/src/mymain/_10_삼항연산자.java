package mymain;

public class _10_삼항연산자 {

	public static void main(String[] args) {
		//(조건) ? 참일때값 : 거짓일때값
		
		//2가지 수 중 큰수 구하기
		int a = 10 , b = 5, c;
		c = (a > b) ? a : b;
		System.out.printf("%d 와(과) %d중 큰수는 %d입니다\n", a,b,c);
		
		//절대값 구하기
		int n = -100;
		int m = ( n < 0 ) ? -n : n;
		System.out.printf("|%d| => %d\n", n,m);
		
		//절대값 구하기 if~else
		if (n <0) 
			m=-n;
		else
			m=n;
		
		// 처리속도
		// 3항연산자 < 제어문(if)
		
	}

}
