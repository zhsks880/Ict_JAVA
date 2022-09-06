package myutil;

//������ ����� ���ִ� ���� ��ü
public class MyMath {
	
	private MyMath() {}	//�⺻������ ���θ� jvm�� public ��ü�� �����ؼ� ���� ���� ���ƹ��� private ���� ^0^
	
	public static int plus(int a, int b) {
		return a+b;
	}

	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int max(int a, int b, int c) {
		int big = a > b ? a : b;
		big = c > big ? c : big;
		return big;
	}
	
	//��������(elipsis) :������ ������ ������ ����
	//��:MyMath.min(2,3); int [] nr = {2.3};
	//��:MyMath.min(2,3,4); int [] nr = {2.3,4};
	public static int min(int...nr) {
		int small = nr[0];
		for (int i=1; i<nr.length; i++) {
			small = small > nr[i] ? nr[i] : small;
		}		
		return small;
	}
	
	public static int max2(int...nr) {
		int big = nr[0];
		for (int i=1; i<nr.length; i++) {
			big = big > nr[i] ? big : nr[i];
		}
		return big;
	}
	
	
	
	
	
	
}
