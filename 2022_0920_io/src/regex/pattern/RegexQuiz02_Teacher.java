package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02_Teacher {

	public static void main(String[] args) {
		/*
		»óÇ°¹øÈ£, ¾÷¼Ò¸í(µµ½Ã¶ô¸í), °¡°Ý À¸·Î ºÐ¸®ÇØ¼­ Ãâ·Â
		Á¤±ÔÇ¥Çö½Ä¿¡¼­ (): °ýÈ£ ¾È¿¡ µé¾îÀÖ´Â ¹®ÀÚ¸¦ ÇÏ³ªÀÇ ¹®ÀÚ¿­·Î ÀÎ½Ä
		-> \\(, \\) ->°ýÈ£¾È¿¡ ¹¹°¡ Á¸ÀçÇÏ´ÂÁö È®ÀÎÇÏ´Â°Å
		*/
		String str1 = "123123-4564564 GS25(Ä¡Å²µµ½Ã¶ô) 4,400¿ø";
		String str2 = "111111-2222222 CU(¸¶´ÃÇÜµµ½Ã¶ô) 5,500¿ø";
		String str3 = "333333-4444444 MINISTOP(Á¦À°µµ½Ã¶ô) 5,000¿ø";
		
		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "[A-Z]+[0-9]*";
		String pattern3 = "\\([°¡-ÆR]+\\)";
		String pattern4 = "[0-9],[0-9]+¿ø";
		
		String[] arr = {str1, str2, str3};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("-------------------------");
			Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(pattern4).matcher(arr[i]);
			
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println("Á¦Ç°¹øÈ£: " + m1.group());
				System.out.println("¾÷¼Ò¸í: " + m2.group());
				System.out.println("µµ½Ã¶ô¸í: " + m3.group());
				System.out.println("°¡°Ý: " + m4.group());
			}
		}
	}

}
