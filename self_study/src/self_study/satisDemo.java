package self_study;

public class satisDemo {

	public static void main(String[] args) {
		
		final int MAX = 10;
		final int artis = 5000;
		
		satis[] personel = new satis[MAX];
		
		int i;
		int id = 111;
		int fiyat = 25_000;
			
		for(i = 0; i < personel.length; ++i)
			personel[i] = new satis();		
		for(i = 0; i < personel.length; ++i)
		{
			personel[i].setId(id);
			personel[i].setSale(fiyat);
			++id;
			fiyat += artis;
		}
		
		for(i = 0; i < personel.length; ++i)
			System.out.println("id #" + personel[i].getId() + " ve satis miktari $" + personel[i].getSale());
	}
}
