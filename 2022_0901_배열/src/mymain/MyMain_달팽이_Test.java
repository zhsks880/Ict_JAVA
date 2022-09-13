package mymain;

import java.util.Scanner;

import myutil.Mabangjin;
import myutil.Snail;

public class MyMain_달팽이_Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int row_chasu;
		int col_chasu;
		String yn="y";
		
		Snail snail = new Snail();
				
		
		while(true) {
			System.out.print("차수(행/열): ");
			row_chasu = scanner.nextInt();
			col_chasu = scanner.nextInt();
			
			
			//달팽이에게 chasu 전달
			snail.setChasu(row_chasu, col_chasu);
			
			//달팽이출력
			snail.display();
			
			//또?
			System.out.print("또할래?(y/n)");
			yn = scanner.next();
			if(!yn.equalsIgnoreCase("y")) break;
			
		}
		System.out.println("====END====");
		scanner.close();
	}

}
