package self_study;

import java.util.*;
public class BowlingTeam {

	private String teamName;
	private String[] members = new String[4];
	//takim ismini alir
	public void setTeamName(String team) {
		teamName = team;
	}
	//takim ismini basar
	public String getTeamName() {
		return teamName;
	}
	//takim oyuncusunun ismini alir String dizisine atar
	public void setMember(int number, String name) {
		members[number] = name;
	}
	//String dizisindeki oyuncunun ismini basar
	public String getMember(int number) {
		return members[number];
	}
	public static void main(String[] args) {
		
		String name;
		BowlingTeam bowlTeam = new BowlingTeam();
		int x;
		final int NUM_TEAM_NUMBERS = 4;
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("takim adi > ");
			name = input.nextLine();
			bowlTeam.setTeamName(name);
			
			for(x = 0; x < NUM_TEAM_NUMBERS; ++x) {
				System.out.print("takim uyesinin adi > ");
				name = input.nextLine();
				bowlTeam.setMember(x, name);
			}
		}
		System.out.println(bowlTeam.getTeamName() + " takimi uyeleri;");
		for(x = 0; x < NUM_TEAM_NUMBERS; ++x) {
			System.out.print(bowlTeam.getMember(x) + " ");
			System.out.println();
		}
	}
}
