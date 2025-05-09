package Streams.BeginnerLevel;

import java.util.*;
import java.util.stream.Collectors;

public class NumberBasedQ {
    public static void main(String[] args) {


        //Mock Data
        List<Integer> numbers = Arrays.asList(1, 2, 11, 15, 16, 1,3,4, 17, 15, 3, 4, 5, 6, 7, 8, 9, 10);



        //Questions

        // 1. Filter Even no
        List<Integer> evenNumberList=numbers
                .stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        System.out.println("Even no list is : " + evenNumberList);

        // 2. Sum of all no
        int sumOfNo = numbers
                .stream()
                .reduce((a,b)->a+b)
                .get();

        System.out.println("Sum of all no : " + sumOfNo);


        //3. Sorting no in Descending Order

        List<Integer> sortedList=numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending order is : " + sortedList);

        //4. Remove duplicate from the list

        List<Integer> uniqueNo=numbers
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique no : " + uniqueNo);


        //5. Max no
        Optional<Integer> maxNo=numbers
                .stream()
                .max(Comparator.naturalOrder());

        System.out.println("Max no is : " + maxNo.get());

        //Good Q
        //6. Second highest no
        Optional<Integer> secondLargest=numbers
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second Largest no is : " + secondLargest.get());


    }
}
