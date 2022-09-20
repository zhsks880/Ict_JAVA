package api.io.rw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		/*
		-���ڱ������ �о���̴� Ŭ������ FileReader �Դϴ�.
		-2����Ʈ ������ �б� ������ ���ڸ� �о���̱� �����մϴ�.
		*/
		
		FileReader fr = null;
		try {
			fr = new FileReader("c:/Work/file/merong.txt");
			char[] arr = new char[100];
			
			int result = fr.read(arr);		//���ڸ� �ϳ��� �о����
			System.out.println("������ ����: " + result);
			
			for(char c : arr) {
				System.out.print(c);
				if(c==0) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
