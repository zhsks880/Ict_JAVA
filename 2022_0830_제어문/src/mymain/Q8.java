package mymain;

public class Q8 {

	public static void main(String[] args) {
		
		double pi = 0;
		int sign = 1; //��ȣ������� ����
		
		for(int i=0; i<1000000000; i++){			// i= 012345....����
			pi = pi + sign * (4.0/(2.0*i+1));	// sign �̶� ������ ��۹������ -,+�� �����Ѵ�/ 2.0*i+1=Ȧ�����ϴ�����
			sign = -sign; 						// toggle��� 1 <-> -1
		}
		System.out.println(pi);					// �츮�� ����� ���� ��
		System.out.println(Math.PI);			// MathŬ������ �ִ� ���� ���� ��
	}

}
