package self_study;


public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder nameString = new StringBuilder("Barbara");
		int nameStringCapacity = nameString.capacity(); //String uzunlugu +16; sebebi tam 4 bayt olmasi
		System.out.println("nameString'in kapasitesi > " + nameStringCapacity);
		
		StringBuilder addressString = null;
		addressString = new StringBuilder("XxXXX Caddesi yYYy sokak");
		
		int addStringCapacity = addressString.capacity();
		System.out.println("addressString'in kapasitesi > " + addStringCapacity);
		
		nameString.setLength(20);
		System.out.println("nameString.setLength(20) > " + nameString);
		
		addressString.setLength(20);
		System.out.println("addressString.setLength(20) > " + addressString);
		
		StringBuilder obj1 = new StringBuilder("asd");
		StringBuilder obj2 = new StringBuilder("asd");
	
		if(obj1.toString().equals(obj2.toString())) System.out.println("a");
		else System.out.println("b");
		
		//append(); StringBuilder nesnesinin sonuna karakter ekler
		StringBuilder phrase = new StringBuilder("Happy");
		phrase.append(" Birthday");
		System.out.println(phrase);
		
		//setCharAt, ilk parametrenin oldugu hedefi, ikinci parametre ile degistirir
		phrase.setCharAt(6, '4');
		System.out.println(phrase);
		
		phrase.insert(6, "30th ");
		System.out.println(phrase);
		
		StringBuilder text = new StringBuilder("Java Programming");
		char letter = text.charAt(5);
		System.out.println(letter);
		
		//StringBuilder nesnesine capacity() atanabilir
		StringBuilder LIMITED = new StringBuilder(300);
		StringBuilder unLimited = new StringBuilder("deneme");
		
		LIMITED.insert(0, unLimited);
		System.out.println(LIMITED);
	}
}
