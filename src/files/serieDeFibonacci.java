package files;

import java.util.Scanner;

public class serieDeFibonacci {
    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
        System.out.println("ingrese el numero que desea calcular");
        int n = ent.nextInt();
        calcularSerie(n);
    }
    public static void calcularSerie(int n){
        int a = 0, b=1,c=0;
        System.out.print("{");

        do {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
        while (--n>0);
        System.out.println("}");
    }
}
