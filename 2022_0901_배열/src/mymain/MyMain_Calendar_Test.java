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
			
			System.out.print("년도/월:");
			year=scanner.nextInt();
			month=scanner.nextInt();
			//달력객체에게 값 전달(year, month)
			mc.setDate(year, month);
			
			//달력출력
			mc.display();
		
			//또?
			System.out.print("또?(Y/N)");
			yn=scanner.next();
			if(!yn.equalsIgnoreCase("Y")) break;
		}
		
		System.out.println("---End---");
		
		scanner.close();
	}

}
