package mymain;

public class _09_exercise {

	public static void main(String[] args) {

		for(int i='A'; i<='Z'; i++) {
			System.out.printf("%c", i);
		}
		System.out.println();
		
		for(int i ='A'; i<='Z'; i++) {
			if(i%3==0)
				{
				System.out.printf("%c", i);
				}else {
					System.out.printf("%c", i+32);
				}
		}
		System.out.println();

	}
}
