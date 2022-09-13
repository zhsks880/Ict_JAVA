package myutil;

public class TV implements RemoteCon {
	
	int volume = 10;
	int channel = 9;
	
	boolean bOn = false; 			//�����ֳ�?(���� false �� ��������)
	boolean bVolumeZero = false; 	//���Ұ� ���³�?
	
	
	@Override
	public void volumeUP() {
		volume++;
		if(volume > Volume.MAX)
			volume = Volume.MAX;
		
		display();
	}

	@Override
	public void volumDown() {
		volume--;
		if(volume < Volume.MIN)
			volume = Volume.MIN;
		
		display();
	}

	@Override
	public void volumZero() {
		//Toggle���
		bVolumeZero = !bVolumeZero;
		
		display();
		
	}

	@Override
	public void channelUP() {
		channel++;
		if(channel > Channel.MAX)
			channel = Channel.MIN;
		display();
	}

	@Override
	public void channelDown() {
		channel--;
		if(channel < Channel.MIN)
			channel = Channel.MAX;
		display();
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		display();
		
	}

	@Override
	public void onOff() {
		//Toggle��� : true<->false
		bOn = !bOn;
		display();
		
	}

	private void display() {
		if(bOn) {
			System.out.println("---[TV ON ����]---");
			System.out.printf("ä�� : %d\n", channel);
			
			
			if(bVolumeZero)
				System.out.println("���� : ���Ұ�");
			else
				System.out.printf("���� : %d\n", volume);
			
		}else {									//��������
			System.out.println("---[TV OFF ����]---");
		}
	}

}
