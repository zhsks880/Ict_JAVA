package mymain;

public class _06_Ex_for2 {

	public static void main(String[] args) {
		//abcd...xyz ���� ����� �غ��� 
		//�ؿ� for ���� ��������� ������ ����� �޸� �غ��°Ŵ�~
		
		for(int i=65; i<=90; i++)  //i�� 65�����ؼ� 90���� ���ƶ�~
		{
			System.out.printf("%c", i);
		}
		System.out.println();
		//==================================================================================================
		for(int i='A'; i<='Z'; i++) //i�� A�����ؼ� Z���� ���ƶ�~
		{
			System.out.printf("%c", i);
		}
		System.out.println();
		
		for(int i=0; i<26; i++) 	//i�� 0~25���� ���鼭 i �� �ϳ��� �߰��ϸ鼭 �غ���~
		{
			System.out.printf("%c", 'A'+ i);
		}
		System.out.println();
		//==================================================================================================
		//Question1 : AbCdEfGh....�빮�ڼҹ��ڷ� ǥ���غ���
		for(int i='A'; i<='Z'; i++)
		{
			if(i%2==1) { 		//Ȧ���� �빮��
				System.out.printf("%c", i); 
			}else {      		//�빮��+32 = �ҹ���
			System.out.printf("%c", i+32);}
		}
		System.out.println();
		//==================================================================================================
		//Question2 : AbcDefGhiJklMnoP 
		for(int i=0; i<26; i++)
		{
			if(i%3==0) 
			{
			System.out.printf("%c", 'A'+i);
		} else {
			System.out.printf("%c", 'A'+i+32);
		}
		}
		System.out.println();
		//==================================================================================================
		//Question3 :  ABC-DEF-GHI-JKL-
		//01234567890123456789012345   <=i
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		//�׷��Ƿ� 2,5,8,11 �ڸ��� "-"�� ���� �Ǵ°���/ �׷��� 3���� ������ ������ 2���ڸ��� 2,5,8,11�� ��
		for(int i=0; i<26; i++)
		{
			System.out.printf("%c", 'A'+i);
			if(i%3==2)
				System.out.print('-');   //�ڸ��� ã�Ƽ� �� �ڸ��� ������ �־���� ���� ��
		}
		System.out.println();
		//==================================================================================================
		/* Question3 �� ���� ���
		 * { 
		 * 	if(i%3==2) 
		 * 		{ System.out.printf("%c��", 'A'+i); 
		 * }else {
		 * 		System.out.printf("%c", 'A'+i ); 
		 * } } 
		 * System.out.println();
		 */
		
	}
}
