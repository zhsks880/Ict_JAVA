package myutil;
//추상클래스는 반드시 추상메소드를 포함하지 않아도 된다.
//추상메소드를 소유한 클래스는 반드시 추상클래스여야 한다
//추상클래스는 객체생성 못한다 = new 학생() 이거 못함
abstract public class 학생 {
	 
	protected int 학년;
	protected int 학번;
	
	//추상메소드: 구현코드부분이 없는 메소드
	abstract public void 공부한다();
	
}
