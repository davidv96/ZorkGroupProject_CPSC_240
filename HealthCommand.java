
/**
 * A class that keeps track of the users health througout the game and will let the user know
 * the status of their health.
 * 
 * @author Dylon Garrett, Sean Bermingham, Cris Guzman
 * @version BorkV1
 */
public class HealthCommand extends Command
{
   private int healthPoints;
   /**
    * A constructor that takes in a health points integer. 
    * @param - hp
    */
   public HealthCommand(int hp){
       
   }
   
   /**
    * A method that is extended from the abstract Command class and returns a string based on the GameState
    * health value.
    * @return String
    */
   public String execute(){
    return "";
   }
   
}
