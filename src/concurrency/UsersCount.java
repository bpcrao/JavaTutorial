package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class UsersCount {

    AtomicInteger users =new AtomicInteger(0);

    public int getHits() {
        return users.get();
    }

    public void increment() {
        this.users.getAndIncrement();
    }

    public void decrement() {
       this.users.decrementAndGet();
        
    }

}
