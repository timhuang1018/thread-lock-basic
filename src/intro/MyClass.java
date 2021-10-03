package intro;

public class MyClass extends Thread {
    private String name;
    private MyObject myObj;
    public MyClass(MyObject obj, String n) {
        name = n;
        myObj = obj;
    }

    @Override
    public void run() {
        if (name.equals("1")){
            myObj.foo(name);
        }else if (name.equals("2")){
            myObj.bar(name);
        }
    }


    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyClass thread1 = new MyClass(obj1, "1");
        MyClass thread2 = new MyClass(obj1, "2");
        thread1.start();
        thread2.start();
    }
}
