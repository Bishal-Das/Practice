package CollectionInterface8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerRankingComparator implements Comparator<Player>{

	public static void main(String[] args) {
		List<Player> footballTeam = new ArrayList<>();
	    Player player1 = new Player(59, "John", 20);
	    Player player2 = new Player(67, "Roger", 22);
	    Player player3 = new Player(45, "Steven", 24);
	    footballTeam.add(player1);
	    footballTeam.add(player2);
	    footballTeam.add(player3);
	    
	    System.out.println("Before Sorting : " + footballTeam);
		PlayerRankingComparator playerComparator = new PlayerRankingComparator();
		Collections.sort(footballTeam, playerComparator);
		System.out.println(footballTeam);
	}

	@Override
	public int compare(Player o1, Player o2) {
		return Integer.compare(o1.getRanking(), o2.getRanking());
	}

}
