package mymain;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame{
	
	public MyWindow2() {
		super("�߻�ȭ�� ��������?");
		this.setLayout(null);
		JButton jbt1 = new JButton("Ȯ��");
		jbt1.setBounds(10,10,60,30);
		this.add(jbt1);
		
		JCheckBox jck1 = new JCheckBox("��ȥ����");
		jck1.setBounds(10, 50, 80, 30);
		this.add(jck1);
		
		//��ġ�� ũ�⸦ �ѹ��� �����ϴ� �޼ҵ�
		//				x	 y    W    H  ��ǥ
		this.setBounds(200, 100, 500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		new MyWindow2();
	}
}
