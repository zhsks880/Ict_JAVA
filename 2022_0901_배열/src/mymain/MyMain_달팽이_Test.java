package mymain;

import java.util.Scanner;

import myutil.Mabangjin;
import myutil.Snail;

public class MyMain_������_Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int row_chasu;
		int col_chasu;
		String yn="y";
		
		Snail snail = new Snail();
				
		
		while(true) {
			System.out.print("����(��/��): ");
			row_chasu = scanner.nextInt();
			col_chasu = scanner.nextInt();
			
			
			//�����̿��� chasu ����
			snail.setChasu(row_chasu, col_chasu);
			
			//���������
			snail.display();
			
			//��?
			System.out.print("���ҷ�?(y/n)");
			yn = scanner.next();
			if(!yn.equalsIgnoreCase("y")) break;
			
		}
		System.out.println("====END====");
		scanner.close();
	}

}
