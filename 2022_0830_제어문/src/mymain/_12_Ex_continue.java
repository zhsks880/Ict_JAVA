package mymain;

public class _12_Ex_continue {

	public static void main(String[] args) {
		
		int sum = 0;
		
		//1.¦���� ���� ���ϴ� ��� 1��
		for(int i=0; i<=10; i++)
		{
			if(i%2==0)
				sum = sum + i;
		}
		System.out.println(sum);
		
		//2.¦���� ���� ���ϴ� ��� 2��
		sum = 0;
		for(int i=0; i<=10; i++)
		{
			if(i%2==1) continue; 	//Ȧ���� ��쿣 sum=sum+i; �� ������������ ���������� GoGo
			sum = sum + i;
		}
		System.out.println(sum);
		
		//3.¦���� ��
		sum = 0;
		for(int i=0; i<=10; i+=2)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
