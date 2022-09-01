package mymain;

public class _10_Ex_dowhile1 {

	public static void main(String[] args) {
		//10까지의 합
		int sum = 0;
		int i = 0;
		
		do
		{
			sum = sum + i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		
	}

}
