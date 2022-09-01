package myutil;

public class MyMath {
	//Method Overload(중복메소드)
	//: 메소드명을 동일하나 호출 인자정보가 틀린메소드
	//: 변수명을 모두다 plus 로 해놔서 사용자 입장에서 더블이건 정수이건 세수의 합에 관해서 plus만 쓰면 됨
	
	//2수의 합을 구하는 메소드(정수)
	public static int plus(int a, int b) {
		int c= a + b;
		return c;
	}
	
	//2수의 합을 구하는 메소드(실수)
	public static double plus(double a, double b) {
		double c= a + b;
		return c;
	}
	
	//3수의 합을 구하는 메소드
	public static int plus(int a, int b, int c) {
		int d= a + b + c;
		return d;
	}
	
	//n까지의 합을 구하는 메소드
	public static int hap(int n) {
		int sum = 0;
		
		for(int i=0; i<=n; i++)
			sum = sum + i;
		
		return sum; // return 을 붙혀야지 계산한 값을 돌려주는 메소드가 되니까 붙혀라
	}
}
