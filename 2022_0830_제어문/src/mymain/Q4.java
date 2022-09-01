package mymain;

public class Q4 {

	public static void main(String[] args) {
		int sum = 0;
		double sail = 0;
		
		for (int i=0; i<=10; i++) {			//i가 0일때 10000원이 되야 시작이 됨
			sum = (1000*i) +10000;
			sail = sum*0.7;
			System.out.printf("정상가격 : %d  세일가격 : %.1f\n", sum, sail);
			
		}
		
	}

}
