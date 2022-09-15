package mymain;

import java.util.ArrayList;

import myutil.MyArrayList;

public class _05_MyMain_throws {

	public static void main(String[] args) {
		// �迭(�迭�� ���� ������ �ȵ�)
		String[] str_arr = { "Hi", "Hello", "Thank you" };

		// �ڹ��� ��簴ü ��������ϴ� ��ü(Object ������ ����)
		// �����迭(�迭�� ������ �ǳ� '0'���� �����ؼ� ���̰� �þ��� �پ��� ��)
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

		// �����
		list.remove(1);
		System.out.println(list.size());

		System.out.println("---÷�ڹ��---");
		for (int i = 0; i < list.size(); i++) {
			String m = (String) list.get(i);
			System.out.printf("%d: %s\n", i, m);
		}

		System.out.println("--����loop���--");
		for (Object ob : list) {
			String m = (String) ob;
			System.out.println(m);
		}
		System.out.println("-------[���� ���� MyArrayLst]---------");
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
		
		System.out.println("--[÷�ڹ��]--");
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
