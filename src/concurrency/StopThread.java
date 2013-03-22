package concurrency;

public class StopThread {

    static boolean stopRequested = false;

    public static synchronized boolean isStopped() {
        return stopRequested;
    }

    public static synchronized void stopRequested() {
        StopThread.stopRequested = true;
    }

    public static void main(String ar[]) throws InterruptedException {
        Thread runningThread = new Thread(new Runnable() {

            @Override
            public void run() {
                while (!isStopped()) {
                    System.out.println(stopRequested);
                }

            }
        });
        runningThread.start();

        System.out.println("Stop Running Thread");
        stopRequested();
    }
}
