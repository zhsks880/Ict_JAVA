package mymain;

import java.util.ArrayList;

import myutil.MyArrayList;

public class _01_제네릭 {

	public static void main(String[] args) {
		//자바의 모든 객체(Object)를 저장관리
		//ArrayList 에 저장할때는 모두다 Object 로 업캐스팅으로 되기 떄문에 자료를 꺼내서 쓸때는 다운캐스팅이 필수가 됨
		ArrayList list = new ArrayList();
		
		//단순한 숫자를 객체로 저장할떄는 wrapper 클래스로 해야 저장이 됨.
		//Integer.valueof(10); <<이런방식
		//JDK 5.0 이후부터 된 기능 : Auto-Boxing(자동포장)
		list.add("홍길동");
		list.add(10);		//실제는 new Integer(10) 이 들어가는데 JVM 이 변환해서 넣어줌
		list.add(180.5);	//실제는 new Double(180.5)
		list.add(true);		//실제는 new Boolean(true)
		String name = (String) list.get(0);
		Integer age = (Integer) list.get(1);
		
		//제네릭적용 : <> 모양 안에 객체생성시 저장타입이 결정됨, int 나 double 이런거 말고 Integer 나 Double 등 wrapper 클래스로 쓰기
		//제네릭은 타입이 만들때 마다 셋팅 됨, 기존 new 객체는 생성시 한번 하면 되던거랑 다름(편하네?)
		ArrayList<String> fruit_list = new ArrayList<String>();
		fruit_list.add("포도");
		fruit_list.add("참외");
		
		ArrayList<Integer> lotto_list = new ArrayList<Integer>();
		lotto_list.add(10);
		
		//MyArray 사용해서 제네릭 하기
		System.out.println("--내가 만든 제네릭 사용하기--");
		MyArrayList<String> sido_list = new MyArrayList<String>();
		sido_list.add("서울");
		sido_list.add("경기");
		sido_list.add("인천");
		sido_list.add("대전");
		
		try {
			//String sido = sido_list.get(0);
			
			for(int i=0; i<sido_list.size(); i++) {
				String s = sido_list.get(i);
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
