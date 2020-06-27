package genericsChallenge;


public class LeagueTable<T extends Team> {
	private int numOfTeams=0;
	private Team root;

	public boolean addTeam(T Team) {
		if (this.numOfTeams==0) {
			this.root = Team;
			//System.out.println(Team.getTeamName() + " has been added.");
			numOfTeams++;
			return true;
		}
		Team current = this.root;
		while (true) {

			if (current.getTeamName().equals(Team.getTeamName())) {
				//System.out.println("Team already added");
				return false;
			} else if (current.getScore() > Team.getScore()) {
				if (current.next() == null) {
					current.setNext(Team).setPrevious(current);
				//	System.out.println(Team.getTeamName() + " has been added.");
					numOfTeams++;
					return true;
				}
				current = current.next();
			}

			else {
				if (current == this.root) {

					if (current.next() == null) {
						Team.setNext(current).setPrevious(Team);
						//System.out.println(Team.getTeamName() + " has been added.");
						//System.out.println("root is now " + Team.getTeamName());
						this.root = Team;
						numOfTeams++;
						return true;
					}
					Team.setNext(current).setPrevious(Team);
					this.root = Team;
					numOfTeams++;
					//System.out.println(Team.getTeamName() + " has been added.");

					return true;
				}
			//	System.out.println("replacing " + current.getTeamName() + " with " + Team.getTeamName());
				current.previous().setNext(Team).setNext(current);
				current.setPrevious(Team);
				// Team.setPrevious(current.previous());
			//	System.out.println(Team.getTeamName() + " has been added.");
				numOfTeams++;
				return true;
			}

		}

	}

	public void printTeams() {
		int count = 0;
		Team current = this.root;
		for (int i = 0; i < numOfTeams; i++) {
			count++;
			System.out.println(count + "." + current.getTeamName());
			if (current.next() == null) {
				break;
			}
			current = current.next();

		}
	}
}
