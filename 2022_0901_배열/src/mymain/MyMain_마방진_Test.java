package mymain;

import java.util.Scanner;

import myutil.Mabangjin;

public class MyMain_������_Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int chasu;
		String yn="y";
		
		Mabangjin mabangjin = new Mabangjin();			//myutil�� �ִ� ������ Ŭ���� ��ü�� �ҷ�����
		
		while(true) {
			System.out.print("����: ");
			chasu = scanner.nextInt();
			
			if(chasu%2==0) {
				System.out.println("������ Ȧ���� �Է��ϼ���!");
				continue;
			}
			
			//���������� chasu ����
			mabangjin.setChasu(chasu);
			
			//���������
			mabangjin.display();
			
			//��?
			System.out.print("���ҷ�?(y/n)");
			yn = scanner.next();
			if(!yn.equalsIgnoreCase("y")) break;
			
		}
		System.out.println("====END====");
		scanner.close();
	}

}
