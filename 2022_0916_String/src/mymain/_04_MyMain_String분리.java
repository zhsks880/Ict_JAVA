package mymain;

import java.util.StringTokenizer;

public class _04_MyMain_String분리 {

	public static void main(String[] args) {

		String str = "서울 경기 인천 대전 대구 부산 광주 목포";
		
		//방법1 : StringTokenizer 를 이용한 분리
		//분리기준 :실제 토큰이 있는지 없는지에 따라 분리
		StringTokenizer st = new StringTokenizer(str);	//단어들을 토큰으로 만들어버림, 뒤에 "스페이스" 생략되있음
		
		System.out.println(st.countTokens());			//8토큰이 있다~
		System.out.println("--StringTokenizer--");
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); 				//현재 토큰가져오고 다음토큰위치 이동
			System.out.println(token);
		}
			
		//방법2 : String->split() 메소드 이용하는 방법
		//분리기준 : 분리문자기준으로 잘라내서 배열로 만드는 기준이라 값이 없으면 한칸 공백으로 처리됨
		String [] sido_array = str.split(" ");			//공백기준으로 분리해서 배열로 넣어라, 분리문자 기준으로함
		//String [] sido_array = {"서울", "경기", "인천", "대전", "대구", "부산", "광주", "목포"}; 이런형식으로 변환
		System.out.println("--split--");
		for(String sido : sido_array)
			System.out.println(sido);
		
		}	
	}