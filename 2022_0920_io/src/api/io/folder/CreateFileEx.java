package api.io.folder;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {
		/*
		-�ڹٿ��� �ܺ� ��η� ������ ������ ���� File Ŭ������ ����մϴ�.
		-�������� �Ű������� ������ ������ ��� + �������� �����մϴ�.
		*/
		File file = new File("c:/Work/folder_test");
		
		if(!file.exists()) {		//!�����������ڷ� ������~�� üũ��, �ش� ���� �� ������ �����ϸ� true, �������� ������ false
			file.mkdir();			//���� ����, ������ �������� �����ÿ� .mkdirs �� �ؾ���
			System.out.println("���� ���� �Ϸ�!");
		}else {
			System.out.println("�ش� ������ �̹� �����մϴ�.");
		}
		
		
		
		
	}

}
