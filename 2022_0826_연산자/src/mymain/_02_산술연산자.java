package mymain;

public class _02_��������� {

	public static void main(String[] args) {
		//���������
		// *(��)  /(��)  %(������)
		//  +   -
		
		int a = 10, b=3;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		//   %�� ���ڷ� �νĽ�Ű���� '%' %%ǥ���Ѵ�
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		// "�� ���ڷ� �νĽ�Ű���� \" (�տ� \) => '"'
		System.out.println("�� ������ ���� \"�߿��� �޼���\" �Դϴ�.");
		// \�� ���ڷ� �νĽ�Ű���� \\ (�տ� \) => '\'
		System.out.println("C:\\Work");
		
		
		int x = 10;
		double y = 3.0;
		//�򿬻��� : ����/����=>��
		System.out.println(x / (int)y);  // 10.0 / 3.0
		System.out.println((int)(x / y)); // (int)(10.0/3.0)
		
		//������������
		System.out.println( x % y ); // 10 % 3.0
		System.out.println((int)( x % y) ); // (int)(10.0%3.0)
		
		// 3 % 10
		// ������<���� => ������ 
		System.out.println( 3%10 );
		
		// ������ 0�̸� ���� �Ұ�
		//System.out.println( 10 / 0 );
		//System.out.println( 10 % 0 );
	
	
	
		
		
		
	}

}
