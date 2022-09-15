package mymain;

import java.util.ArrayList;

import myutil.MyArrayList;

public class _01_���׸� {

	public static void main(String[] args) {
		//�ڹ��� ��� ��ü(Object)�� �������
		//ArrayList �� �����Ҷ��� ��δ� Object �� ��ĳ�������� �Ǳ� ������ �ڷḦ ������ ������ �ٿ�ĳ������ �ʼ��� ��
		ArrayList list = new ArrayList();
		
		//�ܼ��� ���ڸ� ��ü�� �����ҋ��� wrapper Ŭ������ �ؾ� ������ ��.
		//Integer.valueof(10); <<�̷����
		//JDK 5.0 ���ĺ��� �� ��� : Auto-Boxing(�ڵ�����)
		list.add("ȫ�浿");
		list.add(10);		//������ new Integer(10) �� ���µ� JVM �� ��ȯ�ؼ� �־���
		list.add(180.5);	//������ new Double(180.5)
		list.add(true);		//������ new Boolean(true)
		String name = (String) list.get(0);
		Integer age = (Integer) list.get(1);
		
		//���׸����� : <> ��� �ȿ� ��ü������ ����Ÿ���� ������, int �� double �̷��� ���� Integer �� Double �� wrapper Ŭ������ ����
		//���׸��� Ÿ���� ���鶧 ���� ���� ��, ���� new ��ü�� ������ �ѹ� �ϸ� �Ǵ��Ŷ� �ٸ�(���ϳ�?)
		ArrayList<String> fruit_list = new ArrayList<String>();
		fruit_list.add("����");
		fruit_list.add("����");
		
		ArrayList<Integer> lotto_list = new ArrayList<Integer>();
		lotto_list.add(10);
		
		//MyArray ����ؼ� ���׸� �ϱ�
		System.out.println("--���� ���� ���׸� ����ϱ�--");
		MyArrayList<String> sido_list = new MyArrayList<String>();
		sido_list.add("����");
		sido_list.add("���");
		sido_list.add("��õ");
		sido_list.add("����");
		
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
