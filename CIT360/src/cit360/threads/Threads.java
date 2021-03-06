/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.threads;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Justin
 */
public class Threads {

public static void main(String[] args){
        ExecutorService executor = Executors.newCachedThreadPool();
        
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(2000);
                
                if(duration > 2000){
                    throw new IOException("Long sleep.");
                }
                
                System.out.println("Starts...");
                
                try{
                    Thread.sleep(duration);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                
                System.out.println("Completed.");
                return duration;
            }
        
        });
        
        executor.shutdown();
              
        
        try {
            System.out.println("Result: " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
    

