package mymain;

import javax.swing.JFrame;

public class Main_�������̽�Ȱ�� extends JFrame{
	
	public Main_�������̽�Ȱ��() {
		super("�̺�Ʈ����");
		
		//��ġũ��
		this.setBounds(200, 100, 300, 300);
		//�����ֱ�
		this.setVisible(true);
		//�����ϱ�
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//XXX Listener(interface)
		// Java Event ó���� �����̺�Ʈ ��(Delegation Event Model)
		this.addWindowListener(new MyWindowEventListner());
		
	}
	public static void main(String[] args) {
		
		new Main_�������̽�Ȱ��();
		
		
	}

}
