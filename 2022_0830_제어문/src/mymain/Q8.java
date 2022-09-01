package mymain;

public class Q8 {

	public static void main(String[] args) {
		
		double pi = 0;
		int sign = 1; //부호정보담는 변수
		
		for(int i=0; i<1000000000; i++){			// i= 012345....돈다
			pi = pi + sign * (4.0/(2.0*i+1));	// sign 이란 변수를 토글방식으로 -,+를 설정한다/ 2.0*i+1=홀수구하는형식
			sign = -sign; 						// toggle방식 1 <-> -1
		}
		System.out.println(pi);					// 우리가 계산한 파이 값
		System.out.println(Math.PI);			// Math클래스에 있는 파이 원래 값
	}

}
