package mymain;

import java.util.Scanner;

public class _07_�Ϲݳ�������2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.print("���̸��Է��Ͻÿ� :");
		age= scanner.nextInt();
		
		//������ ����(����>=20)
		if(age>=20)
			System.out.println("�����Դϴ�:" + age + "��");
		else 
			System.out.println("�̼����Դϴ�" + age + "��");
			System.out.println();
		
		int su = 3;
		//¦����? Ȧ����?
		if (su%2==0)
			System.out.printf("[%d]��(��) ¦��\n", su);
		else
			System.out.printf("[%d]��(��) Ȧ��\n", su);
		//3�ǹ����?
		if (su%3==0)
			System.out.printf("[%d]��(��) 3�ǹ��\n", su);
		else
			System.out.printf("[%d]��(��) 3�ǹ���� �ƴմϴ�\n", su);
		//2�� 3�� �����?
		//����1: 2�ǹ��
		//����2: 3�ǹ��
		//if(����1 %% ����2)
		if (su%2==0 && su%3==0)
			System.out.printf("[%d]��(��) 2�� 3�� ��� �Դϴ�\n", su);
		else
			System.out.printf("[%d]��(��) 2�� 3�� ����� �ƴմϴ�\n", su);
		//2�Ǵ� 3�� �����?
		//����1: 2�ǹ��
		//����2: 3�ǹ��
		//if(����1 || ����2)
		if(su%2==0 || su%3==0)
			System.out.printf("[%d]�� 2�Ǵ� 3�� ����Դϴ�\n", su);
		else
			System.out.printf("[%d]�� 2�Ǵ� 3�� ����� �ƴմϴ�\n", su);
		

	}
}
