package mymain;

public class test {

	public static void main(String[] args) {
		int birth_year = 12;
		String tti;
		String [] tti_array = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
		
		tti = tti_array[birth_year%12];
		System.out.println(tti);
	}

}
