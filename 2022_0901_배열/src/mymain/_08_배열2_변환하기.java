package mymain;

import myutil.MyArrays2;
import myutil.Translate;

public class _08_�迭2_��ȯ�ϱ� {

	public static void main(String[] args) {
		
		int [][] src = new int [5][5];
		
		MyArrays2.set_sequence(src);
		System.out.println("====[����]====");
		MyArrays2.display(src);
		
		int[][] dest = Translate.rotate_left_90(src);
		System.out.println("====[left Right 90]====");
		MyArrays2.display(dest);
		
		dest = Translate.flip_left_right(src);
		System.out.println("====[�¿� ������]====");
		MyArrays2.display(dest);
		
		dest = Translate.up_down(src);
		System.out.println("====[���� ������]====");
		MyArrays2.display(dest);
		
	}
}
