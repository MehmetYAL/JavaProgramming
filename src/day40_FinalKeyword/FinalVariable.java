package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    public FinalVariable(String birthday){
        this.birthday=birthday;}
    public static void main(String[] args) {



        final double pi=3.14;

        //pi=4.5; final variable ca not be change

        final String name;
        name="Java";
        System.out.println(name);

        //name="python"; can be change final

        FinalVariable obj=new FinalVariable("may/01");
        //obj.birthday="june/01";//final variable ca not be reassign
        System.out.println(obj.birthday);







    }
}
