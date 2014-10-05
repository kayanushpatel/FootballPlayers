/*DefensivePlayer.java
 *Kayanush Patel
 *12/16/13
 */
 
 public class DefensivePlayer extends FootballPlayer
 {
 	//instance variables
 	private int numberOfInterceptions;
 	private int numberOfTackles;
 	
 	//constructor
 	public DefensivePlayer(String n, int gp, int ni, int inter, int tack)
 	{
 		super(n, gp, ni);
 		numberOfInterceptions = inter;
 		numberOfTackles = tack;
 	}
 	
 	//methods: setters
 	public void setNumberOfInterceptions(int inter)
 	{
 		numberOfInterceptions = inter;
 	}
 	
 	public void setNumberOfTackles(int tack)
 	{
 		numberOfTackles = tack;
 	}
 	
 	
 	//methods: getters
 	public int getNumberOfInterceptions()
 	{
 		return numberOfInterceptions;
 	}
 	
 	public int getNumberOfTackles()
 	{
 		return numberOfTackles;
 	}
 	
 	public void display()
 	{
 		super.display();
 		System.out.println ("Number of interceptions: " + numberOfInterceptions +
 		"\n" + "Number of tackles: " + numberOfTackles);
 	}
 	
 }//end DefensivePlayer class