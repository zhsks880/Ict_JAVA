package myutil;

public class TV implements RemoteCon {
	
	int volume = 10;
	int channel = 9;
	
	boolean bOn = false; 			//켜져있냐?(현재 false 라 꺼져있음)
	boolean bVolumeZero = false; 	//음소거 상태냐?
	
	
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
		//Toggle방식
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
		//Toggle방식 : true<->false
		bOn = !bOn;
		display();
		
	}

	private void display() {
		if(bOn) {
			System.out.println("---[TV ON 상태]---");
			System.out.printf("채널 : %d\n", channel);
			
			
			if(bVolumeZero)
				System.out.println("볼륨 : 음소거");
			else
				System.out.printf("볼륨 : %d\n", volume);
			
		}else {									//꺼진상태
			System.out.println("---[TV OFF 상태]---");
		}
	}

}
