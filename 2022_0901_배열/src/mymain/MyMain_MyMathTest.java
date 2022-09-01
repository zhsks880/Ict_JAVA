package mymain;

import myutil.MyMath;

public class MyMain_MyMathTest {

	public static void main(String[] args) {
		
		int x = 10 ,y = 5, z = 6, res;
		res = MyMath.plus(x,y);
		System.out.printf("%d + %d = %d\n", x,y,res);
		
		res = MyMath.plus(x,y,z);
		System.out.printf("%d + %d + %d = %d\n", x,y,z,res);
		
		res = Math.max(x,y);
		
		res = MyMath.hap(x);
		System.out.printf("%d까지의 합: %d\n", x, res);
	}

}
