package mymain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		//��: 12350
		// 1��:60��
		// 1�ð�: 3600��
		// 1��: 86,400��
		//[���]
		//�ϼ� : 
		//�ð� :
		//�� :
		//��:
		
		Scanner scanner = new Scanner(System.in);
		int time;
		int im_time;
		
		int time_day;
		int time_hour;
		int time_min;
		int time_sec;
		
		System.out.print("���ϴ� ��(sec)�� �Է��غ��� : ");
		time = scanner.nextInt();
		im_time = time;
		
		time_day = im_time / 86400;
		im_time = im_time % 86400;
		
		time_hour = im_time / 3600;
		im_time = im_time % 3600;
		
		time_min = im_time / 60;
		im_time = im_time % 60;
		
		time_sec = im_time / 1;
		im_time = im_time % 1;
		
		System.out.println();
		System.out.printf("�����[%d]�ʿ� �ش��ϴ� �ð��뺰 �������\n", time);
		System.out.printf("�ϼ� : [%d]��\n", time_day);
		System.out.printf("�ð� : [%d]�ð�\n", time_hour);
		System.out.printf("  �� : [%d]��\n", time_min);
		System.out.printf("  �� : [%d]��\n", time_sec);
			
		
		scanner.close();
		
		
		
	}

}
