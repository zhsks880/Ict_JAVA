package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int su1,su2,su3;
		System.out.print("�� ���� ������ �Է��ϼ���: ");
		su1 = scanner.nextInt();
		su2 = scanner.nextInt();
		su3 = scanner.nextInt();
		
		//2���� ��
		int min = (su1 > su2) ? su2 : su1;
		//������ 1���� ��
		min = min > su3 ? su3 : min;
		//��� ���� �������� min �� ����
		
		System.out.printf("�Է¼�:%d %d %d\n", su1, su2, su3);
		System.out.printf("������ �� �߿��� ���� ���� ���� : %d", min);
			
		scanner.close();
		
	}

}
