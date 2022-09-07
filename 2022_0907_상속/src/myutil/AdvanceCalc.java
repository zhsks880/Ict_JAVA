package myutil;

public class AdvanceCalc extends BaseCalc {	//class 생성시 superclass 란을 설정해도 되고 아니면 하드코딩해서 "extends 클래스명" 써도 됨
	
	public int hap(int n) {
		
		int sum = 0;
		
		for(int i=0; i<=n; i++)
			//sum = sum + i;	sum = this.plus + i;	sum = plus + i;(this생략)
			sum = super.plus(sum, i);	//위도 가능 이것도 가능 상속받아서 다 가능~
			
		return sum;
	}
	
	public double pow(int n, int m) {
		
		double result = 1.0;
		
		for(int i=0; i<m; i++)
			//result = result * n;
			result = super.multiply(result, n);
		
		return result;
	}
	
}
