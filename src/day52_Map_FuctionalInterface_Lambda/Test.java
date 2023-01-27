package day52_Map_FuctionalInterface_Lambda;

public class Test {
    public static void main(String[] args) {
        //display if the number is odd
       MyFirstFunctionalInterface oddOrEven= (a)->{
           if(a %2==0){
               System.out.println("is even number");
           }else {
               System.out.println("number is odd number");
           }
       };
       oddOrEven.apply(87);

        //function is eligible to by cigarete

        MyFirstFunctionalInterface isEligible=(a) ->{
            if (a>18){
                System.out.println("eligible to by cigarete");
            }else{
                System.out.println("is not eligible to uy cigarattte");
            }

        };
        isEligible.apply(23);
        //function can display cube of number

        MyFirstFunctionalInterface cube=(a) ->{

            System.out.println(a*a*a);

        };
        cube.apply(3);
    }
}
