package mymain;

import java.util.Scanner;

import myutil.MyCalendar;

public class MyMain_Calendar_Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int year;
		int month;
		String yn="y";
		
		MyCalendar mc = new MyCalendar();
		
		while(true) {
			
			System.out.print("�⵵/��:");
			year=scanner.nextInt();
			month=scanner.nextInt();
			//�޷°�ü���� �� ����(year, month)
			mc.setDate(year, month);
			
			//�޷����
			mc.display();
		
			//��?
			System.out.print("��?(Y/N)");
			yn=scanner.next();
			if(!yn.equalsIgnoreCase("Y")) break;
		}
		
		System.out.println("---End---");
		
		scanner.close();
	}

}
