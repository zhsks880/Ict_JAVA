package mymain;

import java.util.Scanner;

public class _08_�Ϲݳ�������_���ⱸ�ϱ� {

	/*
	����: 1�� 366���� ��(�⵵)
	����1 : 400���� ����� ��
	����2 : 4�� ����̸鼭 100�� ����� �ƴ���
			(����21 %% ����22)
			
	if(����1 || ����2)
		����
	else
		���
	*/
	
	public static void main(String[] args) {
		//��������
		int year;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է�:");
		year = scanner.nextInt();
		//    ����1      �Ǵ�            ����2
		//    					����21 �̸鼭 ����22
		if((year%400==0) || (year%4==0 && year%100!=0))
			System.out.printf("[%d]�⵵�� ����\n", year);
		else
			System.out.printf("[%d]�⵵�� ���\n", year);
		
				
		scanner.close();
		
		
	}

}
