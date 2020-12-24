package self_study;

import java.util.*;
public class BowlingTeamDemo3 {

	public static void main(String[] args) {
		String name;
		final int MAX_TEAMS = 4;
		final int MAX_MEMBERS = 4;
		int x, y;
		
		BowlingTeam[] teams = new BowlingTeam[MAX_TEAMS];
		Scanner keyboard = new Scanner(System.in);
		getTeamData(teams);
		
		for(y = 0; y < MAX_TEAMS; ++y) {
			System.out.println(teams[y].getTeamName() + " oyunculari;");
			for(x = 0; x < MAX_TEAMS; ++x) {
				System.out.print(teams[y].getMember(x) + " ");
			}
			System.out.println();
		}
		System.out.print("kadrosunu goruntulemek istedigin takimin ismini gir > ");
		name = keyboard.nextLine();
		for(y = 0; y < teams.length; ++y) {
			if(name.equals(teams[y].getTeamName())) 
				for(x = 0; x < MAX_MEMBERS; x++) {
					System.out.print(teams[y].getMember(x) + " ");
				}
				System.out.println();
		}
	}
	public static void getTeamData(BowlingTeam[] teams) {
		String name;
		final int MAX_TEAMS = 4;
		final int MAX_MEMBERS = 4;
		int x, y;
		
		Scanner keyboard = new Scanner(System.in);
		for(y = 0; y < MAX_TEAMS; ++y) {
			teams[y] = new BowlingTeam();
			System.out.print("takim ismi > ");
			name = keyboard.nextLine();
			teams[y].setTeamName(name);
				for(x = 0; x < MAX_MEMBERS; ++x) {
					System.out.print("takimin oyuncusu > ");
					name = keyboard.nextLine();
					teams[y].setMember(x, name);
			}
		}
	}
}
