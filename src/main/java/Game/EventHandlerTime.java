package Game;

public class EventHandlerTime extends Thread  {

    public void upKeep (){
        upkeepGold();
        upkeepBuildinges();
        upkeepArmies();
    }

    public void upkeepGold(){
        // player.setGold(peasants*1);
    }

    public void upkeepBuildinges (){
        /*
        if (player.getbuildingQue != Null)
            bygg byggnad
         */
    }

    public void upkeepArmies(){
        /*
        if (player.getTrainingQue != Null)
            träna gubbar
         */
    }

}
