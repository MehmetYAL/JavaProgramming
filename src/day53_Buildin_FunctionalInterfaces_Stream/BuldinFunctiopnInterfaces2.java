package day53_Buildin_FunctionalInterfaces_Stream;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuldinFunctiopnInterfaces2 {

    //Create a function that can check if the Integer is contained in an array of integer, return boolean
    public static void main(String[] args) {
        BiPredicate<Integer[],Integer> contains=(a,b) -> {
            boolean result=false;
            for (Integer each : a) {

                if (each==b){
                    result=true;
                    break;
                }

            }

            return result;
        };
        Integer[] arr={10,2,45,65,};
                boolean r1=contains.test(arr,65);
        System.out.println(r1);

        System.out.println("============================================================");

        // create a function that can check if two strings are anagram

        //                              a= bac,   b= cab

        BiPredicate<String,String> anagram=(s1,s2) -> {
String[] arr1=s1.split("");
String[] arr2= s2.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);

return Arrays.equals(arr1,arr);

        };
        System.out.println(anagram.test("abc", "abc"));


        System.out.println("---------------------------------------------");
        // create a function that can print the given string for given number of times
        BiConsumer<String,Integer> printMultipleTimes=(T,U) ->{
            for (int i = 0; i <U ; i++) {
                System.out.println(T);
            }

        };
printMultipleTimes.accept("wooden spoon",5);


        System.out.println("===========================================");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");


          /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : "+v);
        }
         */
        scrumTeam1.forEach((a,b) ->{
            System.out.println(a+" : "+b);
        });

        System.out.println("======================================================");
        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a>b)?a:b;

int max=maxNum.apply(100,200);
        System.out.println("max = " + max);
        System.out.println("==============================================================");
        //2. create a function that can merge two integer arrays into a list
        BiFunction<int[], int[], List<Integer>> merge=(x, y) -> {
            List<Integer> arr2=new ArrayList<>();
            for (Integer each : x){
                arr2.add(each);
            }
            for (Integer each : y) {
                arr2.add(each);

            }

            return arr2 ;
        };
        int[] array1={1,2,3,4,5};
        int[] array2={7,8,9};

        System.out.println(merge.apply(array1, array2));
        System.out.println("---------------------------------------");
        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}
         */

        BiFunction<List<String>,List<Integer>,Map<String,Integer>> mergeMap= (s1,n1) -> {
Map<String,Integer> studentScore=new HashMap<>();
            for (int i = 0; i < s1.size(); i++) {
                studentScore.put(s1.get(i),n1.get(i) );
            }
            return studentScore;
        };

        List<String> student=new ArrayList<>(Arrays.asList("layan","ksenia"));
        List<Integer> scores=new ArrayList<>(Arrays.asList(95,85));
        System.out.println("(student,scores) = " + mergeMap.apply(student, scores));

    }
}
