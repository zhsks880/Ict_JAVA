package mymain;

public class _04_���迬���� {

	public static void main(String[] args) {
		//���迬����:  >   >=  <   <=  ==   !=  (���:boolean)
		
		int a =3, b=2;
		System.out.printf("%d > %d: %b\n", a, b, a>b);
		System.out.printf("%d < %d: %b\n", a, b, a<b);
		System.out.println();
		System.out.printf("%d >= %d: %b\n", a, b, a>=b);
		System.out.printf("%d <= %d: %b\n", a, b, a<=b);
		System.out.println();
		//  == �⺻���ڷ���(������ ��~) �� �� ���(��ü �񱳽� ����ϸ� �ȵ�)
		System.out.printf("%d == %d: %b\n", a, b, a==b);
		System.out.printf("%d != %d: %b\n", a, b, a!=b);
				
	}

}
