package mymain;

public class _02_정수형자료형 {

	public static void main(String[] args) {
		//정수(소수점이 없는 수) : byte short int(기본형) long
		//상수 : 0(int)	0L(long)
		//출력서식: %d(10진수decimal) %o(8진수octal) %x(16진수hexa)
		//	16진수 값의 표현 :0 ~ 9 까지는 숫자로 표현하고 10부터는 a,b,c,d,e
		//					  0x64 (Zero X붙인다)
		//	8진수 값의 표현 : 0144(앞에 0을 붙인다)
		
		int n = 100;
		System.out.printf("Decimal:%d\n",n);
		System.out.printf("Oct:0%o\n",n); // 10진수값의 100을 8진수로 출력
		System.out.printf("Hex:0x%x\n",n); // 10진수값의 100을 16진수로 출력
		
		System.out.printf("0144(8진수의 100은)10진수의->%d\n", 0144);
		System.out.printf("0x64(16진수의 100은)10진수의->%d\n", 0x64);
		
		//2진수 출력
		n=1990;
		System.out.println(Integer.toBinaryString(n));
		
	}

}
