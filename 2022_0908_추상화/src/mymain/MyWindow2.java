package mymain;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame{
	
	public MyWindow2() {
		super("추상화랑 무슨관계?");
		this.setLayout(null);
		JButton jbt1 = new JButton("확인");
		jbt1.setBounds(10,10,60,30);
		this.add(jbt1);
		
		JCheckBox jck1 = new JCheckBox("결혼유무");
		jck1.setBounds(10, 50, 80, 30);
		this.add(jck1);
		
		//위치와 크기를 한번에 지정하는 메소드
		//				x	 y    W    H  좌표
		this.setBounds(200, 100, 500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		new MyWindow2();
	}
}
