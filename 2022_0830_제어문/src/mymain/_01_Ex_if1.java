package mymain;

import java.util.Scanner;

public class _01_Ex_if1 {

	public static void main(String[] args) {
		String menu;
		Scanner scanner = new Scanner(System.in);

		System.out.println("�����Ǹ� ������");
		System.out.println("1.������");
		System.out.println("2.���");
		System.out.println("3.¥���");
		
		System.out.printf("�����ǹ�ȣ: ");
		menu = scanner.next();
		System.out.println();
		//��� �Է½�-> ���ڿ� �񱳴� .equals() �̿��Ѵ� menu=="���" <<�̰� �ȵ�(���ڸ����Ű���)
		// if�� ���� {} ȭ ���ϸ� �� ù�ٸ� if�� �԰� �������� �� �����
		// if�� �ڿ� ; <<�̰� ������ else �κк��� ������ �߱� ������(�����ض�)
		if (menu.equals("2")) {
			System.out.println("========[�����̱�]========");
			System.out.println("1.���� ���δ�.");
			System.out.println("2.���� �ִ´�.");
			System.out.println("3.������ �ִ´�.");
			System.out.println("4.3���� ��ٸ���.");
		} else if (menu.equals("1")) {
			System.out.println("========[�����̲��̱�]========");
			System.out.println("1.���� ���δ�.");
			System.out.println("2.���� �ִ´�.");
			System.out.println("3.�����带 �ִ´�.");
			System.out.println("4.10���� ��ٸ���.");
		} else if (menu.equals("3")) {
			System.out.println("========[¥��� ���̱�]========");
			System.out.println("1.���� ���δ�.");
			System.out.println("2.���� �ִ´�.");
			System.out.println("3.���带 �ִ´�.");
			System.out.println("4.10�а� ����.");
		}
				
		scanner.close();
	}

}
