package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_Jumin_Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Jumin jumin = new Jumin();
		
		String jumin_no;
		String yn = "y";
		
		while(true) {
			
			System.out.printf("�ֹι�ȣ (xxxxxx-xxxxxxx): ");
			jumin_no = scanner.next();
			
			//�Է��ֹι�ȣ�� jumin��ü���� ����(setter)
			jumin.setJumin_no(jumin_no);
			
			//�ΰ����� ���Ѵ�
			int year 		= jumin.getYear();
			int age 		= jumin.getAge();
			String tti 		= jumin.getTti();
			String gender 	= jumin.getGender();
			String season 	= jumin.getSeason(); 
			String ganji	= jumin.getGanji();
			String area		= jumin.getArea();
			
			//���
			System.out.printf("����⵵(����):%d��(%s)\n", year, ganji);
			System.out.printf("���� : %d��\n", age);
			System.out.printf("�� : %s��\n", tti);
			System.out.printf("���� : %s\n", gender);
			System.out.printf("���� : %s\n", season);
			System.out.printf("���� : %s\n", area);
			
			//�ٸ��� �� �غ���?
			System.out.printf("��?(y/n):");
			yn = scanner.next();
			
			if (!yn.equalsIgnoreCase("Y")) break;
		}// end-while
		
		System.out.println("�ڡڡڡڡڡڡڡڡڡ�END�ڡڡڡڡڡڡڡڡڡ�");
		
		scanner.close();
	}
}
