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
		
		//정렬(Sort)_javautil : 오름차순(Ascending)
		Arrays.sort(nr2);
		System.out.println("===[after (Ascending_javaUtil) sort]===");
		MyArrays.display(nr2);
		//정렬(Sort) : 오름차순(Ascending) 
		MyArrays.array_sort_asc(nr2);
		System.out.println("===[after (Ascending_Myutil) sort]===");
		MyArrays.display(nr2);
		//정렬(sort) : 내림차순(Descending)
		MyArrays.array_sort_desc(nr2);
		System.out.println("===[after (Descending_Myutil) sort]===");
		MyArrays.display(nr2);
		
		//배열을 초기화가 아닌 대입(치환) 하는 경우임
		int [] nr3;
		nr3 = new int[]{5,4,3,1,2,7,6,8};
		
		MyArrays.array_sort_desc(nr3);
		System.out.println("===[after (Descending_Myutil) sort]===");
		MyArrays.display(nr3);
		
		//특정 범위 asc소트(java.util)
		Arrays.sort(nr3, 1, 7); // 범위 산정시 시작은 1인덱스~7인덱스(-1인 6인덱스까지만)
		System.out.println("===[after range(1~6) Ascending sort]===");
		MyArrays.display(nr3);
		
		//특정 범위 desc소트(myutil)
		MyArrays.array_sort_asc(nr3);
		System.out.println("===[after (Ascending_Myutil) sort]===");
		MyArrays.display(nr3);
		
		MyArrays.array_sort_desc(nr3, 1, 6);
		System.out.println("===[after range(1~6) Descending sort]===");
		MyArrays.display(nr3);
		
		//특정 범위 asc소트(myutil)
		MyArrays.array_sort_asc(nr3, 1, 4);
		System.out.println("===[ Random sort ]===");
		MyArrays.display(nr3);
		
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
