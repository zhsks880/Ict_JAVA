package myutil;

//수학적 계산을 해주는 서비스 객체
public class MyMath {
	
	private MyMath() {}	//기본적으로 냅두면 jvm이 public 객체로 생성해서 내가 따로 막아버림 private 으로 ^0^
	
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
	
	//가변인자(elipsis) :인자의 갯수가 정하지 않음
	//예:MyMath.min(2,3); int [] nr = {2.3};
	//예:MyMath.min(2,3,4); int [] nr = {2.3,4};
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
