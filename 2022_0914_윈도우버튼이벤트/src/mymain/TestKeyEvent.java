package mymain;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.net.ssl.ExtendedSSLSession;
import javax.swing.JFrame;

public class TestKeyEvent extends JFrame {
	
	int screen_width;
	int screen_height;
	
	public TestKeyEvent() {
		super("");
		//�ػ� ���ϱ�
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		screen_width = d.width;
		screen_height = d.height;
		
		init_key_event();
		
		
		//��ġ
		this.setLocation(300, 200);
		//ũ��
		this.setSize(400, 300);
		//ũ�������Ұ�
		this.setResizable(false);
		
		//�����ֱ�
		this.setVisible(true);
		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		/*	�츮�� �ʿ��Ѱ� keypressed�� �ʿ��ؼ� ������ ����
		 *�ڡڡڡ� ���1 �ڡڡڡ�
		 * class MyKeyListener implements KeyListener {
		 * 
		 * @Override public void keyPressed(KeyEvent e) { }
		 * 
		 * @Override public void keyTyped(KeyEvent e) { }
		 * 
		 * @Override public void keyReleased(KeyEvent e) { }
		 */
		//XXXLister (interface)
		//XXXAdapter (abstract class) : XXXLister �� �̸� ������ �س��� �߻�Ŭ����
		//�ʿ��� �̺�Ʈ �޼ҵ常 ������ �ؼ� ����ض�..
		
		/*�ڡڡڡ� ���2 �ڡڡڡ�
		 * class MyKeyAdapter extends KeyAdapter{
		 * 
		 * @Override public void keyPressed(KeyEvent e) {
		 * } }
		 */
		
		//�ڡڡڡ� ���3 �ڡڡڡ�
		KeyListener listener = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e);
				//���� �������� ��ġ���ϱ�
				Point pt = getLocation();
				//System.out.printf("���� �������� ��ġ: (%d, %d)\n", pt.x, pt.y);
				
				
				//����Ű ��
				int key = e.getKeyCode();
				//�����̴� ���� ����
				int gan = 100;
				//������ â �̵�
				if(key==KeyEvent.VK_RIGHT) {		//�����̵�
					pt.x = pt.x + gan;
					if(pt.x>screen_width) {
						pt.x = -400;
					}
				}else if(key==KeyEvent.VK_LEFT){
					pt.x = pt.x -gan;	
					if(pt.x<-400) {
						pt.x = screen_width;
					}
				}else if(key==KeyEvent.VK_UP) {
					pt.y = pt.y -gan;
					if(pt.y<-300) {
						pt.y = screen_height;
					}
				}else if(key==KeyEvent.VK_DOWN) {
					pt.y = pt.y +gan;
					if(pt.y>screen_height) {
						pt.y = -300;
					}
				}
				//����� ��ǥ�� �̵�
				setLocation(pt);
			}
		};
		
		this.addKeyListener(listener);	
	}

	public static void main(String[] args) {

		new TestKeyEvent();

	}

}
