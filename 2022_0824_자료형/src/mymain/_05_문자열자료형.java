package mymain;

public class _05_문자열자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 문자(열) : String
		// 상수     :  "ABC"       "홍길동"
        //             'A''B''C'
		//             "A"(String) 같지않다  'A'(char)
		// 출력서식 : %s
		
		String str = "우리나라대한민국";
		System.out.printf("%s\n", str);
		
		// %m.ns : m(전체자릿수)  n : 출력문자수
		System.out.printf("[%10.4s]\n", str);
		System.out.printf("[%-10.4s]\n", str);
		
		
		 
	}

}
