package mymain;

import java.util.Scanner;

import myutil.RemoteCon;
import myutil.TV;

public class MyMain_TV_Test {

	public static void main(String[] args) {
		//�������̽�			Ŭ����(���輭)
		RemoteCon remoteCon = new TV();			//�������� ������ TV�� ��Ʈ�� �Ҽ� �ִ�
		
		remoteCon.onOff(); //����
		//remoteCon.onOff(); //���� , ��� ������� �س��� �ѹ� ȣ��� ���� ���� ȣ��� ����
		
		remoteCon.volumeUP();		//���� 1����
		remoteCon.volumZero();		//���� ���Ұ�
		remoteCon.volumZero();		//���� ���Ұ� ��������
		remoteCon.channelUP();
		
		for(int i=0; i<90; i++)
			remoteCon.channelUP();
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);	//�Է�ä�� �ٷΰ���
		int setChannel;
		System.out.print("�Է�ä��:");
		setChannel = scanner.nextInt();
		remoteCon.setChannel(setChannel);
		
		scanner.close();
	}

}
