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
			int year 		= jumin.getYear();
			int age 		= jumin.getAge();
			String tti 		= jumin.getTti();
			String gender 	= jumin.getGender();
			String season 	= jumin.getSeason(); 
			String ganji	= jumin.getGanji();
			String area		= jumin.getArea();
			
			//출력
			System.out.printf("출생년도(간지):%d년(%s)\n", year, ganji);
			System.out.printf("나이 : %d살\n", age);
			System.out.printf("띠 : %s띠\n", tti);
			System.out.printf("성별 : %s\n", gender);
			System.out.printf("계절 : %s\n", season);
			System.out.printf("지역 : %s\n", area);
			
			//다른거 또 해볼까?
			System.out.printf("또?(y/n):");
			yn = scanner.next();
			
			if (!yn.equalsIgnoreCase("Y")) break;
		}// end-while
		
		System.out.println("★★★★★★★★★★END★★★★★★★★★★");
		
		scanner.close();
	}
}
