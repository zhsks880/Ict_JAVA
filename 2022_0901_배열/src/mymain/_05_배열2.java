package mymain;

import myutil.MyArrays2;

public class _05_배열2 {

	public static void main(String[] args) {
		
		//2차원배열   new int[행갯수][열갯수]
		int [][] mm = new int[3][4];
		
		MyArrays2.display(mm);									//MyArray2 디스플레이 메소드 호출
		System.out.println();
		MyArrays2.set_sequence(mm);								//Myarrays2 1부터 하나씩 더하기
		MyArrays2.display(mm);				
		System.out.println();
		MyArrays2.fill(mm, 0);									//Myarrays2 0으로 클리어 시킴
		MyArrays2.display(mm);
		System.out.println();
	
	}

}
