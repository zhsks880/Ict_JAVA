package mymain;

import myutil.MyArrays2;

public class _06_�迭2_�ʱ�ȭ {

	public static void main(String[] args) {
		
		//�迭�ʱ�ȭ
		int [][] mm = new int[][] {
			{10, 20, 30},		//0��			
			{40, 50, 60},		//1��
			{70, 80, 90}		//2��
		};						//3�� 3���� 2���� �迭�� ����
		MyArrays2.display(mm);
		
		//2�����迭�� ������� ������
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
