package myutil;

public class MyWatch {
	
	//single-ton pattern
	//public static �ϰ������ �տ��� static ���� �������� �ϰ��� �ؾ� �̾�����...
	static MyWatch single = null;
	
	public static MyWatch getInstance() {
		
		//��ü�� ������ �����ض�..
		if(single==null) single = new MyWatch();
		
		return single;
	}
	
	private MyWatch() {
		System.out.println("==MyWatch()==");
	}
	//instance method
	public void display() {
		
		System.out.println("=====[����ð�]=====");
	}
	
}
