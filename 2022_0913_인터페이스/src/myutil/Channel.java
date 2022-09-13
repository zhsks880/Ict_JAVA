package myutil;

public interface Channel {
	
	int MIN = 0;
	int MAX = 99;
	
	void channelUP();
	void channelDown();
	void setChannel(int channel);
	
}
