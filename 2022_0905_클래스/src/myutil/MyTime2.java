package myutil;

import java.util.Calendar;

public class MyTime2 {
	/*
		this.: 자신의 참조변수
		this(): 자신의 생성자 메소드
		this. 과 this() 애는 아주 다르다...
		this(); <<애 앞에는 어떠한 명령도 넣으면 안된다.생성자=초기화의 형식이니까...
	*/
	int hour,minute,second;
	
	//★★★★★★★★★★hour 외부값 안받고 시,분,초는 지금 시간
	public MyTime2() {
		//this.hour = this.minute = this.second = 1;		//this를 꾸역꾸역 한번 써봄
		System.out.println("--MyTime2()--");
		Calendar c 	= Calendar.getInstance();
		hour 		= c.get(Calendar.HOUR_OF_DAY);			//24H
		minute 		= c.get(Calendar.MINUTE);
		second 		= c.get(Calendar.SECOND);
	}
	
	//★★★★★★★★★★hour 외부값 받고 분, 초는 지금 시간
	public MyTime2(int hour) {								//시간은 내손으로 분과 초는 자동으로
		this();												//MyTime2() <애를 부름
		System.out.println("--MyTime2(int)--");
		this.hour = hour;
	}
	
	//★★★★★★★★★★hour, minute 외부값 받고 초는 지금 시간
	public MyTime2(int hour, int minute) {
		this(hour);											//this(인자)넣으면 MyTime2(int) call, 하지만 이방법은 잘 안함
		System.out.println("--MyTime2(int, int)--");
		this.minute = minute;
	}

	public void display() {
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
	}
	
}
