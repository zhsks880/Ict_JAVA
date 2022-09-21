package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02_Teacher {

	public static void main(String[] args) {
		/*
		��ǰ��ȣ, ���Ҹ�(���ö���), ���� ���� �и��ؼ� ���
		����ǥ���Ŀ��� (): ��ȣ �ȿ� ����ִ� ���ڸ� �ϳ��� ���ڿ��� �ν�
		-> \\(, \\) ->��ȣ�ȿ� ���� �����ϴ��� Ȯ���ϴ°�
		*/
		String str1 = "123123-4564564 GS25(ġŲ���ö�) 4,400��";
		String str2 = "111111-2222222 CU(�����ܵ��ö�) 5,500��";
		String str3 = "333333-4444444 MINISTOP(�������ö�) 5,000��";
		
		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "[A-Z]+[0-9]*";
		String pattern3 = "\\([��-�R]+\\)";
		String pattern4 = "[0-9],[0-9]+��";
		
		String[] arr = {str1, str2, str3};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("-------------------------");
			Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(pattern4).matcher(arr[i]);
			
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println("��ǰ��ȣ: " + m1.group());
				System.out.println("���Ҹ�: " + m2.group());
				System.out.println("���ö���: " + m3.group());
				System.out.println("����: " + m4.group());
			}
		}
	}

}
