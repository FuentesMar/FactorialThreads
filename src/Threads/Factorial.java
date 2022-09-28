package Threads;
import java.util.Scanner;
public class Factorial implements Runnable{
    int calfact;
    public Factorial (int n){
        this.calfact = n;
    }
    public void run(){
        int num;
        num = calfact;
        if(calfact > 0){
            for (int i = calfact-1; i >= 1; i--){
                num = num * i;
            }
        }
        System.out.println(Thread.currentThread().getName() + ": " + num);
    }
}


