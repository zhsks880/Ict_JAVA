package mymain;

import myutil.Child;

public class MyMain_super_Test {
	
	/*
		super	: 조상(부모)객체의 대명사
		super() : 조상(부모)클래스
	
	*/

	public static void main(String[] args) {
		
		Child c1 = new Child();			//호출순서와 초기화 순서는 다르다(아빠 밥먹으러오라해라~)
		c1.display();
		System.out.println("----------------------");
		Child c2 = new Child(2000);
		c2.display();
		System.out.println("----------------------");
		Child c3 = new Child(5000, 8000);
		c3.display();
		System.out.println("----------------------");
		
	}

}
