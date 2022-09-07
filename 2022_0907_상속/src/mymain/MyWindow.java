package mymain;

import java.awt.Frame;	//Frame 윈도우 기능	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;	//JFrame 이 Frame 자식이라 그냥 끌고 와서 써도 무난~애비 ㄳ

//AWT(Abstract Window Toolkit)

public class MyWindow extends JFrame{
	
	public MyWindow() {							//프로그램의 초기화 윈도우의 초기화로 생각하자
		
		//제목
		//super.setTitle("처음만들어본 윈도우");
		super("처음만들어본 윈도우");			//아버지 처음기능이 title 쓰는거라 바로 가능~
		//버튼생성
		JButton jbt_exit = new JButton("눌러서 창 닫기");
		this.add(jbt_exit, "South");
		//Event처리
		/*
		 * jbt_exit.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { 
		 * 		System.exit(0);		//종료처리
		 * } });
		 */
		//JDK1.8 이후부터 지원되는 람다식(축약식)
		jbt_exit.addActionListener(e -> {System.exit(0);});

		
		//위치설정
		super.setLocation(100, 100);			//내가보는 모니터기준 x좌표=100, y좌표=100 위치
		//크기설정
		super.setSize(500, 500); 			
		//보여줘
		super.setVisible(true);					//특정개체 안보이게 하고 싶으면 false 값 줘라	
		//종료 : 창에서 x 버튼 활성화
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {	//프로그램의 시작부분 main~
		
		new MyWindow();
		
		
		
	}

}
