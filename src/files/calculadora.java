package files;

import javax.swing.*;

public class calculadora {
    public static void main(String[] args) {
        int a;
        int b;
        String entA;
        String entB;
        JOptionPane.showMessageDialog(null, "bienvenido a la calculadora didactica de numeros enteros");
        JOptionPane.showMessageDialog(null, "Advertencia!!");
        JOptionPane.showMessageDialog(null, "unicamente puede realizar operaciónes con numeros enteros");
        while (1==1) {
            JOptionPane.showMessageDialog(null, "que operación matematica desea realizar?");
            String ent = JOptionPane.showInputDialog("1=suma, 2=resta, 3=multiplicación, 4=division");
            int op = Integer.parseInt(ent);
            switch (op){
                case 1:
                    entA = JOptionPane.showInputDialog(null,"ingrese por favor el primer sumando");
                    a = Integer.parseInt(entA);
                    entB = JOptionPane.showInputDialog(null,"ingrese por favor el segundo sumando");
                    b = Integer.parseInt(entB);
                    JOptionPane.showMessageDialog(null,"el resultado de la suma es: "+sumar(a,b));
                    break;
                case 2:
                    entA = JOptionPane.showInputDialog(null,"ingrese por favor el minuendo");
                    a = Integer.parseInt(entA);
                    entB = JOptionPane.showInputDialog(null,"ingrese por favor el sustraendo");
                    b = Integer.parseInt(entB);
                    JOptionPane.showMessageDialog(null,"el resultado de la resta es: "+restar(a,b));
                    break;
                case 3:
                    entA = JOptionPane.showInputDialog(null,"ingrese por favor el multiplicando");
                    a = Integer.parseInt(entA);
                    entB = JOptionPane.showInputDialog(null,"ingrese por favor el multiplicador");
                    b = Integer.parseInt(entB);
                    JOptionPane.showMessageDialog(null,"el resultado de la multiplicación es: "+multiplicar(a,b));
                    break;
                case 4:
                    entA = JOptionPane.showInputDialog(null,"ingrese por favor el dividendo");
                    a = Integer.parseInt(entA);
                    entB = JOptionPane.showInputDialog(null,"ingrese por favor el divisor");
                    b = Integer.parseInt(entB);
                    JOptionPane.showMessageDialog(null,"el resultado de la division es: "+dividir(a,b));

                default:
                    JOptionPane.showMessageDialog(null,"recuerde que debe de insertar un numero valido");
                    JOptionPane.showMessageDialog(null,"1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir");
            }
        }

    }

    public static int dividir(int a,int b){
        int resultado = a /b;
        return resultado;
    }

    public static int multiplicar(int a, int b){
        int resultado = a*b;
        return resultado;
    }

    public static int sumar(int a, int b){
        int resultado = a+b;
        return resultado;
    }

    public static int restar (int a, int b){
        int resultado = a-b;
        return resultado;
    }
}
