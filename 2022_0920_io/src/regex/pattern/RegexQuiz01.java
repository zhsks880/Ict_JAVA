package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {

		String str = "��4,500�� �R~ 1,200����? 6000���� 120000��";
		
		/*
		-���� ���ĸ� ã�Ƽ� ������� ����� ����.
		ex) 4,500�� 1,200��....
		�� ������ ��� ������ų ���� ǥ������ �ۼ��ؾ��Ѵ�.
		*/
		
		String pattern = "\\d+,*[0-9]+��";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println("ã�� ��: " + m.group());
		}
	}
}
