package mymain;

import java.util.Scanner;

public class _03_Ex_switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		int last_day; //해당월의 마지막날?
		
		System.out.print("월:");
		month = scanner.nextInt();
		
		//if(month==1 || month==3 || month==5 ||....)이것도 가능은 함
		//월의 유효범위 체크(1~12)
		if (month >=1 && month<=12){
			switch(month)
			{
				case 2 : last_day = 28;	break;
				case 4 : 
				case 6 : 
				case 9 : 
				case 11 : last_day = 30;	break;		//4~11월 30일끝나는거 동일하니 마지막꺼 하나만 작성하면 됨
				default : last_day = 31;				//끝날이 28, 30일을 제외한 모든달은 31일로 간결하게 가능
					
			}
			System.out.printf("[%d]월의 마지막 날은[%d]일 입니다\n", month, last_day);
		}else {
			System.out.println("월은 1~12월까지만 입력가능합니다");
		}
								
		scanner.close();
	}

}
