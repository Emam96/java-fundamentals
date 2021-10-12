package basiclibrary;

import java.util.*;

public class Maps {


    public static void main(String[] args) {

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println("High:" + getMaxValue(weeklyMonthTemperatures));
        System.out.println("Low:" + getMinValue(weeklyMonthTemperatures));


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        String str[] = new String[votes.size()];
        for (int j = 0; j < votes.size(); j++) {
            str[j] = votes.get(j);
        }
        String winner = tally(str);
        System.out.println(winner + " received the most votes!");

    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue;
    }

//    public static String notSeen(int[][] numbers, int max, int min) {
//        String unseen = new ArrayList<>();
//
//
//            for (int j = 0; j < numbers.length; j++) {
//                for (int i = 0; i < numbers[j].length; i++) {
//                    if (unseen.contains(i)) {
//
//                        unseenTemp = unseenTemp + "Never saw temperature: " + i + "\n";
//
//                    }
//                }
//            }
//
//
//
//
//        System.out.println("High: " + min);
//        System.out.println("low: " + max);
//
//        return unseenTemp;
//    }







    static String tally(String[] array) {

        Map<String,Integer> hashmap = new HashMap<String, Integer>();
        for (String str : array)
        {
            if (hashmap.keySet().contains(str))
                hashmap.put(str, hashmap.get(str) + 1);
            else
                hashmap.put(str, 1);
        }

        String maxStr = "";
        int maxVal = 0;
        for (Map.Entry<String,Integer> entry : hashmap.entrySet())
        {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > maxVal)
            {
                maxVal = count;
                maxStr = key;
            }

            else if (count == maxVal){
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }

        return maxStr;
    }


}
