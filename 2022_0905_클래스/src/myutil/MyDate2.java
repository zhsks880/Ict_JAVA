package myutil;

public class MyDate2 {
	
	//은닉화(data hiding): 접근제한자 private을 이용해서
	private int year;
	private int month;
	private int day;
	
	//기본생성자
	public MyDate2() {
	
	}
	
	//오버로드 된 생성자
	public MyDate2(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//알트 + 쉬프트 + s = 코드자동생성 단축키
	
	//Getter , Setter 된 생성자
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
