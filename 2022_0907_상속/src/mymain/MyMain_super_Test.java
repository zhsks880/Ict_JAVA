package mymain;

import myutil.Child;

public class MyMain_super_Test {
	
	/*
		super	: ����(�θ�)��ü�� ����
		super() : ����(�θ�)Ŭ����
	
	*/

	public static void main(String[] args) {
		
		Child c1 = new Child();			//ȣ������� �ʱ�ȭ ������ �ٸ���(�ƺ� ������������ض�~)
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
