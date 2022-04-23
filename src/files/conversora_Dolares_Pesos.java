package files;

import java.util.Scanner;

public class conversora_Dolares_Pesos {

    public static void main(String[] args) {
        System.out.println("el obejtivo del programa es hacer una conversora de Pesos colombianos a Dolares");
        System.out.println(conversor(entrada()));
    }
    public static int entrada(){
        int p = 0;
        boolean con = true;

        while(con == true){
            Scanner ent = new Scanner(System.in);
            System.out.println("ingrese la cantidad de Pesos");
            try {
                p = ent.nextInt();
                con = false;
            }
            catch (Exception e) {
                System.out.println("unicamente puedes ingresar numeros enteros mayores a 0");
            }
        }

        return p;
    }

    public static double conversor(int entrada){
        double d = entrada*0.0002603219;
        return d;
    }
}
