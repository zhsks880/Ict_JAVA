package mymain;

public class _01_MyMain_String�� {

	public static void main(String[] args) {
		/*
			String�������
			->��������� ���� ����·� ����� �������� ���� Ʋ����
			
			1.������������
				->String str = new String("ABCD");
				->�������� �ٸ��� heap ������ ������ �Ǵ� ���� �������� Ʋ���� ������ ���ϸ� �ٸ��ٰ� ����
				->������ .equals�� ���� �� ����
			2.�������������
				->String str = "ABCD";
				->ó���� �����Ǽ� Constant Pool(����� ��Ƽ� ����) �Ǵ°��� ����� ���� �ִٰ� �����ؼ� �����(������ ����)
				->.equals�� ���� �񱳵� ����������, �ּҷ� ���ص� ���Բ� �����Դ� �ǳ� ���������� �ʴ´�
		*/
		
		//������ �������
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		
		if(s1==s2)
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");
		if(s1.equals(s2))
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");

		//����� �������
		String s3 = new String("Littel Star");
		String s4 = new String("Littel Star");
		
		if(s3==s4)			//������ ��
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");
		if(s3.equals(s4))	//�� ��
			System.out.println("-----Same------");
		else
			System.out.println("-----diff------");

		
		
	}

}
