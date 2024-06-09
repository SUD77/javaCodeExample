package Interfaces.CallableInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<String> combinedResults = fetchUserDataConcurrently();

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Combined Data: " + combinedResults);
        System.out.println("Total Execution Time (Concurrent): " + duration + " ms");
    }

    public static List<String> fetchUserDataConcurrently() {

        //Using executorService
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<List<String>> task1 = new UserDataFetcher1();
        Callable<List<String>> task2 = new UserDataFetcher2();
        Callable<List<String>> task3 = new UserDataFetcher3();

        List<Future<List<String>>> futures = new ArrayList<>();
        futures.add(executorService.submit(task1));
        futures.add(executorService.submit(task2));
        futures.add(executorService.submit(task3));

        List<String> combinedResults = new ArrayList<>();
        for (Future<List<String>> future : futures) {
            try {
                combinedResults.addAll(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
        return combinedResults;
    }
}

class UserDataFetcher1 implements Callable<List<String>> {
    @Override
    public List<String> call() throws Exception {
        Thread.sleep(1000);  // Simulate delay, basically, to show, data sources starts giving data at their start time
        return Arrays.asList("User1", "User2", "User3");
    }
}

class UserDataFetcher2 implements Callable<List<String>> {
    @Override
    public List<String> call() throws Exception {
        Thread.sleep(2000);  // Simulate delay, basically, to show, data sources starts giving data at their start time
        return Arrays.asList("User4", "User5", "User6");
    }
}

class UserDataFetcher3 implements Callable<List<String>> {
    @Override
    public List<String> call() throws Exception {
        Thread.sleep(1500);  // Simulate delay, basically, to show, data sources starts giving data at their start time
        return Arrays.asList("User7", "User8", "User9");
    }
}
