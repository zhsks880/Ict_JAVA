package mymain;

public class _10_���׿����� {

	public static void main(String[] args) {
		//(����) ? ���϶��� : �����϶���
		
		//2���� �� �� ū�� ���ϱ�
		int a = 10 , b = 5, c;
		c = (a > b) ? a : b;
		System.out.printf("%d ��(��) %d�� ū���� %d�Դϴ�\n", a,b,c);
		
		//���밪 ���ϱ�
		int n = -100;
		int m = ( n < 0 ) ? -n : n;
		System.out.printf("|%d| => %d\n", n,m);
		
		//���밪 ���ϱ� if~else
		if (n <0) 
			m=-n;
		else
			m=n;
		
		// ó���ӵ�
		// 3�׿����� < ���(if)
		
	}

}
