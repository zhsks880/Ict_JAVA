package mymain;

public class _13_Ex_break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		//1~10까지만 더하고 끝내는 while 문
		while(true)
		{
			sum = sum + i;
			i++;
			//break: 해당반복문을 탈출(종료)해라
			if(i>10) break; 
		}
		System.out.println(sum);
		
	}

}
