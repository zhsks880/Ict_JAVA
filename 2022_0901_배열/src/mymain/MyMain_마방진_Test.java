package mymain;

import java.util.Scanner;

import myutil.Mabangjin;

public class MyMain_마방진_Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int chasu;
		String yn="y";
		
		Mabangjin mabangjin = new Mabangjin();			//myutil에 있는 마방진 클래스 객체로 불러오기
		
		while(true) {
			System.out.print("차수: ");
			chasu = scanner.nextInt();
			
			if(chasu%2==0) {
				System.out.println("차수는 홀수만 입력하세요!");
				continue;
			}
			
			//마방진에게 chasu 전달
			mabangjin.setChasu(chasu);
			
			//마방진출력
			mabangjin.display();
			
			//또?
			System.out.print("또할래?(y/n)");
			yn = scanner.next();
			if(!yn.equalsIgnoreCase("y")) break;
			
		}
		System.out.println("====END====");
		scanner.close();
	}

}
