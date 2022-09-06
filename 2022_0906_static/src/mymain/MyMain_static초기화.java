package mymain;

public class MyMain_static초기화 {

	static //static 초기화의 용도 : main 메소드 돌기전에 미리 시동 켜놓는 용도
	{
		System.out.println("==0.무슨소리 내가 먼저 처리돼!==");
		System.out.println("(DB Library / 이미지 / 사운드 등 준비작업을 메모리에 올려둔다");
	}
	
	public static void main(String[] args) {
		System.out.println("==1.내가 제일 먼저 실행돼!!==");
	}

}
