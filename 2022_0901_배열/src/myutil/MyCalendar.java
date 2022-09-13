package myutil;

import java.util.Calendar;

public class MyCalendar {
	
	int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	int year;
	int month;
	
	int [][] cal_array;
	
	public void setDate(int year, int month) {
		this.year = year;
		this.month = month;
		
		//�޷¸����
		make_calendar();
	}
	
	private boolean isYoon() {
		return (year%400==0) || (year%4==0 && year%100!=0);
	}
	
	private void make_calendar() {
		if(isYoon())
			month_array[1] = 29;
		else
			month_array[1] = 28;
		//�޷��� ������ �迭����
		cal_array = new int[6][7];
		//�־��� ��/���� 1���� ���� ���ϱ�
		int yoil = 0;
		int week = 0;
		//Ķ���� ��ü�� ���Ѵ�
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);					//Calendar���� month�� 0:1����, �׷��� -1
		//�ش糯¥�� ������ ���Ѵ�
		yoil = c.get(Calendar.DAY_OF_WEEK) -1;		//Calendar���� day�� 1:�Ͽ�����, �׷��� -1
		
		//������� �޷�ä���
		int last_day = month_array[month-1];
		 
			for(int i=1; i<=last_day; i++) {
				cal_array[week][yoil] = i; 
				yoil++;
		  
				 if(yoil>6) {
					 week++; 
					 yoil = 0;  
				 }
		}
		
		//������ �޷� ä���
		if(yoil>0) {										//������ ������ ������ ä����~(2022��5���� ������ ������ ������ �۵� ����)
			int prev_yoil = yoil-1;							//������ ����
			int prev_month = (month ==1) ? 12 : month-1;	//������
			int prev_last_day = month_array[prev_month-1];	//������ ��������
			
			for(int i = prev_yoil; i>=0; i--) {				//��->������ ä��������(i�� 0���� ä����~)
				cal_array[0][i] = prev_last_day;
				prev_last_day--;
			}
		}
		
		//������ �޷� ä���
		for(int i=1; i<15; i++) {							//������� �޷� ä��� ������ �������� ����
			cal_array[week][yoil] = i;
			yoil++;
				
				if(yoil>6) {
					week++;
					yoil=0;
					if(week==6)break;						//week�� ���ϸ鼭 �����ٰ� 6���� �Ǹ� ���̻� ���������� ����(index boundary ��¼�� ��¼�� ���� �ذ��)
				}
		}
		
		
			
		
	}
	
	//�޷�����ϴ� �޼ҵ�
	public void display() {
		
		//�������
		System.out.println("----------------------------");
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		System.out.println("----------------------------");
		//��¥���
		for(int i=0; i<6; i++) {
			for(int k=0; k<7; k++) {
				System.out.printf("%4d", cal_array[i][k]);
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
	}
	
}
