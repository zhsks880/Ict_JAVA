package mymain;

import java.util.Calendar;
import java.util.Scanner;

public class Google_Calendar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("년도 입력 : ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("월 입력 : ");
        int month = Integer.parseInt(sc.nextLine());	//Integer.parseInt=숫자형태를 문자열로 입력받을때 다시 정수형태로 치환
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;
        
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        
        start.set(year, month - 1, 1);
        end.set(year, month, 1);
        end.add(Calendar.DATE, -1);
        
        START_DAY_OF_WEEK = start.get(Calendar.DAY_OF_WEEK);
        END_DAY = end.get(Calendar.DATE);
        
        System.out.println(year+"년 "+month+"월 달력\n"
                + "일\t월\t화\t수\t목\t금\t토");
        
        for(int q = 1 ; q < START_DAY_OF_WEEK ; q++) {
            System.out.print("\t");
        }
        
        int cnt = START_DAY_OF_WEEK - 1;
        for(int q = 1 ; q <= END_DAY ; q++) {
            System.out.print(q+"\t");
            cnt ++;
            if(cnt == 7) {
                cnt = 0;
                System.out.println("\n");
            }
        }
        sc.close();
        //어떤 달의 마지막날을 구하는 법은 구할 달의 다음달 1일에서 하루를 빼면 된다.
    }
 
}
