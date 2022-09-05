package mymain;

import myutil.MyDate;

public class MyMain_MyDate_Test {

	public static void main(String[] args) {
		//참조변수(in) = new + 객체;
		MyDate in = new MyDate();
		
		//in. 으로 불러오기, 도트(.)연산자
		
		//public : 공개모드
		//in.year = 2022;	  =>public 일땐 바로 사용되나, private 하면서부터 사용이 안됨		
		in.setYear(2022);	//=>그래서 setYear 메소드를 생성해서 퍼블릭 해놓고 사용으로 돌림
		
		//protected : 보호모드, 동일패키지에선 공개 or 부모자식일때 공개, 그외는 private
		//in.month = 9;		
		in.setMonth(9);
		
		//private : 비공개모드
		//in.day = 5;		  -> in.day 로 day변수 바로 값 못넣음(은닉화 되어서)
		in.setDay(5);		//->은닉화라서 메소드 설정하고 불러옴
		
		//default : 비공개모드, 동일패키지에선 공개, 그외는 private
		//in.weekday = 2;
		
		in.display();
		
		int year = in.getYear();
		int month = in.getMonth();
		int day = in.getDay();
		
		System.out.printf("%d-%d-%d\n", year, month, day);
	}
}
