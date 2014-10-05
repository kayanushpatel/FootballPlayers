/*FootballPlayer.java
 *Kayanush Patel
 *12/16/13
 */
 
 public class FootballPlayer
 {
 	//instance variables
 	private String name;
 	private int gamesPlayed;
 	private int numberOfInjuries;
 	
 	public FootballPlayer(String n, int gp, int ni)
 	{
 		name = n;
 		gamesPlayed = gp;
 		numberOfInjuries = ni;
 	}
 	
 	//methods: setters
 	public void setName(String n)
 	{
 		name = n;
 	}
 	
 	public void setGamesPlayed(int gp)
 	{
 		gamesPlayed = gp;
 	}
 	
 	public void setNumberOfInjuries(int ni)
 	{
 		numberOfInjuries = ni;
 	}
 	
 	
 	//methods: getters
 	public String getName()
 	{
 		return name;
 	}
 	
 	public int getGamesPlayed()
 	{
 		return gamesPlayed;
 	}
 	
 	public int getNumberOfInjuries()
 	{
 		return numberOfInjuries;
 	}
 	
 	
 	public void display()
 	{
 		System.out.println ("Name: " + name + 
 			"\n" + "Games Played: " + gamesPlayed +
 			"\n" + "Number of injuries: " + numberOfInjuries);
 	}
 	
 }//end FootballPlayer class