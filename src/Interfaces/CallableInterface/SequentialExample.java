package Interfaces.CallableInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequentialExample {

    public static void main(String[] args) {

        //To calculate total execution time
        long startTime = System.currentTimeMillis();

        List<String> result1 = fetchData1();
        List<String> result2 = fetchData2();
        List<String> result3 = fetchData3();

        // Combine results into a new ArrayList
        List<String> combinedResults = new ArrayList<>();
        combinedResults.addAll(result1);
        combinedResults.addAll(result2);
        combinedResults.addAll(result3);

        //To calculate total execution time
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Combined Data: " + combinedResults);
        System.out.println("Total Execution Time (Sequential): " + duration + " ms");
    }


    public static List<String> fetchData1() {
        try {
            Thread.sleep(1000); // Simulate delay, basically, to show, data sources starts giving data at their start time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList("User1", "User2", "User3");
    }

    public static List<String> fetchData2() {
        try {
            Thread.sleep(2000); // Simulate delay, basically, to show, data sources starts giving data at their start time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList("User4", "User5", "User6");
    }

    public static List<String> fetchData3() {
        try {
            Thread.sleep(1500); // Simulate delay, basically, to show, data sources starts giving data at their start time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList("User7", "User8", "User9");
    }
}
