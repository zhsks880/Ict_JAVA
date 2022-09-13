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
	
	//default로 정의된 메소드의 재정의는 선택사항
	@Override
	public int gop(int a, int b) {
		return a*b;
	}
}
