package regex.pattern;

import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		//[]: гь╢Г ю╖д║юг гя ╠шюз©║ ╬Н╤╡ ╧╝юз╣Июл ©ц ╪Ж юж╢баЖ╦╕ а╓юг.
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sweep"));
		/*
		# [] ╬х©║ а╓юггр ╪Ж юж╢б ╟м╣И
		1. [abc] : a,b,c аъ гоЁ╙╦╦ гЦ©К
		2. [^abc] : a,b,c ╦╕ а╕©эгя ╦П╣н╦╕ гЦ©К
		3. [a-z] : a╨нем z╠НаЖ гЦ©К(©╣╬Н╪р╧╝юз╦╦)
		->[a-zA-Z╟║-фR]: ©╣╧╝ ╪р╧╝юз+╢К╧╝юз+гя╠ш гЦ©К
		4. [0-9] : ╪Щюз╦╦ гЦ©К
		5. &&: ╠ЁаЩгу(абгв╟З ©Лгв фпеою╩ ╦П╣н ╦╦а╥го╢б ╧╝юз)
		*/
		
		System.out.println(Pattern.matches("s[^1-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sLeep"));
		System.out.println(Pattern.matches("s[a-dm-z]eep", "sleep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		/*
		# гь╢Г фпеоюл юШ©К╣и ╧╝юзюг ╟Ё╪Ж╦╕ а╓югго╢б ╧Щ(╟Ь╧И ╬Ь╬Н╬ъ╣й)
		1. Ex{n}: ╬у©║ юж╢б фпеоюл n╠шюз юод║гь╬ъгя╢ы.
		2. Ex{n,m}: цж╪р n╠шюз ╨нем цж╢К m╠шюз╟║ юод║гь╬ъгя╢ы.
		3. Ex{n,}: цж╪р n╠шюз╦╦ юод║гь╬ъгя╢ы.
		4. Ex?: 0╧Ь х╓ю╨ гя╧Ь	/ 2╟Ё юл╩С ╬х╣й
		5. Ex+: цж╪р гя╧Ь юл╩С
		6. Ex*: 0╧Ь х╓ю╨ ©╘╥╞╧Ь	/ 2╟Ё юл╩С ╟║╢и
		7. . : ╧╝юз гя ╟Ё©м юод║╫це╢
		*/
		
		System.out.println(Pattern.matches("....[\\d]{3}", "abcd123"));
		System.out.println(Pattern.matches("[\\w╟║-фR]{2,12}", "abcd╬хЁГ123456"));
		
		String email = "abc@Ёвюл╧Ж";
		System.out.println(Pattern.matches("[\\w]+@[a-zA-Z0-9]+\\.[a-zA-Z]", email));
		
		/*
		# Pattern.matches(regex, str)
		->юЭ╢чгя ╧╝юз©╜юл а╓╠тг╔гЖ╫д╟З юод║го╦И true.
		#Matcher
		->╧╝юз©╜ю╩ цЁю╫╨нем Ё║╠НаЖ ╟к╩Гго╦И╪╜ гь╢Г а╓╠тг╔гЖ╫д╟З юод║го╢б юн╣╕╫╨ ╧в ╟А╟З╟╙ю╩ ╟║аЖ╟М юж╢б ╟╢ц╪.
		*/
		
	}

}
