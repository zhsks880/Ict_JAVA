package mymain;

import java.util.Scanner;

public class _11_Ex_dowhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		String yn="y";  //��?
		
		do
		{
			System.out.print("��:");
			dan = scanner.nextInt();
			
			//��(��)ȿ�� üũ
			//if( !(dan>=2 && dan<=9) ) // 2~9�� ���̰� �ƴϸ�~
			if( dan<2 || dan>9)  		// ���� ��������...
			{
				System.out.println("���� 2~9���̰��� �Է��ϼ���!!");
				//continue�� : ����������� �����ϰ� �ݺ����� ������������� �̵��ض�, �ݺ��������� ��밡��
				//�ݺ����� ���� ������� ����, do ���� �Ѿ�� while ������ ����, while �� �⺻�� y�� �־���� �ٽ� Ű���� �޴°� �س���
				continue; 
			}
				
			//������ ���
			System.out.printf("===[%d]�ܺ���===\n", dan);
			for (int i=1; i<=9; i++)
			{
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			System.out.println("=============");
			//��� ���� �Է�
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
		}while(yn.equals("y") || yn.equals("Y"));
		
		System.out.println("===The End===");
		
		scanner.close();
	}

}
