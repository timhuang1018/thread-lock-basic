package fizzbuzz;

import java.util.function.Predicate;

public class Template extends Thread {

    static int current, max;
    static final Object lock = new Object();

    private Predicate<Integer> validate;
    private String toPrint;

    public Template(Predicate<Integer> validate, String toPrint){
        this.validate = validate;
        this.toPrint = toPrint;
    }

    @Override
    public void run(){

        while (true) {
            synchronized (lock){
                if (current > max) {
                    return;
                }
                if (validate.test(current)) {
                    System.out.println(toPrint);
                    current++;
                }
            }

        }
    }
}
