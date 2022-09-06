package myutil;

public class Save {
	
	private String name;				//저축자이름
	private int money;					//저축금액
	
	public static double rate = 0.1;	//저축 이율
	
	public Save() {
		
	}

	public Save(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void display() {
		System.out.printf("이름:%s 저축액:%d 이자:%.0f\n", name, money, money*rate);	//%.0f=실수긴 한데 소수점 안찍기
	}
	
}
