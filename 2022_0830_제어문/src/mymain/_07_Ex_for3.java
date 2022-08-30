package mymain;

import java.util.Scanner;

public class _07_Ex_for3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		System.out.printf("단: ");
		dan = scanner.nextInt();
			
		//구구단 출력
		//유효성검증(단:2~9사이값)
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++)
				System.out.printf("[%d X %d = %2d]\n", dan, i, dan*i);
		}else {
				System.out.println("구구단은 2~9단 까지만~");
		}
		
		
		scanner.close();
	}

}
