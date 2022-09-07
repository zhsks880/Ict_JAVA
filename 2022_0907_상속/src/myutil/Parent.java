package myutil;

public class Parent {
	
	protected int p_money;

	public Parent() {
		super();	//Object()
		System.out.println("==Parent()==");
		p_money = 1000;
	}

	public Parent(int p_money) {
		super();
		System.out.println("==Parent(int)==");
		this.p_money = p_money;
	}
	
	
}
