package mymain;

import java.util.Scanner;

public class _02_Ex_switch1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String data;
		String result;
		System.out.printf("���ϸ�: ");
		data = scanner.next();
		
		switch(data) 
		{
			case "����" : result="�޴�";	
				break;
			case "����" : result="�ÿ��ϴ�";	
				break;
			case "����" : result="���ִ�";	
				break;
			case "����" : result="�˾Ƶ�";	
				break;
			default:	  result="������";	
				break;
		}
		System.out.printf("[%s]��(��) [%s]\n", data, result);
				
		scanner.close();
				
	}

}
