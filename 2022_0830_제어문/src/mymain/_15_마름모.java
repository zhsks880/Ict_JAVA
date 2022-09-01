package mymain;

public class _15_마름모 {

	public static void main(String[] args) {
		int chasu = 5;
		int center = chasu/2;
		
		for(int i=0; i<chasu; i++)
		{
			for(int k=0; k<chasu; k++)
			{
				if(i<=center){  								// 마름모 상단
					if(k>=center-i && k<=center+i)
						System.out.print("★");
					else
						System.out.println("  ");
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
