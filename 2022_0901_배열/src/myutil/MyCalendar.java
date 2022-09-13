package myutil;

import java.util.Calendar;

public class MyCalendar {
	
	int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	int year;
	int month;
	
	int [][] cal_array;
	
	public void setDate(int year, int month) {
		this.year = year;
		this.month = month;
		
		//달력만들기
		make_calendar();
	}
	
	private boolean isYoon() {
		return (year%400==0) || (year%4==0 && year%100!=0);
	}
	
	private void make_calendar() {
		if(isYoon())
			month_array[1] = 29;
		else
			month_array[1] = 28;
		//달력을 저장할 배열생성
		cal_array = new int[6][7];
		//주어진 년/월에 1일의 요일 구하기
		int yoil = 0;
		int week = 0;
		//캘린더 객체를 구한다
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);					//Calendar에서 month는 0:1월임, 그래서 -1
		//해당날짜의 요일을 구한다
		yoil = c.get(Calendar.DAY_OF_WEEK) -1;		//Calendar에서 day는 1:일요일임, 그래서 -1
		
		//현재월의 달력채우기
		int last_day = month_array[month-1];
		 
			for(int i=1; i<=last_day; i++) {
				cal_array[week][yoil] = i; 
				yoil++;
		  
				 if(yoil>6) {
					 week++; 
					 yoil = 0;  
				 }
		}
		
		//이전달 달력 채우기
		if(yoil>0) {										//이전달 정보가 있으면 채워라~(2022년5월은 이전달 정보가 없으니 작동 안함)
			int prev_yoil = yoil-1;							//이전달 요일
			int prev_month = (month ==1) ? 12 : month-1;	//이전달
			int prev_last_day = month_array[prev_month-1];	//이전달 마지막날
			
			for(int i = prev_yoil; i>=0; i--) {				//뒤->앞으로 채워나가기(i를 0까지 채워라~)
				cal_array[0][i] = prev_last_day;
				prev_last_day--;
			}
		}
		
		//다음달 달력 채우기
		for(int i=1; i<15; i++) {							//현재월의 달력 채우기 끝나고 나서부터 시작
			cal_array[week][yoil] = i;
			yoil++;
				
				if(yoil>6) {
					week++;
					yoil=0;
					if(week==6)break;						//week을 더하면서 나가다가 6행이 되면 더이상 하지말도록 제어(index boundary 어쩌구 저쩌구 에러 해결법)
				}
		}
		
		
			
		
	}
	
	//달력출력하는 메소드
	public void display() {
		
		//요일출력
		System.out.println("----------------------------");
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		System.out.println("----------------------------");
		//날짜출력
		for(int i=0; i<6; i++) {
			for(int k=0; k<7; k++) {
				System.out.printf("%4d", cal_array[i][k]);
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
	}
	
}
