package myutil;

public class MyMath {
	//Method Overload(�ߺ��޼ҵ�)
	//: �޼ҵ���� �����ϳ� ȣ�� ���������� Ʋ���޼ҵ�
	//: �������� ��δ� plus �� �س��� ����� ���忡�� �����̰� �����̰� ������ �տ� ���ؼ� plus�� ���� ��
	
	//2���� ���� ���ϴ� �޼ҵ�(����)
	public static int plus(int a, int b) {
		int c= a + b;
		return c;
	}
	
	//2���� ���� ���ϴ� �޼ҵ�(�Ǽ�)
	public static double plus(double a, double b) {
		double c= a + b;
		return c;
	}
	
	//3���� ���� ���ϴ� �޼ҵ�
	public static int plus(int a, int b, int c) {
		int d= a + b + c;
		return d;
	}
	
	//n������ ���� ���ϴ� �޼ҵ�
	public static int hap(int n) {
		int sum = 0;
		
		for(int i=0; i<=n; i++)
			sum = sum + i;
		
		return sum; // return �� �������� ����� ���� �����ִ� �޼ҵ尡 �Ǵϱ� ������
	}
}
