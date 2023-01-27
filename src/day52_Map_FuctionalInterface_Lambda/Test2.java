package day52_Map_FuctionalInterface_Lambda;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface <String> printEach;
       printEach= (s) ->{
           for (String each : s.split("")) {
               System.out.println(each);
           }

        };
       printEach.test("wooden spoon");
    }
}
