package mymain;

public class _14_Ex_����for {

	public static void main(String[] args) throws InterruptedException {
		//��ü ��5��5�� ���
		System.out.println("======[5��5�����]======");
		for(int i=0; i<5; i++)  			// i= 01234 ���� ����(i�� �ؿ� for�� ��ü�� 5��)
		{
			for(int k=0; k<5; k++)  		// k= 01234 ���� ����
			{
				System.out.print("��");
				//System.out.printf("(i=%d k=%d)", i, k);
				//Thread.sleep(500);		// �̰� �Ҷ��� exception �߰��������
			}
			System.out.println(); 	//�ٹٲٱ�
		}
//==========���α׷����� ��ü�� �׸��� �������� ���� ������� �����ϴ°� ����==========		
		System.out.println("======[�ﰢ��1]======");
		for(int i=0; i<5; i++)  			// i= 01234 ���� ����(i�� �ؿ� for�� ��ü�� 5��)
		{
			for(int k=0; k<5; k++)  		// k= 01234 ���� ����
			{
				if(k<=i)
					System.out.print("��");
				else
					System.out.print("-");
			}
			System.out.println(); 			//�ٹٲٱ�
		}
		
		System.out.println("======[�ﰢ��2]======");
		for(int i=0; i<5; i++)  			// i= 0124 ���� ����(i�� �ؿ� for�� ��ü�� 5��)
		{
			for(int k=0; k<5; k++)  		// k= 01234 ���� ����
			{
				if(k<i)
					System.out.print("  ");
				else
					System.out.print("��");
			}
			System.out.println(); 			//�ٹٲٱ�
		}
		
		System.out.println("======[�ٶ�����]======");
		for(int i=0; i<5; i++)  			// i= 01234 ���� ����(i�� �ؿ� for�� ��ü�� 5��)
		{
			for(int k=0; k<5; k++)  		// k= 01234 ���� ����
			{
				if(i==k || i==4-k)
					System.out.print("  ");
				else
					System.out.print("��");
			}
			System.out.println(); 			//�ٹٲٱ�
		}
		
		System.out.println("======[�����ڸ����]======");
		for(int i=0; i<5; i++)  			// i= 01234 ���� ����(i�� �ؿ� for�� ��ü�� 5��)
		{
			for(int k=0; k<5; k++)  		// k= 01234 ���� ����
			{
				if(i==k || i==4-k)
					System.out.print("��");
				else
					System.out.print("  ");
			}
			System.out.println(); 			//�ٹٲٱ�
		}
		
		System.out.println("======[�ﰢ��3]======");
		for(int i=0; i<5; i++)  			// i= 01234 ���� ����(i�� �ؿ� for�� ��ü�� 5��)
		{
			for(int k=0; k<5; k++)  		// k= 01234 ���� ����
			{
				
				if(k<4-i)					// k��4���� ¦���� �������� ����(k�� �������� ����)
											// k<4-3 , k<4-2, k<4-1, k<4-0
					System.out.print("  ");
				else
					System.out.print("��");
			}
			System.out.println(); 	//�ٹٲٱ�
		}
		
		System.out.println("======[������]======");
		int chasu = 5;
		int center = chasu/2;
		
		for(int i=0; i<chasu; i++)
		{
			for(int k=0; k<chasu; k++)
			{
				if(i<=center)								// ������ ���
				{  											
					if(k>=center-i && k<=center+i)
						System.out.print("��");
					else
						System.out.print("  ");
				}else {										//������ �ϴ�
					int a = chasu-i-1;
					if(k>=center-a && k<=center+a) 			//�� ��� ����
						System.out.print("��");
					else
						System.out.print("  ");
				}
			
			}//end-k
			System.out.println();
		
		}//end-i
		
		

	}
	
}
