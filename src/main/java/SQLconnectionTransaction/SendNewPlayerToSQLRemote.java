package SQLconnectionTransaction;

import Player.PlayerData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SendNewPlayerToSQLRemote {

    public static void save(PlayerData player){

        String user="titaniaMaster";
        String password="hej";
        String IP = "172.20.10.3";
        String connectionUrl = "jdbc:sqlserver://172.20.10.3:1433;databaseName=Titania;user="+user+";password="+password+";";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {

            String SQL = "INSERT INTO playerData (" +
                    "playerName, password, race, gold, territory, food, armeyPeasant, armeyKnight, armeyCavalry," +
                    " buildingHomeNumber, buildingFarmhouseNumber, buildingKnightNumber, buildingCavalryNumber)" +
                    " values (" +
                   "'" + player.getName() +"', " +
                   "'"+ player.getPassword() +"', " +
                    "'"+ player.getRace() +"', " +
                    player.getResources().getGuld() +", " +
                    player.getResources().getTeritory() +", " +
                    player.getResources().getFood() +", " +
                    player.getArmies().get(0).getNumberOfUnits() + ", " +
                    player.getArmies().get(1).getNumberOfUnits() + ", " +
                    player.getArmies().get(2).getNumberOfUnits() + ", " +
                    player.getBuildings().get(0).getNumberOfHouses() + ", " +
                    player.getBuildings().get(1).getNumberOfHouses() + ", " +
                    player.getBuildings().get(2).getNumberOfHouses() + ", " +
                    player.getBuildings().get(3).getNumberOfHouses() + ")";
            stmt.executeQuery(SQL);
        }catch (SQLException e) {e.printStackTrace();
    }
















    }

}
