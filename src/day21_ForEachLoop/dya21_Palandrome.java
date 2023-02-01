package day21_ForEachLoop;

public class dya21_Palandrome {
    public static void main(String[] args) {
     String[] name=   {"anna","level","Java"};
int count=0;
        for (int i = 0; i < name.length ; i++) {
            String list=name[i];
            String reverse="";

            for (int j = list.length()-1; j >=0 ; j--) {
                reverse+=list.charAt(j);
            }if (list.equalsIgnoreCase(reverse)){
            count++;
                System.out.println(reverse);}


        }
        System.out.println(count);
    }
}
/*
. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
 */