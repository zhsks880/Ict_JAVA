package mymain;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HellowWin extends JFrame {
	
	JButton jbt_kor, jbt_eng, jbt_jpn, jbt_chn, jbt_ger, jbt_fra;
	
	JTextField jtf_message;
	
	//����μ��� ����Ŭ����
	//Inner class(����Ŭ����) �̺�Ʈ ��ü �ۼ�
	class InnerButtonEventListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(HellowWin.this, "�����λ縻: Fuxing Korean!!");
		}
		
	}
	
	public HellowWin() {
		super("������ �λ縻 �˾ƺ���");
		
		//��ġ��� ����
		this.setLayout(new GridLayout(7, 1));
		jbt_kor = new JButton("�ѱ��� �λ縻");
		jbt_eng = new JButton("���� �λ縻");
		jbt_jpn = new JButton("�Ϻ��� �λ縻");
		jbt_chn = new JButton("�߱��� �λ縻");
		jbt_ger = new JButton("���Ͼ� �λ縻");
		jbt_fra = new JButton("�Ҿ� �λ縻");
		
		//�޼���â ����
		jtf_message = new JTextField();
		
		//��ư�߰�
		this.add(jbt_kor);
		this.add(jbt_eng);
		this.add(jbt_jpn);
		this.add(jbt_chn);
		this.add(jbt_ger);
		this.add(jbt_fra);
		this.add(jtf_message);
		
		//��ư �̺�Ʈ ó��
		//�̺�Ʈ�ҽ�.addActionListner(���Ӱ�ü);
		//�ѱ����λ縻 �̺�Ʈ ���
		//�ڡ�Ŭ���� ���� mymain�� ���� ���� ����
		ButtonEventListener listener = new ButtonEventListener(this);
		jbt_kor.addActionListener(listener);
		
		//�����λ縻 �̺�Ʈ ���
		//�ڡڳ���Ŭ����(�� ���� ����)
		jbt_eng.addActionListener(new InnerButtonEventListener());
		
		//�Ϻ��� �λ縻 �̺�Ʈ ���
		//�ڡ�Local Inner Class(���ó���Ŭ����)
		class LocalInnerButtonEventListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf_message.setText("�Ϻ��� : ��â��â������");
				JOptionPane.showMessageDialog(HellowWin.this, "��â��â������", "�Ϻ����λ縻", JOptionPane.YES_OPTION);
			}
		}
		jbt_jpn.addActionListener(new LocalInnerButtonEventListener());
		
		//�߱��� �λ縻 �̺�Ʈ ���
		//�ڡ�Annonymous Class(�͸�Ŭ����(���ó���Ŭ����)), Ŭ���� �̸��� ���°�, �����Ų��
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf_message.setText("�߱��� : ��¯��¯~!!");
				JOptionPane.showMessageDialog(HellowWin.this, "�߱��� �λ縻 : ��¯��¯~~!!");
			}
		};
		jbt_chn.addActionListener(listener2);
		
		//���Ͼ� �λ縻 �̺�Ʈ ���
		//�ڡ�Annonymous Class, ������ ���� �� ����
		jbt_ger.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(HellowWin.this, "���Ͼ� �λ縻 : !!!�������м�¯!!!");
			}
		});
		
		//�������� �λ縻 �̺�Ʈ ���
		//�ڡ�Lambda��(JDK 8.0 �̻󿡼��� ��밡��)
		jbt_fra.addActionListener(e-> {JOptionPane.showMessageDialog(HellowWin.this, "�Ҿ� �λ縻 : ������ ¯��!");});
		
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

		new HellowWin();

	}

}
