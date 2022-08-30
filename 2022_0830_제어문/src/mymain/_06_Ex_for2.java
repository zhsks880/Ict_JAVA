package mymain;

public class _06_Ex_for2 {

	public static void main(String[] args) {
		//abcd...xyz 까지 출력을 해보자 
		//밑에 for 문은 결과적으론 같은데 방법을 달리 해보는거다~
		
		for(int i=65; i<=90; i++)  //i가 65시작해서 90까지 돌아라~
		{
			System.out.printf("%c", i);
		}
		System.out.println();
		//==================================================================================================
		for(int i='A'; i<='Z'; i++) //i가 A시작해서 Z까지 돌아라~
		{
			System.out.printf("%c", i);
		}
		System.out.println();
		
		for(int i=0; i<26; i++) 	//i가 0~25까지 돌면서 i 를 하나씩 추가하면서 해봐라~
		{
			System.out.printf("%c", 'A'+ i);
		}
		System.out.println();
		//==================================================================================================
		//Question1 : AbCdEfGh....대문자소문자로 표시해봐라
		for(int i='A'; i<='Z'; i++)
		{
			if(i%2==1) { 		//홀수면 대문자
				System.out.printf("%c", i); 
			}else {      		//대문자+32 = 소문자
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
		//그러므로 2,5,8,11 자리에 "-"이 들어가면 되는거임/ 그래서 3으로 나누고 나머지 2인자리가 2,5,8,11이 됨
		for(int i=0; i<26; i++)
		{
			System.out.printf("%c", 'A'+i);
			if(i%3==2)
				System.out.print('-');   //자리만 찾아서 그 자리에 하이픈 넣어줘라를 넣음 됨
		}
		System.out.println();
		//==================================================================================================
		/* Question3 의 나의 답안
		 * { 
		 * 	if(i%3==2) 
		 * 		{ System.out.printf("%c★", 'A'+i); 
		 * }else {
		 * 		System.out.printf("%c", 'A'+i ); 
		 * } } 
		 * System.out.println();
		 */
		
	}
}
