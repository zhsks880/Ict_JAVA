package mymain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		1.회원가입정보를 입력받는다
		 : 아이디/비밀번호/이름/나이/전화번호/시력(좌우)/결혼유무/주소
		
		2.변수이름과 자료형은 여러분들이 결정
		
		3.입력
		
		4.입력결과에 대한 내용을 출력
		
		*/
		
	Scanner scanner = new Scanner(System.in);
	
		String id;
		String pass;
		String name;
		int age;
		String phone;
		double lefteye;
		double righteye;
		boolean marriage;
		String add;
		
		System.out.print("ID를입력하세요 :  ");
		id = scanner.next();
		System.out.print("비밀번호를입력하세요 :  ");
		pass = scanner.next();
		System.out.print("이름을 작성하세요 :  ");
		name = scanner.next();
		System.out.print("나이를입력하세요(숫자만) :  ");
		age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("전화번호를입력하세요 :  ");
		phone = scanner.nextLine();
		
		System.out.print("왼쪽시력를입력하세요 :  ");
		lefteye = scanner.nextDouble();
		System.out.print("오른쪽시력를입력하세요 :  ");
		righteye = scanner.nextDouble();
		System.out.print("결혼유무입력하세요(true or false 를 작성) :  ");
		marriage = scanner.nextBoolean();
		
		scanner.nextLine();
		System.out.print("주소를 입력하세요 :  ");
		add = scanner.nextLine();
		
		//입력결과
		System.out.println("===========[회원가입 정보]===========");
		System.out.printf("ID : %s\n", id);
		System.out.printf("비밀번호 : %s\n", pass);
		System.out.printf("성 명 : %s\n", name);
		System.out.printf("나 이 : %d살\n", age);
		System.out.printf("연락처 : %s\n", phone);
		System.out.printf("좌측시력 : %.1f\n", lefteye);
		System.out.printf("우측시력 : %.1f\n", righteye);
		System.out.printf("결혼유무 : %b\n", marriage);
		System.out.printf("주 소 : %s\n", add);
		
	
	scanner.close();
		
		
	}

}
