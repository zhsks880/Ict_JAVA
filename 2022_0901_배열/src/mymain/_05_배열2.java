package mymain;

import myutil.MyArrays2;

public class _05_�迭2 {

	public static void main(String[] args) {
		
		//2�����迭   new int[�హ��][������]
		int [][] mm = new int[3][4];
		
		MyArrays2.display(mm);									//MyArray2 ���÷��� �޼ҵ� ȣ��
		System.out.println();
		MyArrays2.set_sequence(mm);								//Myarrays2 1���� �ϳ��� ���ϱ�
		MyArrays2.display(mm);				
		System.out.println();
		MyArrays2.fill(mm, 0);									//Myarrays2 0���� Ŭ���� ��Ŵ
		MyArrays2.display(mm);
		System.out.println();
	
	}

}
