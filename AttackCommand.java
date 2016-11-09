/**
 * Created by David.
 *
 * This class will take the name of the NPC which is being attacked, change its weight (which we are cleverly using
 * as its health), and also causes damage to the adventurer by the NPC's (if they are capable of doing damage)
 *
 */
public class AttackCommand extends Command {
    private String itemName;

    public AttackCommand(String itemName) {
        this.itemName = itemName;
    }


    /**
     *
     * This execute should call the changeWeight method of the NPC class in order to do damage to the NPC,
     * as well as do damage to the adventurer by calling the wound method in the GameState.
     *
     * @return
     */

    @Override
    String execute() {
        if (itemName == null || itemName.trim().length() == 0) {
            return "Take what?\n";
        }
        try {
            Room currentRoom =
                    GameState.instance().getAdventurersCurrentRoom();
            Item theItem = currentRoom.getItemNamed(itemName);


        } catch (Item.NoItemException e) {
            e.printStackTrace();
        }

        return null;
    }

}
