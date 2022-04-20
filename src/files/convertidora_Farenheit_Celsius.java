package files;

import java.util.Scanner;

public class convertidora_Farenheit_Celsius {
    public static void main(String[] args) {
        boolean bucle =true;
        System.out.println("el objetivo de este programa es: realizar la conversión de grados fahrenheit a Celsius para facilitarle la vida a el usuario");
        System.out.println("");

        while (bucle == true) {
            Scanner ent = new Scanner(System.in);
            System.out.println("ingrese por favor la temperatura, unicamente utilizando numeros");
            try {
                float grados = ent.nextFloat();
                float gradosC = (grados-32)*5/9;
                System.out.println("tu converción dio como resultado: "+gradosC);
                bucle = false;
            }
            catch (Exception e) {
                System.out.println("unicamente puedes ingresar numeros en este campo");
            }
        }
    }
}
