package mymain;

import java.util.Scanner;

public class _09_�Ϲݳ�������_�������ϱ� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor;
		String grade="F";  //�⺻�� F �����
		
		System.out.print("���������Է�: ");
		kor = scanner.nextInt();
		
		//A�������� : 90~100�� ����
		if(kor>=90 && kor<=100) grade ="A";
			
		//B�������� : 80~89�� ����
		if(kor>=80 && kor<=89) grade ="B";
		
		if(kor>=70 && kor<=79) grade ="C";
		if(kor>=60 && kor<=69) grade ="D";

		
		System.out.printf("�ϳ��� ������[%d]���̰�\n�����[%s]\n", kor, grade);
					
		scanner.close();
		
		
	}

}
