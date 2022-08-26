package mymain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		//초: 12350
		// 1분:60초
		// 1시간: 3600초
		// 1일: 86,400초
		//[결과]
		//일수 : 
		//시간 :
		//분 :
		//초:
		
		Scanner scanner = new Scanner(System.in);
		int time;
		int im_time;
		
		int time_day;
		int time_hour;
		int time_min;
		int time_sec;
		
		System.out.print("원하는 초(sec)를 입력해보자 : ");
		time = scanner.nextInt();
		im_time = time;
		
		time_day = im_time / 86400;
		im_time = im_time % 86400;
		
		time_hour = im_time / 3600;
		im_time = im_time % 3600;
		
		time_min = im_time / 60;
		im_time = im_time % 60;
		
		time_sec = im_time / 1;
		im_time = im_time % 1;
		
		System.out.println();
		System.out.printf("■■■■[%d]초에 해당하는 시간대별 값■■■■\n", time);
		System.out.printf("일수 : [%d]일\n", time_day);
		System.out.printf("시간 : [%d]시간\n", time_hour);
		System.out.printf("  분 : [%d]분\n", time_min);
		System.out.printf("  초 : [%d]초\n", time_sec);
			
		
		scanner.close();
		
		
		
	}

}
