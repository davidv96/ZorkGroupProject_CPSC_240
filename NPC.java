import java.util.Scanner;

/**
 * This class will extend the item class, allowing us to easily add the NPC's into the room contents.
 * However we will use the item weights as their health during combat.
 *
 * @param hostile determines if a NPC is a threat to the player. If not, then players cannot attack that NPC.
 * @param 
 *
 */



public class NPC extends Item {

    private boolean hostile;

    NPC(Scanner s) throws NoItemException, Dungeon.IllegalDungeonFormatException {
        super(s);
    }

    public void setHostile(boolean h){this.hostile = h;}

    public boolean checkHostile(){
        return hostile;
    }


}
