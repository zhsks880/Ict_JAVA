package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/*
		��ǰ��ȣ, ���Ҹ�(���ö���), ���� ���� �и��ؼ� ���
		����ǥ���Ŀ��� (): ��ȣ �ȿ� ����ִ� ���ڸ� �ϳ��� ���ڿ��� �ν�
		-> \\(, \\) ->��ȣ�ȿ� ���� �����ϴ��� Ȯ���ϴ°�
		*/
		String str1 = "123123-4564564 GS25(ġŲ���ö�) 4,400��";
		String str2 = "111111-2222222 CU(�����ܵ��ö�) 5,500��";
		String str3 = "333333-4444444 MINISTOP(�������ö�) 5,000��";
		
		String pattern1 = "\\d{6}-\\d{7}\\d+,*[0-9]+��";

		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(str1);
		
		while(m.find()) {
			System.out.println(m.group());

		
	
		
			}
			
		}

}	
		
		
