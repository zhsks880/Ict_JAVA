package mymain;

public class _02_MyMain_String�Һ���Ư¡ {

	public static void main(String[] args) {
		
		String msg =  new String("���� ����� �ٺ�?");		//�� �����ʹ� �Ⱦ������� heap ������ �״�� ����
		String msg1 = msg.replaceAll("�ٺ�", "***");	//���ο� ��ü�� �����ع���
		System.out.printf("����:%s\n", msg);
		System.out.printf("�纻:%s\n", msg1);
		
		String str = "abcdef";
		str = str.toUpperCase();	//�� �ڵ�� ���� str �ҹ��ڸ� ������ �ٲ� �빮�� str �� �����ؼ� �����°���, ���� ��ü�� �ٲ�� �ƴ� ������(Gabage Collector)
		System.out.println(str);
		
		
	}

}
