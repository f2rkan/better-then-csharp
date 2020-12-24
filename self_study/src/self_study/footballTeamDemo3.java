package self_study;

import java.util.*;
public class footballTeamDemo3 {

	public static void main(String[] args) {
		
		String name;
		int x, y;
		final int MAX_TEAM = 4;
		final int MAX_MEMBER = 4;
		
		footballTeam[] teams = new footballTeam[MAX_TEAM];
		Scanner input = new Scanner(System.in);
		//input
		for(x = 0; x < MAX_TEAM; ++x) {
			teams[x] = new footballTeam();
			System.out.print("takim ismi > ");
			name = input.nextLine();
			teams[x].setTeamName(name);
			for(y = 0; y < MAX_MEMBER; ++y) {
				System.out.print("takim oyuncusu > ");
				name = input.nextLine();
				teams[x].setMemberName(y, name);
			}
		}
		//output
		for(x = 0; x < MAX_TEAM; ++x) {
			System.out.println(teams[x].getTeamName() + " takimi kadrosu;");
			for(y = 0; y < MAX_MEMBER; ++y) {
				System.out.print(teams[x].getMemberName(y) + " ");
			}
			System.out.println();
		}
		//output with equals
		System.out.print("kadrosunu goruntulemek istedigin takimin ismini gir > ");
		name = input.nextLine();
		
		for(x = 0; x < teams.length; ++x) {
			if(name.equals(teams[x].getTeamName())) {
				for(y = 0; y < MAX_MEMBER; ++y) {
					System.out.print(teams[x].getMemberName(y) + " ");
				}
				System.out.println();
			}
		}
	}

}
