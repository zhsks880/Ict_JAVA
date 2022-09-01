package mymain;

public class _15_test {

	public static void main(String[] args) {
		int num = 33;
		String result="";
		
		if(num%2==0) result = "짝수";
		else result ="홀수";
		System.out.println(result);
	
	
		
		int a = 80 , b = 33, d=55, c;
		c = (a > b  ) ? a : b;
		System.out.printf("%d 와(과) %d와 중 큰수는 %d입니다\n", a,b,c);
		
		c= (a > d) ? a : d;
		System.out.printf("%d 와(과) %d와 중 큰수는 %d입니다\n", a,d,c);
		
		int e= 80;
		int f= 33;
		int g= 55;
		
		if (e>f) {
			System.out.println("e가f보다 큽니다");
		}else if (e>g) {
			System.out.println("e가g보다 큽니다");
		}else if (f>g) {
			System.out.println("f가g보다 큽니다");
		}
			
		
	
	
	
	
	}
	
}
