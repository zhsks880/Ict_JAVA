package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//�ݾ�: 125,600��
		//50,000���� : 2��
		//10,000���� : 2��
		//5,000���� : 1��
		//100���� : 6��
		
		//�Էµ���
		Scanner scanner = new Scanner(System.in);
		
		int money; //�ݾ�
		int im_money; //
		//������ ����
		int money_50000;
		int money_10000;
		int money_5000;
		int money_1000;
		int money_500;
		int money_100;
		int money_50;
		int money_10;
		
		//�Է�
		System.out.print("�ݾ�:");
		money = scanner.nextInt();
		//�ӽú��� �ִ´�
		im_money = money;
		//������ ������ ���
		//im_money = 125600
		
		//50000���� ����
		money_50000 = im_money / 50000;
		
		//50000���� ����� ������ �ݾ��� im_money�ִ´�
		im_money = im_money % 50000;
		
		money_10000 = im_money / 10000;
		im_money = im_money % 10000;
		
		money_5000 = im_money / 5000;
		im_money = im_money % 5000;
		
		money_1000 = im_money / 1000;
		im_money = im_money % 1000;
		
		money_500 = im_money / 500;
		im_money = im_money % 500;
		
		money_100 = im_money / 100;
		im_money = im_money % 100;
		
		money_50 = im_money / 50;
		im_money = im_money % 50;
		
		money_10 = im_money / 10;
		im_money = im_money % 10;
		
		
		System.out.printf("�����[%d]���� ���� ������ ���������\n", money);
		System.out.printf("50000��: %d(��)\n", money_50000);
		System.out.printf("10000��: %d(��)\n", money_10000);
		System.out.printf(" 5000��: %d(��)\n", money_5000);
		System.out.printf(" 1000��: %d(��)\n", money_1000);
		System.out.printf("  500��: %d(��)\n", money_500);
		System.out.printf("  100��: %d(��)\n", money_100);
		System.out.printf("   50��: %d(��)\n", money_50);
		System.out.printf("   10��: %d(��)\n", money_10);
		
		
		
		scanner.close();
	}

}
