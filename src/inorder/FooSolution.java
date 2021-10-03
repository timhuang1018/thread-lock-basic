package inorder;

import java.util.concurrent.Semaphore;

public class FooSolution {

    public Semaphore sem1, sem2;

    public FooSolution(){
        try{
            //各只有1個permit
            sem1 = new Semaphore(1);
            sem2 = new Semaphore(1);

            sem1.acquire();
            sem2.acquire();
            //do something
        }catch (InterruptedException e){ }
    }

    public void first(){
        //do something

        sem1.release();
    }

    public void second(){

        try {
            sem1.acquire();
            sem1.release();

            //do something

            sem2.release();
        }catch (InterruptedException e){ }
    }

    public void third(){
        try {
            sem2.acquire();
            sem2.release();

            //do something

        }catch (InterruptedException e){ }
    }
}
