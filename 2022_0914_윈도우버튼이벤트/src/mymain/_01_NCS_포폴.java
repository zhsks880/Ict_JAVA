package mymain;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _01_NCS_포폴 extends JFrame {
	
	JButton jbt_song1, jbt_song2, jbt_song3, jbt_song4;	
	
	JTextArea jta_display;				
	
	public _01_NCS_포폴() {
		super("음식 만들기");
		
		init_menu();
		init_button_event();
		init_display();
		
		this.setLocation(300, 200);
		this.setSize(1000, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
private void init_display() {
	
			Font font = new Font("궁서체", Font.BOLD, 25);
			
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
			jbt_song1 = new JButton("라면끓이는법");
			jbt_song2 = new JButton("떡볶이만드는법");
			jbt_song3 = new JButton("미역국끓이는법");
			jbt_song4 = new JButton("미음 만드는법");
			
			p.add(jbt_song1);
			p.add(jbt_song2);
			p.add(jbt_song3);
			p.add(jbt_song4);
	}

	private void init_button_event() {
		
		jbt_song1.addActionListener(e->{
			jta_display.setText("☆☆☆라면끓이는 법☆☆☆\n1.물을 올린다\n2.가스레인지를 킨다.\n3.물이끓으면 라면을 넣는다.\n4.밤에 먹는다");
			
		});
		jbt_song2.addActionListener(e->{
			jta_display.setText("☆☆☆떡볶이 만드는 법☆☆☆\n1.물을 올린다\n2.가스레인지를 킨다.\n3.물이 끓으면 떡과 고추장을 넣는다.\n4.밤에 먹는다.");
			
		});
		jbt_song3.addActionListener(e->{
			jta_display.setText("☆☆☆미역국 끓이는 법☆☆☆\n1.물을 올린다\n2.미역을불린다\n3.물이 끓으면 미역과 국간장을 넣는다.\n4.아침에 먹는다.");
			
		});
		jbt_song4.addActionListener(e->{
			jta_display.setText("☆☆☆미음 만드는 법☆☆☆\n1.이건 매우 시간이 필요하다\n2.하지만 걱정하지마라 마트에서 (백미고운 쌀가루)를 사자\n3.차가운물에 가루를 탄다(걸리지마라)\n4.다 저었으면 센불에서 눌러붙지 않게 계속 저어라\n5.어릴때 먹자");
			
		});
		
	}

	public static void main(String[] args) {

		new _01_NCS_포폴();

	}

}
