package all_over;

public class GarbageCollector {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			Uret u = new Uret(i);
		}
		System.out.println("---");
		System.gc(); //garbage collector calistirma
		//silme iþlemi rastgele olur
		
		
		for(int j = 0; j < 25; j++) {
			Uret q = new Uret(j);
		}
	
		System.out.println("***");
		System.gc();
	}

}
class Uret{
	int i = 0;
	//kurucu fonksiyon
	Uret(int i){
		this.i = i;
		System.out.println((i + 1) + ". obje olusturuldu.");
	}
	public void finalize() {
		System.out.println((i + 1) + ". obje silindi.");
	}
}
