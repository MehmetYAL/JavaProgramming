package day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String,Integer> students=new HashMap<>();
        students.put("Aygul",85);
        students.put("Maria",86);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

     /*   Set<String > keys=students.keySet();
        for (String eachKey : keys) {
            //System.out.println(eachKey+ " : "+students.get(eachKey));
            students.replace(eachKey,students.get(eachKey)+5);
        }*/

Map<String,Integer> earlyBirds=new HashMap<>();
Map<String,Integer> angryBirds=new HashMap<>();

        for (String key : students.keySet()) {
            Integer value=students.get(key);
            if (value>=90){
                earlyBirds.put(key,value);
            }else {
                angryBirds.put(key,value);}
        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

        Set<String> names=students.keySet();


    }
}
