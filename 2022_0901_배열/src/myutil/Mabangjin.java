package myutil;

public class Mabangjin {
	
	int chasu;
	
	int [][] ma_array;

	public void setChasu(int chasu) {
		this.chasu = chasu;
		
		//������ ä��� �޼ҵ����(���°Ŷ� �տ� ������ư ������ �ؿ� private void ��������)
		make_mabangjin();
	}

	private void make_mabangjin() {
		//�迭����
		ma_array = new int[chasu][chasu];
		
		//�ʱ���ġ����
		int row = 0;
		int col = chasu/2;						//chasu=3 /2 = 1
		
		//ó���ڸ� �� �� ����
		int su =1;
		ma_array[row][col]=su;
		su++;
		
		//ó������ �� ������ ĭ ä���
		for(int i=0; i<chasu*chasu-1; i++) {	//�ʱ���ġ 1ĭ �԰� �־ -1 ���̰� ���ƶ�~3*3=9 -1 =8�� ���ƶ�
			//�����밢�̵�
			row--;	//�迭 ���� �ø���
			col++;	//�迭 ���������� ������
			
			if( row<0 && col==chasu ) {			//��&���� ��γ������
				row = row + 2;
				col--;
			}else if( row<0 ) {					//���� �������->�� ��ġ���� �� �Ʒ���
				row = chasu -1;
			}else if( col==chasu ) {			//�������� �������-> �� ��ġ���� �� ������
				col = 0;
			}
		
			if(ma_array[row][col]!=0) {			//�̹� ���� ä���� ������
				row = row + 2;
				col--;
			}
			ma_array[row][col] = su++;			//ĭ�� ä����(1 ��������~���� ����)
		}
	}
	
	public void display() {
		for(int i=0; i<chasu; i++) {			//��ݺ��ϸ鼭 ä������
			for(int k=0; k<chasu; k++) {		//��ä��鼭 ä������
				System.out.printf("%4d", ma_array[i][k]);
			}									//k���� ������
			System.out.println();				//���� �ٲٰ�
		}										//i���� �����°�
		
	}
	
	
	
	
}
