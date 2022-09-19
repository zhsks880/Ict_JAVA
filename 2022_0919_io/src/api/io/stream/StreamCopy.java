package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("c:/Work/1.png");
			newFile = new FileOutputStream("c:/Work/file/copy.jpg");
			
			byte[]arr = new byte[100];
			
			while(true) {
				//�о���� �����Ͱ� �ִٸ� ���� �������� ���̸� ��ȯ, ���ٸ� -1�� ��ȯ.
				int result = oldFile.read(arr);
				if(result==-1) break;
				
				//����Ʈ ������ 0���� ���� ���� ũ������� ������ �ۼ�
				newFile.write(arr, 0, result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
