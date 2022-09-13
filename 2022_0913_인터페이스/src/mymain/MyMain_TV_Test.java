package mymain;

import java.util.Scanner;

import myutil.RemoteCon;
import myutil.TV;

public class MyMain_TV_Test {

	public static void main(String[] args) {
		//인터페이스			클래스(설계서)
		RemoteCon remoteCon = new TV();			//리모컨을 가지고 TV를 컨트롤 할수 있다
		
		remoteCon.onOff(); //켜짐
		//remoteCon.onOff(); //꺼짐 , 토글 방식으로 해놔서 한번 호출시 켜짐 다음 호출시 꺼짐
		
		remoteCon.volumeUP();		//볼륨 1증가
		remoteCon.volumZero();		//볼륨 음소거
		remoteCon.volumZero();		//볼륨 음소거 상태해제
		remoteCon.channelUP();
		
		for(int i=0; i<90; i++)
			remoteCon.channelUP();
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);	//입력채널 바로가기
		int setChannel;
		System.out.print("입력채널:");
		setChannel = scanner.nextInt();
		remoteCon.setChannel(setChannel);
		
		scanner.close();
	}

}
