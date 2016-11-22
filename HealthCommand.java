/**
 * A class that keeps track of the users health throughout the game and will let the user know
 * the status of their health.
 *
 * @author Dylon Garrett, Sean Bermingham, David Guzman
 * @version BorkV1
 */
public class HealthCommand extends Command
{
    private int healthPoints;
    /**
     * A constructor that takes in a health points integer.
     * @param - hp
     */
    public HealthCommand(){

    }

    /**
     * A method that is extended from the abstract Command class and returns a string based on the GameState
     * health value.
     * @return String
     */
    public String execute(){

        if (GameState.instance().getAdventurersCurrentHealth() >= 85){
            return "You are fit as a fiddle!";
        }
        if (GameState.instance().getAdventurersCurrentHealth() < 85 && GameState.instance().getAdventurersCurrentHealth() >= 70){
            return "Not too shabby, but try to stay out of harms way.";
        }
        if (GameState.instance().getAdventurersCurrentHealth() < 70 && GameState.instance().getAdventurersCurrentHealth() >= 50){
            return "You really need to stop hurting yourself.";
        }
        if (GameState.instance().getAdventurersCurrentHealth() < 30 && GameState.instance().getAdventurersCurrentHealth() >= 35){
            return "You are going towards the light. Death awaits.";
        }
        else{
            GameState.instance().setLoseCondition(true);
            return "You are dead as a doornail. Better luck next time.";
        }
    }

}