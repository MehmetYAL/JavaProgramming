package day21_ForEachLoop;

public class day21_arrays_reverse {
    public static void main(String[] args) {
        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};



        for (int i = 0; i <classmates.length ; i++) {

          String  name=classmates[i];
String reverse="";
            for (int j = name.length()-1; j >=0 ; j--)

                reverse += name.charAt(j);
            System.out.println(reverse);

        }
    }

}
