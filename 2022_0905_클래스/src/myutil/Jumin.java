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
	
	//�ڡڡڡڡڡڡڡ�����⵵ ���ϱ�ڡڡڡڡڡڡڡ�
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
	
	//�ڡڡڡڡڡڡڡڳ��̱��ϱ�(����⵵ ī���ٷ� ���ؾ���)�ڡڡڡڡڡڡڡ�
	public int getAge() {
		//���� = ����⵵ - ����⵵(�ڽ��Ǹ޼ҵ�ȣ��:getYear()) + 1;
		Calendar c = Calendar.getInstance();
		int current_year = c.get(Calendar.YEAR);
		
		int age = current_year - getYear() + 1;
		return age;
	}
	
	//�ڡڡڡڡڡڡڡڶ챸�ϱ�(�迭��?)�ڡڡڡڡڡڡڡ�
	public String getTti() {
		int birth_year = this.getYear();
		
		/*           �迭 ����ؼ� �̷��Ե� ����
		 * String tti; 
		 * String [] tti_array = {"������", "��", "��", "����", "��", "��", "ȣ����",
		 * "�䳢", "��", "��", "��", "��"};
		 * 
		 * tti = tti_array[birth_year%12];
		 */
		switch(birth_year%12)
		{
			case 0: return "������";
			case 1: return "��";
			case 2: return "��";
			case 3: return "����";
			case 4: return "��";
			case 5: return "��";
			case 6: return "ȣ����";
			case 7: return "�䳢";
			case 8: return "��";
			case 9: return "��";
			case 10: return "��";					//10���� ���̽��� �� �ƴϸ� ���� "��" ǥ��
		}
		return "��";
	}
	
	//�ڡڡڡڡڡڡڡڼ������ϱ�ڡڡڡڡڡڡڡ�
	public String getGender() {
		char gender = jumin_no.charAt(7);
		//���1	: ������ ���ڴ� �ƽ�Ű�ڵ� ���ڿ� �����̹Ƿ� �׳� ���� �ƴ�
		//if(gender=='1' || gender=='3' || gender=='5' || gender=='7'|| gender=='9')
		//return "����";
		
		//���2	: '0'->48	'1'->49		/ gender(�����ڵ�) - '0'(48) = ������ ������ �Ǽ� ������ ����
		if( (gender-'0')%2 == 1) return "����";
		
		return "����";
	}
	
	//�ڡڡڡڡڡڡڡڰ������ϱ�ڡڡڡڡڡڡڡ�
	public String getSeason() {
		
		String str_month = jumin_no.substring(2,4);
		int month = Integer.parseInt(str_month);		// ����12->����12��
		//��:3~5	����:6~8	����:9~11	�ܿ�:12~2
		
		//���1 : ����ġ ��
		/*
		 * switch(month) { case 3: case 4: case5: return "��"; case 6: case 7: case8:
		 * return "����"; case 9: case 10: case11: return "����"; }
		 */
		
		//���2
		switch(month/3) 
		{
		case 1: return "��";		//3��/3=1, 4��/3=1
		case 2: return "����";		//6��/3=2, 7��/3=2
		case 3: return "����";		//9��/3=3, 10��/3=3
		}
		return "�ܿ�";				//�׿�~
	}
	
	//�ڡڡڡڡڡڡڡ�10�� 12���ڡڡڡڡڡڡڡ�
		//10�� 12�� DB
		//�ε���	4	5	6	7	8	9	0	1	2	3					<-����%10(0~9)
		//10�� :	��	��	��	��	��	��	��	��	��	��
		//�ε���	4	5	6	7	8	9	10	11	0	1	2	3			<-����%12(0~11)
		//12�� : 	��	��	��	��	��	��	��	��	��	��	��	��
	public String getGanji() {
		//					0 1 2 3 4 5 6 7 8 9 10 11
		String gan_list = "����Ӱ谩����������";
		String ji_list	= "�������������ι��������";
		int birth_year = this.getYear();						//����⵵ ��������
		
		char gan = gan_list.charAt(birth_year%10);
		char ji = ji_list.charAt(birth_year%12);
		
		return String.format("%c%c��", gan, ji);				//String.format("����",��)->���ڿ�����
	}
	//�ڡڡڡڡڡڡڡ����� ���ϱ�ڡڡڡڡڡڡڡ�
	//���� �ڿ� ���ڸ��� �����ڵ�DB
	//���� 00~08  �λ�09~15 ��õ 13~15 ��⵵ 16~25 ������ 26~34 ��û�ϵ� 35~39 ����:40 ��û����:41~47
	//����ϵ�:48~54 
	public String getArea() {
		
		String str_area = jumin_no.substring(8,10);
		int area = Integer.parseInt(str_area);
		String ji = "";
		
		if(area>=0 && area<=8) ji = "����"; 
		else if (area>=9 && area<=15) ji = "�λ�";
		else if (area>=13 && area<=15) ji = "��õ";
		else if (area>=16 && area<=25) ji = "��⵵";
		else if (area>=26 && area<=34) ji = "������";
		else if (area>=35 && area<=39) ji = "��û�ϵ�";
		else if (area==40) ji = "����";
		else if (area>=41 && area<=47) ji = "��û����";
		else if (area>=48 && area<=54) ji = "����ϵ�";
		else if (area>=55 && area<=66) ji = "���󳲵�";
		else if (area>=67 && area<=69) ji = "�뱸";
		else if (area>=70 && area<=75) ji = "���ϵ�";
		else if (area>=86 && area<=92) ji = "��󳲵�";
		else if (area>=93 && area<=95) ji = "���ֵ�";
		else if (area>=44 && area<=49) ji = "������";
		// if(are>=0 && area<=8) return "����"; 			<<�̷������� �ص� �� �����Ѱ�...
		return ji;
	}
}
