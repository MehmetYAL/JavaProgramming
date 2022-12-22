package day41_Exceptions;

import day01_JavaIntro.day05_Concatenation.day10_NestedIf.test;

public class TryCatchBlocks {
    public static void main(String[] args) {

        //you take the unexception error code in the try block
        //in thecatch block in parantesies you write theexception class name and asssign it
        System.out.println("Test started");
        try{ System.out.println(9/0);
            System.out.println("try block");
        }catch (ArithmeticException e){
            System.out.println("catch block");
            System.out.println("Ariethmetic exception was occured");
        }
        System.out.println("test completed");

        System.out.println("======================================================");

        System.out.println("test2 started");

        int[] numbers={0,1,2,3,4,5};

       try {
           System.out.println(numbers[200]);
           System.out.println("try block");
       }catch (RuntimeException e){
           e.printStackTrace();
           System.out.println("catch block");
       }
        System.out.println("test2 completed");

        System.out.println("=========================================");
// for ctach block we use the class from RuntimeExpection class which is parents of the
        //all the exceptions class so we dont look for which exception class must be
        System.out.println("test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("test3 completed");

        System.out.println("==================================================");

        System.out.println("hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cydeo");

    }
}
