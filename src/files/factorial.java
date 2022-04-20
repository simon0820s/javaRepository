package files;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int factor;
        Scanner ent = new Scanner(System.in);
        System.out.println("ingrese por favor el numero del cual desea encontrar el factorial: ");
        factor = ent.nextInt();
        System.out.println(factorial(factor));
    }
    public static int factorial(int n){
        int factorial=1;

        while(n!=0){
            factorial=factorial*n;
            n --;
            System.out.println(factorial+"x"+n+"="+factorial*n);

        }
        return factorial;
    }
}
