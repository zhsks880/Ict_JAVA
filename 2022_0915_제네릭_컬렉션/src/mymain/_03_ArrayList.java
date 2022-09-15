package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _03_ArrayList {

	/*
		List
		1.������ �ִ� �ڷᱸ��
		2.�����迭
		
		
		
	*/
	public static void main(String[] args) {
		//  				  Vector			vs		ArrayList
		//Thread ����ȭ		 O(��ü�ڽ�)			 	  X(������)
		
		List<String> river_list = new ArrayList<String>();
		
		river_list.add("�Ѱ�");
		river_list.add("������");
		river_list.add("���갭");
		river_list.add("�θ���");
		river_list.add("�̽ý��ǰ�");
		
		System.out.println(river_list);
		
		PersonVo p = new PersonVo("�ϱ浿", 34, "010-222-1234");
		System.out.println(p);
		
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		p_list.add(new PersonVo("�̱浿", 34, "010-2222-4123"));
		p_list.add(new PersonVo("��浿", 24, "010-2345-4123"));
		p_list.add(new PersonVo("��浿", 41, "011-2222-4123"));
		p_list.add(new PersonVo("���浿", 14, "010-2222-4123"));
		p_list.add(new PersonVo("���浿", 204, "010-4332-4123"));
		
		System.out.println("--[÷���̿�]--");
		for(int i=0; i<p_list.size(); i++) {
			PersonVo pp = p_list.get(i);
			System.out.println(pp);
		}
		
		System.out.println("--[����loop�̿�]--");
		for(PersonVo pp : p_list) {
			System.out.println(pp);
		}
		
	}

}
