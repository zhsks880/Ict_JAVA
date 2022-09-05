package mymain;

import myutil.MyDate;

public class MyMain_MyDate_Test {

	public static void main(String[] args) {
		//��������(in) = new + ��ü;
		MyDate in = new MyDate();
		
		//in. ���� �ҷ�����, ��Ʈ(.)������
		
		//public : �������
		//in.year = 2022;	  =>public �϶� �ٷ� ���ǳ�, private �ϸ鼭���� ����� �ȵ�		
		in.setYear(2022);	//=>�׷��� setYear �޼ҵ带 �����ؼ� �ۺ� �س��� ������� ����
		
		//protected : ��ȣ���, ������Ű������ ���� or �θ��ڽ��϶� ����, �׿ܴ� private
		//in.month = 9;		
		in.setMonth(9);
		
		//private : ��������
		//in.day = 5;		  -> in.day �� day���� �ٷ� �� ������(����ȭ �Ǿ)
		in.setDay(5);		//->����ȭ�� �޼ҵ� �����ϰ� �ҷ���
		
		//default : ��������, ������Ű������ ����, �׿ܴ� private
		//in.weekday = 2;
		
		in.display();
		
		int year = in.getYear();
		int month = in.getMonth();
		int day = in.getDay();
		
		System.out.printf("%d-%d-%d\n", year, month, day);
	}
}
