package mymain;

import java.util.Scanner;

import myutil.Lotto;
import myutil.MyArrays;

public class _04_배열1_로또 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String yn="y";
		
		int [] win_no = new int[7];									//추첨번호
		int [] user_no = new int[6];								//user번호
		
		Lotto.make_win_no(win_no);									//당첨번호생성(메소드호출)
		System.out.println("[추첨번호]");
		MyArrays.display(win_no);									//배열내숫자표시(My메소드호출)
		
		while(true)
		{
			System.out.print("로또 6자리 번호를 입력하세요:");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			user_no[3] = scanner.nextInt();
			user_no[4] = scanner.nextInt();
			user_no[5] = scanner.nextInt();
			
			System.out.println("[유저번호]");
			MyArrays.array_sort_asc(user_no);
			MyArrays.display(user_no);
		
			int rank = Lotto.rank(win_no, user_no);					//등수체크
			if(rank==0) {
				System.out.println("꽝!!입니다");
			}else {
				System.out.printf("[%d]등에 당첨되었습니다.", rank);
			}
			
			System.out.print("계속?(y/n):");						//계속 할지 묻기
			yn=scanner.next();
			if(yn.equalsIgnoreCase("Y")==false)break;				//.equalsIgnorecase>대소문자 구분하지 않고 체크하는 식(y가 아니면 while문 종료해라)
		}
		
		System.out.println("★★★End★★★");
		scanner.close();	
	}

}
