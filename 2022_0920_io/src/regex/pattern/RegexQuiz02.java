package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/*
		상품번호, 업소명(도시락명), 가격 으로 분리해서 출력
		정규표현식에서 (): 괄호 안에 들어있는 문자를 하나의 문자열로 인식
		-> \\(, \\) ->괄호안에 뭐가 존재하는지 확인하는거
		*/
		String str1 = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 CU(마늘햄도시락) 5,500원";
		String str3 = "333333-4444444 MINISTOP(제육도시락) 5,000원";
		
		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "\\w[A-Z]\\d{2}";
		String pattern3 = "\\([^)]*\\)";
		String pattern4 = "\\d+,*[0-9]+원";
		String pattern5 = "\\w[A-Z]";
		
		Pattern p1 = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		Pattern p3 = Pattern.compile(pattern3);
		Pattern p4 = Pattern.compile(pattern4);
		Pattern p5 = Pattern.compile(pattern5);

		Matcher m1 = p1.matcher(str1);
		Matcher m2 = p2.matcher(str1);
		Matcher m3 = p3.matcher(str1);
		Matcher m4 = p4.matcher(str1);
		
		Matcher m5 = p1.matcher(str2);
		Matcher m6 = p5.matcher(str2);
		Matcher m7 = p3.matcher(str2);
		Matcher m8 = p4.matcher(str2);
		
		Matcher m9 = p1.matcher(str3);
		Matcher m10 = p5.matcher(str3);
		Matcher m11 = p3.matcher(str3);
		Matcher m12 = p4.matcher(str3);
	
		System.out.println("-----------------------------");
		while(m1.find()) {
			System.out.println("상품번호:" + m1.group());
		}
		while(m2.find()) {
			System.out.println(m2.group());
		}
		while(m3.find()) {
			System.out.println(m3.group());
		}
		while(m4.find()) {
			System.out.println(m4.group());
		}
		System.out.println("-----------------------------");
		while(m5.find()) {
			System.out.println("상품번호:" + m5.group());
		}
		while(m6.find()) {
			System.out.println(m6.group());
		}
		while(m7.find()) {
			System.out.println(m7.group());
		}
		while(m8.find()) {
			System.out.println(m8.group());
		}
		System.out.println("-----------------------------");
		while(m9.find()) {
			System.out.println("상품번호:" + m9.group());
		}
		while(m10.find()) {
			System.out.print(m10.group());
		}
		System.out.println();
		while(m11.find()) {
			System.out.println(m11.group());
		}
		while(m12.find()) {
			System.out.println(m12.group());
		}

	}

}
