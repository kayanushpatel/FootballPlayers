/*QuarterBack.java
 *Kayanush Patel
 *AP Java
 *Mr. Blondin
 *12/16/13
 */
 
 public class QuarterBack extends OffensivePlayer
 {
 	//instance variables
 	private int interceptionsThrown;
 	private double completionPercentage;
 	
 	//constructor
 	public QuarterBack(String n, int gp, int ni, int ty, int td, int interThrow, double comp)
 	{
 		super(n,gp,ni,ty,td);
 		interceptionsThrown = interThrow;
 		completionPercentage = comp; 		
 	}
 	
 	//methods: setters
 	public void setInterceptionsThrown(int interThrow)
 	{
 		interceptionsThrown = interThrow;
 	}
 	
 	public void setCompletionPercentage(double comp)
 	{
 		completionPercentage = comp;
 	}
 	
 	
 	//methods: getters
 	public int getInterceptionsThrown()
 	{
 		return interceptionsThrown;
 	}
 	
 	public double getCompletionPercentage()
 	{
 		return completionPercentage;
 	}
 	
 	
 	public void display()
 	{
 		super.display();
 		System.out.println ("Interceptions thrown: " + interceptionsThrown +
 		"\n" + "Completion percentage: " + completionPercentage); 		
 	}
 	
 }//end QuarterBack class