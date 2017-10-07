package cit360.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	    
	public static void main(String[] args) throws InterruptedException {
	        
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for(int i = 1; i <= 10; i++){
            executorService.execute(new Runnable(){
	                
                public void run(){
                try{
                    System.out.println("Up");
                    Thread.currentThread();
					Thread.sleep(1000);
                    System.out.println("Down");
                    Thread.currentThread();
					Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
           }});
       }
}
	    
	}
