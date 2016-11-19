

import java.util.Scanner;
import java.util.Hashtable;

public class Item {

    static class NoItemException extends Exception {}

    private String primaryName;
    private int weight;
    private Hashtable<String,String> messages;


    Item(Scanner s) throws NoItemException,
        Dungeon.IllegalDungeonFormatException {

        messages = new Hashtable<String,String>();

        // Read item name.
        primaryName = s.nextLine();
        if (primaryName.equals(Dungeon.TOP_LEVEL_DELIM)) {
            throw new NoItemException();
        }

        // Read item weight.
        weight = Integer.valueOf(s.nextLine());

        // Read and parse verbs lines, as long as there are more.
        String verbLine = s.nextLine();
        while (!verbLine.equals(Dungeon.SECOND_LEVEL_DELIM)) {
            if (verbLine.equals(Dungeon.TOP_LEVEL_DELIM)) {
                throw new Dungeon.IllegalDungeonFormatException("No '" +
                    Dungeon.SECOND_LEVEL_DELIM + "' after item.");
            }
            String[] verbParts = verbLine.split(":");
            messages.put(verbParts[0],verbParts[1]);
            
            verbLine = s.nextLine();
        }
    }

    boolean goesBy(String name) {
        // could have other aliases
        return this.primaryName.equals(name);
    }

    String getPrimaryName() { return primaryName; }

    public String getMessageForVerb(String verb) {
        String retMessage= "";


        //now that keys could also contain other chars, like [], use contains to get correct message
        //Edit by David
        for(String key: messages.keySet()){
            if(key.contains(verb)){
                retMessage = messages.get(key);
            }

            //if there's other effects, we need to execute them
            if(key.contains("[")){
               secondaryCommands(key);
            }
        }




        return retMessage;
    }


    /**
     * @author David
     */

    private void secondaryCommands(String key) {
    String secondaryCommands = key.substring(key.indexOf('[',key.indexOf(']')));
        String[] commands = secondaryCommands.split(",");


        for(int i = 0; i < commands.length; i++){

            String command = commands[i];

            if(command.contains("Wound")){
              GameState.instance().woundAdventurer(Integer.parseInt(command.substring(command.indexOf("("),
                      command.indexOf(")"))));
            }
            if(command.contains("Score")){

            }
            if(command.contains("Die")){

            }
            if(command.contains("Win")){
                GameState.instance().setWinCondition(true);
            }
            if(command.contains("Disappear")){

            }
            if(command.contains("Transform")){

            }
            if(command.contains("Teleport")){
                GameState.instance().getDungeon().getEntry();
            }
        }


    }

    public String toString() {
        return primaryName;
    }
}
