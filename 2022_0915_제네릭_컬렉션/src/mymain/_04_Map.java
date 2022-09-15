package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import vo.PersonVo;

public class _04_Map {

	public static void main(String[] args) {
		
		Map<Integer, String>telMap = new HashMap<Integer, String>();
		//         Key		Value
		telMap.put(1, "010-122-1234");
		telMap.put(2, "010-222-1234");
		telMap.put(3, "010-322-1234");
		telMap.put(4, "010-422-1234");
		telMap.put(5, "010-522-1234");
		
		int short_key = 5;
		String tel = telMap.get(short_key);
		System.out.printf("단축번호 %d : %s\n", short_key, tel);
		
		System.out.println("---[keySet을 이용한 데이터 조회]---");
		Set<Integer> keySet = telMap.keySet();
		System.out.println(keySet);
		
		for(Integer key : keySet) {
			System.out.printf("단축번호 %d : %s\n", key, telMap.get(key));
		}
		
		System.out.println("------ArrayList vs Map 저장 시 검색성능------");
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		Map<String, PersonVo> personMap = new HashMap<String, PersonVo>();
		
		//가상의 100개의 PersonVo 생성
		for(int i=1; i<=100; i++) {
			
			String name = String.format("길동%03d", i);
			int age = 20 + (i%11);
			String tel2 = String.format("010-111-%04d", i);
			
			PersonVo pp = new PersonVo(name, age, tel2);
			
			//ArrayList 추가
			p_list.add(pp);
			//Map 추가
			personMap.put(name, pp);
		}

//■■■■■■■■■■ Map 과 ArrayList 에 데이터를 찾는걸 예제로 해보자 ■■■■■■■■■■		
		String search_name = "길동100";
		//ArrayList 통해서 검색(순차검색)
		for(int i=0; i<p_list.size(); i++) {
			PersonVo p = p_list.get(i);
				if(p.getName().equals(search_name)) {
					System.out.printf("[%d]회 검색 후 찾음", i+1);	//i가 인덱스라 +1 해줌
					System.out.println(p);
					break;
				}
		}
		//Map을 통해서 검색
		PersonVo search_p = personMap.get(search_name);
		System.out.printf("[검색정보] : %s\n", search_p);
		
	}
}
