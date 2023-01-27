package day53_Buildin_FunctionalInterfaces_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildinFunctionalInterface {

    public static void main(String[] args) {

        Predicate<String> isPalindrome=(p) -> {

            String reverse=new StringBuilder().reverse().toString();

            return reverse.equalsIgnoreCase(p);

        };
        boolean result=isPalindrome.test("Java");
        System.out.println("result = " + result);

        System.out.println("=============================================================");


        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,4,23,4,5));

       list.removeIf(p-> {return p % 2 == 0;});
        System.out.println("list = " + list);


        System.out.println("=========================================================================");

        Consumer<String> printEach= (s) ->{
            for (int i = 0; i <s.length() ; i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("java");

        System.out.println("========================================================");

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,4,23,8,5));

        list1.forEach(p -> {
                    if (p %2==0)
                        System.out.println(p);

                });
        System.out.println("-------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(p->{
            System.out.println(p.charAt(0) + ". " +p.charAt(p.lastIndexOf(" ") + 1)); ;
        });
    }
}
