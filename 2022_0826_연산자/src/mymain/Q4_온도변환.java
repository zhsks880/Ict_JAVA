package mymain;

import java.util.Scanner;

public class Q4_�µ���ȯ {

	public static void main(String[] args) {
		//����(C) <-> ȭ��(F)
		
		//F����: F=9/5*(C+32)
		//C����: C=5/9*(F-32)
		//���� ��� ȭ�� � �Դϴ�. ȭ�� ��� ���� � �Դϴ�.
		
		//��������100
		double temp_c;
		double temp_f;
		
		double result_tem_f;
		double result_tem_c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("����/ȭ��:");
		temp_c = scanner.nextDouble();
		temp_f = scanner.nextDouble();
		
		result_tem_f = (temp_c * 9/5) + 32;
		//result_tem_f = 9/5*temp_c + 32;  �̰� Ʋ����.��������� ���ؼ� 9/5���� ������
		//result_tem_f = 9.0/5.0*temp_c + 32.0; ���� ������� �����(�ڷ��� ����� �����ض�) int �� double �� �׽� ����
		result_tem_c = (temp_f - 32) * 5/9;
		//result_temp_c = 5.0/9.0*(temp_f-32.); ���� ������� ����
		System.out.printf("�Է��� ����[%.2f(C)]�� ȭ���� ��ȯ�ϸ�[%.2f(F)]\n�Է��� ȭ��[%.2f(F)�� ������ ��ȯ�ϸ�[%.2f(C)]\n", temp_c, result_tem_f, temp_f, result_tem_c);
		
		
		
		
		
		
		scanner.close();
		
		
	}

}
