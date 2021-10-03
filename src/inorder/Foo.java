package inorder;

/**
 * The same instance of Foo will be passed to three different threads.
 * ThreadA will call first ThreadB will call second,and ThreadC will call third.
 * Design a mechanism to ensure that first is called before second and second is called before third.
 */
public class Foo {
    public Foo() { }
    public void first() {
        //...
    }
    public void second() {
        //...
    }
    public void third() {
        //...
    }
}
