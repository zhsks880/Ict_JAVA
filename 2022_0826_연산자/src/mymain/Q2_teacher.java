package mymain;

import java.util.Scanner;

public class Q2_teacher {
	
	//�������
	public static final int MIN_SEC = 60;
	public static final int HOUR_SEC = MIN_SEC*60;
	public static final int DAY_SEC = HOUR_SEC*24;
	//Q2 ���� �ѰͰ� ���̴� ����� ���������� ������ �ӵ��� �� ������ �Ǳ� ����
	
	public static void main(String[] args) {

		//��: 3662
		// 1��:60��
		// 1�ð�: 3600��
		// 1��: 86,400��
		//[���]
		//�ϼ� : 
		//�ð� :
		//�� :
		//��:
		
		//��������
		int total_sec, im_sec;
		int day, hour, min, sec;
								
		Scanner scanner = new Scanner(System.in);
		System.out.print("��:");
		total_sec = scanner.nextInt();
		im_sec = total_sec;
		
		//�� ���
		day = im_sec / DAY_SEC;
		im_sec = im_sec % DAY_SEC; //���� ������ ������ �ð�
		
		//�ð����
		hour = im_sec / HOUR_SEC;
		im_sec = im_sec % HOUR_SEC;
		
		//�а��
		min = im_sec / MIN_SEC;
		
		//�ʰ��
		sec = im_sec % MIN_SEC;
		
		System.out.printf("�� : %d�ʿ� ���� ���\n", total_sec);
		System.out.printf("��:%d\n", day);
		System.out.printf("��:%d\n", hour);
		System.out.printf("��:%d\n", min);
		System.out.printf("��:%d\n", sec);
				
		scanner.close();
				
	}

}
