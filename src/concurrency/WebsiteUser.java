package concurrency;

public class WebsiteUser implements Runnable {

    private UsersCount count;

    WebsiteUser(UsersCount count) {
        this.count = count;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        UsersCount hitCount = new UsersCount();
        for (long i = 0l; i <200000; i++) {
            WebsiteUser user = new WebsiteUser(hitCount);
            new Thread(user, "thread: " + (1+i)).start();

        }
    }

 
    @Override
    public void run() {
        this.count.increment();
        System.out.println("thread :" + Thread.currentThread().getName() + "->" + this.count.getHits());
        this.count.decrement();    
        System.out.println("thread :" + Thread.currentThread().getName() + "->" + this.count.getHits());
    }

}
