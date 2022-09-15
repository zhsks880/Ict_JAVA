package mymain;

import java.util.ArrayList;

import myutil.MyArrayList;

public class _05_MyMain_throws {

	public static void main(String[] args) {
		// 배열(배열의 길이 조정이 안됨)
		String[] str_arr = { "Hi", "Hello", "Thank you" };

		// 자바의 모든객체 저장관리하는 객체(Object 형으로 저장)
		// 동적배열(배열로 관리는 되나 '0'으로 시작해서 길이가 늘었다 줄었다 함)
		ArrayList list = new ArrayList();
		System.out.println(list.size());

		list.add(new String("Hi")); // 0
		System.out.println(list.size());

		list.add(new String("Hello")); // 1
		System.out.println(list.size());

		list.add(new String("Thank you")); // 2
		System.out.println(list.size());

		String msg = (String) list.get(1);
		System.out.println(msg);

		// 지우기
		list.remove(1);
		System.out.println(list.size());

		System.out.println("---첨자방식---");
		for (int i = 0; i < list.size(); i++) {
			String m = (String) list.get(i);
			System.out.printf("%d: %s\n", i, m);
		}

		System.out.println("--개선loop방식--");
		for (Object ob : list) {
			String m = (String) ob;
			System.out.println(m);
		}
		System.out.println("-------[내가 만든 MyArrayLst]---------");
		MyArrayList list2 = new MyArrayList();
		System.out.println(list2.size());

		list2.add("HI~~");
		System.out.println(list2.size());

		list2.add("Hello~~");
		System.out.println(list2.size());

		list2.add("Thanks");
		System.out.println(list2.size());

		try {
			String msg2 = (String) list2.get(2);
			System.out.println(msg2);
			
			list2.remove(1);
			System.out.println(list2.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--[첨자방식]--");
			for (int i = 0; i < list2.size(); i++) {
			
				try {
					String m = (String) list2.get(i);
					System.out.printf("%d : %s\n", i, m);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}

}
