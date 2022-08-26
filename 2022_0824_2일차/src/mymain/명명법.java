package mymain;

class A {

	// 내부클래스 표시가 될때 A$B.class 로 저장되어 $<애는 사용가능~
	class B {

	}
}

public class 명명법 {
	public static void main(String[] args) { // main + ctrl+space 하면 메인 메소드 바로 불러와짐
		System.out.println("------------[명명법]------------");
		System.out.println("1.식별자(변수/클래스/메소드/상수)의 이름을 부여하는 방법");
		System.out.println("2.숫자로 시작하면 안된다.");
		// int kor1; (O)
		// int 1kor; (X)
		System.out.println("3.중간에 공백띄우면 안된다.");
		// int kor 1; (X)
		System.out.println("4.특수문자 사용하면 안된다.(단, _와$는 예외");
		System.out.println("  특수문자:키보드에서 숫자/영문자(한글)을 제외한 문자");
		// int pay*; (X)
		// int you&i = 10;(X)
		// int ___ = 10; (O)
		// int $$$ = 100; (O)
		System.out.println("5.예약어(keyword) 사용 못한다");
		// int public; (X)
		// int static; (X)

		// 명명법 표기법
		// 1.Pascal표기법 : 대문자로 시작/ 2개이상의 단어가 조합되면 매 단어 첫글자는 대문자로 표현
		// class MyProfile : My + Profile
		// class MyProfileInfo : My + Profile + Info
		// 2.Camel표기법 : 소문자로 시작/ 2개이상의 단어가 조합되면 매 단어 첫글자는 대문자로 표현
		// String familyName; : family + Name
		// int myYearPay : my + Year + Pay
		// 3.Snake표기법 : 2개이상의 단어가 조합되면 각 단어의 연결을 _ 한다
		// String family_name; : family + name
		// int my_year_pay; : my + year + pay

		// 4.Hungarian표기법 : 자바에서는 거의 안쓰인다
		// int nPay; //숫자형변수(number)
		// int pPoint; //주소변수 (point)
		// boolean b0k; //논리형변수에서 가끔 씀
		System.out.println();
		System.out.println("------------[클래스명 명명법(권고)]------------");
		System.out.println("1.Pascal표기법을 사용한다");
		System.out.println();
		System.out.println("------------[변수명/메소드명 명명법(권고)]------------");
		System.out.println("1.Camel표기법을 사용한다");
		System.out.println("2.Snake표기법을 사용한다");
		System.out.println();
		System.out.println("------------[상수 명명법(권고)]------------");
		System.out.println("1.모두 대문자로 표현");
		System.out.println("2.Snake표기법을 사용한다");
		// final double PI = 3.14; //변수에 final 앞에 달면 상수로 변경이 됨
		// PI = 3.141592;
		// System.out.println(Byte.MAX_VALUE);
		
		
		/*
		 * System.out.println(); float f = 112345.67890123456789F; double d =
		 * 112345.67890123456789;
		 * 
		 * 
		 * System.out.printf("[%.20f]\n", f); System.out.printf("[%.20f]\n", d);
		 */

	}
}
