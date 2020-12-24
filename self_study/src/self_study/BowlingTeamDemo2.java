package self_study;

import java.util.*;
public class BowlingTeamDemo2 {

	public static void main(String[] args) {
		
		String name;
		final int NUM_TEAMS = 4;
		final int NUM_TEAM_MEMBER = 4;
		
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		int x, y;
		Scanner keyboard = new Scanner(System.in);
		
		//input
		for(y = 0; y < NUM_TEAMS; ++y) {
			teams[y] = new BowlingTeam();
			System.out.print("takim ismi > ");
			name = keyboard.nextLine();
			teams[y].setTeamName(name);
				for(x = 0; x < NUM_TEAM_MEMBER; ++x) {
					System.out.print("takim oyuncusu > ");
					name = keyboard.nextLine();
					teams[y].setMember(x, name);
			}
		}
		//output
		for(y = 0; y < NUM_TEAMS; ++y) {
			System.out.println(teams[y].getTeamName() + " takiminin oyunculari;");
			for(x = 0; x < NUM_TEAM_MEMBER; ++x) {
				System.out.print(teams[x].getMember(y) + " ");
			}
			System.out.println();
		}
		System.out.print("kadrosunu goruntulemek istedigin" +
		" takim ismini gir > ");
		name = keyboard.nextLine();
		for(y = 0; y < teams.length; ++y) {
			if(name.equals(teams[y].getTeamName()))
				for(x = 0; x < NUM_TEAM_MEMBER; ++x) {
					System.out.print(teams[y].getMember(x) + " ");
				}
			System.out.println();
		}
	}

}
