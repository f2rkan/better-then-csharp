package all_over;

public class LambdaIfadeler {

	public static void main(String[] args) {
		
		//Interface'ten nesne turetme yollari
		//1. YOL
		//
		//
		LambdaIfadeleri obj1 = new LambdaIfadeleri() {
			
			@Override
			public void Goster2(int a) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void Goster() {
				System.out.println("nesne olusturmak icin uretilen local class");
				
			}
		};
		obj1.Goster();
		
		//2. YOl
		//
		//
		LambdaIfadeleri obj2 = new Deneme();
		obj2.Goster();
		
		//3. YOL
		//
		//
		Deneme obj3 = new Deneme();
		obj3.Goster();
		
		//4. YOL (Lambdalar)
		//
		//
		LambdaReturn obj4 = () -> {return 5*5;};
		
		LambdaReturn obj5 = () -> 5*5;
		
		LambdaReturn2 obj6 = (a) -> {return a*a;};
		
		LambdaVoid obj7 = a -> System.out.println("Merhaba: " + a);
		//eger fonksiyonda tek parametre varsa 
		//esittir ifadesinden sonraki parametreyi parantez icinde yazmak zorunda degiliz
		
		//lambda ifadeleri kullanýrken parametre sayýlarý onemli, 
		//ayný interface icerisinde ayný sayýdaki parametre durumlarý sozkonusu olursa eger 
		//su an icin jdk sürümleri bu durumu karsýlamaz
		
	}
}

class Deneme implements LambdaIfadeleri{
	@Override
	public void Goster() {
		System.out.println("(Deneme) override edilen Goster() fonsiyonu");
		
	}@Override
	public void Goster2(int a) {
		System.out.println("(Deneme) override edilen parametreli Goster2() fonksiyonu"+ a);
		
	}public Deneme() {
		// TODO Auto-generated constructor stub
	}@Override
	public void Goster3() {
		// TODO Auto-generated method stub
		LambdaIfadeleri.super.Goster3();
	}
}
