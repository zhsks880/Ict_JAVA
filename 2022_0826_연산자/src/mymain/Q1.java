package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//금액: 125,600원
		//50,000원권 : 2매
		//10,000원권 : 2매
		//5,000원권 : 1매
		//100원권 : 6매
		
		//입력도구
		Scanner scanner = new Scanner(System.in);
		
		int money; //금액
		int im_money; //
		//권종별 수량
		int money_50000;
		int money_10000;
		int money_5000;
		int money_1000;
		int money_500;
		int money_100;
		int money_50;
		int money_10;
		
		//입력
		System.out.print("금액:");
		money = scanner.nextInt();
		//임시변수 넣는다
		im_money = money;
		//권종별 갯수를 계산
		//im_money = 125600
		
		//50000원권 갯수
		money_50000 = im_money / 50000;
		
		//50000원을 계산한 나머지 금액을 im_money넣는다
		im_money = im_money % 50000;
		
		money_10000 = im_money / 10000;
		im_money = im_money % 10000;
		
		money_5000 = im_money / 5000;
		im_money = im_money % 5000;
		
		money_1000 = im_money / 1000;
		im_money = im_money % 1000;
		
		money_500 = im_money / 500;
		im_money = im_money % 500;
		
		money_100 = im_money / 100;
		im_money = im_money % 100;
		
		money_50 = im_money / 50;
		im_money = im_money % 50;
		
		money_10 = im_money / 10;
		im_money = im_money % 10;
		
		
		System.out.printf("■■■■[%d]원에 대한 권종별 갯수■■■■\n", money);
		System.out.printf("50000원: %d(매)\n", money_50000);
		System.out.printf("10000원: %d(매)\n", money_10000);
		System.out.printf(" 5000원: %d(매)\n", money_5000);
		System.out.printf(" 1000원: %d(매)\n", money_1000);
		System.out.printf("  500원: %d(개)\n", money_500);
		System.out.printf("  100원: %d(개)\n", money_100);
		System.out.printf("   50원: %d(개)\n", money_50);
		System.out.printf("   10원: %d(개)\n", money_10);
		
		
		
		scanner.close();
	}

}
