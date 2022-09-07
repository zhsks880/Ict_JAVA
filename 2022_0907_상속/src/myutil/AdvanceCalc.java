package myutil;

public class AdvanceCalc extends BaseCalc {	//class ������ superclass ���� �����ص� �ǰ� �ƴϸ� �ϵ��ڵ��ؼ� "extends Ŭ������" �ᵵ ��
	
	public int hap(int n) {
		
		int sum = 0;
		
		for(int i=0; i<=n; i++)
			//sum = sum + i;	sum = this.plus + i;	sum = plus + i;(this����)
			sum = super.plus(sum, i);	//���� ���� �̰͵� ���� ��ӹ޾Ƽ� �� ����~
			
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
