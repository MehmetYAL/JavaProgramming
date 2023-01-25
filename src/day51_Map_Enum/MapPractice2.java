package day51_Map_Enum;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?

        int maxSal=Integer.MIN_VALUE;

        int minSal=Integer.MAX_VALUE;
        String name2="";
        String name1="";
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            //String eachKey= pair.getKey();
            if (pair.getValue()>maxSal){
                maxSal= pair.getValue();
                name1=pair.getKey();
            }

            if (pair.getValue()<minSal){
                minSal= pair.getValue();
                name2 =  pair.getKey();
            }
        }
        System.out.println("name1 = " + name1+" = " +maxSal);

        System.out.println(name2+" is minSal = " + minSal);

        System.out.println("==========================================");

        //how many employees has the salary between 120k ~ 150K?
int count=0;
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()>120000&&each.getValue()<150000){
                count++;
                System.out.println(each.getKey());
            }

        }
        System.out.println("emplloyees count is  "+count);

        System.out.println("===============================================5555");

        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue()<120000){
                entry.setValue(entry.getValue()+10000);
            }

        }
        System.out.println(map);


    }
}
