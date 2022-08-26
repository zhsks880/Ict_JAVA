package mymain;

public class _02_산술연산자 {

	public static void main(String[] args) {
		//산술연산자
		// *(곱)  /(몫)  %(나머지)
		//  +   -
		
		int a = 10, b=3;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		//   %를 문자로 인식시키려면 '%' %%표현한다
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		// "를 문자로 인식시키려면 \" (앞에 \) => '"'
		System.out.println("이 내용은 아주 \"중요한 메세지\" 입니다.");
		// \를 문자로 인식시키려면 \\ (앞에 \) => '\'
		System.out.println("C:\\Work");
		
		
		int x = 10;
		double y = 3.0;
		//몫연산자 : 정수/정수=>몫
		System.out.println(x / (int)y);  // 10.0 / 3.0
		System.out.println((int)(x / y)); // (int)(10.0/3.0)
		
		//나머지연산자
		System.out.println( x % y ); // 10 % 3.0
		System.out.println((int)( x % y) ); // (int)(10.0%3.0)
		
		// 3 % 10
		// 피젯수<젯수 => 피젯수 
		System.out.println( 3%10 );
		
		// 젯수가 0이면 연산 불가
		//System.out.println( 10 / 0 );
		//System.out.println( 10 % 0 );
	
	
	
		
		
		
	}

}
