package mymain;

import javax.swing.JFrame;

public class MyWin extends JFrame {
	public MyWin() {
		super("템플릿으로 만든 윈도우 ^0^");

		//위치
		this.setLocation(300, 200);
		//크기
		this.setSize(500, 400);
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {

		new MyWin();

	}

}
