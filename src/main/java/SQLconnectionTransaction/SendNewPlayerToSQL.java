package SQLconnectionTransaction;
import Player.PlayerData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SendNewPlayerToSQL {

    public static void save(PlayerData player){

        String user="titaniaMaster";
        String password="hej";
        String connectionUrl = "jdbc:sqlserver://192.168.1.68:1433;databaseName=Titania;user="+user+";password="+password+";";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {

            DateTimeFormatter formatedForSQL = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateAndTimeNow = LocalDateTime.now();

            //
            String playerData = "INSERT INTO playerData (" +
                    "playerName, password, race, gold, territory, food, armeyPeasant, armeyKnight, armeyCavalry," +
                    " buildingHomeNumber, buildingFarmhouseNumber, buildingKnightNumber, buildingCavalryNumber, playerTime)" +
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
                    player.getBuildings().get(3).getNumberOfHouses() + ", " +
                    "CONVERT(smallDATETIME, " + "'" + formatedForSQL.format(dateAndTimeNow)+ "'" +" , 120)"  + ")";
            System.out.println(playerData);

            stmt.executeQuery(playerData);
        }catch (SQLException e) {e.printStackTrace();
    }
















    }

}
