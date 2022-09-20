package api.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	private static FileInputStream fis;

	public static void main(String[] args) {
		/*
		1. ������ �о���̴µ� ����ϴ� Ŭ������ FileInputStream �Դϴ�.
		2. �������� �Ű������� �о���� ������ ��ü ��θ� �����ϴ�.
		3. InputStream ��ü�� �����ڿ� throws�� �ֱ� ������ ����ó���� �ʼ���
		->try-catch�ȿ��� ���.
		*/
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/Work/hello.txt");	//�о������ �ϴ� ��� �Է�
	
//			while(true) {
//				int data = fis.read();	//1����Ʈ ������ �����͸� �о����.
//				System.out.print((char) data);
//				if(data == -1) break;	//read() �޼��尡 �� �̻� ���� ���� ���ٸ� -1�� ��ȯ.
//			}
			
			byte[] arr = new byte[100];
			int result = fis.read(arr);	//100����Ʈ ������ �о���̰ڴ�.
			System.out.println("�о���� ������ ����:" + result);
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(arr[i] !=0) {
				System.out.print((char) arr[i]);
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//��Ʈ���� ���̻� ������� ������� �ý��� �ڿ��� �ݳ��ϴ� �ڵ带 �� �ۼ��մϴ�.
				fis.close();	//���⼭ �����ָ� nullpointexception �������� �ִ�. fis �� ���� ���� ��쵵 �־...
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
