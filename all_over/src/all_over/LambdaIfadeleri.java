package all_over;

public interface LambdaIfadeleri {

	public void Goster();
	public void Goster2(int a);
	
	//defult guncel JDK'larla gelen kod blogu tanimlama durumudur
	default void Goster3() {
			
	}
}
interface LambdaStatic{
	//static tanimli fonksiyonlar JDK 8'den sonra kod blogu halinde tanimlanir duruma geldiler
	
	public static void Goster2() {
		
	}
}

interface LambdaReturn{
	public double KareAl();
	//public double KareAl2();
}
interface LambdaReturn2{
	public double KareAl(int a);
}
interface LambdaVoid{
	public void Merhaba(int a);
}

interface LambdaDeneme{
	public void Merhaba0();
	public void Merhaba1(int a);
}

