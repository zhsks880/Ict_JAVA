package myutil;

public class MyArrays2 {
	
	//2�߹迭 display �޼ҵ�
	public static void display(int [][] m2) {
		for(int i=0; i<m2.length; i++) {
			for(int k=0; k<m2[i].length; k++) {						//k for��:1�� ���
				System.out.printf("%4d", m2[i][k]);
			}
			System.out.println();									//1�� ��� �� �ٹٲٱ�
		}
	}
	
	//2�߹迭 ������� �� ä��� �޼ҵ�
	public static void set_sequence(int[][] m2) {
		int su =1;
			for(int i=0; i<m2.length; i++) {						//��÷��
				for(int k=0; k<m2[i].length; k++) {					//��÷��	
					m2[i][k] = su++;								//ó��1���� �����ؼ� 1�� �÷��� 
				}
			}
		}
	
	//2�߹迭 ��� �� ������ ä��� �޼ҵ�
	public static void fill(int[][] m2, int value) {
			for(int i=0; i<m2.length; i++) {						//��÷��
				for(int k=0; k<m2[i].length; k++) {					//��÷��
					m2[i][k] = value;							 
				}
			}
		}
	
	//display�� ������ ��ɳ��� �޼ҵ�
	public static void display_block(int [][] m2) {
		for(int i=0; i<m2.length; i++) {
			for(int k=0; k<m2[i].length; k++) {						//k for��:1�� ���
				
				if(m2[i][k]==1)
					System.out.print("��");
				else
					System.out.print("  ");
			}
			System.out.println();									
		}
	}
	
		
		
	}
