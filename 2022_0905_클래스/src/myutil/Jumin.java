package myutil;

import java.util.Calendar;

public class Jumin {
	
	private String jumin_no;

	
	public String getJumin_no() {
		return jumin_no;
	}

	public void setJumin_no(String jumin_no) {
		this.jumin_no = jumin_no;
	}
	
	//						01234567890123		<--index
	//���� ���� jumin_no = "801212-1234560";
	
	/*	�����ڵ�DB
						������				�ܱ���
					��			��		��			��
		1900���	1			2		5			6
		2000���	3			4		7			8
		1800���	9			0		1800��� �ܱ��� ����
	
	*/
	public int getYear() {
		
		//String slice(���� ������) = .substring(������, �ڸ���(�迭���ڰ���-1))
		String str_year = jumin_no.substring(0,2);	//�ֹι�ȣ���� "80"����
		
		//Integer.parseInt = String->int �� ����
		int year = Integer.parseInt(str_year); 		//������ 80-> ���� 80���� ����
		
		//.charaAt = String -> char ���ڸ� ���ڷ� ����
		char gender = jumin_no.charAt(7);			//������ ����'1'->
		switch(gender)
		{
			case '1': case '2': case '5': case '6': year=year+1900; break;
			case '3': case '4': case '7': case '8': year=year+2900; break;
			default : year = year+1800;
		}
		
		return year;
	}
	
	//���̱��ϱ�(����⵵ ī���ٷ� ���ؾ���)
	public int getAge() {
		//���� = ����⵵ - ����⵵(�ڽ��Ǹ޼ҵ�ȣ��:getYear()) + 1;
		Calendar c = Calendar.getInstance();
		int current_year = c.get(Calendar.YEAR);
	
		int age = current_year - getYear() + 1;
		return age;
	}
	
	//�챸�ϱ�(�迭��?)
	public String getTti() {
		int birth_year = getYear();
		String [] tti_array = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
		String tti;
		tti = tti_array[birth_year%12];
		
		return"tti";
	}
	
	//�������ϱ�
	public String getGender() {
		
		
		return "����";
	}
	
}
