package day50_Collection_Cont_Iterable;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        List<Integer> list= new ArrayList<>(set);
        System.out.println("list = " + list);

        List<String > names=null;
        //System.out.println(names.size()); it give nullpointerexception

        System.out.println("==================================================================");

        List<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]

        //((Stack)chars).pop();// take out the  last added object
        //System.out.println("chars = " + chars);//chars = [A, B, C]--CALISMADI NIYE BILMIYORUM

        //poll() ==> FIFO

        List<String> namesList = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));
        System.out.println("namesList = " + namesList);

((LinkedList<String>) namesList).poll();
        System.out.println("namesList = " + namesList);
        ((LinkedList<String>) namesList).poll();
        System.out.println("namesList = " + namesList);


    }
}
