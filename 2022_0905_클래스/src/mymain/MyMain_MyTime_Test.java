package mymain;

import myutil.MyTime;
import myutil.MyTime2;

public class MyMain_MyTime_Test {

	public static void main(String[] args) {
				
		MyTime mt1 = new MyTime();			//현재시간 getinstance 로 가져와있음
		mt1.display();
		
		MyTime mt2 = new MyTime(12);
		mt2.display();
		
		MyTime mt3 = new MyTime(16, 10);
		mt3.display();
		
		MyTime mt4 = new MyTime(16, 8, 30);
		mt4.display();
		
		MyTime2 mt22 = new MyTime2();
		mt22.display();
		
		MyTime2 mt221 = new MyTime2(9);
		mt221.display();
		
		MyTime2 mt222 = new MyTime2(9,10);
		mt222.display();
		
		
		
	}
}