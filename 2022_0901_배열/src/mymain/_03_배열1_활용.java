package mymain;

import java.util.Calendar;
import java.util.Scanner;

public class _03_�迭1_Ȱ�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		int age;
		String tti="��";
		System.out.print("����⵵ �Է� : ");
		year = scanner.nextInt();
		
		//���� �ý��� ��¥�� ���ϴ� ���(������ð谪������, ����Ͻú��ʿ�������...)
		Calendar c = Calendar.getInstance();
		
		//Ķ������ ������ �ִ� �����߿��� �⵵�� ���
		int current_year = c.get(Calendar.YEAR);
		
		//���̱��ϱ� : ����=����⵵-����⵵+1
		age = current_year - year + 1;
		
		//�챸�ϱ�(switch)
		//4  5  6  7  8  9  10 11 0  1  2  3    <=�� index = ����⵵%12(0~11) 
		//�� �� �� �� �� �� �� �� �� �� �� ��
		//�� �� �� �� �� �� �� �� �� �� �� ��
		switch(year%12)
		{
			case 0 : tti = "������"; 	break;
			case 1 : tti = "��"; 		break;
			case 2 : tti = "��"; 		break;
			case 3 : tti = "����"; 		break;
			case 4 : tti = "��"; 		break;
			case 5 : tti = "��"; 		break;
			case 6 : tti = "ȣ����"; 	break;
			case 7 : tti = "�䳢"; 		break;
			case 8 : tti = "��"; 		break;
			case 9 : tti = "��"; 		break;
			case 10 : tti = "��"; 		break;
			case 11 : tti = "��"; 		break;
		}
		
		//�챸�ϱ�(�迭)
		String [] tti_array = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
		
		//switch �� ���̰� �ϴ� ���
		// tti = tti_array[year%12];
		// System.out.printf("�� : %s ��\n", tti);
		System.out.printf("�ѱ�����:%d ��\n", age);
		System.out.printf("�� : %s ��\n", tti);
		System.out.printf("�迭�� : %s ��\n", tti_array[year%12]);
		
		scanner.close();
	}

}
