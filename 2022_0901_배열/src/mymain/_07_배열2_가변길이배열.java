package mymain;

import myutil.MyArrays2;

public class _07_�迭2_�������̹迭 {

	public static void main(String[] args) {
		
		//�������̹迭: 1�����迭�� ���̰� ������ �迭
		//�������̹迭: 1�����迭�� ���̰� ���� �ٸ� �迭
		
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
