package mymain;

import javax.swing.JFrame;

public class BaseWindow extends JFrame{
	public BaseWindow() {
		super("");
		
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
		
		new BaseWindow();
		
		
	}

}
