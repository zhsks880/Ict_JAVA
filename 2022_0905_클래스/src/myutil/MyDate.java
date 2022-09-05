package myutil;

public class MyDate {
	
	//이 안에 있는 아이들 부르는 단어들...에러날때 보기 좋잔아~
	//member 변수
	//member field
	//member attribue
	//member property
	//클래스에서 데이터(변수)들은 외부에서 마음대로 하면 손실의 위험이 있으므로, private 로 대부분 함(=은닉화)
	
	//instance(객체) 변수: 객체가 생성되면 생성되는 변수(new 로 주고 만들때 인스턴트화)
	//public 		int year;
	private 	int year;
	protected 	int month;
	private 	int day;
	    		int weekday;
	
	//MyDate class멤버 메소드(void=반환형(return 값이 없는 메소드)
	//setter method: 외부값을 내부변수에 넣는 메소드(set + 내부변수명으로 쓴다~)
	//set + field명 (명명법:Camel)
	public void setYear(int y) {
		year = y;
		return;						//void 형에서는 return 넣어도 되고 안넣어도 됨(일반적으로 생략)
	}
	// call by value (호출할때 값을 전달하는거)
	public void setMonth(int m) {
		month = m;
	}
	public void setDay(int d) {
		day = d;
	}
	public void setWeekday(int w) {
		weekday = w;
	}
	
	//값을 얻어오는 기능
	//getter method: 내부값을 외부로 전달하는 메소드(get +  내부변수명)
	//get + field명 (명명법:Camel)
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	// call by name(호출할때 메소드만 전달하는거)
	public void display() {
		System.out.printf("%d-%02d-%02d\n", year, month, day);
	}
}
