package mymain;

import java.io.FileReader;
import java.io.IOException;

public class _04_MyMain_finally {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {							//���ڵ念��
			fr = new FileReader("a.txt");
			
			while(true) {
				int ch = fr.read();
				if(ch==-1) break;		//������ ���̸� �����ض�
				System.out.printf("%c", ch);
			}
			
		} catch (Exception e) {			//����ó������
			e.printStackTrace();
			
		}finally {						//���� �Ǵ� ���ܿ� ������� ������ ����Ǵ� ����(try catch �� �����ִ� ��¡��)
			
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}//end-finally
		
		System.out.println("\n--��������--");
	}

}
