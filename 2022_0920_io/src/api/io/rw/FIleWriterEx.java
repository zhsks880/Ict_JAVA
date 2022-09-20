package api.io.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterEx {

	public static void main(String[] args) {
		/*
		-���ڸ� �Ἥ ������ �� ����ϴ� Ŭ������ FileWriter �Դϴ�.
		-�⺻������ 2����Ʈ ������ ó���ϱ� ������ ���� ���⿡ �����մϴ�.
		*/
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/work/file/merong.txt");
			// \r:ĳ���� ����->Ŀ���� �� ������ ����� ����.
			// \n:�� ����(�ٹٲ�)
			// ��Ȳ�� ȯ�濡 ���� �� ���� �� Ŀ���� �� ������ �ȶ����ִ� ��찡 ����.
			
			String str = "������ 9�� 20�� �Դϴ�.\r\nȭ���� �Դϴ�.\r\n�� ȭ���Ϲۿ� �ȵ���?";
			fw.write(str);
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
