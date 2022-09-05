package myutil;

public class MyDate {
	
	//�� �ȿ� �ִ� ���̵� �θ��� �ܾ��...�������� ���� ���ܾ�~
	//member ����
	//member field
	//member attribue
	//member property
	//Ŭ�������� ������(����)���� �ܺο��� ������� �ϸ� �ս��� ������ �����Ƿ�, private �� ��κ� ��(=����ȭ)
	
	//instance(��ü) ����: ��ü�� �����Ǹ� �����Ǵ� ����(new �� �ְ� ���鶧 �ν���Ʈȭ)
	//public 		int year;
	private 	int year;
	protected 	int month;
	private 	int day;
	    		int weekday;
	
	//MyDate class��� �޼ҵ�(void=��ȯ��(return ���� ���� �޼ҵ�)
	//setter method: �ܺΰ��� ���κ����� �ִ� �޼ҵ�(set + ���κ��������� ����~)
	//set + field�� (����:Camel)
	public void setYear(int y) {
		year = y;
		return;						//void �������� return �־ �ǰ� �ȳ־ ��(�Ϲ������� ����)
	}
	// call by value (ȣ���Ҷ� ���� �����ϴ°�)
	public void setMonth(int m) {
		month = m;
	}
	public void setDay(int d) {
		day = d;
	}
	public void setWeekday(int w) {
		weekday = w;
	}
	
	//���� ������ ���
	//getter method: ���ΰ��� �ܺη� �����ϴ� �޼ҵ�(get +  ���κ�����)
	//get + field�� (����:Camel)
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	// call by name(ȣ���Ҷ� �޼ҵ常 �����ϴ°�)
	public void display() {
		System.out.printf("%d-%02d-%02d\n", year, month, day);
	}
}
