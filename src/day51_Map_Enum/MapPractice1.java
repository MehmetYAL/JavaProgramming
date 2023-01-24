package day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println(employeeMap);

       /* for (String eachKey : employeeMap.keySet()) {
if (employeeMap.get(eachKey).equalsIgnoreCase("F")){

    employeeMap.replace(eachKey,"Female");

}if (employeeMap.get(eachKey).equalsIgnoreCase("M")){
    employeeMap.replace(eachKey,"Male");
            }


            }*/

        for (Map.Entry<String, String> pair : employeeMap.entrySet()) {
            if (pair.getValue().equalsIgnoreCase("F")) {
                pair.setValue("Female");
            }
            if (pair.getValue().equalsIgnoreCase("M")) {
                pair.setValue("Male");
            }


        }
        System.out.println(employeeMap);


        //  1. Update the "M" to Male and "F" to Female
        /*for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

            if (employeeMap.values().contains("F")){
                employeeMap.replace("F","Female");
            }



        }*/

        //display the names of all female employees
        for (Map.Entry<String, String> pair : employeeMap.entrySet()) {


            if(pair.getValue().equalsIgnoreCase("Female")){
                System.out.println(pair.getKey());
            }
        }


    }
}
