package mymain;

import java.io.IOException;
import java.util.Scanner;

public class Q5_�Է¹��ھ˾Ƴ��� {

	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		//��������
		int ch;
		String result ="";
		
		System.out.print("���� 1���� �Է��ϼ���:");
		//ch = (char) System.in.read();//scanner.next().charAt(0); // �̰� ������ char ch; �� ��� ���
		ch = System.in.read();
		
		//�Է¹��� ���ڰ� �빮��/�ҹ���/����/��/��Ÿ
		if(Character.isUpperCase(ch)) //Character.isUpperCase<<Ŭ������ �ؿ� if ���ǹ��� ����
			result = "�빮��";
		//if(ch>='A' && ch<='Z') result ="�빮��";
		else if (ch>='a' && ch<='z')
			result ="�ҹ���";
		else if (ch=='\t' || ch==32 || ch=='\r' || ch=='\n')
			result ="ȭ��Ʈ����";
		else if (ch>='0' && ch<='9')
			result = "����";
		else result = "��Ÿ";
		
		System.out.printf("[%s] : %c\n", result, ch);
		
		
		//scanner.close();
		
		
	}

}
