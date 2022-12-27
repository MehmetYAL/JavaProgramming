package day42_ExceptionsContinue;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("-----------------push up started--------------");

        for (int i = 1; i <=30 ; i++) {


            System.out.println("\rPush up "+i);
            sleep(1.5);
        }
        System.out.println(" push up completed");

        System.out.println("pull up started");
        for (int i = 1; i <=20 ; i++) {
            System.out.println("\rpull up "+i);
            try {
                Thread.sleep(200);

            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }System.out.println(" pull up is completed");


    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
/*
1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */