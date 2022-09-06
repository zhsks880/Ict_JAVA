package myutil;

public class MyWatch {
	
	//single-ton pattern
	//public static 하고싶으면 앞에서 static 변수 먼저부터 하고나서 해야 이어진다...
	static MyWatch single = null;
	
	public static MyWatch getInstance() {
		
		//객체가 없으면 생성해라..
		if(single==null) single = new MyWatch();
		
		return single;
	}
	
	private MyWatch() {
		System.out.println("==MyWatch()==");
	}
	//instance method
	public void display() {
		
		System.out.println("=====[현재시각]=====");
	}
	
}
