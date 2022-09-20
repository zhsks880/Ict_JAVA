package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("c:/Work/file/test.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader ���� readline() �޼��尡 �ְ�,
			//�� �߸� ��°�� �о String ���� ������ �ݴϴ�.
			
//			System.out.println(br.readLine());	//���پ� �о���� ���
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());	//txt���� �ȿ� 3��° �� �� ��� null ��
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
