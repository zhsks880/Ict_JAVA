package mymain;

import myutil.MyArrays2;

public class _06_배열2_초기화 {

	public static void main(String[] args) {
		
		//배열초기화
		int [][] mm = new int[][] {
			{10, 20, 30},		//0행			
			{40, 50, 60},		//1행
			{70, 80, 90}		//2행
		};						//3행 3열의 2차원 배열을 만듬
		MyArrays2.display(mm);
		
		//2차원배열로 블럭모냥을 만들어보자
		int [][] block_t = {
							{1,1,1},
							{0,1,0},
							{0,1,0},
							};
		
		int [][] block_l = {
							{1,0,0},
							{1,0,0},
							{1,1,1},
							};
		int [][] block_f = {
							{0,1,0},
							{1,1,1},
							{1,1,1},
							};
		System.out.println("====[T Block]====");
		MyArrays2.display_block(block_t);
		System.out.println("====[L Block]====");
		MyArrays2.display_block(block_l);
		System.out.println("====[F Block]====");
		MyArrays2.display_block(block_f);
		
	}

}
