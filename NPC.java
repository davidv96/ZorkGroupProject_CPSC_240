import java.util.Scanner;


/**
 * This class will extend the item class, allowing us to easily add the NPC's into the room contents.
 */
public class NPC extends Item {
    private boolean hostile;

    /**
     *
     * @param s
     * @throws NoItemException
     * @throws Dungeon.IllegalDungeonFormatException
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
