package dinner;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {

    private Lock lock;
    public int index;

    public  Chopstick(){
        lock = new ReentrantLock();
    }

    public boolean pickUp(){
        return lock.tryLock();
    }

    public void putDown(){
        lock.unlock();
    }
}
