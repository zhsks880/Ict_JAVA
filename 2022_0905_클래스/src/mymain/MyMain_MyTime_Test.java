package mymain;

import myutil.MyTime;

public class MyMain_MyTime_Test {

	public static void main(String[] args) {
				
		MyTime mt1 = new MyTime();			//����ð� getinstance �� ����������
		mt1.display();
		
		MyTime mt2 = new MyTime(12);
		mt2.display();
		
		MyTime mt3 = new MyTime(16, 10);
		mt3.display();
		
		MyTime mt4 = new MyTime(16, 8, 30);
		mt4.display();
		
	}
}