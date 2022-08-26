package mymain;

public class _04_관계연산자 {

	public static void main(String[] args) {
		//관계연산자:  >   >=  <   <=  ==   !=  (결과:boolean)
		
		int a =3, b=2;
		System.out.printf("%d > %d: %b\n", a, b, a>b);
		System.out.printf("%d < %d: %b\n", a, b, a<b);
		System.out.println();
		System.out.printf("%d >= %d: %b\n", a, b, a>=b);
		System.out.printf("%d <= %d: %b\n", a, b, a<=b);
		System.out.println();
		//  == 기본형자료형(숫자지 뭐~) 비교 시 사용(객체 비교시 사용하면 안됨)
		System.out.printf("%d == %d: %b\n", a, b, a==b);
		System.out.printf("%d != %d: %b\n", a, b, a!=b);
				
	}

}
