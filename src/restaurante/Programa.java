package restaurante;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("a continuación debe de ingresar los datos de el cliente para que se le otorgue un ID y pueda en un futuro usarlo para los domicilios del restaurante");

        Cliente c1;
        c1 = new Cliente(edad(),sexo(),nombre(),visitas());
        System.out.println("los valores que usted ingreso fueron: ");
        System.out.println("");
        c1.imprimirValores();
        System.out.println("");
        c1.asignarId();
    }

    public static int edad() {
        int edad = -20;
        while (edad < 0) {
            try {
                Scanner tec = new Scanner(System.in);
                System.out.println("ingrese la edad");
                edad = tec.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("unicamente puedes ingresar un valor entero y mayor que 0");
                System.out.println("");
            }
        }
        return edad;
    }

    public static String sexo() {
        String sex = "";
        while (sex == "") {
            try {
                Scanner tec = new Scanner(System.in);
                System.out.println("ingrese el sexo del cliente");
                sex = tec.nextLine();
            } catch (Exception e) {
                System.out.println("unicamente puedes texto en este campo");
                System.out.println("");
            }
        }
        return sex;
    }

    public static String nombre() {
        String nombre = "";
        while (nombre == "") {
            try {
                Scanner tec = new Scanner(System.in);
                System.out.println("ingrese el nombre del usuario");
                nombre = tec.nextLine();
            } catch (Exception e) {
                System.out.println("unicamente puedes ingresar una cadena de texto");
                System.out.println("");
            }
        }
        return nombre;
    }
    public static int visitas(){
        int visitas = -20;
        while (visitas < 0) {
            try {
                Scanner tec = new Scanner(System.in);
                System.out.println("ingrese la cantidad de visitas que ha tenido este usuario");
                visitas = tec.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("unicamente puedes ingresar un valor entero y mayor que 0");
                System.out.println("");
            }
        }
        return visitas;
    }
}
