package myutil;

//인터페이스 내부: 상수, 추상메소드, default메소드
public interface BaseCalc {
	
	//상수선언 없어도 상수로 인식
						double PI = 3.14;	//자료형 변수명 초기값주면 알아서 상수로 변환되서 다른 패키지에서 사용가능함
	public static final double PI2= 3.14;	//위의 생략된 부분 다 작성한거임
	
	//추상메소드
					int plus(int a, int b);	//public abstract 안써도 알아서 추상메소드 됨
	public abstract int minus(int a, int b);//public void double(){} <<이런건 에러뜸
	
	//default메소드
	default int gop(int a, int b) {return a*b;}	//default 로 정의해놓으면 오버라이드 할 필요가 없음(값까지{} 정의가능)
	
	
}
