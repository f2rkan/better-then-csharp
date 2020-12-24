package self_study;

import java.util.*;
public class footballTeamDemo5 {

	public static void main(String[] args) {
		final int MAX_TEAMS = 4;
		footballTeam[] teams = new footballTeam[MAX_TEAMS];
		
		setTeamData(teams);
		getTeamData(teams);
	}

	public static void setTeamData(footballTeam[] teams) {
		
		String name;
		int x, y;
		final int MAX_TEAMS = 4;
		final int MAX_MEMBERS = 4;
		
		Scanner keyboard = new Scanner(System.in);
		//data input
		for(x = 0; x < MAX_TEAMS; x++) {
			teams[x] = new footballTeam();
			System.out.print("takim ismi > ");
			name = keyboard.nextLine();
			teams[x].setTeamName(name);
				for(y = 0; y < MAX_MEMBERS; ++y) {
					System.out.print("takim oyuncusu > ");
					name = keyboard.nextLine();
					teams[x].setMemberName(y, name);
				}
		}
	}
	public static void getTeamData(footballTeam[] teams) {
		String name;
		int x, y;
		final int MAX_TEAMS = 4;
		final int MAX_MEMBERS = 4;
		
		//data output
		for(x = 0; x < MAX_TEAMS; ++x) {
			System.out.println(teams[x].getTeamName() + " takiminin kadrosu;");
			for(y = 0; y < MAX_MEMBERS; ++y) {
				System.out.print(teams[x].getMemberName(y) + " ");
			}
			System.out.println();
		}
	}
}
