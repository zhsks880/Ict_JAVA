package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _03_ArrayList {

	/*
		List
		1.순서가 있는 자료구조
		2.동적배열
		
		
		
	*/
	public static void main(String[] args) {
		//  				  Vector			vs		ArrayList
		//Thread 동기화		 O(객체자신)			 	  X(개발자)
		
		List<String> river_list = new ArrayList<String>();
		
		river_list.add("한강");
		river_list.add("낙동강");
		river_list.add("연산강");
		river_list.add("두만강");
		river_list.add("미시시피강");
		
		System.out.println(river_list);
		
		PersonVo p = new PersonVo("일길동", 34, "010-222-1234");
		System.out.println(p);
		
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		p_list.add(new PersonVo("이길동", 34, "010-2222-4123"));
		p_list.add(new PersonVo("삼길동", 24, "010-2345-4123"));
		p_list.add(new PersonVo("사길동", 41, "011-2222-4123"));
		p_list.add(new PersonVo("오길동", 14, "010-2222-4123"));
		p_list.add(new PersonVo("육길동", 204, "010-4332-4123"));
		
		System.out.println("--[첨자이용]--");
		for(int i=0; i<p_list.size(); i++) {
			PersonVo pp = p_list.get(i);
			System.out.println(pp);
		}
		
		System.out.println("--[개선loop이용]--");
		for(PersonVo pp : p_list) {
			System.out.println(pp);
		}
		
	}

}
