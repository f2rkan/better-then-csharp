package self_study;

public class DisplayRents {

	public static void main(String[] args) {
		
		int[][] rents = {
				 {400, 450, 510},
				 {500, 560, 630},
				 {625, 676, 740},
				 {1000, 1250, 1600} 
		};
		
		int floor, bdrms;
		for(floor = 0; floor < rents.length; ++floor)
			for(bdrms = 0; bdrms < rents[floor].length; ++bdrms)
				System.out.println("kat, " + floor + 
						"; yatak odasi, " + bdrms + 
						"; kira, " + rents[floor][bdrms]);
	}
}
