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
		
		//����(Sort) : ��������(Ascending) ��������(Descending)
		Arrays.sort(nr2);
		System.out.println("===[after sort]===");
		MyArrays.display(nr2);
		
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
