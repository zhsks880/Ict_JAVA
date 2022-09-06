package mymain;

import myutil.MyMath;

public class MyMain_MyMath_Test {

	public static void main(String[] args) {
		
		int a = 10, b = 5, c = 30, res;
		//기존API기능
		res= Math.max(a, b);
		System.out.printf("%d,%d수 중 큰수는 %d입니다\n", a,b,res);
		
		//MyMath기능
		//MyMath mm = new MyMath();  //객체가 비어있는 상태라 괜히 메모리만 먹어서 이건 하지마라/그리고 기본 API 는 다 막아둠(private으로)
		res= MyMath.max(a, b);
		System.out.printf("%d,%d수 중 큰수는 %d입니다\n", a,b,res);
		
		res = MyMath.max(a, b, c);
		System.out.printf("%d,%d,%d수 중 큰수는 %d입니다\n", a,b,c,res);
		
		res = MyMath.min(18,19);	//가장 작은 수를 구해내는 아주 좋은놈이네?
		System.out.println(res);
		
		res = MyMath.max2(3,4,5,1);	//가장 큰 수를 구해내는 아주 좋은 놈이네?
		System.out.println(res);
	}

}
