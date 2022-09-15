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
		System.out.printf("�����ȣ %d : %s\n", short_key, tel);
		
		System.out.println("---[keySet�� �̿��� ������ ��ȸ]---");
		Set<Integer> keySet = telMap.keySet();
		System.out.println(keySet);
		
		for(Integer key : keySet) {
			System.out.printf("�����ȣ %d : %s\n", key, telMap.get(key));
		}
		
		System.out.println("------ArrayList vs Map ���� �� �˻�����------");
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		Map<String, PersonVo> personMap = new HashMap<String, PersonVo>();
		
		//������ 100���� PersonVo ����
		for(int i=1; i<=100; i++) {
			
			String name = String.format("�浿%03d", i);
			int age = 20 + (i%11);
			String tel2 = String.format("010-111-%04d", i);
			
			PersonVo pp = new PersonVo(name, age, tel2);
			
			//ArrayList �߰�
			p_list.add(pp);
			//Map �߰�
			personMap.put(name, pp);
		}

//����������� Map �� ArrayList �� �����͸� ã�°� ������ �غ��� �����������		
		String search_name = "�浿100";
		//ArrayList ���ؼ� �˻�(�����˻�)
		for(int i=0; i<p_list.size(); i++) {
			PersonVo p = p_list.get(i);
				if(p.getName().equals(search_name)) {
					System.out.printf("[%d]ȸ �˻� �� ã��", i+1);	//i�� �ε����� +1 ����
					System.out.println(p);
					break;
				}
		}
		//Map�� ���ؼ� �˻�
		PersonVo search_p = personMap.get(search_name);
		System.out.printf("[�˻�����] : %s\n", search_p);
		
	}
}
