package mymain;

import java.util.Scanner;

public class _07_Ex_for3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		System.out.printf("��: ");
		dan = scanner.nextInt();
			
		//������ ���
		//��ȿ������(��:2~9���̰�)
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++)
				System.out.printf("[%d X %d = %2d]\n", dan, i, dan*i);
		}else {
				System.out.println("�������� 2~9�� ������~");
		}
		
		
		scanner.close();
	}

}
