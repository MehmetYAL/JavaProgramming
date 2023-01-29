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
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    }
}
