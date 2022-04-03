package org.denizhan.creational_patterns.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Callable<String>>> futureList = new ArrayList<>();
        for(int i = 0; i<100; i++){
            futureList.add(executorService.submit(Main::databaseTask));
        }
        futureList.forEach(callableFuture -> {
            try {
                log.info(callableFuture.get().call());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.exit(0);
    }

    private static Callable<String> databaseTask(){
        return () -> {
            Thread.sleep(10);
            return "Object hash: " + Database.getDatabase().hashCode();
        };
    }
}
