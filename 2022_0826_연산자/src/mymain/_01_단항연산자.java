package mymain;

public class _01_���׿����� {

	public static void main(String[] args) {
	//���׿����� : ~ ! ++ -- (cast) -(��ȣ)
	//=> ���꿡 �����ϴ� ���� 1�� �� ������
	
	// ~ (tield) : ������Not������(1�Ǻ���)
	
	System.out.println("�ڡڡڡڡڡڡ�[������Not�����ڿ����ѿ���]�ڡڡڡڡڡڡ�");
	int n = 10;
	// Integer.toBinaryString(����) : �ش������� ���� 2������ ���ڿ�(String) ��ȯ
	System.out.printf("[%32s]\n",Integer.toBinaryString(n));
	System.out.printf("[%32s]\n",Integer.toBinaryString(~n));
	System.out.println();
	
	System.out.println("�ڡڡڡڡڡڡ�[�Ϲݳ�Not������]�ڡڡڡڡڡڡ�");
	// ! : �Ϲݳ�Not������ : ������� boolean
	boolean b0k = !(3>2);
	
	System.out.printf("!(3>2) : %b\n", b0k);
	
	System.out.printf("!true : %b\n", !true);
	System.out.printf("!false : %b\n", !false);
	System.out.println();
	
	System.out.println("�ڡڡڡڡڡڡ�[����(++/==)������]�ڡڡڡڡڡڡ�");
	//���������� : ++(����)  --(����)
	// ++���� (������)
	// ����++ (������)
	
	int m = 10;
	System.out.printf("m=%d\n", m);
	//����/�������� �ܵ����� ���ɶ� �ǹ� ����.
	m++; // m=m+1 �� ������ (�ڽ��� 1����)
	System.out.printf("m++�� ��� m=%d\n", m);
	--m; // m=m-1 �� ������ (�ڽ��� 1����)
	System.out.printf("--m�� ��� m=%d\n", m);
	
	//�������� �������� �ǹ̰� �ִ� ����
	//������: ��翬�꿡 �ռ��� ���� ���� ����ȴ�
	//������: ��翬���� ����� �Ŀ� ���� �������� ����ȴ�
	
	int x = 10;
	int y = 5;
	int z = ++x + y--;
	
	//1) ++x -> 11
	//2) z=x+y ->16
	//3) y-- ->15
	System.out.printf("x=%d y=%d z=%d\n", x, y, z);
	System.out.println();
	
	System.out.println("�ڡڡڡڡڡڡ�[��ȣ������]�ڡڡڡڡڡڡ�");
	//��ȣ������: ���տ��ٰ� - ������ => (-1) * ��
	int a = 10;
	System.out.printf("%d =>��ȣ���� : %d\n", a, -a);
	System.out.println();
	
	System.out.println("�ڡڡڡڡڡڡ�[cast������]�ڡڡڡڡڡڡ�");
	//cast������: (�ڷ���) ��
	
	/* 
	 ����ȯ
	 	1.�ڵ�����ȯ(���θ��)
	 		A)���Խ� : �º��׿� ���߾�����(��, �º����� Ŭ ���)
	 		cf)�ʱ�ȭ: ��������� ���ÿ� ���� ����
	 		int a;
	 			a   =    10;
	 		(�º���)  (�캯��)
	 		
	 		B)����� : �ڷ��� ū������ ���缭 ����
	 		
	 	2.��������ȯ(cast������) : ����
	  		(�ڷ���)��
	  		ū�ڷ����� ���� �ڷ������� �ٲܶ�
	 */
	
	
	//A)���Խ� �ڵ�����ȯ
	double d;
	d = 1;  // ��Ģ�����δ� double = int (x) �ڵ�����ȯ���� ���Ͽ� 1) 1(int)->1.0(double) 2)d=1.0 ���� ¥��~
	
	//B)����� ����ȯ
	d = 1 + 1.0;  // 1(int) + 1.0(double)(X)
	//               1.0(double) + 1.0(double) = 2.0 ���� ¥��
	
	/*
	 	int ������ �����ɷ� ���ϸ� ������ int �� ���� ��������
	 	�׿ܴ� ���� �� ū�ɷ� ���󰣴�~
	 	byte + byte => int
	 	byte + short => int
	 	
	 	byte + int => int
	 	byte + long => long
	 	int + float => float
	 	int + double => double
	 
	 */
	
	//2.��������ȯ
	byte b1 = 1, b2 =2, b3;
	b3 = (byte)(b1+b2);
	System.out.println(b3);
	
	short s1 = 1, s2 = 2, s3;
	s3 = (short) (s1 + s2);
	System.out.println(s3);
	
	float f = (float) 1.0;
	System.out.printf("ȫ�浿 Code��: [%x][%x][%x]\n", (int)'ȫ', (int)'��', (int)'��');
	
	
	}

}
