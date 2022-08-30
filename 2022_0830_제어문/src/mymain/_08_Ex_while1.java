package mymain;

public class _08_Ex_while1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		//방법1
		for(int i=0; i<=10; i++)
			sum = sum + i; // <-애랑 같음 sum += i;
		System.out.println(sum);
		
		//방법2 : for문에 조건식만 남기고 쓰는 방법
		int n = 0;
		sum = 0;
		for(  ; n<=10; )
		{
			sum = sum + n;
			n++;
		}
		System.out.println(sum);
		
		//방법3 : while문으로~
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
