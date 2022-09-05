package myutil;

import java.util.Calendar;

public class MyTime {
	
	//생성자(메소드) : Constructor Method
	//1.객체가 생성될 때 초기화 목적으로 사용되는 메소드
	//2.자신의 변수를 일반적으로 초기화
	//3.단 1회 자동호출
	//4.Method Overload(중복메소드)가 가능하다
	//5.생성자메소드형식 : 반환형이 없다/ 클래스명()과 동일한 메소드명을 가짐
	//6.생성자 생략가능하다 (생략했을 시 JVM이 자동생성해서 처리)
	//7.여기서는 생성자를 4가지로 만들 수 있다.(null, hour, hour min, hour min sec)
	int hour;
	int minute;
	int second;
	
	//기본생성자 : default constructor / 생성자 없이 생성
	public MyTime() {
		System.out.println("--MyTime--");
		//초기화
		//hour = minute = second = 1;
		
		//현재 시스템 시간으로 초기화
		Calendar c 	= Calendar.getInstance();
		hour 		= c.get(Calendar.HOUR_OF_DAY);		//24H
		minute 		= c.get(Calendar.MINUTE);
		second 		= c.get(Calendar.SECOND);
		
		//Calendar는 월을 구할때 0:1월 1:2월..이렇게 나가서 바로 뽑으면 해당 월 보다 낮게나옴 
		//System.out.println(c.get(Calendar.MONTH));
	}
	
	//생성자오버로드~
	public MyTime(int h) {
		System.out.println("--MyTime(h)--");
		hour = h;
	}
	
	//생성자오버로드~
	public MyTime(int h, int m) {
		System.out.println("--MyTime(h,m)--");
		hour = h;
		minute = m;
	}
	
	//컨트롤쉬프트s로 자동생성 함
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
