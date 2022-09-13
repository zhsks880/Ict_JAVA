package mymain;

import myutil.BaseCalc;
import myutil.BaseCalcImpl;

public class MyMain_BaseCalc_Test {

	public static void main(String[] args) {
		
		//BaseCalc.PI = 3.1442123;
		int x=10, y=5, res;
		
		//인터페이스 = new 클래스()
		//(사용설명서)     (제조방법)
		BaseCalc calc = new BaseCalcImpl();
		res = calc.plus(x, y);
		System.out.printf("%d + %d = %d\n", x,y,res);

	}

}
