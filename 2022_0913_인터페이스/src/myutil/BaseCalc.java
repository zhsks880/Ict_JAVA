package myutil;

//�������̽� ����: ���, �߻�޼ҵ�, default�޼ҵ�
public interface BaseCalc {
	
	//������� ��� ����� �ν�
						double PI = 3.14;	//�ڷ��� ������ �ʱⰪ�ָ� �˾Ƽ� ����� ��ȯ�Ǽ� �ٸ� ��Ű������ ��밡����
	public static final double PI2= 3.14;	//���� ������ �κ� �� �ۼ��Ѱ���
	
	//�߻�޼ҵ�
					int plus(int a, int b);	//public abstract �Ƚᵵ �˾Ƽ� �߻�޼ҵ� ��
	public abstract int minus(int a, int b);//public void double(){} <<�̷��� ������
	
	//default�޼ҵ�
	default int gop(int a, int b) {return a*b;}	//default �� �����س����� �������̵� �� �ʿ䰡 ����(������{} ���ǰ���)
	
	
}
