package concepts.Recursions;

import org.junit.jupiter.api.Test;

public class MultipleRecursions {


    ////////////////////////////////Fibonacci series with Multiple recursions///////////////////////////////////

    @Test
    public void start(){
        System.out.println(fib(6));
    }


    public  int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

    //**************************************** End ****************************************





