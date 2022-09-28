
package Threads;

import java.util.Scanner;
public class Threads {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        int totnum;

        System.out.println("Total de numeros a los que le quiere sacar el factorial: ");
        totnum = lect.nextInt();

        for (int i = 0; i < totnum; i++){
            System.out.println();
            System.out.println("Número del que quiere conocer el factorial: ");

            int factnum;
            factnum = lect.nextInt();

            Thread thread = new Thread(new Factorial(factnum));

            thread.start();
        }
    }
}
