package mymain;

public class _08_Ex_while1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		//���1
		for(int i=0; i<=10; i++)
			sum = sum + i; // <-�ֶ� ���� sum += i;
		System.out.println(sum);
		
		//���2 : for���� ���ǽĸ� ����� ���� ���
		int n = 0;
		sum = 0;
		for(  ; n<=10; )
		{
			sum = sum + n;
			n++;
		}
		System.out.println(sum);
		
		//���3 : while������~
		int m = 0;
		sum = 0;
		while(m<=10) 
		{
			sum = sum + m;
			m++;
		}
		System.out.println(sum);
		
		
	}

}
