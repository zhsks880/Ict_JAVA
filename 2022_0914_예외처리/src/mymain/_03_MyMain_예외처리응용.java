package mymain;

import java.util.Scanner;

public class _03_MyMain_예외처리응용 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String yn="y";
		int kor;
		
		while(true) {
			
			try {
				System.out.print("국어점수: ");
				kor = scanner.nextInt();
				System.out.printf("입력한 점수는 %d\n", kor);
				System.out.print("또?(y/n): ");
				yn=scanner.next();
					if(!yn.equalsIgnoreCase("y")) break;
						
			} catch (Exception e) {
				scanner.nextLine();
				//e.printStackTrace();
				System.out.println("점수는 숫자만 입력하세요!!");
				
			}
			
			
		}
		
		
		scanner.close();
	}

}
