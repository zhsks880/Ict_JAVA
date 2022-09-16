package mymain;

public class _03_MyMain_StringBuffer {

	public static void main(String[] args) {
		
		//�޸� ���� �ڵ�(����������� �������� �λ깰(�߰���ü��) �߻�)
		int count = 0;
		String msg = ++count + " little," +  ++count + " little," + ++count + " little Indian";
		System.out.println(msg);
		System.out.println(msg.length());
		
		//�ذ���1 : StringBuffer �̿��ض�(StringBuffer (����ȭ ��=�ӵ��� ����) vs StringBuilder(����ȭ �ȵ�=�ӵ��� ����)
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());	//����뷮Ȯ��
		//�޸�ȿ������ ���鿡�� ���� ����
		count = 0;
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little Indian");
		
		System.out.println(sb);			//pringln�� sb.toString() ���� �������̵� �ڵ� ó���Ǽ� ǥ�ð� �Ǳ� ��
		
		String msg1 = sb.toString();	//StringBuffer �� ���� toString �ؿ;��� String�� ��
		System.out.println(msg1);
		System.out.println(msg1.length());
		
		//�ذ���2 : String Fomatter �̿�(���ο��� StringBuffer�� �̿�)
		count = 0;
		String msg2 = String.format("%d little,%d little,%d little Indian",++count, ++count, ++count );
		System.out.println(msg2);
		
		
		
	}

}
