package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {

		String str = "°4,500¿ø ÆR~ 1,200¿ø¾ı? 6000¿øŸ‹ 120000¿ø";
		
		/*
		-°¡°İ Çü½Ä¸¸ Ã£¾Æ¼­ ¼ø¼­´ë·Î Ãâ·ÂÇØ º¸ÀÚ.
		ex) 4,500¿ø 1,200¿ø....
		µÎ ÆĞÅÏÀ» ¸ğµÎ ¸¸Á·½ÃÅ³ Á¤±Ô Ç¥Çö½ÄÀ» ÀÛ¼ºÇØ¾ßÇÑ´Ù.
		*/
		
		String pattern = "\\d+,*[0-9]+¿ø";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println("Ã£Àº °ª: " + m.group());
		}
	}
}
