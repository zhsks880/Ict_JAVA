package myutil;

//인터페이스는 다중상속이 가능하다
public interface RemoteCon extends Volume, Channel{
	
	void onOff();
	
}
