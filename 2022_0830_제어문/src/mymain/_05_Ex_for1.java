package mymain;

public class _05_Ex_for1 {

	public static void main(String[] args) throws InterruptedException {
		
		int sum = 0;
		//	   �ʱ��;   ���ǽ�; ������;
		for(int  i=0;    i<=10;   i++) {
			//������ ����ϴ� ��
			sum = sum + i; //(0~10���� �� ���ϴ� ����)
		}	
			/* for���� ���ư��� ������ �����ִ� ��
			 * System.out.print(i);
			 * if(i<10) System.out.print('+'); 
			 * else System.out.print('=');
			 * Thread.sleep(300); // �ð�:milisecond
			 */
		System.out.println(sum);
		
	}

}
