package mymain;

public class _03_쉬프트연산자 {

	public static void main(String[] args) {
		//쉬프트연산자: >> << >>> (2진수로 바꿔서 비트만큼 밀어서 연산, 2의승(bit)만큼이네)
		//	-> >>(나누기연산)  <<(곱하기연산)
		// >>(빈공간:부호)  <<(빈공간:0)  >>>(빈공간:0)  (2진연산)
		//이건 값을 구하는 연산자가 아니다. 2진수만 잘 이해해서 비트 밀어내는거만 이해하도록
		
		int n = 10;
		System.out.printf("[%32s]\n", Integer.toBinaryString(n));
		System.out.printf("[%32s]\n", Integer.toBinaryString(n>>2));
		System.out.printf("[%32s]\n", Integer.toBinaryString(n<<2));
		
		n = -1;
		System.out.printf("[%32s]\n", Integer.toBinaryString(n));
		System.out.printf("[%32s]\n", Integer.toBinaryString(n>>4));
		System.out.printf("[%32s]\n", Integer.toBinaryString(n>>>4));
		
	}

}
