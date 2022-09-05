package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_Jumin_Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Jumin jumin = new Jumin();
		
		String jumin_no;
		String yn = "y";
		
		while(true) {
			
			System.out.printf("주민번호 (xxxxxx-xxxxxxx): ");
			jumin_no = scanner.next();
			
			//입력주민번호를 jumin객체에게 전달(setter)
			jumin.setJumin_no(jumin_no);
			
			//부가정보 구한다
			int year = jumin.getYear();
			int age = jumin.getAge();
			String tti = jumin.getTti();
			String gender= jumin.getGender();
			
			//출력
			System.out.printf("출생년도:%d\n", year);
			System.out.printf("나 이:%d살\n", age);
			System.out.printf("띠  :%s띠\n", tti);
			System.out.printf("성 별:%s\n", tti);
			
			
			
			//또?
			System.out.printf("또?(y/n):");
			yn = scanner.next();
			
			if (!yn.equalsIgnoreCase("Y")) break;
		}// end-while
		
		System.out.println("★★★★★★★★★★END★★★★★★★★★★");
		
		scanner.close();
				
	}

}
