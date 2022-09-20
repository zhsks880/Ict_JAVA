package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		/*
		1. ������ �� ��(�ۼ�) ����ϴ� Ŭ������ FileOutputStream �Դϴ�.
		2. �������� �Ű������� ������ �� ��ü ��θ� �����մϴ�.
		3. io ��Ű���� ��� Ŭ������ �����ڿ� throws Ű���尡 �ֱ� ������ try catch �ʼ�
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ�: ");
		String name = sc.next();
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/Work/" + name + ".txt");	//���������� �ϴ� ��� �Է�
			System.out.print("������ �Է��ϼ���: ");
			sc.nextLine();
			String str = sc.nextLine();
			
			byte[]arr = str.getBytes();		//���ڿ� �����͸� ����Ʈ �����ͷ� ��ȯ
			fos.write(arr);					//������ ����Ʈ������ �� ����
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
