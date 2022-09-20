package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		/*
		# BUffered I/O
		- ���۸� �̿��ؼ� �б�/���� ������ ����Ű�� Ŭ����
		- ����: �����͸� ��/��� �ϱ����� �ӽ÷� ������ �δ� �迭 ������ ����
		
		# ������ �̿��ؾ� �ϴ� ����
		- ���۸� ������� ������ ��/����� �ʹ� ���� �Ͼ��.
		ex) 
			"Java Programming"�� ���� ���
			->�⺻ OutputStream�� ����ϸ� �� ���ھ� 16���� ����� �߻���.
			->�迭 ���¿� ������ ���� �ѹ��� ���Ͽ� �����Ͽ� �ۼ��ϸ� �ѹ��� ��¸����� ������ �ִ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/Work/file/test.txt");
			bw = new BufferedWriter(fw);
			
			System.out.print("ù ����: ");
			String str1 = sc.nextLine();
			
			System.out.print("�ι�° ����: ");
			String str2 = sc.nextLine();
			
			bw.write(str1 + "\r\n" + str2);
			System.out.println("���� ���� ��� �Ϸ�!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
