package mymain;

import java.util.Arrays;
import java.util.Random;

import myutil.MyArrays;

public class _02_배열1_초기화 {

	public static void main(String[] args) {
		
		//배열초기화 : 갯수생략한다
		int [] nr1 = new int[] {1,2,3,4,5};
		MyArrays.display(nr1);
		
		int [] nr2 = {9,6,8,3,5};
		System.out.println("===[before sort]===");
		MyArrays.display(nr2);
		
		//정렬(Sort) : 오름차순(Ascending) 내림차순(Descending)
		Arrays.sort(nr2);
		System.out.println("===[after sort]===");
		MyArrays.display(nr2);
		
		//1차원배열의 활용
		//0	1	2	3	4	5	6	7	8	9	10	11 <-index
		//1	2	3	4	5	6	7	8	9	10	11	12 <-month
		//31 28 31 30 31 30 31 31 30 31 30 31			<-lastday
		
		                   //0	1	2	3	4	5	6	7	8	9	10	11 <-index
		int[] month_array = {31 ,28 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31};
		//난수 발생 객체
		Random random = new Random();
		//				nextInt(bound) : bound(발생경우의 수) 0부터 시작
		int month = random.nextInt(12) + 1;  // 12값을주면 0~11까지에서 난수 발생이라 +1 을 줘야 1~12월값이 난수로 됨
		System.out.printf("[%d]월은 [%d]일까지 있습니다\n", month, month_array[month-1]);
		
		
	}

}
