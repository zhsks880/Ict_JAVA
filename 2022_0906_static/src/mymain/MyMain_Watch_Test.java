package mymain;

import java.util.Calendar;
import java.util.Date;

import myutil.MyWatch;

public class MyMain_Watch_Test {

	public static void main(String[] args) throws InterruptedException {
		
		while(true){
			
			/* 현재 시스템 시간구하기
			 * Date today = new Date();  	//애는 매초당 new 로 만들고 버리고 만들고 버리고 형식임
			 * int hour = today.getHours(); 
			 * int minute = today.getMinutes();
			 * int second = today.getSeconds();
			 */
			
			//single-ton pattern
			Calendar c = Calendar.getInstance();	//애는 한번 만들고 나서 계속 사용되는중임(메모리소비가 적다)
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			MyWatch mw = MyWatch.getInstance();		//mywatch 를 싱글톤으로 바꿔서 한번만 불러서 사용하게끔 해놓음
			//MyWatch mw = new MyWatch();			//MyWatch 를 private 을 해놔서 더이상 여기서 불러서 못쓰게 막아둠
			mw.display();
			
			System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
			
			Thread.sleep(1000);
		}
		
		
	}

}
