package self_study;

public interface BasitInterfaceTekrar {

		final int a = 30;
		
		void Goruntule();
		int degerGetir(int a, double b);
		double Degerler();
}
interface BasitInterfaceTekrar2{
	int durum1();
	double durum2(double a);
}
class BasitInterfaceUygulamasi implements BasitInterfaceTekrar, BasitInterfaceTekrar2{
	@Override
	public int degerGetir(int a, double b) {
		System.out.println("BasitInterfaceTekrar interface'inden turetilen 'class BasitInterfaceUygulamasi implements BasitInterfaceTekrar, "
				+ "BasitInterfaceTekrar2' ifadesinin degerGetir fonksiyonu tetiklendi");
		a++;
		b++;
		return 0;
	}@Override
	public double Degerler() {
		System.out.println("BasitInterfaceTekrar interface'inden turetilen 'class BasitInterfaceUygulamasi implements BasitInterfaceTekrar, "
				+ "BasitInterfaceTekrar2' ifadesinin Degerler fonksiyonu tetiklendi");
		return 0;
	}@Override
	public int durum1() {
		System.out.println("BasitInterfaceTekrar interface'inden turetilen 'class BasitInterfaceUygulamasi implements BasitInterfaceTekrar, "
				+ "BasitInterfaceTekrar2' ifadesinin durum1 fonksiyonu tetiklendi");
		return 0;
	}@Override
	public double durum2(double a) {
		System.out.println("BasitInterfaceTekrar interface'inden turetilen 'class BasitInterfaceUygulamasi implements BasitInterfaceTekrar, "
				+ "BasitInterfaceTekrar2' ifadesinin durum2 fonksiyonu tetiklendi");
		return 0;
	}@Override
	public void Goruntule() {
		System.out.println("BasitInterfaceTekrar interface'inden turetilen 'class BasitInterfaceUygulamasi implements BasitInterfaceTekrar, "
				+ "BasitInterfaceTekrar2' ifadesinin goruntule fonksiyonu tetiklendi");
	}
}
