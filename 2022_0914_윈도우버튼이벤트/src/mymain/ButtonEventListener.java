package mymain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonEventListener implements ActionListener{
	HellowWin hellowWin;
	
	public ButtonEventListener(HellowWin hellowWin) {
		// TODO Auto-generated constructor stub
		this.hellowWin = hellowWin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		hellowWin.jtf_message.setText("한국어는 짱짱맨이다!!!");
		JOptionPane.showMessageDialog(hellowWin, "한국어인사말: 안녕하세요!");
	}
	
	
	
}
