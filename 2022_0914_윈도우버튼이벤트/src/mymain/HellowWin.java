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
	
	//멤버로서의 내부클래스
	//Inner class(내부클래스) 이벤트 객체 작성
	class InnerButtonEventListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(HellowWin.this, "영어인사말: Fuxing Korean!!");
		}
		
	}
	
	public HellowWin() {
		super("각국의 인사말 알아보기");
		
		//배치방법 설정
		this.setLayout(new GridLayout(7, 1));
		jbt_kor = new JButton("한국어 인사말");
		jbt_eng = new JButton("영어 인사말");
		jbt_jpn = new JButton("일본어 인사말");
		jbt_chn = new JButton("중국어 인사말");
		jbt_ger = new JButton("독일어 인사말");
		jbt_fra = new JButton("불어 인사말");
		
		//메세지창 생성
		jtf_message = new JTextField();
		
		//버튼추가
		this.add(jbt_kor);
		this.add(jbt_eng);
		this.add(jbt_jpn);
		this.add(jbt_chn);
		this.add(jbt_ger);
		this.add(jbt_fra);
		this.add(jtf_message);
		
		//버튼 이벤트 처리
		//이벤트소스.addActionListner(위임객체);
		//한국어인사말 이벤트 등록
		//★★클래스 파일 mymain에 따로 만들어서 진행
		ButtonEventListener listener = new ButtonEventListener(this);
		jbt_kor.addActionListener(listener);
		
		//영어인사말 이벤트 등록
		//★★내부클래스(저 위에 있음)
		jbt_eng.addActionListener(new InnerButtonEventListener());
		
		//일본어 인사말 이벤트 등록
		//★★Local Inner Class(로컬내부클래스)
		class LocalInnerButtonEventListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf_message.setText("일본어 : 두창두창데스까");
				JOptionPane.showMessageDialog(HellowWin.this, "두창두창데스까", "일본어인사말", JOptionPane.YES_OPTION);
			}
		}
		jbt_jpn.addActionListener(new LocalInnerButtonEventListener());
		
		//중국어 인사말 이벤트 등록
		//★★Annonymous Class(익명클래스(로컬내부클래스)), 클래스 이름이 없는것, 함축시킨것
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf_message.setText("중국어 : 착짱죽짱~!!");
				JOptionPane.showMessageDialog(HellowWin.this, "중국어 인사말 : 착짱죽짱~~!!");
			}
		};
		jbt_chn.addActionListener(listener2);
		
		//독일어 인사말 이벤트 등록
		//★★Annonymous Class, 위에꺼 보다 더 함축
		jbt_ger.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(HellowWin.this, "독일어 인사말 : !!!슈바이학센짱!!!");
			}
		});
		
		//프랑스어 인사말 이벤트 등록
		//★★Lambda식(JDK 8.0 이상에서만 사용가능)
		jbt_fra.addActionListener(e-> {JOptionPane.showMessageDialog(HellowWin.this, "불어 인사말 : 유럽의 짱개!");});
		
		//위치
		this.setLocation(300, 200);
		//크기
		this.setSize(500, 400);
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new HellowWin();

	}

}
