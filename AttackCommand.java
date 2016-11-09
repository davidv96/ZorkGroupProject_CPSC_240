/**
 * @author seanbermingham
 * @version 0.0.1
 *
 * Extends the command class enabling the player to combat hostile creatures
 *
 */



class AttackCommand extends Command {

    private String weapon;
    private String target;

    /**
     * Constructor for the AttackCommand class the assigns values to the weapon and target variables.
     * @param weapon the user may specify a weapon in their inventory to attack the target with
     * @param target the user must specify a target they wish to attack
     */
    AttackCommand(String weapon, String target){

    }


    /**
     *
     * @return will return the String result of the attack command
     */
    public String execute(){

    }
}
