package mymain;

import java.util.Calendar;
import java.util.Scanner;

public class Google_Calendar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("�⵵ �Է� : ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("�� �Է� : ");
        int month = Integer.parseInt(sc.nextLine());	//Integer.parseInt=�������¸� ���ڿ��� �Է¹����� �ٽ� �������·� ġȯ
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;
        
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        
        start.set(year, month - 1, 1);
        end.set(year, month, 1);
        end.add(Calendar.DATE, -1);
        
        START_DAY_OF_WEEK = start.get(Calendar.DAY_OF_WEEK);
        END_DAY = end.get(Calendar.DATE);
        
        System.out.println(year+"�� "+month+"�� �޷�\n"
                + "��\t��\tȭ\t��\t��\t��\t��");
        
        for(int q = 1 ; q < START_DAY_OF_WEEK ; q++) {
            System.out.print("\t");
        }
        
        int cnt = START_DAY_OF_WEEK - 1;
        for(int q = 1 ; q <= END_DAY ; q++) {
            System.out.print(q+"\t");
            cnt ++;
            if(cnt == 7) {
                cnt = 0;
                System.out.println("\n");
            }
        }
        sc.close();
        //� ���� ���������� ���ϴ� ���� ���� ���� ������ 1�Ͽ��� �Ϸ縦 ���� �ȴ�.
    }
 
}
