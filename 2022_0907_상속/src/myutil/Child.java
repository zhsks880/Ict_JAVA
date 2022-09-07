package myutil;

public class Child extends Parent {
	
	int c_money;

	public Child() {
		super();
		System.out.println("--Child()--");
		c_money = 1500;
	}
	public Child(int c_money) {
		super();
		System.out.println("--Child(int)--");
		this.c_money = c_money;
		
	}
	public Child(int p_money, int c_money) {
		super(p_money);
		System.out.println("--Child(int, int)--");
		this.c_money = c_money;
	}
	public void display() {
		System.out.printf("¾Æ¹öÁöµ·:%d\n", p_money);
		System.out.printf("³»   µ·:%d\n", c_money);
		System.out.printf("ÃÑ   µ·:%d\n", p_money + c_money);
	}
	
	
}
