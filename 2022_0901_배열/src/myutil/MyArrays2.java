package myutil;

public class MyArrays2 {
	
	//2중배열 display 메소드
	public static void display(int [][] m2) {
		for(int i=0; i<m2.length; i++) {
			for(int k=0; k<m2[i].length; k++) {						//k for문:1줄 출력
				System.out.printf("%4d", m2[i][k]);
			}
			System.out.println();									//1줄 출력 후 줄바꾸기
		}
	}
	
	//2중배열 순서대로 값 채우는 메소드
	public static void set_sequence(int[][] m2) {
		int su =1;
			for(int i=0; i<m2.length; i++) {						//행첨자
				for(int k=0; k<m2[i].length; k++) {					//열첨자	
					m2[i][k] = su++;								//처음1부터 시작해서 1씩 올려라 
				}
			}
		}
	
	//2중배열 모두 한 값으로 채우는 메소드
	public static void fill(int[][] m2, int value) {
			for(int i=0; i<m2.length; i++) {						//행첨자
				for(int k=0; k<m2[i].length; k++) {					//열첨자
					m2[i][k] = value;							 
				}
			}
		}
	
	//display를 블럭으로 모냥내는 메소드
	public static void display_block(int [][] m2) {
		for(int i=0; i<m2.length; i++) {
			for(int k=0; k<m2[i].length; k++) {						//k for문:1줄 출력
				
				if(m2[i][k]==1)
					System.out.print("■");
				else
					System.out.print("  ");
			}
			System.out.println();									
		}
	}
	
		
		
	}
