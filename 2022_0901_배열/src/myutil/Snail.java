package myutil;

public class Snail {
	
	//�������(����)
	public static final int RIGHT = 0;			//���� ����ִ� 0,1,2,3 �� ���и������� �ǹ� ����(��, ���� ������ ����� ��������)
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int UP = 3;
	
	int row_chasu;
	int col_chasu;
	
	int [][] snail_array;
	
	//ä������������ ������ ����
	int direction = RIGHT;
	
	public void setChasu(int row_chasu, int col_chasu) {
		this.row_chasu = row_chasu;
		this.col_chasu = col_chasu;
		
		//������ ä���	/ snail �� �ϸ� ���ʴ�� snail2 ���ϸ� ��������
		make_snail2();					
	}
	
	private void make_snail() {
		//������ �迭 ����
		snail_array = new int[row_chasu][col_chasu];
		
		direction = RIGHT;		//���� ���������� �ʱ�ȭ ������� �ٽ��ϱ� �ؼ� ��������
		int row = 0;
		int col = -1;			//RIGHT ��� ������ 0���� �����ϰ� ��
		int su = 1;				//ä��� ��
		
		for(int i=0; i<row_chasu*col_chasu; i++) {
			if(direction==RIGHT) {				//������ 0,0���� ���������� �̵���
				col++;							//���������� �̵� col ����
				if(col == col_chasu || snail_array[row][col]!=0) {		//col ������ ���� ��ų�~�迭���� �ִ°�쿡��~
					row++;												//���� ������
					col--;												//�������� �ٽ� �־ �����ϱ�
					direction = DOWN;									//�ڸ� �����ϰ� ������ ��������~
				}
			}else if(direction==DOWN) {
				row++;
				if(row == row_chasu || snail_array[row][col]!=0) {
						row--;
						col--;
						direction = LEFT;
				}
				
			}else if(direction==LEFT) {
				col--;
				if(col < 0 || snail_array[row][col]!=0) {
					row--;
					col++;
					direction = UP;
				}
			}else if(direction==UP) {
				row--;
				if(snail_array[row][col]!=0) { 
					row++;
					col++;
					direction = RIGHT;
				}
			}
			//��ä���
			snail_array[row][col] = su++;
		}
				
	}
	
	private void make_snail2() {
		//������ �迭 ����
		snail_array = new int[row_chasu][col_chasu];
		
		direction = RIGHT;		//���� ���������� �ʱ�ȭ ������� �ٽ��ϱ� �ؼ� ��������
		int row = 0;
		int col = -1;			//RIGHT ��� ������ 0���� �����ϰ� ��
		int su = row_chasu*col_chasu;				//ä��� ��
		
		for(int i=0; i<row_chasu*col_chasu; i++) {
			if(direction==RIGHT) {				//������ 0,0���� ���������� �̵���
				col++;							//���������� �̵� col ����
				if(col == col_chasu || snail_array[row][col]!=0) {		//col ������ ���� ��ų�~�迭���� �ִ°�쿡��~
					row++;												//���� ������
					col--;												//�������� �ٽ� �־ �����ϱ�
					direction = DOWN;									//�ڸ� �����ϰ� ������ ��������~
				}
			}else if(direction==DOWN) {
				row++;
				if(row == row_chasu || snail_array[row][col]!=0) {
						row--;
						col--;
						direction = LEFT;
				}
				
			}else if(direction==LEFT) {
				col--;
				if(col < 0 || snail_array[row][col]!=0) {
					row--;
					col++;
					direction = UP;
				}
			}else if(direction==UP) {
				row--;
				if(snail_array[row][col]!=0) { 
					row++;
					col++;
					direction = RIGHT;
				}
			}
			//��ä���
			snail_array[row][col] = su--;
		}
				
	}
	public void display() {
		for(int i=0; i<row_chasu; i++) {
			for(int k=0; k<col_chasu; k++) {
				System.out.printf("%4d",snail_array[i][k]);
			}
			System.out.println();	
		}
	}
	
}
