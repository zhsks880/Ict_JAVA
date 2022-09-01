package mymain;

import java.util.Scanner;

public class _11_Ex_dowhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		String yn="y";  //또?
		
		do
		{
			System.out.print("단:");
			dan = scanner.nextInt();
			
			//유(무)효성 체크
			//if( !(dan>=2 && dan<=9) ) // 2~9단 사이가 아니면~
			if( dan<2 || dan>9)  		// 위랑 같은말임...
			{
				System.out.println("단은 2~9사이값만 입력하세요!!");
				//continue문 : 현재수행명령을 종료하고 반복문의 다음제어식으로 이동해라, 반복문에서만 사용가능
				//반복문의 다음 제어문으로 쩜핑, do 문은 넘어가고 while 문부터 쩜프, while 문 기본값 y로 넣어놔서 다시 키보드 받는거 해놓음
				continue; 
			}
				
			//구구단 출력
			System.out.printf("===[%d]단보기===\n", dan);
			for (int i=1; i<=9; i++)
			{
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			System.out.println("=============");
			//계속 여부 입력
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
		}while(yn.equals("y") || yn.equals("Y"));
		
		System.out.println("===The End===");
		
		scanner.close();
	}

}
