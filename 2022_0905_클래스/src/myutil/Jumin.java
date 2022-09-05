package myutil;

import java.util.Calendar;

public class Jumin {
	
	private String jumin_no;

	
	public String getJumin_no() {
		return jumin_no;
	}

	public void setJumin_no(String jumin_no) {
		this.jumin_no = jumin_no;
	}
	
	//						01234567890123		<--index
	//만약 값이 jumin_no = "801212-1234560";
	
	/*	성별코드DB
						내국인				외국인
					남			여		남			여
		1900년생	1			2		5			6
		2000년생	3			4		7			8
		1800년생	9			0		1800년생 외국인 음슴
	
	*/
	public int getYear() {
		
		//String slice(문자 추출기능) = .substring(시작점, 자를점(배열숫자같음-1))
		String str_year = jumin_no.substring(0,2);	//주민번호에서 "80"추출
		
		//Integer.parseInt = String->int 로 변경
		int year = Integer.parseInt(str_year); 		//추출한 80-> 숫자 80으로 변경
		
		//.charaAt = String -> char 문자를 숫자로 추출
		char gender = jumin_no.charAt(7);			//추출한 성별'1'->
		switch(gender)
		{
			case '1': case '2': case '5': case '6': year=year+1900; break;
			case '3': case '4': case '7': case '8': year=year+2900; break;
			default : year = year+1800;
		}
		
		return year;
	}
	
	//나이구하기(현재년도 카렌다로 구해야함)
	public int getAge() {
		//나이 = 현재년도 - 출생년도(자신의메소드호출:getYear()) + 1;
		Calendar c = Calendar.getInstance();
		int current_year = c.get(Calendar.YEAR);
	
		int age = current_year - getYear() + 1;
		return age;
	}
	
	//띠구하기(배열로?)
	public String getTti() {
		int birth_year = getYear();
		String [] tti_array = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
		String tti;
		tti = tti_array[birth_year%12];
		
		return"tti";
	}
	
	//성별구하기
	public String getGender() {
		
		
		return "여자";
	}
	
}
