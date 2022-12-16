package day01_JavaIntro.day05_Concatenation.day10_NestedIf;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;
import Utulities.StringUtulity;
public class test {
    public static void main(String[] args) {
        String str = "aaaaaabbbbbcccccccdddddd";
      str=  ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name="java programming";
        String reverse= ReturnMethodIntro.reverse(name);
        System.out.println(reverse);

        System.out.println("-------------------------------");
String strnew="wooden spoon";
        StringUtulity.printEachChar(strnew);
    }



}