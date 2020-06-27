package genericsChallenge;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		BasketballTeam raptors = new BasketballTeam("Raptors",100);
		BasketballTeam test2 = new BasketballTeam("test2",12456965);
		BasketballTeam test3 = new BasketballTeam("test3",3220);
		BasketballTeam test4 = new BasketballTeam("test4",1002220);
		BasketballTeam test5 = new BasketballTeam("test5",1010);
		SoccerTeam madrid=new SoccerTeam("Madrid",12);
		
		
		
		List<BasketballTeam> teamList=new LinkedList<>();
		
		LeagueTable <BasketballTeam> table1=new LeagueTable<>();
		table1.addTeam(raptors);
		table1.addTeam(test2);
		table1.addTeam(test4);
		table1.addTeam(test3);
		table1.addTeam(test5);
		table1.printTeams();
		
	}

}
