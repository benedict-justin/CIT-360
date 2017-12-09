/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Justin
 */
public class ThreadRunnableExecutor {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Create Executor Service..");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Create a Runnable..");
        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());
        };

        System.out.println("Submit the runnable task to the executor.");
        executorService.submit(runnable);
    
        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}
