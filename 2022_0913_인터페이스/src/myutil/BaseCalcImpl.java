package myutil;

public class BaseCalcImpl implements BaseCalc{

	@Override
	public int plus(int a, int b) {
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}
	
	//default�� ���ǵ� �޼ҵ��� �����Ǵ� ���û���
	@Override
	public int gop(int a, int b) {
		return a*b;
	}
}
