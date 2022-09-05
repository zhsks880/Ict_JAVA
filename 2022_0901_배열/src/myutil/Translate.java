package myutil;

public class Translate {
	//i=행 k=열인 도식화
	
	//오른쪽 90도 전체로 돌리는 식
	public static int[][] rotate_right_90(int [][] src){
		
		//원본과 동일한 크기의 사본배열 생성
		int [][] dest = new int[src.length][src[0].length];
		int end_index = src.length-1;
		for(int i=0; i<src.length; i++) {
			for(int k=0; k<src[i].length; k++) {
				dest[i][k] = src[end_index-k][i];					//90도 도릴라면 인덱스를 4씩 빼면 우측으로 90도 감
			}
		}
		return dest;
	}
	//왼쪽 90도 전체로 돌리는 식
	public static int[][] rotate_left_90(int [][] src){
		
		//원본과 동일한 크기의 사본배열 생성
		int [][] dest = new int[src.length][src[0].length];
		int end_index = src.length-1;
		for(int i=0; i<src.length; i++) {
			for(int k=0; k<src[i].length; k++) {
				dest[i][k] = src[k][end_index-i];					
			}
		}
		return dest;
	}
	//좌우 바꾸는 식
		public static int[][] flip_left_right(int [][] src){
			
			//원본과 동일한 크기의 사본배열 생성
			int [][] dest = new int[src.length][src[0].length];
			int end_index = src.length-1;
			for(int i=0; i<src.length; i++) {
				for(int k=0; k<src[i].length; k++) {
					dest[i][k] = src[i][end_index-k];					
				}
			}
			return dest;
		}
	//상하 바꾸는 식
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
	//대각 바꾸는 식
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
	//역대각 바꾸는 식
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
