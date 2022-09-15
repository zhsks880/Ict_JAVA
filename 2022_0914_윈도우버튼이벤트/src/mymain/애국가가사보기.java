package mymain;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class 애국가가사보기 extends JFrame {
	
	JButton jbt_song1, jbt_song2, jbt_song3, jbt_song4;	//초기 버튼 설정
	
	JTextArea jta_display;				//가운데 텍스트 출력창 띄우는거
	
	public 애국가가사보기() {
		super("애국가 가사 보기");
		//메뉴초기화
		init_menu();
		//버튼 이벤트 초기화
		init_button_event();
		//출력창 초기화
		init_display();

		//위치
		this.setLocation(300, 200);
		//크기
		this.setSize(800, 500);
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
private void init_display() {
	//■■■■■■■■■■ 디스플레이 설정 ■■■■■■■■■■■■■■■■■■■■		
			
			//폰트설정
			Font font = new Font("굴림체", Font.BOLD, 20);
			
			//출력창
			jta_display = new JTextArea();
			this.add(jta_display, "Center");
			
			//폰트적용
			jta_display.setFont(font);
			
			//읽기전용으로 변경
			jta_display.setEditable(false);
			//jta_display.setText("동해물과 백두산이\n마르고 닳도록");  <<예제로 써봄
	}

private void init_menu() {
	//■■■■■■■■■■ 메뉴 만드는 메소드 ■■■■■■■■■■■■■■■■■■■■		
			
			//JPanel : border(테두리) 가 없는 윈도우
			JPanel p = new JPanel();
			p.setBackground(Color.GREEN);		//JPanel색넣기(GridLayout 넣을땐 빼야함)
			//JPanel 배치방법:기본적으로 FLowLayout
			p.setLayout(new GridLayout(1,4));	//GridLayout변경(north 위치시엔 좌표 1,4로 하기)
			//메뉴판 위치 설정
			this.add(p, "North");
			jbt_song1 = new JButton("애국가 1절");
			jbt_song2 = new JButton("애국가 2절");
			jbt_song3 = new JButton("애국가 3절");
			jbt_song4 = new JButton("애국가 4절");
			
			//Panel에 버튼 넣는다
			p.add(jbt_song1);
			p.add(jbt_song2);
			p.add(jbt_song3);
			p.add(jbt_song4);
	}


	private void init_button_event() {
	//■■■■■■■■■■ 버튼 누르면 출력할 내용 ■■■■■■■■■■■■■■■■■■■■		
		
		//1절버튼 클릭시
		jbt_song1.addActionListener(e->{
			jta_display.setText("우리집강아지");
			
		});
		//2절버튼 클릭시
		jbt_song2.addActionListener(e->{
			jta_display.setText("\n관악산\n푸르른 날에");
			
		});
		
	}

	public static void main(String[] args) {

		new 애국가가사보기();

	}

}
