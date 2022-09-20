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
		
		String pattern1 = "\\d{6}-\\d{7}\\d+,*[0-9]+원";

		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(str1);
		
		while(m.find()) {
			System.out.println(m.group());

		
	
		
			}
			
		}

}	
		
		
