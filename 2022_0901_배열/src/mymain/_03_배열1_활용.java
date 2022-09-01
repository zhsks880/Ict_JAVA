package mymain;

import java.util.Calendar;
import java.util.Scanner;

public class _03_배열1_활용 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		int age;
		String tti="양";
		System.out.print("출생년도 입력 : ");
		year = scanner.nextInt();
		
		//현재 시스템 날짜를 구하는 방법(윈도우시계값가져옴, 년월일시분초요일주차...)
		Calendar c = Calendar.getInstance();
		
		//캘린더가 가지고 있는 정보중에서 년도만 얻기
		int current_year = c.get(Calendar.YEAR);
		
		//나이구하기 : 나이=현재년도-출생년도+1
		age = current_year - year + 1;
		
		//띠구하기(switch)
		//4  5  6  7  8  9  10 11 0  1  2  3    <=띠 index = 출생년도%12(0~11) 
		//자 축 인 묘 진 사 오 미 신 유 술 해
		//쥐 소 범 토 용 뱀 말 양 원 닭 개 돼
		switch(year%12)
		{
			case 0 : tti = "원숭이"; 	break;
			case 1 : tti = "닭"; 		break;
			case 2 : tti = "개"; 		break;
			case 3 : tti = "돼지"; 		break;
			case 4 : tti = "쥐"; 		break;
			case 5 : tti = "소"; 		break;
			case 6 : tti = "호랑이"; 	break;
			case 7 : tti = "토끼"; 		break;
			case 8 : tti = "용"; 		break;
			case 9 : tti = "뱀"; 		break;
			case 10 : tti = "말"; 		break;
			case 11 : tti = "양"; 		break;
		}
		
		//띠구하기(배열)
		String [] tti_array = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
		
		//switch 문 죽이고 하는 방법
		// tti = tti_array[year%12];
		// System.out.printf("띠 : %s 띠\n", tti);
		System.out.printf("한국나이:%d 살\n", age);
		System.out.printf("띠 : %s 띠\n", tti);
		System.out.printf("배열띠 : %s 띠\n", tti_array[year%12]);
		
		scanner.close();
	}

}
