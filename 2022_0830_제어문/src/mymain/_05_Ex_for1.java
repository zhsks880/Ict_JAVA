package mymain;

public class _05_Ex_for1 {

	public static void main(String[] args) throws InterruptedException {
		
		int sum = 0;
		//	   초기식;   조건식; 증감식;
		for(int  i=0;    i<=10;   i++) {
			//누적값 계산하는 식
			sum = sum + i; //(0~10까지 다 더하는 공식)
		}	
			/* for문이 돌아가는 형식을 보여주는 것
			 * System.out.print(i);
			 * if(i<10) System.out.print('+'); 
			 * else System.out.print('=');
			 * Thread.sleep(300); // 시간:milisecond
			 */
		System.out.println(sum);
		
	}

}
