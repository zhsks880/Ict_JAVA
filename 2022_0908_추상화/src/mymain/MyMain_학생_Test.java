package mymain;

import myutil.����л�;
import myutil.���л�;
import myutil.�ʵ��л�;
import myutil.�л�;

public class MyMain_�л�_Test {
	
	static void ��ӴϿ�(�л� [] student_array) {
		
		/*	==÷�ڹ��==
		 * for(int i=0; i<student_array.length; i++) {
		 * 		�л� student = student_array[i];
		 */
		
		//	==�������==
		for(�л� student: student_array) {	
			//������(Polymorphism): ������ ��ɿ� ���ؼ� ��ü���� �ٸ��ൿ
			student.�����Ѵ�();				//�л��鿡�� ���� ���!
			
		}
	}
	
	public static void main(String[] args) {
		
		�л� [] student_array = {new �ʵ��л�(), new ���л�(), new ����л�()};
		
		��ӴϿ�(student_array);
		
		/*
		 * int [] nr = {1,2,3,4}; 
		 * System.out.println("--÷�ڹ��--"); 
		 * for(int i=0; i<nr.length; i++)
		 *  System.out.println(nr[i]);
		 * 
		 * System.out.println("--����loop���--"); 
		 * for(int n : nr)
		 * System.out.println(n); 
		 */
		
	}

}
