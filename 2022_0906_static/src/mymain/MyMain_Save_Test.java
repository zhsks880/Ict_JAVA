package mymain;

import myutil.Save;

public class MyMain_Save_Test {

	public static void main(String[] args) {
		//static����: Ŭ������.������ ���� �ҷ��ͼ� ���� �ٷ� ���� ����
		Save.rate = 0.2;
		//Save [] s_array = { new save("�ϱ浿", 1000000), new save("�̱浿", 2000000), new save("��浿", 3000000)};
		Save s1 = new Save("�ϱ浿", 1000000);
		Save s2 = new Save("�̱浿", 2000000);
		Save s3 = new Save("��浿", 3000000);
		
		System.out.printf("---[����:%.2f]---\n", Save.rate);
		s1.display();
		s2.display();
		s3.display();
		
		//s1.rate = 0.1;	�̷��� �ᵵ ������ �����ϸ� ��������
		Save.rate =0.1;
		System.out.printf("---[����:%.1f]---\n", Save.rate);
		s1.display();
		s2.display();
		s3.display();
	}

}
