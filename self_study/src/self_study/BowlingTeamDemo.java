package self_study;

import java.util.*;
public class BowlingTeamDemo {

	public static void main(String[] args) {

		 String name;
		 final int NUM_TEAMS = 4;
		 BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		 int x, y;
		 final int NUM_TEAM_MEMBERS = 4;
		 Scanner input = new Scanner(System.in);
		 
		 for(y = 0; y < NUM_TEAMS; ++y) {
			 teams[y] = new BowlingTeam();
			 System.out.print("takim adi > ");
			 name = input.nextLine();
			 teams[y].setTeamName(name);
			 for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
				 System.out.print("takim oyuncusunun ismi > ");
				 name = input.nextLine();
				 teams[y].setMember(x, name);
			 }
		 }
		 for(y = 0; y < NUM_TEAMS; y++) {
			 System.out.println(teams[y].getTeamName() + " takiminin oyunculari;");
			 	for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
			 		System.out.print(teams[y].getMember(x) + " ");
			 	}
			 	System.out.println();
		 }
			
	}
}
