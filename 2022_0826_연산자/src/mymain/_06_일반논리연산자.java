package mymain;

public class _06_�Ϲݳ������� {

	public static void main(String[] args) {
		//�Ϲݳ� : &&(and)	||(or)
		System.out.println("=============[&&]=============");
		System.out.printf("true && true =>%b\n", true && true);
		System.out.printf("true && false =>%b\n", true && false);
		System.out.printf("false && true =>%b\n", false && true);
		System.out.printf("false && false =>%b\n", false && false);
		
		System.out.println();
		System.out.println("=============[||]=============");
		System.out.printf("true || true =>%b\n", true || true);
		System.out.printf("true || false =>%b\n", true || false);
		System.out.printf("false || true =>%b\n", false || true);
		System.out.printf("false || false =>%b\n", false || false);
		
		//short circuit evaluation(����������) : && ||
		int x=1;
		int y=2;
		boolean z;
		
		z=--x>0 && ++y>0;
		//x=0 y=2 z=false (���� �̹� false �� �ڴ� ��� ����, and�����ڴ� ���� false �� �ڵ� �Ⱥ�)
		System.out.printf("x=%d y=%d z=%b\n", x,y,z);
		
		z=++x>0 || ++y>0;
		//x=1 y=2 z=true (���� �̹� true �� �ڴ� ��� ����, or�����ڴ� ���� true �� �ڵ� �Ⱥ�)
		System.out.printf("x=%d y=%d z=%b\n", x,y,z);
		
	}

}
