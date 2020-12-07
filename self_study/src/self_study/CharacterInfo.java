package self_study;

public class CharacterInfo {

	public static void main(String[] args) {
		
		char aChar = 'C';
		System.out.println(aChar + " karakteri;");
		
		if(Character.isUpperCase(aChar)) System.out.println(aChar + ", buyuk harftir.");
		else System.out.println(aChar + ", buyuk harf degildir.");
		
		if(Character.isLowerCase(aChar)) System.out.println(aChar + ", kucuk harftir.");
		else System.out.println(aChar + ", kucuk harf degildir");
		
		aChar = Character.toLowerCase(aChar);
		System.out.println("toLowerCase() sonrasi, aChar > " + aChar);
		
		aChar = Character.toUpperCase(aChar);
		System.out.println("toUpperCase() sonrasi, aChar > " + aChar);
		
		if(Character.isLetterOrDigit(aChar)) System.out.println(aChar + ", harf ya da digit.");
		else System.out.println(aChar + ", harf ya da digit degil.");
		
		if(Character.isWhitespace(aChar)) System.out.println(aChar + ", bosluk.");
		else System.out.println(aChar + ", bosluk degil.");
		
	}

}
