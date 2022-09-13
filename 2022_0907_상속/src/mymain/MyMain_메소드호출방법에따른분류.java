package mymain;

import myutil.MyLine;

public class MyMain_메소드호출방법에따른분류 {

	public static void main(String[] args) {
		/*
			1.Call by name
			2.Call by Value
			3.Call by Reference	
		*/
		
		//1.Call by name
		//MyLine.draw_line();
		//안에 써져있는거만 그대로 표기해라
		
		//2.Call by Value
		//My.Line.draw_line(30);
		//value 를 입력해서 그것을 표현해라
		
		//3.Call by Reference
		//MyLine.draw_title("[성적관리]", 10);
		
		int line_len = 30;
		String title = new String("[성적관리]");
		
		
		MyLine.draw_title(title, 10);
		//System.out.println("=======[성적관리]=======");
		System.out.println("번호 이름 국어 영어 수학");
		//System.out.println("========================");
		//MyLine.draw_line();			// 1.선선긋기가 너무 많을경우엔 메소드를 해놓고 한번에 변경하면 편함(수정사항발생시)
		//MyLine.draw_line(line_len);
		MyLine.draw_line('|', 30); 		//3. 선모양과 선 길이의 자동화
		System.out.println("  1  일길동 77  88   90");
		System.out.println("  2  이길동 77  88   90");
		//System.out.println("========================");
		//MyLine.draw_line();
		MyLine.draw_line(line_len);		//2. 선긋기의 자동화..
		MyLine.draw_line('*', 4, '-', 2, 20);
		//MyLine.draw_line('*',3,'-',2,30);
		// ***--***--***--
		
		//MyLine.draw_line('*',1,'-',3,30);
		// *---*---*---*
		
	}

}
