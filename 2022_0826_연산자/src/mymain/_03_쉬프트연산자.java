package mymain;

public class _03_����Ʈ������ {

	public static void main(String[] args) {
		//����Ʈ������: >> << >>> (2������ �ٲ㼭 ��Ʈ��ŭ �о ����, 2�ǽ�(bit)��ŭ�̳�)
		//	-> >>(�����⿬��)  <<(���ϱ⿬��)
		// >>(�����:��ȣ)  <<(�����:0)  >>>(�����:0)  (2������)
		//�̰� ���� ���ϴ� �����ڰ� �ƴϴ�. 2������ �� �����ؼ� ��Ʈ �о�°Ÿ� �����ϵ���
		
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
