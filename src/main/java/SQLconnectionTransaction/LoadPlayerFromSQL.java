package SQLconnectionTransaction;

import Armies.Cavalry;
import Armies.Knight;
import Armies.Peasant;
import Buildings.Farmhouse;
import Game.GetInput;
import Player.PlayerData;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoadPlayerFromSQL {
/*
    public static PlayerData load(){
        try {
            System.out.print("Enter UserName:");
            String userName = GetInput.getInputString();
            System.out.println("");
            System.out.print("Enter Password: ");
            String Password = GetInput.getInputString();

            PlayerData player = insertPlayer(userName, Password);
            return player;
        } catch (Exception e){
            System.out.println("Entred wrong password or usernam, plase try again");
        }
        return null;
    }

/*
    public static PlayerData insertPlayer(String use, String passwor) {

        String user = use;
        String password = passwor;


        String serverUser = "titaniamaster";
        String serverPassword = "hejhejhej"; //localhos är lösenord hej
        //String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Titania;user=" + serverUser + ";password=" + serverPassword + ";";
        String connectionUrl = "jdbc:sqlserver://titaniaMaster.ci2wc63tn8mw.us-east-2.rds.amazonaws.com;user=" + serverUser + ";password=" + serverPassword + ";";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {

            String SQL = "select * from playerData where playerName = '" + user + "' and password = '" + password + "';";
            ResultSet rs = stmt.executeQuery(SQL);


            // laddning av playerTime
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime playerTime = LocalDateTime.parse(rs.getString("playeTime"), formatter);

            PlayerData player = new PlayerData(rs.getString("playerName"), rs.getString("password"), rs.getString("race"), playerTime );

            player.getResources().setGuld(Integer.parseInt(rs.getString("gold")));
            player.getResources().setTeritory(Integer.parseInt(rs.getString("territory")));
            player.getResources().setFood(Integer.parseInt(rs.getString("food")));

            player.getArmies().add(new Peasant(Integer.parseInt(rs.getString("armeyPeasant"))));
            player.getArmies().add(new Knight(Integer.parseInt(rs.getString("armeyKnight"))));
            player.getArmies().add(new Cavalry(Integer.parseInt(rs.getString("armeyCavalry"))));

            player.getBuildings().add(new Farmhouse(Integer.parseInt(rs.getString("buildingHomeNumber"))));
            player.getBuildings().add(new Farmhouse(Integer.parseInt(rs.getString("buildingFarmhouseNumber"))));
            player.getBuildings().add(new Farmhouse(Integer.parseInt(rs.getString("buildingKnightNumber"))));
            player.getBuildings().add(new Farmhouse(Integer.parseInt(rs.getString("buildingCavalryNumber"))));

            stmt.executeQuery(SQL);

            return player;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

 */
}
