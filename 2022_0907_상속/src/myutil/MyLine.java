package myutil;

public class MyLine {
	
	public static void draw_title(String title, int len) {
		
		for(int i=0; i<len; i++)
			System.out.print("    ");
		
		System.out.println(title);
	}
	
	
	public static void draw_line() {
		System.out.println("===================");
	}
	
	public static void draw_line(int len) {
		
		for(int i=0; i<len; i++)
			System.out.print('-');
		
		System.out.println();
	}
	
	public static void draw_line(char ch, int len) {
			
			for(int i=0; i<len; i++)
				System.out.print(ch);
			
			System.out.println();
		}
	
	public static void draw_line(char ch1, int len1, char ch2, int len2, int total_len) {
		//��ü ���̰� 30�ε� ��3 ������ 2 ��������
		
		while(true) {
			//pattern1 ���
			for(int i=0; i<len1; i++) {
				System.out.printf("%c", ch1);
				
				total_len--;
				if(total_len==0) {
					System.out.println();
					return;
				}
			}
			//pattern2 ���
			for(int i=0; i<len2; i++) {
				System.out.printf("%c", ch2);
				
				total_len--;
				if(total_len==0) {
					System.out.println();
					return;
				}
			}
		}
	}
		
}
