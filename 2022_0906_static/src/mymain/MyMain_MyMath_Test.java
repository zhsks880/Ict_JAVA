package mymain;

import myutil.MyMath;

public class MyMain_MyMath_Test {

	public static void main(String[] args) {
		
		int a = 10, b = 5, c = 30, res;
		//����API���
		res= Math.max(a, b);
		System.out.printf("%d,%d�� �� ū���� %d�Դϴ�\n", a,b,res);
		
		//MyMath���
		//MyMath mm = new MyMath();  //��ü�� ����ִ� ���¶� ���� �޸𸮸� �Ծ �̰� ��������/�׸��� �⺻ API �� �� ���Ƶ�(private����)
		res= MyMath.max(a, b);
		System.out.printf("%d,%d�� �� ū���� %d�Դϴ�\n", a,b,res);
		
		res = MyMath.max(a, b, c);
		System.out.printf("%d,%d,%d�� �� ū���� %d�Դϴ�\n", a,b,c,res);
		
		res = MyMath.min(18,19);	//���� ���� ���� ���س��� ���� �������̳�?
		System.out.println(res);
		
		res = MyMath.max2(3,4,5,1);	//���� ū ���� ���س��� ���� ���� ���̳�?
		System.out.println(res);
	}

}
