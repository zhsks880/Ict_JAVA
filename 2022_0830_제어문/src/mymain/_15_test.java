package mymain;

public class _15_test {

	public static void main(String[] args) {
		int num = 33;
		String result="";
		
		if(num%2==0) result = "¦��";
		else result ="Ȧ��";
		System.out.println(result);
	
	
		
		int a = 80 , b = 33, d=55, c;
		c = (a > b  ) ? a : b;
		System.out.printf("%d ��(��) %d�� �� ū���� %d�Դϴ�\n", a,b,c);
		
		c= (a > d) ? a : d;
		System.out.printf("%d ��(��) %d�� �� ū���� %d�Դϴ�\n", a,d,c);
		
		int e= 80;
		int f= 33;
		int g= 55;
		
		if (e>f) {
			System.out.println("e��f���� Ů�ϴ�");
		}else if (e>g) {
			System.out.println("e��g���� Ů�ϴ�");
		}else if (f>g) {
			System.out.println("f��g���� Ů�ϴ�");
		}
			
		
	
	
	
	
	}
	
}
