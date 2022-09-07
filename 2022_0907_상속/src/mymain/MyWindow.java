package mymain;

import java.awt.Frame;	//Frame ������ ���	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;	//JFrame �� Frame �ڽ��̶� �׳� ���� �ͼ� �ᵵ ����~�ֺ� ��

//AWT(Abstract Window Toolkit)

public class MyWindow extends JFrame{
	
	public MyWindow() {							//���α׷��� �ʱ�ȭ �������� �ʱ�ȭ�� ��������
		
		//����
		//super.setTitle("ó������ ������");
		super("ó������ ������");			//�ƹ��� ó������� title ���°Ŷ� �ٷ� ����~
		//��ư����
		JButton jbt_exit = new JButton("������ â �ݱ�");
		this.add(jbt_exit, "South");
		//Eventó��
		/*
		 * jbt_exit.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { 
		 * 		System.exit(0);		//����ó��
		 * } });
		 */
		//JDK1.8 ���ĺ��� �����Ǵ� ���ٽ�(����)
		jbt_exit.addActionListener(e -> {System.exit(0);});

		
		//��ġ����
		super.setLocation(100, 100);			//�������� ����ͱ��� x��ǥ=100, y��ǥ=100 ��ġ
		//ũ�⼳��
		super.setSize(500, 500); 			
		//������
		super.setVisible(true);					//Ư����ü �Ⱥ��̰� �ϰ� ������ false �� ���	
		//���� : â���� x ��ư Ȱ��ȭ
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {	//���α׷��� ���ۺκ� main~
		
		new MyWindow();
		
		
		
	}

}
