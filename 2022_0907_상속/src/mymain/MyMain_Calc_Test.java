package mymain;

import myutil.AdvanceCalc;
import myutil.BaseCalc;

public class MyMain_Calc_Test {
	
	//call by reference : use_basecalc 를 넘길떄 참조변수를 넘김
	static void use_basecalc(BaseCalc bc) {
		//					 BaseCalc bc = ac
		//					 BaseCalc 기능만 사용가능
		//원래는 ac로 참조변수를 주어서 1~3까지 기능을 다 썻지만 static 으로 bc로 고정 박아버리니까 1~2까지만 써짐
		//int res = bc.hap(10); / hap은 AdvanceCalc 기능이라 오류 뜸
		int a = 10, b = 5, res;
		res = bc.minus(a, b);
		System.out.printf("----use_basecalc : %d - %d = %d\n",a,b,res);
	}
	
	static void use_object(Object ob) {
		//Object class의 기능 사용
		System.out.println(ob.toString());			//jvm이 객체를 넘버링하는거 불러오는거
		
		//Object영역->BaseCalc영역확장(DownCasting)
		BaseCalc bc = (BaseCalc) ob;				//강제형변환
		int a= 10, b=3, res;
		res = bc.multiply(a, b);
		System.out.printf("----use_object down-casting : %d * %d = %d\n",a,b,res);
	}
	
	
	public static void main(String[] args) {
		
		AdvanceCalc ac = new AdvanceCalc();
		int x =10, y=3, res;
		res = ac.plus(x, y); 
		System.out.printf("%d + %d = %d\n", x,y,res);
		
		res = ac.hap(x);
		System.out.printf("%d까지의 합: %d\n", x, res);
		
		//up-casting(자동형변환) : 영역의 축소
		//BaseCalc   bc = ac;
		//Object 	 ob = ac;
		use_basecalc(ac);
		
		use_object(ac);
		
	}

}
