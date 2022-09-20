package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		/*
		# ����ǥ����(Regular Expression)
		- Ư���� ��Ģ�� ���� ���ڿ��� ������ ǥ���ϴµ� ����ϴ� ���� ���.
		- ������ ���ϰ� ��ġ�ϴ� ���ڿ��� ������ �� �ִ�.
		
		# Pattern Ŭ����
		- ����ǥ������ �ٷ�� Ŭ����
		
		# Matcher Ŭ����
		- ������ �̿��Ͽ� ��� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
		*/
		
		String info = "30��/����� ���빮��/02-123-4567/010-2345-6789/kkk@naver.com";
		
		//��ȭ��ȣ ����
		// \\d : �������������� �ľ�(\�Ѱ��� ���°���)
		// \\d{3} : ���� 3���� ã��
		// \\d{3, 4} : ����(�ڸ���)�� 3�̻� 4���ϸ� ã��
		
		//1.����ǥ���� �����
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		//2.��/������ ������ ����ǥ������ ����� ���� �޼���
		Pattern p = Pattern.compile(pattern);
		//3.�����͸� ���ؼ� Matcher Ŭ������ ��ȯ
		Matcher m = p.matcher(info);
		//4.����ǥ���Ŀ� �´� ���ڸ� ã��
		while(m.find()) {
			System.out.println("ã�� �ε���: " + m.start());
			System.out.println("�� �ε���: " + m.end());
			System.out.println("ã�� ��: " + m.group());
		}
		System.out.println("======================================================");
		
		//�̸�������
		// \\w : �����ڿ� ���ڸ� ã��
		// \\w+ : �����ڿ� ���� ������ / {} �ȿ� ���� �־ �Ǵµ� ���ڸ𸦶�
		String pattern2 = "\\w+@\\w+.\\w+";
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		while(m2.find()) {
			System.out.println("ã�� �ε���: " + m2.start());
			System.out.println("�� �ε���: " + m2.end());
			System.out.println("ã�� ��: " + m2.group());
		}
		
		
		
	}

}
