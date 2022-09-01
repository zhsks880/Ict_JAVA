package mymain;

import myutil.MyArrays;

public class _01_배열1 {

	public static void main(String[] args) {
		
		int[]mr = new int[4];
		
		System.out.printf("mr`s length : %d\n", mr.length);
		
		//요소(Element)표현->배열명[첨자]
		mr[0] = 1;
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;
		
		/*
		 * for(int i=0; i<mr.length; i++) //for 문을 이용해서 출력하는 방법 쓴거임 
		 * {
		 * System.out.printf("mr[%d]=%d\n",i, mr[i]); }
		 */
		MyArrays.display(mr);
		/* 일일이 다 쓸때 이렇게 하고 위가 한방에 해결
		 * System.out.printf("mr[1]=%d\n", mr[1]); 
		 * System.out.printf("mr[2]=%d\n", mr[2]); 
		 */		
		
		//자바에서 이미 만들어놓은 배열관리 객체 : Arrays
		//Arrays.fill(mr, 0);
		MyArrays.fill(mr, 0);
		System.out.println("---0으로 채우기---");
		/*
		 * for(int i=0; i<mr.length; i++) 
		 * { System.out.printf("mr[%d]=%d\n",i, mr[i]); }
		 */
		MyArrays.display(mr);
		
		
		//기존Arrays : 일부만 채우기
		//				시작인덱스,3-1인덱스자리, 값
		//					시작  ,시작+갯수
		//Arrays.fill(mr,    1,      3,       5);
		MyArrays.fill(mr, 1, 3, 5);
		System.out.println("==첨자:1~2까지 5로 채우기==");
		MyArrays.display(mr);
		
		
	}

}
