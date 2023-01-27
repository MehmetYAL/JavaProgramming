package day53_Buildin_FunctionalInterfaces_Stream;

public class LambdaExpressions {
    public static void main(String[] args) {
        MyThirdFunctionalInterface<String> stringReverse=(s)->{
            String reverse=new  StringBuilder(s).reverse().toString();
          return reverse;
        };

        System.out.println(stringReverse.method("wooden spoon"));

        System.out.println("===================================");

        MyThirdFunctionalInterface<Integer> cube=(c)->{
            Integer givenCube=(c*c);
            return givenCube;
        };
        System.out.println(cube.method(4));
    }
}
