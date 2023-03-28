package CollectionInterface8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
	
	public class Player implements Comparable<Player> {
	    private int ranking;
	    private String name;
	    private int age;
	    
		public int getRanking() {
			return ranking;
		}
		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Player(int ranking, String name, int age) {
			super();
			this.ranking = ranking;
			this.name = name;
			this.age = age;
		}
		public int compareTo(Player o) {
			return Integer.compare(getRanking(), o.getRanking());
		}
	@Override
		public String toString() {   //IMPORTANT TO PRINT
			return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
		}
	
	

	
//	public static void main(String args[]){
//		 List<Player> footballTeam = new ArrayList<>();
//		    Player player1 = new Player(59, "John", 20);
//		    Player player2 = new Player(67, "Roger", 22);
//		    Player player3 = new Player(45, "Steven", 24);
//		    footballTeam.add(player1);
//		    footballTeam.add(player2);
//		    footballTeam.add(player3);
//		    
//		    System.out.println("Before Sorting : " + footballTeam);
//		    
//	//	    PlayerRankingComparator playerComparator = new PlayerRankingComparator();
//	//	    Collections.sort(footballTeam, playerComparator);
//		    
//		    Collections.sort(footballTeam);  //COMPARABLE NEEDED FOR OBJECT SORTING
//		    for(Object o : footballTeam)
//		    	System.out.println(o);
//	//	    System.out.println("After Sorting : " + footballTeam);
//		    
//		    
//	}
////	public class PlayerRankingComparator implements Comparator<Player> {
////
////	    @Override
////	    public int compare(Player firstPlayer, Player secondPlayer) {
////	       return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
////	    }
////	}
	}
	
//
//		}


