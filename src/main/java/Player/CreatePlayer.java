package Player;
import Game.GetInput;
import Player.PlayerData;
import java.time.*;

public class CreatePlayer {

    public static PlayerData createPlayer(){
        try {
            System.out.println("Enter player name:");
            String a = GetInput.getInputString();
            System.out.println("Enter your password: ");
            String b = GetInput.getInputString();
            System.out.println("Enter same password: ");
            String c = GetInput.getInputString();
            if (b.equals(c)) {
                System.out.println("Chose race, 1 for human, 2 for orc");
                String raceChoise;
                int race = GetInput.getInputInt();
                if (race == 1){
                    raceChoise = "human";
                } else if( race == 2){
                    raceChoise = "orc";
                } else {
                    System.out.println("this game is very limited, typ 1 or 2");
                    return null;
                }
                LocalDateTime timeNow = LocalDateTime.now();
                PlayerData succes = new PlayerData(a, b, raceChoise);
                return succes;
            }
        } catch (Exception e){
            System.out.println("ops, something went wrong or you did not write same password twice");
        }
       return null;
    }
}
