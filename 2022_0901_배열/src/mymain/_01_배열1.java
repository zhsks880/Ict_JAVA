package mymain;

import myutil.MyArrays;

public class _01_�迭1 {

	public static void main(String[] args) {
		
		int[]mr = new int[4];
		
		System.out.printf("mr`s length : %d\n", mr.length);
		
		//���(Element)ǥ��->�迭��[÷��]
		mr[0] = 1;
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;
		
		/*
		 * for(int i=0; i<mr.length; i++) //for ���� �̿��ؼ� ����ϴ� ��� ������ 
		 * {
		 * System.out.printf("mr[%d]=%d\n",i, mr[i]); }
		 */
		MyArrays.display(mr);
		/* ������ �� ���� �̷��� �ϰ� ���� �ѹ濡 �ذ�
		 * System.out.printf("mr[1]=%d\n", mr[1]); 
		 * System.out.printf("mr[2]=%d\n", mr[2]); 
		 */		
		
		//�ڹٿ��� �̹� �������� �迭���� ��ü : Arrays
		//Arrays.fill(mr, 0);
		MyArrays.fill(mr, 0);
		System.out.println("---0���� ä���---");
		/*
		 * for(int i=0; i<mr.length; i++) 
		 * { System.out.printf("mr[%d]=%d\n",i, mr[i]); }
		 */
		MyArrays.display(mr);
		
		
		//����Arrays : �Ϻθ� ä���
		//				�����ε���,3-1�ε����ڸ�, ��
		//					����  ,����+����
		//Arrays.fill(mr,    1,      3,       5);
		MyArrays.fill(mr, 1, 3, 5);
		System.out.println("==÷��:1~2���� 5�� ä���==");
		MyArrays.display(mr);
		
		
	}

}
