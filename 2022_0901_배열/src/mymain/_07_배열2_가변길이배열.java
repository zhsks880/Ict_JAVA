package mymain;

import myutil.MyArrays2;

public class _07_배열2_가변길이배열 {

	public static void main(String[] args) {
		
		//고정길이배열: 1차원배열의 길이가 동일한 배열
		//가변길이배열: 1차원배열의 길이가 서로 다른 배열
		
		int[][] mm = new int [3][];
		
		mm[0] = new int [2];
		mm[1] = new int [3];
		mm[2] = new int [4];
		MyArrays2.set_sequence(mm);
		MyArrays2.display(mm);
		
		int[][] mm1 = {
				{1},
				{2,3},
				{4,5,6},
				{7,8,9,10},
		};
		MyArrays2.display(mm1);	
	}
}
