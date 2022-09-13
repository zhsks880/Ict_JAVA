package myutil;

public class Snail {
	
	//상수선언(방향)
	public static final int RIGHT = 0;			//여기 들어있는 0,1,2,3 은 구분목적으로 의미 없음(단, 값이 같으면 상수가 안정해짐)
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int UP = 3;
	
	int row_chasu;
	int col_chasu;
	
	int [][] snail_array;
	
	//채우기방향정보를 저장할 변수
	int direction = RIGHT;
	
	public void setChasu(int row_chasu, int col_chasu) {
		this.row_chasu = row_chasu;
		this.col_chasu = col_chasu;
		
		//달팽이 채우기	/ snail 로 하면 차례대로 snail2 로하면 역순으로
		make_snail2();					
	}
	
	private void make_snail() {
		//달팽이 배열 생성
		snail_array = new int[row_chasu][col_chasu];
		
		direction = RIGHT;		//방향 오른쪽으로 초기화 해줘야지 다시하기 해서 가능해짐
		int row = 0;
		int col = -1;			//RIGHT 상수 때문에 0으로 시작하게 됨
		int su = 1;				//채우는 수
		
		for(int i=0; i<row_chasu*col_chasu; i++) {
			if(direction==RIGHT) {				//최초의 0,0에서 오른쪽으로 이동중
				col++;							//오른쪽으로 이동 col 증가
				if(col == col_chasu || snail_array[row][col]!=0) {		//col 마지막 끝에 닿거나~배열값이 있는경우에는~
					row++;												//한줄 내리고
					col--;												//왼쪽으로 다시 넣어서 정리하기
					direction = DOWN;									//자리 정리하고 밑으로 내려가자~
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
			//값채우기
			snail_array[row][col] = su++;
		}
				
	}
	
	private void make_snail2() {
		//달팽이 배열 생성
		snail_array = new int[row_chasu][col_chasu];
		
		direction = RIGHT;		//방향 오른쪽으로 초기화 해줘야지 다시하기 해서 가능해짐
		int row = 0;
		int col = -1;			//RIGHT 상수 때문에 0으로 시작하게 됨
		int su = row_chasu*col_chasu;				//채우는 수
		
		for(int i=0; i<row_chasu*col_chasu; i++) {
			if(direction==RIGHT) {				//최초의 0,0에서 오른쪽으로 이동중
				col++;							//오른쪽으로 이동 col 증가
				if(col == col_chasu || snail_array[row][col]!=0) {		//col 마지막 끝에 닿거나~배열값이 있는경우에는~
					row++;												//한줄 내리고
					col--;												//왼쪽으로 다시 넣어서 정리하기
					direction = DOWN;									//자리 정리하고 밑으로 내려가자~
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
			//값채우기
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
