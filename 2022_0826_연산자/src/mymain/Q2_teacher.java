package mymain;

import java.util.Scanner;

public class Q2_teacher {
	
	//상수선언
	public static final int MIN_SEC = 60;
	public static final int HOUR_SEC = MIN_SEC*60;
	public static final int DAY_SEC = HOUR_SEC*24;
	//Q2 내가 한것과 차이는 상수를 선언함으로 컴파일 속도가 더 빠르게 되기 위함
	
	public static void main(String[] args) {

		//초: 3662
		// 1분:60초
		// 1시간: 3600초
		// 1일: 86,400초
		//[결과]
		//일수 : 
		//시간 :
		//분 :
		//초:
		
		//변수선언
		int total_sec, im_sec;
		int day, hour, min, sec;
								
		Scanner scanner = new Scanner(System.in);
		System.out.print("초:");
		total_sec = scanner.nextInt();
		im_sec = total_sec;
		
		//일 계산
		day = im_sec / DAY_SEC;
		im_sec = im_sec % DAY_SEC; //일을 제외한 나머지 시간
		
		//시간계산
		hour = im_sec / HOUR_SEC;
		im_sec = im_sec % HOUR_SEC;
		
		//분계산
		min = im_sec / MIN_SEC;
		
		//초계산
		sec = im_sec % MIN_SEC;
		
		System.out.printf("총 : %d초에 대한 결과\n", total_sec);
		System.out.printf("일:%d\n", day);
		System.out.printf("시:%d\n", hour);
		System.out.printf("분:%d\n", min);
		System.out.printf("초:%d\n", sec);
				
		scanner.close();
				
	}

}
