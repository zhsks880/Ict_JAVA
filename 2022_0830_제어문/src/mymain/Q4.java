package mymain;

public class Q4 {

	public static void main(String[] args) {
		int sum = 0;
		double sail = 0;
		
		for (int i=0; i<=10; i++) {			//i�� 0�϶� 10000���� �Ǿ� ������ ��
			sum = (1000*i) +10000;
			sail = sum*0.7;
			System.out.printf("���󰡰� : %d  ���ϰ��� : %.1f\n", sum, sail);
			
		}
		
	}

}
