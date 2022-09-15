package mymain;

public class _01_MyMain_전통적인예외처리 {

	public static void main(String[] args) {
		
		int a=10, b=0, res;
		
		if(b!=0) {
		res= a/b;
		}else {
			
		}
		
		String str = null;
		
		if(str!=null) {
		int len = str.length();
		}
		
		int [] nr = {1,2,3};
		
		int index = 3;
		if(index<nr.length)
		{
		nr[0] = 10;
		nr[3] = 40;
		}
		
		System.out.println("==정상종료==");
	}

}
