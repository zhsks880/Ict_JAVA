package mymain;

import myutil.Save;

public class MyMain_Save_Test {

	public static void main(String[] args) {
		//static변수: 클래스명.변수명 으로 불러와서 값을 바로 변경 가능
		Save.rate = 0.2;
		//Save [] s_array = { new save("일길동", 1000000), new save("이길동", 2000000), new save("삼길동", 3000000)};
		Save s1 = new Save("일길동", 1000000);
		Save s2 = new Save("이길동", 2000000);
		Save s3 = new Save("삼길동", 3000000);
		
		System.out.printf("---[이율:%.2f]---\n", Save.rate);
		s1.display();
		s2.display();
		s3.display();
		
		//s1.rate = 0.1;	이렇게 써도 되지만 가능하면 하지마센
		Save.rate =0.1;
		System.out.printf("---[이율:%.1f]---\n", Save.rate);
		s1.display();
		s2.display();
		s3.display();
	}

}
