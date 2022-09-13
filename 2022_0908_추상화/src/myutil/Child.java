package myutil;

public class Child extends Parent{
	
	//@어노테이션: 프로그램의 주석, jvm 에게 이게 뭐라는건지 알려주는것, 견출지 역활
	@Override
	public void sub() {
		System.out.println("=====Child.sub() call====");
	}
	
}
