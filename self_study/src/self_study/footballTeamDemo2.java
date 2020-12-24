package self_study;

import java.util.Scanner;
public class footballTeamDemo2 {

	public static void main(String[] args) {
		String name;
		final int MAX_NUM = 4;
		int x, y;
		final int MAX_MEMBER = 4;
		footballTeam[] teams = new footballTeam[MAX_MEMBER];
		Scanner keyboard = new Scanner(System.in);
		
		for(x = 0; x < MAX_NUM; ++x) {
			teams[x] = new footballTeam();
			System.out.print("takim ismi > ");
			name = keyboard.nextLine();
			teams[x].setTeamName(name);
				for(y = 0; y < MAX_MEMBER; ++y) {
					System.out.print("takim oyuncusu > ");
					name = keyboard.nextLine();
					teams[x].setMemberName(y, name);
				}
		}
		//view
		for(x = 0; x < MAX_NUM; ++x) {
			System.out.println(teams[x].getTeamName() + " takimi;");
			for(y = 0; y < MAX_MEMBER; ++y) {
				System.out.print(teams[x].getMemberName(y) + " ");
			}
			System.out.println();
		}
	}
}
