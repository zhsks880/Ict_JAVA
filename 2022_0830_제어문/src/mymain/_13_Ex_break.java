package mymain;

public class _13_Ex_break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		//1~10������ ���ϰ� ������ while ��
		while(true)
		{
			sum = sum + i;
			i++;
			//break: �ش�ݺ����� Ż��(����)�ض�
			if(i>10) break; 
		}
		System.out.println(sum);
		
	}

}
