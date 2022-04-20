package files;

import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        int n;

        Scanner ent = new Scanner(System.in);
        System.out.println("el objetivo de este programa es que ingreses un numero y la maquina se encargara de decirte si este es: primo");
        System.out.println("ingrese por favor el numero: ");

        try {
            n = ent.nextInt();
            if(primo(n)>2) System.out.println(n+" no es un numero primo");
            else System.out.println(n+" es un numero primo");

        }

        catch (Exception e){
            System.out.println("unicamente puedes ingresar un numero entero");
        }
    }
    public static int primo(int n){
        int cont = 2, div = 2;
        while(cont<n){
            if (n%cont==0){
                div++;
                break;
            }
            cont++;
        }
        return div;
    }
}
