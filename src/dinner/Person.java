package dinner;

public class Person extends Thread{
    private int bites = 10;
    private String name;
    //能操作兩隻筷子，但這些筷子是跟其他人共用的資源
    private Chopstick left, right;


    public Person(String name,Chopstick left, Chopstick right){
        this.name = name;
        /**
         * possible solution: reverse assigning chopsticks order for one person by chopsticks' index
         */
//        if (left.index > right.index)
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        for (int i = 0; i < bites; i++){
            eat();
        }
    }

    public void eat(){
        pickUp();
        chew();
        putDown();
    }

    public void pickUp(){
        left.pickUp();
        right.pickUp();
    }

    public void putDown(){
        right.putDown();
        left.putDown();
    }

    private void chew(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){

        }
    }
}
