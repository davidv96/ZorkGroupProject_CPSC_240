/**
 * Created by seanbermingham on 11/9/16.
 */
class TeleportCommand extends Command{

    private String destination;

    /**
     * Constructor for the TeleportCommand takes a String destination and checks if there is a Room with a matching name
     * @param destination the String title of the target room
     */
    TeleportCommand(String destination){

    }

    /**
     * The execute command will move the player from one room to another and return the String message to the user
     * describing their new location
     * @return String message to the user
     */
    public String execute(){
        return "";
    }
}