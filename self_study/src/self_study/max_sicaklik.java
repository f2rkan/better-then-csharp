package self_study;


public class max_sicaklik {

	public static void main(String[] args) {
		 int Cities = 5;
		 int Years = 4;

		final String[] cities =
			{
					"Ankara",
					"Maras",
					"Adana",
					"Bursa",
					"Izmir"
			};
		int[][] maxtemps =
			{
					{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20}
			};
		System.out.println("2008-2011 yillari arasindaki max sicakliklar:");
		for(int city = 0; city < Cities; ++city)
		{
			System.out.println(cities[city] + ":\t");
				for(int year = 0; year < Years; ++year)
					System.out.println(maxtemps[year][city]);
					System.out.println();
		}
	}

}
