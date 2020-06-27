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
					current.setNext(Team).setPrevious(current);
					mainList.add(Team);
					System.out.println(Team.getTeamName() + " has been added.");
					return true;
				}
				current = current.next();
			}

			else {
				if(current==this.root) {
				
					if(current.next()==null) {
					Team.setNext(current).setPrevious(Team);
					System.out.println(Team.getTeamName() + " has been added.");
					System.out.println("root is now "+Team.getTeamName());
					this.root = Team;
					mainList.add(Team);
					return true;
					}
					Team.setNext(current).setPrevious(Team);
					this.root=Team;
					mainList.add(Team);
					System.out.println(Team.getTeamName() + " has been added.");
					
					return true;
				}
				System.out.println("replacing "+current.getTeamName()+" with "+Team.getTeamName());
				current.previous().setNext(Team).setNext(current);
				current.setPrevious(Team);
				//Team.setPrevious(current.previous());
				System.out.println(Team.getTeamName() + " has been added.");
				System.out.println(current.previous().getTeamName());
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
	}
}

