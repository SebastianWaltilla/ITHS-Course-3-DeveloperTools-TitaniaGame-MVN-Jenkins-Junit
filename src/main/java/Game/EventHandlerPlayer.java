package Game;

public class EventHandlerPlayer {


    public void atackPlayer(){ // funktionalitet för atakera annan spelare, åt vilke håll osv... .

    }

    public void atackMPC(){ // funktionalitet för atakera dataGobbe

    }

    private String regionGoingWest(){
        return "whats west?";           // titta i grid, Ta spelarens "å" och titta vänster efter vilken symbol
        // if w, return där är det vatten osv. if p - där är spelaren player.getName .....


    /*          Kan ju använda denna kod för detta...
      private String regionStartPosision(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (regionGrid[i][j].equals("u"))  // hittar första lediga startposisionen
                    return i + "¤" + j;
            }
        }
        return "x"; // if region is full
                    // call method that creats a new region (allNewRegion)
                    // send a notification to all other players
                    // "new land has been found by player xx
    }



     */








    }


    private String regionGoingSouth(){
        return "whats south?";          //
    }


    private String regionGoingNorth(){
        return "whats north?";
    }


    private String regionGoingEast(){
        return "whats East?";
    }


}
