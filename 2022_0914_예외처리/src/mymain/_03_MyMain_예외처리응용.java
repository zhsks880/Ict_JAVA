package mymain;

import java.util.Scanner;

public class _03_MyMain_����ó������ {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String yn="y";
		int kor;
		
		while(true) {
			
			try {
				System.out.print("��������: ");
				kor = scanner.nextInt();
				System.out.printf("�Է��� ������ %d\n", kor);
				System.out.print("��?(y/n): ");
				yn=scanner.next();
					if(!yn.equalsIgnoreCase("y")) break;
						
			} catch (Exception e) {
				scanner.nextLine();
				//e.printStackTrace();
				System.out.println("������ ���ڸ� �Է��ϼ���!!");
				
			}
			
			
		}
		
		
		scanner.close();
	}

}
