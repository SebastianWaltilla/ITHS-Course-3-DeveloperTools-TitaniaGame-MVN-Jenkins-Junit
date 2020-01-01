package World;

import Player.PlayerData;

import java.util.ArrayList;

public class Map {
    int regionNumber = 1;
    ArrayList<PlayerData> playerList = new ArrayList<>();
    //load all players to playerList to occupy the grid wit x/y coordiates from players.

    public void getRegionGridFromSQL(){
        // get all players to playerList from SQL server.
    }

    public String[][] getRegionGrid() {
        return regionGrid;
    }

    public void setRegionGrid(String[][] regionGrid) {
        this.regionGrid = regionGrid;
    }

    // this string Array has to be auto generated in next version. (with conditions)
    // Now static, will be changed later, for testing this is ok.
    // p = player w = water, t = troll, u= unpopulated  ready to put playet
    public String[][] regionGrid = new String[][]{
            {"w", "w", "w", "w", "w", "w", "w", "w", "w", "w"},
            {"w", "t", "t", "t", "u", "u", "w", "u", "u", "w"},
            {"w", "t", "u", "u", "u", "u", "w", "u", "u", "w"},
            {"w", "u", "u", "u", "t", "u", "w", "u", "u", "w"},
            {"w", "u", "t", "u", "u", "u", "w", "u", "u", "w"},
            {"w", "w", "w", "u", "w", "w", "w", "u", "u", "w"},
            {"w", "t", "u", "t", "u", "u", "t", "u", "u", "w"},
            {"w", "u", "u", "u", "u", "u", "t", "u", "u", "w"},
            {"w", "t", "t", "u", "u", "u", "t", "u", "u", "w"},
            {"w", "t", "u", "u", "t", "u", "u", "u", "u", "w"},
            {"w", "w", "w", "w", "w", "w", "w", "w", "w", "w"},
    };
    /*
    public Region() {
        String start = regionStartPosision();
        String[] numberToSplit = start.split("¤");
        this.playerPosX = Integer.parseInt(numberToSplit[0]);
        this.playerPosY = Integer.parseInt(numberToSplit[1]);
    }
*/
    private String regionStartPosision() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (regionGrid[i][j].equals("u"))  // hittar första lediga startposisionen
                    return i + "¤" + j;
            }
        }
        return "x"; // if region is full
        // call method that creats a new region (allNewRegion)
        // send a notification to all other players
        // "new land has been found by player xx
    }

    /*
        public String scoutWithPeasant(int peasant, String direction, Region wow){

            switch (direction){

                case "w":
                    try {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j - 1 < 5; j++) {
                                if (wow.getRegionGrid()[i][j].equals("u")) {
                                    return "u";
                                } if (wow.getRegionGrid()[i][j].equals("p")) {
                                    return "p";
                                } if (wow.getRegionGrid()[i][j].equals("t")) {
                                    return "t";
                                }
                            }
                        }
                    } catch {
                    return "Method for check nearby country, for now this text " +
                            "returns instead of index out of range exception";
                }



                    // metod som kallar på metoden regionGoingWest i region klassen
                    return;

                // samma sak för east, north osv.

                default: // meddela spelaren at hen insert fel...
            }

            // om monster, döda peasent och meddela spelaren att peasant är död :D MUHAHHA

        }
    */
    private String regionGoingWest() {

        try {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j - 1 < 5; j++) {
                    if (regionGrid[i][j].equals("u")) {
                        return "u";
                    }
                    if (regionGrid[i][j].equals("p")) {
                        return "p";
                    }
                    if (regionGrid[i][j].equals("t")) {
                        return "t";
                    }
                }
            }
        } catch (Exception e) {
            return "Method for check nearby country, for now this text " +
                    "returns instead of index out of range exception";

        }
        return "foundNothing";
    }

    /*


    private String regionGoingSouth(){

        try {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j - 1 < 5; j++) {
                    if (regionGrid[i][j].equals("u")) {
                        return "u";
                    } if (regionGrid[i][j].equals("p")) {
                        return "p";
                    } if (regionGrid[i][j].equals("t")) {
                        return "t";
                    }
                }
            }
        } catch(Exception e) {
            return "Method for check nearby country, for now this text " +
                    "returns instead of index out of range exception";
        }
    }
    private String regionGoingNorth(){

        try {
            for (int i = 0; i + 1 < 5; i++) {
                for (int j = 0; j  < 5; j++) {
                    if (regionGrid[i][j].equals("u")) {
                        return "u";
                    } if (regionGrid[i][j].equals("p")) {
                        return "p";
                    } if (regionGrid[i][j].equals("t")) {
                        return "t";
                    }
                }
            }
        } catch(Exception e) {
            return "Method for check nearby country, for now this text " +
                    "returns instead of index out of range exception";
        }
    }

    private String regionGoingSouth(){

        try {
            for (int i = 0; i  - 1 < 5; i++) {
                for (int j = 0; j  < 5; j++) {
                    if (regionGrid[i][j].equals("u")) {
                        return "u";
                    } if (regionGrid[i][j].equals("p")) {
                        return "p";
                    } if (regionGrid[i][j].equals("t")) {
                        return "t";
                    }
                }
            }
        } catch(Exception e) {
            return "Method for check nearby country, for now this text " +
                    "returns instead of index out of range exception";
        }
    }


    /*
    public void regionConnectionToOtherRegion(){
        // på något sätt månste spelaren kunna scouta till en annan region.
        // kanske lämpigast genom att koppla regionen mot en annan
    }

    public void allNewRegion(){
        // use      public void generateRegionGrid (){
    }

    public void generateRegionGrid (){

        // en funktion som genererar en slumpad region

    }
    */



}
