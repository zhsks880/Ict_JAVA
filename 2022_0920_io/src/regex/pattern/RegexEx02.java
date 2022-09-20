package regex.pattern;

import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		//[]: �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ����� ����.
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sweep"));
		/*
		# [] �ȿ� ������ �� �ִ� �͵�
		1. [abc] : a,b,c �� �ϳ��� ���
		2. [^abc] : a,b,c �� ������ ��θ� ���
		3. [a-z] : a���� z���� ���(����ҹ��ڸ�)
		->[a-zA-Z��-�R]: ���� �ҹ���+�빮��+�ѱ� ���
		4. [0-9] : ���ڸ� ���
		5. &&: ������(���װ� ���� ������ ��� �����ϴ� ����)
		*/
		System.out.println(Pattern.matches("s[^1-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sLeep"));
		System.out.println(Pattern.matches("s[a-dm-z]eep", "sleep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		/*
		# �ش� ������ ����� ������ ������ �����ϴ� ��(���� ����ߵ�)
		1. Ex{n}: �տ� �ִ� ������ n���� ��ġ�ؾ��Ѵ�.
		2. Ex{n,m}: �ּ� n���� ���� �ִ� m���ڰ� ��ġ�ؾ��Ѵ�.
		3. Ex{n,}: �ּ� n���ڸ� ��ġ�ؾ��Ѵ�.
		4. Ex?: 0�� Ȥ�� �ѹ�
		5. Ex+: �ּ� �ѹ� �̻�
		6. Ex*: 0�� Ȥ�� ������
		7. . : ���� �� ���� ��ġ��Ŵ
		*/
		
		System.out.println(Pattern.matches("....[\\d]{3}", "abcd123"));
		System.out.println(Pattern.matches("[\\w��-�R]{2,12}", "abcd�ȳ�123456"));
		
		String email = "abc@���̹�";
		System.out.println(Pattern.matches("[\\w]+@[a-zA-Z0-9]+\\.[a-zA-Z]", email));
		
		/*
		# Pattern.matches(regex, str)
		->������ ���ڿ��� ����ǥ���İ� ��ġ�ϸ� true.
		#Matcher
		->���ڿ��� ó������ ������ �˻��ϸ鼭 �ش� ����ǥ���İ� ��ġ�ϴ� �ε��� �� ������� ������ �ִ� ��ü.
		*/
		
	}

}
