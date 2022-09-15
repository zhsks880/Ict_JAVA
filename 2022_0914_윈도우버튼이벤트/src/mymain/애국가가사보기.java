package mymain;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class �ֱ������纸�� extends JFrame {
	
	JButton jbt_song1, jbt_song2, jbt_song3, jbt_song4;	//�ʱ� ��ư ����
	
	JTextArea jta_display;				//��� �ؽ�Ʈ ���â ���°�
	
	public �ֱ������纸��() {
		super("�ֱ��� ���� ����");
		//�޴��ʱ�ȭ
		init_menu();
		//��ư �̺�Ʈ �ʱ�ȭ
		init_button_event();
		//���â �ʱ�ȭ
		init_display();

		//��ġ
		this.setLocation(300, 200);
		//ũ��
		this.setSize(800, 500);
		//�����ֱ�
		this.setVisible(true);
		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
private void init_display() {
	//����������� ���÷��� ���� ���������������������		
			
			//��Ʈ����
			Font font = new Font("����ü", Font.BOLD, 20);
			
			//���â
			jta_display = new JTextArea();
			this.add(jta_display, "Center");
			
			//��Ʈ����
			jta_display.setFont(font);
			
			//�б��������� ����
			jta_display.setEditable(false);
			//jta_display.setText("���ع��� ��λ���\n������ �⵵��");  <<������ �ẽ
	}

private void init_menu() {
	//����������� �޴� ����� �޼ҵ� ���������������������		
			
			//JPanel : border(�׵θ�) �� ���� ������
			JPanel p = new JPanel();
			p.setBackground(Color.GREEN);		//JPanel���ֱ�(GridLayout ������ ������)
			//JPanel ��ġ���:�⺻������ FLowLayout
			p.setLayout(new GridLayout(1,4));	//GridLayout����(north ��ġ�ÿ� ��ǥ 1,4�� �ϱ�)
			//�޴��� ��ġ ����
			this.add(p, "North");
			jbt_song1 = new JButton("�ֱ��� 1��");
			jbt_song2 = new JButton("�ֱ��� 2��");
			jbt_song3 = new JButton("�ֱ��� 3��");
			jbt_song4 = new JButton("�ֱ��� 4��");
			
			//Panel�� ��ư �ִ´�
			p.add(jbt_song1);
			p.add(jbt_song2);
			p.add(jbt_song3);
			p.add(jbt_song4);
	}


	private void init_button_event() {
	//����������� ��ư ������ ����� ���� ���������������������		
		
		//1����ư Ŭ����
		jbt_song1.addActionListener(e->{
			jta_display.setText("�츮��������");
			
		});
		//2����ư Ŭ����
		jbt_song2.addActionListener(e->{
			jta_display.setText("\n���ǻ�\nǪ���� ����");
			
		});
		
	}

	public static void main(String[] args) {

		new �ֱ������纸��();

	}

}
