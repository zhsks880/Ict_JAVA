package mymain;

import java.util.Scanner;

public class _03_Ex_switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		int last_day; //�ش���� ��������?
		
		System.out.print("��:");
		month = scanner.nextInt();
		
		//if(month==1 || month==3 || month==5 ||....)�̰͵� ������ ��
		//���� ��ȿ���� üũ(1~12)
		if (month >=1 && month<=12){
			switch(month)
			{
				case 2 : last_day = 28;	break;
				case 4 : 
				case 6 : 
				case 9 : 
				case 11 : last_day = 30;	break;		//4~11�� 30�ϳ����°� �����ϴ� �������� �ϳ��� �ۼ��ϸ� ��
				default : last_day = 31;				//������ 28, 30���� ������ ������ 31�Ϸ� �����ϰ� ����
					
			}
			System.out.printf("[%d]���� ������ ����[%d]�� �Դϴ�\n", month, last_day);
		}else {
			System.out.println("���� 1~12�������� �Է°����մϴ�");
		}
								
		scanner.close();
	}

}
