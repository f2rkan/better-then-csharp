package self_study;

public class InterfaceUygulama {

	public static void main(String[] args) {
			Interface1 a = new Interface1() {
				
				@Override
				public double durum2(double a) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int durum1() {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			
			InterfaceUygulamasi2 c = new InterfaceUygulamasi2() {
				@Override
				public int degerGetir(int a, double b) {
					// TODO Auto-generated method stub
					return super.degerGetir(a, b);
				}@Override
				public double degerler() {
					// TODO Auto-generated method stub
					return super.degerler();
				}@Override
				public int durum1() {
					// TODO Auto-generated method stub
					return super.durum1();
				}@Override
				public double durum2(double a) {
					// TODO Auto-generated method stub
					return super.durum2(a);
				}
			};
	}

}
