package mymain;

public class _01_MyMain_String비교 {

	public static void main(String[] args) {
		/*
			String생성방법
			->생성방법에 따라 어떤형태로 만들어 지는지에 따라 틀려짐
			
			1.명시적생성방법
				->String str = new String("ABCD");
				->묵시적과 다르게 heap 영역에 생성이 되다 보니 번지수가 틀려서 번지수 비교하면 다르다고 나옴
				->무조건 .equals로 값을 비교 가능
			2.묵시적생성방법
				->String str = "ABCD";
				->처음엔 생성되서 Constant Pool(상수만 모아서 관리) 되는곳에 만들어 지고 있다가 공유해서 사용함(번지수 공유)
				->.equals로 값을 비교도 가능하지만, 주소로 비교해도 같게끔 나오게는 되나 지향하지는 않는다
		*/
		
		//묵시적 생성방법
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		
		if(s1==s2)
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");
		if(s1.equals(s2))
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");

		//명시적 생성방법
		String s3 = new String("Littel Star");
		String s4 = new String("Littel Star");
		
		if(s3==s4)			//번지수 비교
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");
		if(s3.equals(s4))	//값 비교
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");

		
		
	}

}
