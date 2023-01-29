package day53_Buildin_FunctionalInterfaces_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        //Stream methods
        //distinct,collect
        //distinct takes the duplicate elements out but it might use with collect(Collectors.toList()); or if it is array after calling from Arrays utulity to convert toArray distinct().toArray();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1=list1.stream().distinct().collect(Collectors.toList());
        System.out.println("list1 = " + list1);

        int[] arr1={1,1,2,2,3,3,4,4,5,5,6,6};
        arr1=Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        System.out.println("====================================");
        //skip---if you write 4 inthe skip than  it doesnt print the first 4 elements
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.stream().skip(5).collect(Collectors.toList());
        System.out.println("list2 = " + list2);
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        nums=Arrays.stream(nums).skip(4).toArray();
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("------------------------------------------");
        // limit--- it removes after given index number
        List<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       list3=list3.stream().limit(6).collect(Collectors.toList());
        System.out.println("list3 = " + list3);

        //skip end limit together
       list3= list3.stream().limit(7).skip(3).collect(Collectors.toList());
        System.out.println("list3 = " + list3);

        System.out.println("===========================================");

        //map()------- can be use lambda expression of functional functionalinterfaces
        List<Integer> list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days=days.stream().map(p -> p.substring(0,3)).collect(Collectors.toList());
        System.out.println("days = " + days);

        //filter----
        List<Integer> list5=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evenNumbers = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("=========================================");
        //count  ----- method that how many are matched
        List<Integer> list6=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

        System.out.println(list6.stream().filter(p -> p % 2 == 0).count());

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));

        System.out.println(names.stream().filter(p -> p.equalsIgnoreCase("java")).count());

        //forEach
        names.stream().filter(p -> p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));

        //allMatch, anyMatch, nonMatch,
        //if all elements is matched or if any element is matched or non of elements is matched than it uses boolean and return true or false
        List<Integer> list7=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1=list7.stream().allMatch(p -> p%2==0);
        System.out.println("r1 = " + r1);

        boolean r2=list7.stream().anyMatch(p -> p > 20);
        System.out.println("r2 = " + r2);

        boolean r3=list7.stream().noneMatch(p -> p%3==0 );
        System.out.println("r3 = " + r3);


    }
}
