package day51_Map_Enum;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        // displays the names of all employess who has the maximum salaries
       //int maxSal=Integer.MIN_VALUE;

        //we can use collections method instead of first loop

        int maxSal= Collections.max(map.values());

     /*   for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            String eachKey= eachEntry.getKey();
            Integer eachValue=eachEntry.getValue();
            if (eachValue>maxSal){
                maxSal=eachValue;
            }

        }*/
        System.out.println("maxSal= "+ maxSal);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue()==maxSal){
                System.out.println(pair.getKey());
            }

        }

    }
}
