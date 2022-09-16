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
		//해상도 구하기
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		screen_width = d.width;
		screen_height = d.height;
		
		init_key_event();
		
		
		//위치
		this.setLocation(300, 200);
		//크기
		this.setSize(400, 300);
		//크기조절불가
		this.setResizable(false);
		
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		/*	우리가 필요한게 keypressed만 필요해서 더러워 보임
		 *★★★★ 방법1 ★★★★
		 * class MyKeyListener implements KeyListener {
		 * 
		 * @Override public void keyPressed(KeyEvent e) { }
		 * 
		 * @Override public void keyTyped(KeyEvent e) { }
		 * 
		 * @Override public void keyReleased(KeyEvent e) { }
		 */
		//XXXLister (interface)
		//XXXAdapter (abstract class) : XXXLister 를 미리 재정의 해놓은 추상클래스
		//필요한 이벤트 메소드만 재정의 해서 사용해라..
		
		/*★★★★ 방법2 ★★★★
		 * class MyKeyAdapter extends KeyAdapter{
		 * 
		 * @Override public void keyPressed(KeyEvent e) {
		 * } }
		 */
		
		//★★★★ 방법3 ★★★★
		KeyListener listener = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e);
				//현재 윈도우의 위치구하기
				Point pt = getLocation();
				//System.out.printf("현재 윈도우의 위치: (%d, %d)\n", pt.x, pt.y);
				
				
				//눌린키 값
				int key = e.getKeyCode();
				//움직이는 간격 조절
				int gan = 100;
				//윈도우 창 이동
				if(key==KeyEvent.VK_RIGHT) {		//우측이동
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
				//변경된 좌표로 이동
				setLocation(pt);
			}
		};
		
		this.addKeyListener(listener);	
	}

	public static void main(String[] args) {

		new TestKeyEvent();

	}

}
