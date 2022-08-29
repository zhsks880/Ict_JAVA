package mymain;

public class _11_대입연산자 {

	public static void main(String[] args) {
		//대입연산자 : =
		//복합대입연산자 : += -= *= /= %= %= >>= <<= >>>= <<<= &=
		
		int n = 10;
		
		n++; //자기자신을 1증가 : n = n + 1
		n += 5;   // 같은 거임 n = n + 5;  <<편한걸로 쓰세요~
		n *= 2;
		System.out.println(n);
		
		n -= 6;  // n = n - 6;
		n *= 2; //  n = n * 2;
		n = 1 + 3 - 1 + 5 ;
		
		//단항연산자
		boolean b0k = !(3>2);
		//대입연산자
		int a,b,c,d;
		a = b = c = d = 0;  //  순서가 <======이렇게~
	}

}
