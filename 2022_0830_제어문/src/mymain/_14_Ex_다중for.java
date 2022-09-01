package mymain;

public class _14_Ex_다중for {

	public static void main(String[] args) throws InterruptedException {
		//전체 별5행5열 찍기
		System.out.println("======[5행5열찍기]======");
		for(int i=0; i<5; i++)  			// i= 01234 까지 돈다(i를 밑에 for문 전체로 5번)
		{
			for(int k=0; k<5; k++)  		// k= 01234 까지 돈다
			{
				System.out.print("★");
				//System.out.printf("(i=%d k=%d)", i, k);
				//Thread.sleep(500);		// 이거 할때는 exception 추가해줘야함
			}
			System.out.println(); 	//줄바꾸기
		}
//==========프로그래밍은 전체를 그리고 나머지를 뺴는 방식으로 생각하는게 편함==========		
		System.out.println("======[삼각형1]======");
		for(int i=0; i<5; i++)  			// i= 01234 까지 돈다(i를 밑에 for문 전체로 5번)
		{
			for(int k=0; k<5; k++)  		// k= 01234 까지 돈다
			{
				if(k<=i)
					System.out.print("★");
				else
					System.out.print("-");
			}
			System.out.println(); 			//줄바꾸기
		}
		
		System.out.println("======[삼각형2]======");
		for(int i=0; i<5; i++)  			// i= 0124 까지 돈다(i를 밑에 for문 전체로 5번)
		{
			for(int k=0; k<5; k++)  		// k= 01234 까지 돈다
			{
				if(k<i)
					System.out.print("  ");
				else
					System.out.print("★");
			}
			System.out.println(); 			//줄바꾸기
		}
		
		System.out.println("======[바람개비]======");
		for(int i=0; i<5; i++)  			// i= 01234 까지 돈다(i를 밑에 for문 전체로 5번)
		{
			for(int k=0; k<5; k++)  		// k= 01234 까지 돈다
			{
				if(i==k || i==4-k)
					System.out.print("  ");
				else
					System.out.print("★");
			}
			System.out.println(); 			//줄바꾸기
		}
		
		System.out.println("======[엑스자만들기]======");
		for(int i=0; i<5; i++)  			// i= 01234 까지 돈다(i를 밑에 for문 전체로 5번)
		{
			for(int k=0; k<5; k++)  		// k= 01234 까지 돈다
			{
				if(i==k || i==4-k)
					System.out.print("★");
				else
					System.out.print("  ");
			}
			System.out.println(); 			//줄바꾸기
		}
		
		System.out.println("======[삼각형3]======");
		for(int i=0; i<5; i++)  			// i= 01234 까지 돈다(i를 밑에 for문 전체로 5번)
		{
			for(int k=0; k<5; k++)  		// k= 01234 까지 돈다
			{
				
				if(k<4-i)					// k가4보다 짝으면 공백으로 찍어라(k를 기준으로 공백)
											// k<4-3 , k<4-2, k<4-1, k<4-0
					System.out.print("  ");
				else
					System.out.print("★");
			}
			System.out.println(); 	//줄바꾸기
		}
		
		System.out.println("======[마름모]======");
		int chasu = 5;
		int center = chasu/2;
		
		for(int i=0; i<chasu; i++)
		{
			for(int k=0; k<chasu; k++)
			{
				if(i<=center)								// 마름모 상단
				{  											
					if(k>=center-i && k<=center+i)
						System.out.print("★");
					else
						System.out.print("  ");
				}else {										//마름모 하단
					int a = chasu-i-1;
					if(k>=center-a && k<=center+a) 			//별 출력 범위
						System.out.print("★");
					else
						System.out.print("  ");
				}
			
			}//end-k
			System.out.println();
		
		}//end-i
		
		

	}
	
}
