package mymain;

public class _01_논리형자료형 {

	public static void main(String[] args) {
		//논리형자료형 : boolean
		//1.상수     : true false
		//2.출력서식 : %b %B
		
		//변수
		boolean b0k = 3 > 2;
		System.out.printf(" 3 > 2 : %b\n", b0k); // Wn : new line(줄바꾸기)
		System.out.printf(" 3 > 2 : %B\n", b0k);
		
		b0k = "파리" == "새";
		System.out.printf(" 파리가 새냐? : %b\n", b0k);
		
		//화면출력방법
		//  print(숫자/문자/논리형)
		//1.print(값)         : 값만 출력
		//2.println(값)       : 출력 + 줄바꾸기
		//3.printf("서식",값) : 서식대로 값을 넣어서 출력(JDK 5.0 이후부터지원)
		//4.write("문자열값") : 문자만 출력
		
		System.out.print("1.값만 출력\n2.배고프다\n");
		System.out.println("2.값출력 + 줄바꾸기");  // ln=line next
		System.out.printf("3.이름:%s 나이:%d 기혼:%b\n", "전상현", 20, true);
		
		//아래와 같은것들이 있다
		System.out.write(65);
		System.out.flush();
		
	}

}
