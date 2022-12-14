package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		/*
		# 정규표현식(Regular Expression)
		- 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 형식 언어.
		- 지정한 패턴과 일치하는 문자열을 검증할 수 있다.
		
		# Pattern 클래스
		- 정규표현식을 다루는 클래스
		
		# Matcher 클래스
		- 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스
		*/
		
		String info = "30세/서울시 서대문구/02-123-4567/010-2345-6789/kkk@naver.com";
		
		//전화번호 형식
		// \\d : 숫자형식인지를 파악(\한개만 쓰는거임)
		// \\d{3} : 숫자 3개를 찾음
		// \\d{3,4} : 숫자(자릿수)가 3이상 4이하를 찾음
		
		//1.정규표현식 만들기
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		//2.비교/검증이 가능한 정규표현식을 만들어 내는 메서드
		Pattern p = Pattern.compile(pattern);
		//3.데이터를 비교해서 Matcher 클래스로 반환
		Matcher m = p.matcher(info);
		//4.정규표현식에 맞는 문자를 찾기
		while(m.find()) {
			System.out.println("찾은 인덱스: " + m.start());
			System.out.println("끝 인덱스: " + m.end());
			System.out.println("찾은 값: " + m.group());
		}
		System.out.println("======================================================");
		
		//이메일형식
		// \\w : 영문자와 숫자를 찾음
		// \\w+ : 영문자와 숫자 여러개 / {} 안에 숫자 넣어도 되는데 숫자모를때
		String pattern2 = "\\w+@\\w+.\\w+";
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		while(m2.find()) {
			System.out.println("찾은 인덱스: " + m2.start());
			System.out.println("끝 인덱스: " + m2.end());
			System.out.println("찾은 값: " + m2.group());
		}

	}

}
