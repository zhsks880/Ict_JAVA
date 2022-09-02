package mymain;

import java.util.Arrays;
import java.util.Random;

import myutil.MyArrays;

public class _02_�迭1_�ʱ�ȭ {

	public static void main(String[] args) {
		
		//�迭�ʱ�ȭ : ���������Ѵ�
		int [] nr1 = new int[] {1,2,3,4,5};
		MyArrays.display(nr1);
		
		int [] nr2 = {9,6,8,3,5};
		System.out.println("===[before sort]===");
		MyArrays.display(nr2);
		
		//����(Sort)_javautil : ��������(Ascending)
		Arrays.sort(nr2);
		System.out.println("===[after (Ascending_javaUtil) sort]===");
		MyArrays.display(nr2);
		//����(Sort) : ��������(Ascending) 
		MyArrays.array_sort_asc(nr2);
		System.out.println("===[after (Ascending_Myutil) sort]===");
		MyArrays.display(nr2);
		//����(sort) : ��������(Descending)
		MyArrays.array_sort_desc(nr2);
		System.out.println("===[after (Descending_Myutil) sort]===");
		MyArrays.display(nr2);
		
		//�迭�� �ʱ�ȭ�� �ƴ� ����(ġȯ) �ϴ� �����
		int [] nr3;
		nr3 = new int[]{5,4,3,1,2,7,6,8};
		
		MyArrays.array_sort_desc(nr3);
		System.out.println("===[after (Descending_Myutil) sort]===");
		MyArrays.display(nr3);
		
		//Ư�� ���� asc��Ʈ(java.util)
		Arrays.sort(nr3, 1, 7); // ���� ������ ������ 1�ε���~7�ε���(-1�� 6�ε���������)
		System.out.println("===[after range(1~6) Ascending sort]===");
		MyArrays.display(nr3);
		
		//Ư�� ���� desc��Ʈ(myutil)
		MyArrays.array_sort_asc(nr3);
		System.out.println("===[after (Ascending_Myutil) sort]===");
		MyArrays.display(nr3);
		
		MyArrays.array_sort_desc(nr3, 1, 6);
		System.out.println("===[after range(1~6) Descending sort]===");
		MyArrays.display(nr3);
		
		//Ư�� ���� asc��Ʈ(myutil)
		MyArrays.array_sort_asc(nr3, 1, 4);
		System.out.println("===[ Random sort ]===");
		MyArrays.display(nr3);
		
		//1�����迭�� Ȱ��
		//0	1	2	3	4	5	6	7	8	9	10	11 <-index
		//1	2	3	4	5	6	7	8	9	10	11	12 <-month
		//31 28 31 30 31 30 31 31 30 31 30 31			<-lastday
		
		                   //0	1	2	3	4	5	6	7	8	9	10	11 <-index
		int[] month_array = {31 ,28 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31};
		//���� �߻� ��ü
		Random random = new Random();
		//				nextInt(bound) : bound(�߻������ ��) 0���� ����
		int month = random.nextInt(12) + 1;  // 12�����ָ� 0~11�������� ���� �߻��̶� +1 �� ��� 1~12������ ������ ��
		System.out.printf("[%d]���� [%d]�ϱ��� �ֽ��ϴ�\n", month, month_array[month-1]);
		
		
	}

}
