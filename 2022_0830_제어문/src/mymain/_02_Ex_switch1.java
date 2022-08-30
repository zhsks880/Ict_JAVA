package mymain;

import java.util.Scanner;

public class _02_Ex_switch1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String data;
		String result;
		System.out.printf("과일명: ");
		data = scanner.next();
		
		switch(data) 
		{
			case "포도" : result="달다";	
				break;
			case "수박" : result="시원하다";	
				break;
			case "딸기" : result="맛있다";	
				break;
			case "참외" : result="알아둬";	
				break;
			default:	  result="무슨맛";	
				break;
		}
		System.out.printf("[%s]은(는) [%s]\n", data, result);
				
		scanner.close();
				
	}

}
