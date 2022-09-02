package myutil;

import java.util.Random;

public class Lotto {
	//당첨번호 생성 및 중복 걸러내기
	public static void make_win_no(int [] win_no) {
		Random random = new Random();
		
		OUT_FOR:								//label
		for(int i=0; i<win_no.length; i++) {	//i=0 1 2 3 4 5 6
			//난수발생(1~45사이의 난수 발생)
			int su = random.nextInt(45)+1; //+1붙혀야지 1~45임, 안붙히면 0~44임
			
			//중복 수 체크(현재위치 이전까지 체크)
			for(int k=0; k<i; k++) {
				if(win_no[k]==su) { 			//같은수가 있으면 무효시켜라~
					i--;						//System.out.printf("중복수:%d\n", su);	//중복수가 뭐나오는지 보는거
					continue OUT_FOR;			//OUT_FOR라는 라벨 붙힌곳으로 이동해서 i++순서로 넘어감
				}								//continu의 역활 현재반복문을 끝내고 다음제어식으로 넘어가라
			}
			win_no[i] = su;						//발생한 수 저장
		}
		MyArrays.array_sort_asc(win_no, 0, 6);	//앞에 6자리 번호 정렬
	}
	
	//등수계산
	public static int rank(int [] win_no, int [] user_no) {

		int count = 0;
		int lotto_rank = 0;
											//배열끼리 값이 같은지 아닌지 카운트하는법
		for(int i=0; i<6; i++) {			//2중 for 문으로 같냐 다르냐 로 해서 같은 갯수를 카운팅
			for(int k=0; k<6; k++) {
				if(user_no[i]==win_no[k]) {
					count ++;				//user와win_no 가 같으면 count 변수를 한개씩 증가시킴
					break;					//count 변수 증가되면 k for문은 끝나고 i for문 돌러 감
				}
			}
		}
		System.out.println("맞힌 개수:"+count);
		
											//맞은갯수에 따른 순위 계산
		if(count == 3) lotto_rank= 5;
		else if(count == 4) lotto_rank= 4;
		else if(count == 5) lotto_rank= 3;
		else if(count == 6) lotto_rank= 1;
		
		if(count == 5) 						//3등중에서 2등을 찾아내는 방법
			for(int i=0; i<6; i++)
				if(win_no[6]==user_no[i]) {
					lotto_rank= 2;
					break;
				}
		return lotto_rank; // return 을 마지막에 해줘야 public static int<<여기에 값을 넣어서 보내줌
	}
}
