package mymain;

public class _15_������ {

	public static void main(String[] args) {
		int chasu = 5;
		int center = chasu/2;
		
		for(int i=0; i<chasu; i++)
		{
			for(int k=0; k<chasu; k++)
			{
				if(i<=center){  								// ������ ���
					if(k>=center-i && k<=center+i)
						System.out.print("��");
					else
						System.out.println("  ");
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
