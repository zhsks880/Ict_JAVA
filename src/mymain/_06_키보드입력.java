package mymain;


//Scanner의 위치정보를 알려준다 / Scann까지만 치고 컨트롤스페이스 치면 임포트 유틸 뜸
import java.util.Scanner;


public class _06_키보드입력 {

	public static void main(String[] args) {
		//개인정보 : 이름 나이 주소 키
		
		//변수선언
		String name;
		int age;
		String addr;
		double height;
		
		//출력장치 : System.out
		//입력장치 : System.in
		
		//키보드로부터 입력받기 위한 객체
		//클래스정보 확인 : 해당클래스에 캐럿(Caret)위치시키고 F4키 누른다
		Scanner scanner = new Scanner(System.in);
		
		//문자열입력받기
		//next()		: 공백 또는 엔터전까지 가져오기
		//nextLine()	: 공백포함해서 엔터까지 가져오기
		
		//정수입력받기
		//netxtInt()
		//nextShort()
		//nextLong()
		
		//실수입력받기
		// nextDouble()
		// nextFloat()
		
		
		//1.이름입력받기
		System.out.print("이름을 넣어주세요-> ");
		name = scanner.nextLine();
		
		//2.나이 입력받기
		System.out.print("나이를 넣어주세요(숫자만입력)-> ");
		age = scanner.nextInt();
		
		//3. 주소입력받기
		//나이입력 시 남겨진 엔터를 가져와서 버린다.
		scanner.nextLine(); //<<nextInt 에서 엔터를 안가져오고 엔터가 남아서 애가 필요함
		System.out.print("주소를 넣어주세요-> ");
		addr = scanner.nextLine();
		
		//4. 키 입력받기
		System.out.print("키를 넣어주세요-> ");
		height = scanner.nextDouble();
		
		
		//2.출력해보기
		System.out.println("========[결과]========");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("주소 : %s\n", addr);
		System.out.printf("키 : %.2f\n", height); //.1 소수점 1자리까지..그냥f만 하면 6자리까지 늘어짐0000
		
		
		
	}

}
