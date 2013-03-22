/**
 * 
 */
package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gouthami
 * 
 */
public class ExecutorFramework {
    public static boolean execute = true;

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Runnable s = new Runnable() {
            int i = 0;

            public void run() {
                while (execute) {
                    System.out.println(i++);
                }
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(s);
        executor.shutdown();
        Thread.sleep(10);
        execute = false; 
        
    }
}
