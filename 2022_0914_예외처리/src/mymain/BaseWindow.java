package mymain;

import javax.swing.JFrame;

public class BaseWindow extends JFrame{
	public BaseWindow() {
		super("");
		
		//��ġ
		this.setLocation(300, 200);
		//ũ��
		this.setSize(500, 400);
		//�����ֱ�
		this.setVisible(true);
		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args) {
		
		new BaseWindow();
		
		
	}

}
