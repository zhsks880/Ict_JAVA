package mymain;

public class _12_Ex_continue {

	public static void main(String[] args) {
		
		int sum = 0;
		
		//1.짝수의 합을 구하는 방법 1번
		for(int i=0; i<=10; i++)
		{
			if(i%2==0)
				sum = sum + i;
		}
		System.out.println(sum);
		
		//2.짝수의 합을 구하는 방법 2번
		sum = 0;
		for(int i=0; i<=10; i++)
		{
			if(i%2==1) continue; 	//홀수일 경우엔 sum=sum+i; 는 수행하지말고 증감식으로 GoGo
			sum = sum + i;
		}
		System.out.println(sum);
		
		//3.짝수의 합
		sum = 0;
		for(int i=0; i<=10; i+=2)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
