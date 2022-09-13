package myutil;

public class Mabangjin {
	
	int chasu;
	
	int [][] ma_array;

	public void setChasu(int chasu) {
		this.chasu = chasu;
		
		//마방진 채우는 메소드생성(없는거라 앞에 에러버튼 누르면 밑에 private void 생성해줌)
		make_mabangjin();
	}

	private void make_mabangjin() {
		//배열생성
		ma_array = new int[chasu][chasu];
		
		//초기위치설정
		int row = 0;
		int col = chasu/2;						//chasu=3 /2 = 1
		
		//처음자리 및 값 셋팅
		int su =1;
		ma_array[row][col]=su;
		su++;
		
		//처음값을 뺀 나머지 칸 채우기
		for(int i=0; i<chasu*chasu-1; i++) {	//초기위치 1칸 먹고 있어서 -1 먹이고 돌아라~3*3=9 -1 =8번 돌아라
			//우측대각이동
			row--;	//배열 위로 올리기
			col++;	//배열 오른쪽으로 보내기
			
			if( row<0 && col==chasu ) {			//위&우측 모두나간경우
				row = row + 2;
				col--;
			}else if( row<0 ) {					//위로 나간경우->그 위치에서 맨 아래로
				row = chasu -1;
			}else if( col==chasu ) {			//우측으로 나간경우-> 그 위치에서 맨 앞으로
				col = 0;
			}
		
			if(ma_array[row][col]!=0) {			//이미 값이 채워져 있으면
				row = row + 2;
				col--;
			}
			ma_array[row][col] = su++;			//칸을 채워라(1 다음부터~위를 보고)
		}
	}
	
	public void display() {
		for(int i=0; i<chasu; i++) {			//행반복하면서 채워가기
			for(int k=0; k<chasu; k++) {		//열채우면서 채워가기
				System.out.printf("%4d", ma_array[i][k]);
			}									//k열이 끝나면
			System.out.println();				//한줄 바꾸고
		}										//i열이 끝나는것
		
	}
	
	
	
	
}
