package dinner;

public class App {

    public static void main(String[] args) {

        Chopstick chop1 = new Chopstick();
        Chopstick chop2 = new Chopstick();
        Chopstick chop3 = new Chopstick();
        Person person1 = new Person("Tim",chop1,chop2);
        Person person2 = new Person("Jack",chop2,chop3);
        Person person3 = new Person("Danny",chop3,chop1);

        System.out.println("let's start to eat!");
        person1.start();
        person2.start();
        person3.start();
    }
}
