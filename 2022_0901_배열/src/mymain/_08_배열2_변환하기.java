package mymain;

import myutil.MyArrays2;
import myutil.Translate;

public class _08_배열2_변환하기 {

	public static void main(String[] args) {
		
		int [][] src = new int [5][5];
		
		MyArrays2.set_sequence(src);
		System.out.println("====[원본]====");
		MyArrays2.display(src);
		
		int[][] dest = Translate.rotate_left_90(src);
		System.out.println("====[left Right 90]====");
		MyArrays2.display(dest);
		
		dest = Translate.flip_left_right(src);
		System.out.println("====[좌우 뒤집기]====");
		MyArrays2.display(dest);
		
		dest = Translate.up_down(src);
		System.out.println("====[상하 뒤집기]====");
		MyArrays2.display(dest);
		
	}
}
