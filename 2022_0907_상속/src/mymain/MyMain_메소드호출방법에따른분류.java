package mymain;

import myutil.MyLine;

public class MyMain_�޼ҵ�ȣ�����������з� {

	public static void main(String[] args) {
		/*
			1.Call by name
			2.Call by Value
			3.Call by Reference	
		*/
		
		//1.Call by name
		//MyLine.draw_line();
		//�ȿ� �����ִ°Ÿ� �״�� ǥ���ض�
		
		//2.Call by Value
		//My.Line.draw_line(30);
		//value �� �Է��ؼ� �װ��� ǥ���ض�
		
		//3.Call by Reference
		//MyLine.draw_title("[��������]", 10);
		
		int line_len = 30;
		String title = new String("[��������]");
		
		
		MyLine.draw_title(title, 10);
		//System.out.println("=======[��������]=======");
		System.out.println("��ȣ �̸� ���� ���� ����");
		//System.out.println("========================");
		//MyLine.draw_line();			// 1.�����߱Ⱑ �ʹ� ������쿣 �޼ҵ带 �س��� �ѹ��� �����ϸ� ����(�������׹߻���)
		//MyLine.draw_line(line_len);
		MyLine.draw_line('|', 30); 		//3. ������ �� ������ �ڵ�ȭ
		System.out.println("  1  �ϱ浿 77  88   90");
		System.out.println("  2  �̱浿 77  88   90");
		//System.out.println("========================");
		//MyLine.draw_line();
		MyLine.draw_line(line_len);		//2. ���߱��� �ڵ�ȭ..
		MyLine.draw_line('*', 4, '-', 2, 20);
		//MyLine.draw_line('*',3,'-',2,30);
		// ***--***--***--
		
		//MyLine.draw_line('*',1,'-',3,30);
		// *---*---*---*
		
	}

}
