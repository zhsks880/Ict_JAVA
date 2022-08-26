package mymain;

import myutil.MyInteger;

public class _05_이진논리연산자 {

	public static void main(String[] args) {
		//이진논리연산자: &   ^  |
		
		int a = 7, b=5;
		
		System.out.printf("[%32s]:%d\n", MyInteger.toBinaryString(a), a);
		System.out.printf("[%32s]:%d\n", MyInteger.toBinaryString(b), b);
		System.out.printf("[%32s]:%d&%d\n", Integer.toBinaryString(a&b), a, b);
		System.out.printf("[%32s]:%d|%d\n", Integer.toBinaryString(a|b), a, b);
		System.out.printf("[%32s]:%d^%d\n", Integer.toBinaryString(a^b), a, b);
		
		
		System.out.println("★★★★★★★[2진연산 응용예제]★★★★★★★");
		
		int birthday = 0x19881225;
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(birthday));
		
		//년도추출
		int year = birthday >>> 16;
		System.out.printf("출생년도: %x\n", year);
		
		//월추출
		int month = birthday >> 8 & 0x000000ff;
		System.out.printf("출생월: %x\n", month);
											//0x19881225
											//0x00187712	8: 1000	1: 0001
											//0x000000ff	0: 0000 f: 1111
											//0x00000012	   0000    0001
				
		//일추출
		int day = birthday & 0xff;
		System.out.printf("출생일: %x\n", day);
		
		
		//수정 birthday=0x19881225 : 월삭제->월추가
		// ^이용해서 삭제 : 동일값을 부여하면 제거
		birthday = birthday ^ 0x00001200;
											// 0x19881225	8: 1000  1: 0001
											//^0x00001200	0: 0000  1: 0001
											//				   1000     0000
		
		// |이용해서 추가 : 
		birthday = birthday | 0x00000800;
											// 0x19881225	8: 1000  0: 0000
											//|0x00000800	0: 1000  8: 1000
											//				   1000     1000
		System.out.printf("%x\n", birthday);
						
	}

}
