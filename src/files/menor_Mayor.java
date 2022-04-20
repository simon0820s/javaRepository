package files;

import javax.swing.*;

public class menor_Mayor {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"el obejtivo de este programa es mostrar en numero menor y el mayor de un arreglo");

        int[]ent = entrada();
        JOptionPane.showMessageDialog(null,"el numero mayor es: "+mayor(ent)+" y el numero menor es: "+menor(ent));
    }
    public static int[] entrada(){
        int ent[]=new int[5];


            for (int i = 0; i < 5; i++) {
                String n = JOptionPane.showInputDialog(null, "ingrese el #" + (i + 1));
                try {
                    ent[i] = Integer.parseInt(n);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "unicamente puedes ingresar numeros enteros");
                    i = -1;
                }
            }

        return ent;
    }
    public static int mayor(int[]entrada){
        int n=0;

        for (int i=0;i<5;i++){
            if (n<entrada[i]){
                n=entrada[i];
            }
        }
        return n;
    }
    public static int menor(int[] entrada){
        int menor = mayor(entrada);

        for (int i=0;i<5;i++){
            if (menor>entrada[i]){
                menor=entrada[i];
            }
        }
        return menor;
    }
}
