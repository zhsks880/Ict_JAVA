package mymain;

import myutil.AdvanceCalc;
import myutil.BaseCalc;

public class MyMain_Calc_Test {
	
	//call by reference : use_basecalc �� �ѱ拚 ���������� �ѱ�
	static void use_basecalc(BaseCalc bc) {
		//					 BaseCalc bc = ac
		//					 BaseCalc ��ɸ� ��밡��
		//������ ac�� ���������� �־ 1~3���� ����� �� ������ static ���� bc�� ���� �ھƹ����ϱ� 1~2������ ����
		//int res = bc.hap(10); / hap�� AdvanceCalc ����̶� ���� ��
		int a = 10, b = 5, res;
		res = bc.minus(a, b);
		System.out.printf("----use_basecalc : %d - %d = %d\n",a,b,res);
	}
	
	static void use_object(Object ob) {
		//Object class�� ��� ���
		System.out.println(ob.toString());			//jvm�� ��ü�� �ѹ����ϴ°� �ҷ����°�
		
		//Object����->BaseCalc����Ȯ��(DownCasting)
		BaseCalc bc = (BaseCalc) ob;				//��������ȯ
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
		System.out.printf("%d������ ��: %d\n", x, res);
		
		//up-casting(�ڵ�����ȯ) : ������ ���
		//BaseCalc   bc = ac;
		//Object 	 ob = ac;
		use_basecalc(ac);
		
		use_object(ac);
		
	}

}
