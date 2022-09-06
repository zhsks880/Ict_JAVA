package mymain;

import java.util.Calendar;
import java.util.Date;

import myutil.MyWatch;

public class MyMain_Watch_Test {

	public static void main(String[] args) throws InterruptedException {
		
		while(true){
			
			/* ���� �ý��� �ð����ϱ�
			 * Date today = new Date();  	//�ִ� ���ʴ� new �� ����� ������ ����� ������ ������
			 * int hour = today.getHours(); 
			 * int minute = today.getMinutes();
			 * int second = today.getSeconds();
			 */
			
			//single-ton pattern
			Calendar c = Calendar.getInstance();	//�ִ� �ѹ� ����� ���� ��� ���Ǵ�����(�޸𸮼Һ� ����)
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			MyWatch mw = MyWatch.getInstance();		//mywatch �� �̱������� �ٲ㼭 �ѹ��� �ҷ��� ����ϰԲ� �س���
			//MyWatch mw = new MyWatch();			//MyWatch �� private �� �س��� ���̻� ���⼭ �ҷ��� ������ ���Ƶ�
			mw.display();
			
			System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
			
			Thread.sleep(1000);
		}
		
		
	}

}
