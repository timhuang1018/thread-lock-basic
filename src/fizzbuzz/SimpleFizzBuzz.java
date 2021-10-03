package fizzbuzz;

/**
 *  In the classic problem FizzBuzz,
 *  you are told to print the numbers from 1 to n.
 *  However, when the number is divisible by 3, print "Fizz''.
 *  When it is divisible by 5, print "Buzz''.
 *  When it is divisible by 3 and 5, print"FizzBuzz'
 *
 *
 *  Now implement a multithreaded version of FizzBuzz with four threads.
 *  One thread checks for divisibility of 3 and prints"Fizz''.
 *  Another thread is responsible for divisibility of 5 and prints"Buzz''.
 *  A third thread is responsible for divisibility of 3 and 5 and prints"FizzBuzz''.
 *  A fourth thread does the numbers.
 */
public class SimpleFizzBuzz {

    void fizzbuzz(int n){
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 ==0 ){
                System.out.println("fizzbuzz");
            }else if( i % 3 == 0){
                System.out.println("fizz");
            }else if ( i % 5 == 0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
