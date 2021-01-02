package self_study;

public class EnumDemo2 {

	enum Property {
		SINGLE_FAMILY,
		MULTIPLE_FAMILY,
		CONDOMINIUM,
		LAND,
		BUSINESS
	};
	public static void main(String[] args) {
		
		Property propForSale = Property.MULTIPLE_FAMILY;
		switch (propForSale) {
		case SINGLE_FAMILY:
		case MULTIPLE_FAMILY:
			System.out.println("ilan ucreti %5");
				break;
		case CONDOMINIUM:
				System.out.println("ilan ucreti %6");
				break;
		case LAND:
		case BUSINESS:
				System.out.println("bu tur bir mulkle ilgilenmiyoruz");
		}
	}
}
