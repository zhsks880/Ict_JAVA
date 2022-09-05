package myutil;

public class Translate {
	//i=�� k=���� ����ȭ
	
	//������ 90�� ��ü�� ������ ��
	public static int[][] rotate_right_90(int [][] src){
		
		//������ ������ ũ���� �纻�迭 ����
		int [][] dest = new int[src.length][src[0].length];
		int end_index = src.length-1;
		for(int i=0; i<src.length; i++) {
			for(int k=0; k<src[i].length; k++) {
				dest[i][k] = src[end_index-k][i];					//90�� ������� �ε����� 4�� ���� �������� 90�� ��
			}
		}
		return dest;
	}
	//���� 90�� ��ü�� ������ ��
	public static int[][] rotate_left_90(int [][] src){
		
		//������ ������ ũ���� �纻�迭 ����
		int [][] dest = new int[src.length][src[0].length];
		int end_index = src.length-1;
		for(int i=0; i<src.length; i++) {
			for(int k=0; k<src[i].length; k++) {
				dest[i][k] = src[k][end_index-i];					
			}
		}
		return dest;
	}
	//�¿� �ٲٴ� ��
		public static int[][] flip_left_right(int [][] src){
			
			//������ ������ ũ���� �纻�迭 ����
			int [][] dest = new int[src.length][src[0].length];
			int end_index = src.length-1;
			for(int i=0; i<src.length; i++) {
				for(int k=0; k<src[i].length; k++) {
					dest[i][k] = src[i][end_index-k];					
				}
			}
			return dest;
		}
	//���� �ٲٴ� ��
		public static int[][] up_down(int[][] src) {

		int[][] dest = new int[src.length][src[0].length];
		int end_index = src.length - 1;
		for (int i = 0; i < src.length; i++) {
			for (int k = 0; k < src[i].length; k++) {
				dest[i][k] = src[end_index-i][k];
			}
		}
		return dest;
	}
	//�밢 �ٲٴ� ��
		public static int[][] flip_diagonal_1(int[][] src) {

		int[][] dest = new int[src.length][src[0].length];
		int end_index = src.length - 1;
		for (int i = 0; i < src.length; i++) {
			for (int k = 0; k < src[i].length; k++) {
				dest[i][k] = src[end_index-k][end_index-i];
			}
		}
		return dest;
	}
	//���밢 �ٲٴ� ��
		public static int[][] flip_diagonal_2(int[][] src) {

		int[][] dest = new int[src.length][src[0].length];
		int end_index = src.length - 1;
		for (int i = 0; i < src.length; i++) {
			for (int k = 0; k < src[i].length; k++) {
				dest[i][k] = src[k][i];
			}
		}
		return dest;
	}
}
