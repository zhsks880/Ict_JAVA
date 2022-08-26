package mymain;

public class _01_단항연산자 {

	public static void main(String[] args) {
	//단항연산자 : ~ ! ++ -- (cast) -(부호)
	//=> 연산에 참여하는 항이 1개 인 연산자
	
	// ~ (tield) : 이진논리Not연산자(1의보수)
	
	System.out.println("★★★★★★★[이진논리Not연산자에대한예제]★★★★★★★");
	int n = 10;
	// Integer.toBinaryString(정수) : 해당정수의 값을 2진수의 문자열(String) 반환
	System.out.printf("[%32s]\n",Integer.toBinaryString(n));
	System.out.printf("[%32s]\n",Integer.toBinaryString(~n));
	System.out.println();
	
	System.out.println("★★★★★★★[일반논리Not연산자]★★★★★★★");
	// ! : 일반논리Not연산자 : 결과값은 boolean
	boolean b0k = !(3>2);
	
	System.out.printf("!(3>2) : %b\n", b0k);
	
	System.out.printf("!true : %b\n", !true);
	System.out.printf("!false : %b\n", !false);
	System.out.println();
	
	System.out.println("★★★★★★★[증감(++/==)연산자]★★★★★★★");
	//증감연산자 : ++(증가)  --(감소)
	// ++변수 (전위형)
	// 변수++ (후위형)
	
	int m = 10;
	System.out.printf("m=%d\n", m);
	//전위/후위형은 단독으로 사용될때 의미 없다.
	m++; // m=m+1 과 동일함 (자신을 1증가)
	System.out.printf("m++의 결과 m=%d\n", m);
	--m; // m=m-1 과 동일함 (자신을 1감소)
	System.out.printf("--m의 결과 m=%d\n", m);
	
	//전위형과 후위형의 의미가 있는 공식
	//전위형: 모든연산에 앞서서 제일 먼저 연산된다
	//후위형: 모든연산이 종료된 후에 제일 마지막에 연산된다
	
	int x = 10;
	int y = 5;
	int z = ++x + y--;
	
	//1) ++x -> 11
	//2) z=x+y ->16
	//3) y-- ->15
	System.out.printf("x=%d y=%d z=%d\n", x, y, z);
	System.out.println();
	
	System.out.println("★★★★★★★[부호연산자]★★★★★★★");
	//부호연산자: 값앞에다가 - 붙히기 => (-1) * 값
	int a = 10;
	System.out.printf("%d =>부호변경 : %d\n", a, -a);
	System.out.println();
	
	System.out.println("★★★★★★★[cast연산자]★★★★★★★");
	//cast연산자: (자료형) 값
	
	/* 
	 형변환
	 	1.자동형변환(프로모션)
	 		A)대입시 : 좌변항에 맞추어진다(단, 좌변항이 클 경우)
	 		cf)초기화: 변수선언과 동시에 값을 대입
	 		int a;
	 			a   =    10;
	 		(좌변항)  (우변항)
	 		
	 		B)연산시 : 자료형 큰쪽으로 맞춰서 연산
	 		
	 	2.강제형변환(cast연산자) : 디모션
	  		(자료형)값
	  		큰자료형을 작은 자료형으로 바꿀때
	 */
	
	
	//A)대입시 자동형변환
	double d;
	d = 1;  // 원칙적으로는 double = int (x) 자동현변환으로 인하여 1) 1(int)->1.0(double) 2)d=1.0 으로 짜잔~
	
	//B)연산시 형변환
	d = 1 + 1.0;  // 1(int) + 1.0(double)(X)
	//               1.0(double) + 1.0(double) = 2.0 으로 짜잔
	
	/*
	 	int 형보다 작은걸로 더하면 무적권 int 로 값이 떨어진다
	 	그외는 형이 더 큰걸로 따라간다~
	 	byte + byte => int
	 	byte + short => int
	 	
	 	byte + int => int
	 	byte + long => long
	 	int + float => float
	 	int + double => double
	 
	 */
	
	//2.강제형변환
	byte b1 = 1, b2 =2, b3;
	b3 = (byte)(b1+b2);
	System.out.println(b3);
	
	short s1 = 1, s2 = 2, s3;
	s3 = (short) (s1 + s2);
	System.out.println(s3);
	
	float f = (float) 1.0;
	System.out.printf("홍길동 Code값: [%x][%x][%x]\n", (int)'홍', (int)'길', (int)'동');
	
	
	}

}
