package Day30_CustomClass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {//swap the first and last elements of ArrayList
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
        System.out.println("=========================================================");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int size= list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize= list.size();
        int totalNumberOfZeroz=size-newSize;
        System.out.println("totalNumberOfZeroz = " + totalNumberOfZeroz);
        for (int i = 0; i <totalNumberOfZeroz ; i++) {
            list.add(0);

        }
        System.out.println(list);
        System.out.println("======================================================");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer each : list2) {
            if (each!=0){result.add(each);}
            
        }
        for (Integer each : list2) {
            if (each==0){result.add(each);}
            
        }
        System.out.println(result);

        /*move all the zeros to the last indexes of ArrayList
        Ex:{1,0,2,0,3,0,4,0};
        ouput={1,2,3,4,0,0,0,0,};*/
        System.out.println("==============================================");


        String str="ABCD123$%#@&456EFG";
        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
                    }
        ArrayList<Character> letters=new ArrayList<>(chars);
        System.out.println("letters = " + letters);

        letters.removeIf(p-> !Character.isLetter(p));//Lambda
        System.out.println("letters = " + letters);

        ArrayList<Character> digit=new ArrayList<>(chars);
        digit.removeIf(p-> !Character.isDigit(p));
        System.out.println("digit = " + digit);

        ArrayList<Character> specialChar=new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digit);
        System.out.println("specialChar = " + specialChar);

    }
}
