package self_study;

public class BasitInterfaceUygulamaTekrar {

	public static void main(String[] args) {
		BasitInterfaceTekrar b = new BasitInterfaceTekrar() {
			
			@Override
			public int degerGetir(int a, double b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void Goruntule() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public double Degerler() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(b.degerGetir(1, 2));
		System.out.println(b.Degerler());
		
		BasitInterfaceTekrar2 b1 = new BasitInterfaceTekrar2() {
			
			@Override
			public double durum2(double a) {
				a--;
				return 0;
			}
			
			@Override
			public int durum1() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(b1.durum1());
		System.out.println(b1.durum2(3));
	}

}
