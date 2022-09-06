package mymain;

public class test {

	public static void main(String[] args) {
		int birth_year = 12;
		String tti;
		String [] tti_array = {"¿ø¼şÀÌ", "´ß", "°³", "µÅÁö", "Áã", "¼Ò", "È£¶ûÀÌ", "Åä³¢", "¿ë", "¹ì", "¸»", "¾ç"};
		
		tti = tti_array[birth_year%12];
		System.out.println(tti);
	}

}
