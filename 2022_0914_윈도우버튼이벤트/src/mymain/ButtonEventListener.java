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
		hellowWin.jtf_message.setText("�ѱ���� ¯¯���̴�!!!");
		JOptionPane.showMessageDialog(hellowWin, "�ѱ����λ縻: �ȳ��ϼ���!");
	}
	
	
	
}
