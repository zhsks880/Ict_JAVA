package myutil;

public class Child extends Parent{
	
	//@������̼�: ���α׷��� �ּ�, jvm ���� �̰� ����°��� �˷��ִ°�, ������ ��Ȱ
	@Override
	public void sub() {
		System.out.println("=====Child.sub() call====");
	}
	
}
