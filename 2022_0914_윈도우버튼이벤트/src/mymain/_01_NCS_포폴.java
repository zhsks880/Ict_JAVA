package mymain;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _01_NCS_���� extends JFrame {
	
	JButton jbt_song1, jbt_song2, jbt_song3, jbt_song4;	
	
	JTextArea jta_display;				
	
	public _01_NCS_����() {
		super("���� �����");
		
		init_menu();
		init_button_event();
		init_display();
		
		this.setLocation(300, 200);
		this.setSize(1000, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
private void init_display() {
	
			Font font = new Font("�ü�ü", Font.BOLD, 25);
			
			jta_display = new JTextArea();
			this.add(jta_display, "Center");
		
			jta_display.setFont(font);
			
			jta_display.setEditable(false);
			
	}

private void init_menu() {
			
			JPanel p = new JPanel();
			p.setBackground(Color.GREEN);		
			p.setLayout(new GridLayout(4,1));	
			this.add(p, "West");
			jbt_song1 = new JButton("�����̴¹�");
			jbt_song2 = new JButton("�����̸���¹�");
			jbt_song3 = new JButton("�̿������̴¹�");
			jbt_song4 = new JButton("���� ����¹�");
			
			p.add(jbt_song1);
			p.add(jbt_song2);
			p.add(jbt_song3);
			p.add(jbt_song4);
	}

	private void init_button_event() {
		
		jbt_song1.addActionListener(e->{
			jta_display.setText("�١١ٶ����̴� ���١١�\n1.���� �ø���\n2.������������ Ų��.\n3.���̲����� ����� �ִ´�.\n4.�㿡 �Դ´�");
			
		});
		jbt_song2.addActionListener(e->{
			jta_display.setText("�١١ٶ����� ����� ���١١�\n1.���� �ø���\n2.������������ Ų��.\n3.���� ������ ���� �������� �ִ´�.\n4.�㿡 �Դ´�.");
			
		});
		jbt_song3.addActionListener(e->{
			jta_display.setText("�١١ٹ̿��� ���̴� ���١١�\n1.���� �ø���\n2.�̿����Ҹ���\n3.���� ������ �̿��� �������� �ִ´�.\n4.��ħ�� �Դ´�.");
			
		});
		jbt_song4.addActionListener(e->{
			jta_display.setText("�١١ٹ��� ����� ���١١�\n1.�̰� �ſ� �ð��� �ʿ��ϴ�\n2.������ ������������ ��Ʈ���� (��̰�� �Ұ���)�� ����\n3.������� ���縦 ź��(�ɸ�������)\n4.�� �������� ���ҿ��� �������� �ʰ� ��� �����\n5.��� ����");
			
		});
		
	}

	public static void main(String[] args) {

		new _01_NCS_����();

	}

}
