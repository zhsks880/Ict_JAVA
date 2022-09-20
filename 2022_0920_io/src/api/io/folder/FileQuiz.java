package api.io.folder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {
	private static FileInputStream fis;
	
	public static void main(String[] args) {
		/*
		1. ��ĳ�ʸ� ���ؼ� ���ϸ��� ��Ȯ�� �Է¹޽��ϴ�.
       
       2. file������ �ش� ������ �����Ѵٸ� �ش� ������ upload������ �����ϼ���.
       ������ �������� �ʴ´ٸ� "���ϸ��� �����ϴ�." ���ܱ����� ����ϼ���.
       
       3. ���� ���߿� ������ �߻��ϸ� "���� ó�� �� ���� �߻�!" ������ ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		File file = new File("c:/Work/upload");
		if(!file.exists()) {
			file.mkdir();
		}else {
			System.out.println("�̹� ������ �����մϴ�");
		}
		
		System.out.print("���ϸ��� �Է�: ");
		String name = sc.next();
		
		try {
			oldFile = new FileInputStream("c:/Work/file/" + name + ".png");
			
			newFile = new FileOutputStream("C:/Work/upload/" + name + ".jpg");
			
			byte[] arr = new byte[100];
			
//			while(true) {
//				int result = oldFile.read(arr);
//				if(result==-1) break;
//				newFile.write(arr,0,result);
			
			int result;
			while((result = oldFile.read(arr)) !=-1) {		//�ּ����� ������ �����ϰ� ��
				newFile.write(arr,0,result);
			}
			System.out.println("���� ���� ����!");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (IOException e2) {
			System.out.println("���� ó�� �� ���ܰ� �߻��߽��ϴ�.");
		} finally {
			try {
				oldFile.close();
				newFile.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
