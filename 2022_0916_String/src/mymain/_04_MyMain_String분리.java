package mymain;

import java.util.StringTokenizer;

public class _04_MyMain_String�и� {

	public static void main(String[] args) {

		String str = "���� ��� ��õ ���� �뱸 �λ� ���� ����";
		
		//���1 : StringTokenizer �� �̿��� �и�
		//�и����� :���� ��ū�� �ִ��� �������� ���� �и�
		StringTokenizer st = new StringTokenizer(str);	//�ܾ���� ��ū���� ��������, �ڿ� "�����̽�" ����������
		
		System.out.println(st.countTokens());			//8��ū�� �ִ�~
		System.out.println("--StringTokenizer--");
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); 				//���� ��ū�������� ������ū��ġ �̵�
			System.out.println(token);
		}
			
		//���2 : String->split() �޼ҵ� �̿��ϴ� ���
		//�и����� : �и����ڱ������� �߶󳻼� �迭�� ����� �����̶� ���� ������ ��ĭ �������� ó����
		String [] sido_array = str.split(" ");			//����������� �и��ؼ� �迭�� �־��, �и����� ����������
		//String [] sido_array = {"����", "���", "��õ", "����", "�뱸", "�λ�", "����", "����"}; �̷��������� ��ȯ
		System.out.println("--split--");
		for(String sido : sido_array)
			System.out.println(sido);
		
		}	
	}