package mymain;

public class Q7 {

	public static void main(String[] args) {
		int sum = 1;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum = sum * i;
			}
		}
		System.out.println(sum);
			
	}

}
