package api.io.folder;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file = new File("c:/Work/folder_test");
		
		if(file.exists()) {
			file.delete();		//delete ���� �� true, ���� �� false�� ����.
			System.out.println("���� ���� ����!");
		}else {
			System.out.println("���� ���� ���� or �������� ����!");
		}
		
	}

}
