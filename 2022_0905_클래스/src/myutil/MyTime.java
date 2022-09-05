package myutil;

import java.util.Calendar;

public class MyTime {
	
	//������(�޼ҵ�) : Constructor Method
	//1.��ü�� ������ �� �ʱ�ȭ �������� ���Ǵ� �޼ҵ�
	//2.�ڽ��� ������ �Ϲ������� �ʱ�ȭ
	//3.�� 1ȸ �ڵ�ȣ��
	//4.Method Overload(�ߺ��޼ҵ�)�� �����ϴ�
	//5.�����ڸ޼ҵ����� : ��ȯ���� ����/ Ŭ������()�� ������ �޼ҵ���� ����
	//6.������ ���������ϴ� (�������� �� JVM�� �ڵ������ؼ� ó��)
	//7.���⼭�� �����ڸ� 4������ ���� �� �ִ�.(null, hour, hour min, hour min sec)
	int hour;
	int minute;
	int second;
	
	//�⺻������ : default constructor / ������ ���� ����
	public MyTime() {
		System.out.println("--MyTime--");
		//�ʱ�ȭ
		//hour = minute = second = 1;
		
		//���� �ý��� �ð����� �ʱ�ȭ
		Calendar c 	= Calendar.getInstance();
		hour 		= c.get(Calendar.HOUR_OF_DAY);		//24H
		minute 		= c.get(Calendar.MINUTE);
		second 		= c.get(Calendar.SECOND);
		
		//Calendar�� ���� ���Ҷ� 0:1�� 1:2��..�̷��� ������ �ٷ� ������ �ش� �� ���� ���Գ��� 
		//System.out.println(c.get(Calendar.MONTH));
	}
	
	//�����ڿ����ε�~
	public MyTime(int h) {
		System.out.println("--MyTime(h)--");
		hour = h;
	}
	
	//�����ڿ����ε�~
	public MyTime(int h, int m) {
		System.out.println("--MyTime(h,m)--");
		hour = h;
		minute = m;
	}
	
	//��Ʈ�ѽ���Ʈs�� �ڵ����� ��
	public MyTime(int hour, int minute, int second) {
		//super();
		System.out.println("--MyTime(h,m,s)--");
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void display() {
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
	}
	
}
