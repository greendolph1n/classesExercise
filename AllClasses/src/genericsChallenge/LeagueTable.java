package genericsChallenge;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable<T extends Team> {
	private List<Team> mainList = new ArrayList<>();
	private Team root;

	public boolean addTeam(T Team) {
		if (this.mainList.isEmpty()) {
			this.root = Team;
			this.mainList.add(this.root);
			System.out.println(Team.getTeamName() + " has been added.");
			return true;
		}
		Team current = this.root;
		while (true) {
			if (current.getScore() > Team.getScore()) {
				if (current.next() == null) {
					current.setNext(Team);
					Team.setPrevious(current);
					mainList.add(Team);
					System.out.println(Team.getTeamName() + " has been added.");
					return true;
				}
				current = current.next();
			}

			else {
				if (current.next() == null) {
					current.previous().setNext(Team);
					Team.setNext(current);
					mainList.add(Team);
					return true;
				} else if (current.previous() == null) {
					this.root = Team;
					Team.setNext(current);
					current.setPrevious(Team);
					mainList.add(Team);
					System.out.println(Team.getTeamName() + " has been added.");
					return true;
				}
				current.previous().setNext(Team);
				Team.setNext(current);
				System.out.println(Team.getTeamName() + " has been added.");
				mainList.add(Team);
				return true;
			}

		}

	}

	public void printTeams() {
		int count = 0;
		Team current = this.root;
		for (int i = 0; i < this.mainList.size(); i++) {
			count++;
			System.out.println(count + "." + current.getTeamName());
			if (current.next() == null) {
				break;
			}
			current = current.next();

		}
		System.out.println("\n\n");

		for (Team t : mainList) {
			System.out.println(t.getTeamName());
		}
	}
}
