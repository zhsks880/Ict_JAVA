package mymain;

import java.util.Scanner;

import myutil.Lotto;
import myutil.MyArrays;

public class _04_�迭1_�ζ� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String yn="y";
		
		int [] win_no = new int[7];									//��÷��ȣ
		int [] user_no = new int[6];								//user��ȣ
		
		Lotto.make_win_no(win_no);									//��÷��ȣ����(�޼ҵ�ȣ��)
		System.out.println("[��÷��ȣ]");
		MyArrays.display(win_no);									//�迭������ǥ��(My�޼ҵ�ȣ��)
		
		while(true)
		{
			System.out.print("�ζ� 6�ڸ� ��ȣ�� �Է��ϼ���:");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			user_no[3] = scanner.nextInt();
			user_no[4] = scanner.nextInt();
			user_no[5] = scanner.nextInt();
			
			System.out.println("[������ȣ]");
			MyArrays.array_sort_asc(user_no);
			MyArrays.display(user_no);
		
			int rank = Lotto.rank(win_no, user_no);					//���üũ
			if(rank==0) {
				System.out.println("��!!�Դϴ�");
			}else {
				System.out.printf("[%d]� ��÷�Ǿ����ϴ�.", rank);
			}
			
			System.out.print("���?(y/n):");						//��� ���� ����
			yn=scanner.next();
			if(yn.equalsIgnoreCase("Y")==false)break;				//.equalsIgnorecase>��ҹ��� �������� �ʰ� üũ�ϴ� ��(y�� �ƴϸ� while�� �����ض�)
		}
		
		System.out.println("�ڡڡ�End�ڡڡ�");
		scanner.close();	
	}

}
