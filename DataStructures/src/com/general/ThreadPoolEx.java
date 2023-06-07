package com.general;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolEx {

	public static void main(String[] args) {
		
		// Executor Example
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(() -> System.out.println("Anand"));
		
		// Executor Service example
		 ExecutorService executorService = Executors.newFixedThreadPool(10);
		 Future<String> future = executorService.submit(()->"Hello World");
		 try {
			 int i=11;
			 if(i>10) {
				 String result = future.get();
				 System.out.println("Result:"+result);
			 }
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
