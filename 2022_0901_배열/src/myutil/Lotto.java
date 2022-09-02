package myutil;

import java.util.Random;

public class Lotto {
	//��÷��ȣ ���� �� �ߺ� �ɷ�����
	public static void make_win_no(int [] win_no) {
		Random random = new Random();
		
		OUT_FOR:								//label
		for(int i=0; i<win_no.length; i++) {	//i=0 1 2 3 4 5 6
			//�����߻�(1~45������ ���� �߻�)
			int su = random.nextInt(45)+1; //+1�������� 1~45��, �Ⱥ����� 0~44��
			
			//�ߺ� �� üũ(������ġ �������� üũ)
			for(int k=0; k<i; k++) {
				if(win_no[k]==su) { 			//�������� ������ ��ȿ���Ѷ�~
					i--;						//System.out.printf("�ߺ���:%d\n", su);	//�ߺ����� ���������� ���°�
					continue OUT_FOR;			//OUT_FOR��� �� ���������� �̵��ؼ� i++������ �Ѿ
				}								//continu�� ��Ȱ ����ݺ����� ������ ������������� �Ѿ��
			}
			win_no[i] = su;						//�߻��� �� ����
		}
		MyArrays.array_sort_asc(win_no, 0, 6);	//�տ� 6�ڸ� ��ȣ ����
	}
	
	//������
	public static int rank(int [] win_no, int [] user_no) {

		int count = 0;
		int lotto_rank = 0;
											//�迭���� ���� ������ �ƴ��� ī��Ʈ�ϴ¹�
		for(int i=0; i<6; i++) {			//2�� for ������ ���� �ٸ��� �� �ؼ� ���� ������ ī����
			for(int k=0; k<6; k++) {
				if(user_no[i]==win_no[k]) {
					count ++;				//user��win_no �� ������ count ������ �Ѱ��� ������Ŵ
					break;					//count ���� �����Ǹ� k for���� ������ i for�� ���� ��
				}
			}
		}
		System.out.println("���� ����:"+count);
		
											//���������� ���� ���� ���
		if(count == 3) lotto_rank= 5;
		else if(count == 4) lotto_rank= 4;
		else if(count == 5) lotto_rank= 3;
		else if(count == 6) lotto_rank= 1;
		
		if(count == 5) 						//3���߿��� 2���� ã�Ƴ��� ���
			for(int i=0; i<6; i++)
				if(win_no[6]==user_no[i]) {
					lotto_rank= 2;
					break;
				}
		return lotto_rank; // return �� �������� ����� public static int<<���⿡ ���� �־ ������
	}
}
