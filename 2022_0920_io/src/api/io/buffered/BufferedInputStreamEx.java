package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("c:/Work/file/3dd.txt");
			bis = new BufferedInputStream(fis);
			/*
	          - read(): �� ����Ʈ�� int�� �о��
	          - read(byte[]): ������ byte[]�� ũ�⸸ŭ ä���ش�.
	           ������ �迭�� �� byte�� ä������ ��ȯ�Ѵ�.
	          - read(byte[], off, len)
	          : ������ byte[]�߿� off���� len������ �����͸� ä���.
	          */
			int b;
			while((b = bis.read()) !=-1) {
				System.out.print((char) b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
