package mymain;

public class Q4_teacher {

	public static void main(String[] args) {
		
		System.out.println("정상가격        세일가격");
		System.out.println("========================");
		
		for(int price=10000; price<=20000; price+=1000)
		{
			System.out.printf("%d%18.1f\n", price, price*0.7);
		}
		
	}

}
