package myutil;

public class MyDate2 {
	
	//����ȭ(data hiding): ���������� private�� �̿��ؼ�
	private int year;
	private int month;
	private int day;
	
	//�⺻������
	public MyDate2() {
	
	}
	
	//�����ε� �� ������
	public MyDate2(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//��Ʈ + ����Ʈ + s = �ڵ��ڵ����� ����Ű
	
	//Getter , Setter �� ������
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
