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
	
	//★★★★★★★★출생년도 구하기★★★★★★★★
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
	
	//★★★★★★★★나이구하기(현재년도 카렌다로 구해야함)★★★★★★★★
	public int getAge() {
		//나이 = 현재년도 - 출생년도(자신의메소드호출:getYear()) + 1;
		Calendar c = Calendar.getInstance();
		int current_year = c.get(Calendar.YEAR);
		
		int age = current_year - getYear() + 1;
		return age;
	}
	
	//★★★★★★★★띠구하기(배열로?)★★★★★★★★
	public String getTti() {
		int birth_year = this.getYear();
		
		/*           배열 사용해서 이렇게도 가능
		 * String tti; 
		 * String [] tti_array = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이",
		 * "토끼", "용", "뱀", "말", "양"};
		 * 
		 * tti = tti_array[birth_year%12];
		 */
		switch(birth_year%12)
		{
			case 0: return "원숭이";
			case 1: return "닭";
			case 2: return "개";
			case 3: return "돼지";
			case 4: return "쥐";
			case 5: return "소";
			case 6: return "호랑이";
			case 7: return "토끼";
			case 8: return "용";
			case 9: return "뱀";
			case 10: return "말";					//10가지 케이스가 다 아니면 최종 "양" 표시
		}
		return "양";
	}
	
	//★★★★★★★★성별구하기★★★★★★★★
	public String getGender() {
		char gender = jumin_no.charAt(7);
		//방법1	: 추출한 숫자는 아스키코드 문자열 숫자이므로 그냥 숫자 아님
		//if(gender=='1' || gender=='3' || gender=='5' || gender=='7'|| gender=='9')
		//return "남자";
		
		//방법2	: '0'->48	'1'->49		/ gender(문자코드) - '0'(48) = 정수로 나오게 되서 나누기 가능
		if( (gender-'0')%2 == 1) return "남자";
		
		return "여자";
	}
	
	//★★★★★★★★계절구하기★★★★★★★★
	public String getSeason() {
		
		String str_month = jumin_no.substring(2,4);
		int month = Integer.parseInt(str_month);		// 문자12->숫자12로
		//봄:3~5	여름:6~8	가을:9~11	겨울:12~2
		
		//방법1 : 스윗치 문
		/*
		 * switch(month) { case 3: case 4: case5: return "봄"; case 6: case 7: case8:
		 * return "여름"; case 9: case 10: case11: return "가을"; }
		 */
		
		//방법2
		switch(month/3) 
		{
		case 1: return "봄";		//3월/3=1, 4월/3=1
		case 2: return "여름";		//6월/3=2, 7월/3=2
		case 3: return "가을";		//9월/3=3, 10월/3=3
		}
		return "겨울";				//그외~
	}
	
	//★★★★★★★★10간 12지★★★★★★★★
		//10간 12지 DB
		//인덱스	4	5	6	7	8	9	0	1	2	3					<-연도%10(0~9)
		//10간 :	갑	을	병	정	무	기	경	신	임	계
		//인덱스	4	5	6	7	8	9	10	11	0	1	2	3			<-연도%12(0~11)
		//12지 : 	자	축	인	묘	진	사	오	미	신	유	술	해
	public String getGanji() {
		//					0 1 2 3 4 5 6 7 8 9 10 11
		String gan_list = "경신임계갑을병정무기";
		String ji_list	= "신유술해자축인묘진사오미";
		int birth_year = this.getYear();						//출생년도 가져오기
		
		char gan = gan_list.charAt(birth_year%10);
		char ji = ji_list.charAt(birth_year%12);
		
		return String.format("%c%c년", gan, ji);				//String.format("서식",값)->문자열생성
	}
	//★★★★★★★★지역 구하기★★★★★★★★
	//성별 뒤에 두자리가 지역코드DB
	//서울 00~08  부산09~15 인천 13~15 경기도 16~25 강원동 26~34 충청북도 35~39 대전:40 충청남도:41~47
	//전라북도:48~54 
	public String getArea() {
		
		String str_area = jumin_no.substring(8,10);
		int area = Integer.parseInt(str_area);
		String ji = "";
		
		if(area>=0 && area<=8) ji = "서울"; 
		else if (area>=9 && area<=15) ji = "부산";
		else if (area>=13 && area<=15) ji = "인천";
		else if (area>=16 && area<=25) ji = "경기도";
		else if (area>=26 && area<=34) ji = "강원도";
		else if (area>=35 && area<=39) ji = "충청북도";
		else if (area==40) ji = "대전";
		else if (area>=41 && area<=47) ji = "충청남도";
		else if (area>=48 && area<=54) ji = "전라북도";
		else if (area>=55 && area<=66) ji = "전라남도";
		else if (area>=67 && area<=69) ji = "대구";
		else if (area>=70 && area<=75) ji = "경상북도";
		else if (area>=86 && area<=92) ji = "경상남도";
		else if (area>=93 && area<=95) ji = "제주도";
		else if (area>=44 && area<=49) ji = "세종시";
		
		return ji;
	}
}
