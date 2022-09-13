package mymain;

import javax.swing.JFrame;

public class Main_인터페이스활용 extends JFrame{
	
	public Main_인터페이스활용() {
		super("이벤트연습");
		
		//위치크기
		this.setBounds(200, 100, 300, 300);
		//보여주기
		this.setVisible(true);
		//종료하기
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//XXX Listener(interface)
		// Java Event 처리는 위임이벤트 모델(Delegation Event Model)
		this.addWindowListener(new MyWindowEventListner());
		
	}
	public static void main(String[] args) {
		
		new Main_인터페이스활용();
		
		
	}

}
