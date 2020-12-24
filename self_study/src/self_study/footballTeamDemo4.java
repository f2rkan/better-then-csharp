package self_study;

import java.util.*;
public class footballTeamDemo4 {

	public static void main(String[] args) {
		String name;
		int x, y;
		final int MAX_TEAMS = 4;
		final int MAX_MEMBERS = 4;
		
		footballTeam[] teams = new footballTeam[MAX_TEAMS];
		getTeamData(teams);
		Scanner input = new Scanner(System.in);
		
		//output
		for(x = 0; x < MAX_TEAMS; ++x) {
			System.out.println(teams[x].getMemberName(x) + " takiminin kadrosu;");
			for(y = 0; y < MAX_MEMBERS; y++) {
				System.out.print(teams[x].getMemberName(y) + " ");
			}
			System.out.println();
		}
	}
	public static void getTeamData(footballTeam[] teams) {
		String name;
		final int MAX_TEAMS = 4;
		final int MAX_MEMBERS = 4;
		int x, y;
		
		Scanner keyboard = new Scanner(System.in);
		//input
		for(x = 0; x < MAX_TEAMS; ++x) {
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
}
