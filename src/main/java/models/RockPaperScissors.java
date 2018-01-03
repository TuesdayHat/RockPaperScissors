package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class RockPaperScissors {
    public String[] runRockPaperScissors(String playerOne, String playerTwo) {
        String[] combo = {playerOne, playerTwo};
        String[] beats = {"paper", "rock", "scissors"};

        for(int i=0; i<combo.length;i++){
            String curr = combo[i];
            String next = combo[(i+1)%combo.length];

            String[] binarySearch(beats, next)

            if (static beats.binarySearch(String[] beats, String curr)){
            // (((beats.binarySearch(curr, )+1)%beats.length).equals(next)){
//                if (((static String binarySearch(curr, beats))+1%beats.length).equals(next))

            }
        }

        //return false;
    }

}
