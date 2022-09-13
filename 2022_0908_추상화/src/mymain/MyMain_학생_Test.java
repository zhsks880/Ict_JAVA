package mymain;

import myutil.고등학생;
import myutil.중학생;
import myutil.초등학생;
import myutil.학생;

public class MyMain_학생_Test {
	
	static void 어머니왈(학생 [] student_array) {
		
		/*	==첨자방식==
		 * for(int i=0; i<student_array.length; i++) {
		 * 		학생 student = student_array[i];
		 */
		
		//	==개선방식==
		for(학생 student: student_array) {	
			//다형성(Polymorphism): 동일한 명령에 대해서 객체마다 다른행동
			student.공부한다();				//학생들에게 대한 명령!
			
		}
	}
	
	public static void main(String[] args) {
		
		학생 [] student_array = {new 초등학생(), new 중학생(), new 고등학생()};
		
		어머니왈(student_array);
		
		/*
		 * int [] nr = {1,2,3,4}; 
		 * System.out.println("--첨자방식--"); 
		 * for(int i=0; i<nr.length; i++)
		 *  System.out.println(nr[i]);
		 * 
		 * System.out.println("--개선loop방식--"); 
		 * for(int n : nr)
		 * System.out.println(n); 
		 */
		
	}

}
