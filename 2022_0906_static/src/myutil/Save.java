package myutil;

public class Save {
	
	private String name;				//�������̸�
	private int money;					//����ݾ�
	
	public static double rate = 0.1;	//���� ����
	
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
		System.out.printf("�̸�:%s �����:%d ����:%.0f\n", name, money, money*rate);	//%.0f=�Ǽ��� �ѵ� �Ҽ��� �����
	}
	
}
