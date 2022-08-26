package mymain;

public class _04_문자형자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 문자형  : char
		// 상수    : 'A'  '한'  '韓'  '2'
		// 출력서식: %c
		
		// 주어진값을 문자형식으로 출력
		System.out.printf("%c\n", 'A');
		System.out.printf("%c\n", 65);
		System.out.printf("%c\n", 66);
		
		//ASCII(통신문자 코드):0~127
		// 0~31 : 통신 및 제어문자
		// 32~  : 일반문자
		//        'A' : 65   'a' : 97   '0' : 48   ' ' : 32
		
		char ch = '한';
		char ch2 = '가';
		System.out.printf("ch=%c %d\n", ch , (int)ch);
		System.out.printf("ch=%c %d\n" , ch2, (int)ch2);
			
		// '한'의 코드값 : 54620
		System.out.printf("%c\n", 54620);
		System.out.printf("%c %c %c\n",   'A', 'A'+1 , 67);
		
		//제어문자:
		// \r : carrige return(Home) : 13       \r\n
		// \n : new line (Enter)     : 10
		// \t : tab			         : 9
		
		// \b : left arrow
		//밖에서(cmd창) 실행해야 확인할 수 있다
		System.out.println("ABC\b\bX\n");
		
		
		char grade = '수';
		
		System.out.printf("평점은 : %c\n", grade);
		
		
		System.out.printf("[%5c]\n", grade);
		System.out.printf("[%-5c]\n", grade);
		
		
		
		
		
		
		
		
		
		
	}

}
