package mymain;

public class _06_일반논리연산자 {

	public static void main(String[] args) {
		//일반논리 : &&(and)	||(or)
		System.out.println("=============[&&]=============");
		System.out.printf("true && true =>%b\n", true && true);
		System.out.printf("true && false =>%b\n", true && false);
		System.out.printf("false && true =>%b\n", false && true);
		System.out.printf("false && false =>%b\n", false && false);
		
		System.out.println();
		System.out.println("=============[||]=============");
		System.out.printf("true || true =>%b\n", true || true);
		System.out.printf("true || false =>%b\n", true || false);
		System.out.printf("false || true =>%b\n", false || true);
		System.out.printf("false || false =>%b\n", false || false);
		
		//short circuit evaluation(경제적연산) : && ||
		int x=1;
		int y=2;
		boolean z;
		
		z=--x>0 && ++y>0;
		//x=0 y=2 z=false (앞이 이미 false 라서 뒤는 계산 안함, and연산자는 앞이 false 면 뒤도 안봄)
		System.out.printf("x=%d y=%d z=%b\n", x,y,z);
		
		z=++x>0 || ++y>0;
		//x=1 y=2 z=true (앞이 이미 true 라서 뒤는 계산 안함, or연산자는 앞이 true 면 뒤도 안봄)
		System.out.printf("x=%d y=%d z=%b\n", x,y,z);
		
	}

}
