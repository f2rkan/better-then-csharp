package self_study;

import java.util.*;
public class footballTeamDemo {

	public static void main(String[] args) {
		String name;
		int x;
		footballTeam fTeam = new footballTeam();
		Scanner input = new Scanner(System.in);
		System.out.print("team name > ");
		name = input.nextLine();
		fTeam.setTeamName(name);
		
		for(x = 0; x < fTeam.MAX_MEMBER; ++x) {
			System.out.print(fTeam.getTeamName() + " member #" + (x + 1) + " > ");
			name = input.nextLine();
			fTeam.setMemberName(x, name);
		}
		System.out.println(fTeam.getTeamName() + " members;");
		for(x = 0; x < fTeam.MAX_MEMBER; ++x) {
			System.out.print(fTeam.getMemberName(x) + " ");
		}
		System.out.println();
	}

}
