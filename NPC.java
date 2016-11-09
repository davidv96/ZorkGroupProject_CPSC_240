import java.util.Scanner;


/**
 * @author David
 *
 * This class will extend the item class, allowing us to easily add the NPC's into the room contents. NPC's will vary from
 * items in the respect that NPC's will not be able to be carried in the inventory, but instead their weight will be
 * treated as their health, which can be diminished by player actions.
 */
public class NPC extends Item {
    private boolean hostile;

    /**
     *
     * @param s the Scanner will be sent to the Item super class to create the NPC
     * @throws NoItemException if the NPC is not properly created it will throw this exception
     * @throws Dungeon.IllegalDungeonFormatException if the bork file is not formatted correctly this exception will be thrown
     */
    NPC(Scanner s) throws NoItemException, Dungeon.IllegalDungeonFormatException {
        super(s);
    }

    /**
     * @param hostile will set the NPC's threat level
     */
    public void setHostile(boolean hostile){this.hostile = hostile;}


    /**
     *
     * @return hostile returns true if the NPC is hostile can be attacked
     */
    public boolean checkHostile(){
        return hostile;
    }


}
