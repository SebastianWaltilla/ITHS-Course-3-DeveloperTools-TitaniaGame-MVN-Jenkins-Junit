package UserInterface;

import Player.PlayerData;

public class MenuText {

    public String StartMenu(){
        String S =
                "--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--             -" + "\n" +
                "              ---<   TITANIA   >---                  " + "\n" +
                                                                      "\n" +
                "               New Game: Press 1                   " + "\n" +
                "              Load Game: Press 2                  " + "\n" +
                "                   Help: Press 3                  " + "\n" +
                "                   Exit: Press 4                 " +
                                                                    "\n" ;
        return S;
    }



    public String playerStats(PlayerData player){

        return player.getRace() + player.getName() ;
                /*

                +  "\n" +

           " Gold: " + player.getResources().getGuld()
           + "         Food: " + player.getResources().getFood() +
           "    Territory: " + player.getResources().getTeritory() + "\n" +

           " Buildings..   Farmhouse: " + player.getBuildings().get(0).getNumberOfHouses() +
           "     Knight Training Ground: " + player.getBuildings().get(1).getNumberOfHouses() + "\n" +
           "               Homes: "  + player.getBuildings().get(2).getNumberOfHouses() +
           "         Cavalry Training Ground: " + player.getBuildings().get(3).getNumberOfHouses() + "\n" +

           " Armies.....   Peasants: " + player.getArmies().get(0).getNumberOfUnits() +
           "     Knights: " + player.getArmies().get(1).getNumberOfUnits() +
           "    Cavalry: " + player.getArmies().get(2).getNumberOfUnits() + "\n" + "\n" +
           " skriv ner actions här.  "
        ;
        System.out.println(hej);
        */


    }


    public void helpText(){
        System.out.println("Aight this aint helping, no info here yet. Do trial and error for now...");
    }




















}
