package mymain;

import myutil.MyInteger;

public class _05_������������ {

	public static void main(String[] args) {
		//������������: &   ^  |
		
		int a = 7, b=5;
		
		System.out.printf("[%32s]:%d\n", MyInteger.toBinaryString(a), a);
		System.out.printf("[%32s]:%d\n", MyInteger.toBinaryString(b), b);
		System.out.printf("[%32s]:%d&%d\n", Integer.toBinaryString(a&b), a, b);
		System.out.printf("[%32s]:%d|%d\n", Integer.toBinaryString(a|b), a, b);
		System.out.printf("[%32s]:%d^%d\n", Integer.toBinaryString(a^b), a, b);
		
		
		System.out.println("�ڡڡڡڡڡڡ�[2������ ���뿹��]�ڡڡڡڡڡڡ�");
		
		int birthday = 0x19881225;
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(birthday));
		
		//�⵵����
		int year = birthday >>> 16;
		System.out.printf("����⵵: %x\n", year);
		
		//������
		int month = birthday >> 8 & 0x000000ff;
		System.out.printf("�����: %x\n", month);
											//0x19881225
											//0x00187712	8: 1000	1: 0001
											//0x000000ff	0: 0000 f: 1111
											//0x00000012	   0000    0001
				
		//������
		int day = birthday & 0xff;
		System.out.printf("�����: %x\n", day);
		
		
		//���� birthday=0x19881225 : ������->���߰�
		// ^�̿��ؼ� ���� : ���ϰ��� �ο��ϸ� ����
		birthday = birthday ^ 0x00001200;
											// 0x19881225	8: 1000  1: 0001
											//^0x00001200	0: 0000  1: 0001
											//				   1000     0000
		
		// |�̿��ؼ� �߰� : 
		birthday = birthday | 0x00000800;
											// 0x19881225	8: 1000  0: 0000
											//|0x00000800	0: 1000  8: 1000
											//				   1000     1000
		System.out.printf("%x\n", birthday);
						
	}

}
