/*OffensivePlayer.java
 *Kayanush Patel
 *12/16/13
 */
 
 public class OffensivePlayer extends FootballPlayer
 {
 	//instance variables
 	private int totalYards;
 	private int numberOfTDs;
 	
 	//constructor
 	public OffensivePlayer(String n, int gp, int ni, int ty, int td)
 	{
 		super(n,gp,ni);
 		totalYards = ty;
 		numberOfTDs = td;
 	}
 	
 	//methods: setters
 	public void setTotalYards(int ty)
 	{
 		totalYards = ty;
 	}
 	
 	public void setNumberOfTDs(int td)
 	{
 		numberOfTDs = td;
 	}
 	
 	 	
 	//methods: getters
 	public int getTotalYards()
 	{
 		return totalYards;
 	}
 	
 	public int getNumberOfTDs()
 	{
 		return numberOfTDs;
 	}
 	
 	
 	public void display()
 	{
 		super.display();
 		System.out.println ("Total yards: " + totalYards +
 		"\n" + "Number of touchdowns: " + numberOfTDs);
 	}
 	
 }//end OffensivePlayer class