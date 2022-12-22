package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr={1,2,3};


        try{ System.out.println(arr[10]);
            System.out.println("try block");
    }catch (RuntimeException e){
            System.out.println("catch block");
            e.printStackTrace();
      System.exit(0);// if you dont want finally block execute than you shoul terminate system
            //with System.exit
        }finally {
            //finally method print it the in finally block anyway eve if catch block is wrong
            System.out.println("finally block");
        }
    }
}
