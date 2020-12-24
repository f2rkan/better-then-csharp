package self_study;

import java.util.Scanner;
public class footballTeam {

	private String teamName;
	public static int MAX_MEMBER = 4;
	private String[] members = new String[MAX_MEMBER];
	
	//tak�m ismini al
	public void setTeamName(String team) {
		teamName = team;
	}
	//string'e oyuncu al
	public String setMemberName(int number, String name) {
		return members[number] = name;
	}
	//tak�m ad�n� ekrana bas
	public String getTeamName() {
		return teamName;
	}
	//oyuncular� ekrana bas
	public String getMemberName(int number) {
		return members[number];
	}
	public static void main(String[] args) {
		
		footballTeam f = new footballTeam();
		int x;
		String name;
		
		System.out.print("takim ismi > ");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		f.setTeamName(name);
		//tak�m uyelerini al
		for(x = 0; x < MAX_MEMBER; x++) {
			System.out.print("takim oyuncusu #" + (x + 1) + " > ");
			name = s.nextLine();
			f.setMemberName(x, name);
		}
		//tak�m� ekrana bas
		System.out.println("---");
		System.out.println(f.getTeamName() + " takiminin oyunculari;");
		for(x = 0; x < MAX_MEMBER; ++x) {
			System.out.print(f.getMemberName(x) + " ");
		}
		System.out.println("\n---");
	}
}
