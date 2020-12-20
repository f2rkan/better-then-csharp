package self_study;

public interface InterfaceDeneme {

		final int a = 3;
		void Goruntule();
		int degerGetir(int a, double b);
		double degerler();
}
interface Interface1{
	int durum1();
	double durum2(double a);
}
class InterfaceUygulamasi2 implements InterfaceDeneme, Interface1{
	@Override
	public int degerGetir(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public double degerler() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public int durum1() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public double durum2(double a) {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public void Goruntule() {
		// TODO Auto-generated method stub
		
	}
	void DenemeUygulamasi() {
		System.out.println("deneme uyg");
	}
}