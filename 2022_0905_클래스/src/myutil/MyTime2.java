package myutil;

import java.util.Calendar;

public class MyTime2 {
	/*
		this.: �ڽ��� ��������
		this(): �ڽ��� ������ �޼ҵ�
		this. �� this() �ִ� ���� �ٸ���...
		this(); <<�� �տ��� ��� ��ɵ� ������ �ȵȴ�.������=�ʱ�ȭ�� �����̴ϱ�...
	*/
	int hour,minute,second;
	
	//�ڡڡڡڡڡڡڡڡڡ�hour �ܺΰ� �ȹް� ��,��,�ʴ� ���� �ð�
	public MyTime2() {
		//this.hour = this.minute = this.second = 1;		//this�� �ٿ��ٿ� �ѹ� �ẽ
		System.out.println("--MyTime2()--");
		Calendar c 	= Calendar.getInstance();
		hour 		= c.get(Calendar.HOUR_OF_DAY);			//24H
		minute 		= c.get(Calendar.MINUTE);
		second 		= c.get(Calendar.SECOND);
	}
	
	//�ڡڡڡڡڡڡڡڡڡ�hour �ܺΰ� �ް� ��, �ʴ� ���� �ð�
	public MyTime2(int hour) {								//�ð��� �������� �а� �ʴ� �ڵ�����
		this();												//MyTime2() <�ָ� �θ�
		System.out.println("--MyTime2(int)--");
		this.hour = hour;
	}
	
	//�ڡڡڡڡڡڡڡڡڡ�hour, minute �ܺΰ� �ް� �ʴ� ���� �ð�
	public MyTime2(int hour, int minute) {
		this(hour);											//this(����)������ MyTime2(int) call, ������ �̹���� �� ����
		System.out.println("--MyTime2(int, int)--");
		this.minute = minute;
	}

	public void display() {
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
	}
	
}
