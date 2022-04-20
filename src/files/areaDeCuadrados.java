package files;

import javax.swing.*;

public class areaDeCuadrados {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"este programa sirve para: calcular el area de cualquier cuadrado o rectangulo");
        JOptionPane.showMessageDialog(null,"el cuadrado tiene un area = "+calculador(entradas()));

    }
    public static int[] entradas(){
        int[] ent = new int[2];
        int confirm =1;
        while (confirm==1) {
            String l = JOptionPane.showInputDialog(null, "ingrese la longitud de el cuadrado");
            String a = JOptionPane.showInputDialog(null, "ingrese la altura del cuadrado");
            try {
                ent[0] = Integer.parseInt(l);
                ent[1] = Integer.parseInt(a);
                confirm = JOptionPane.showConfirmDialog(null,"desea consultar el area en el cual la altura es = "+a+" y la longitud = "+l+" ?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "en la altura y la longitud de el cuadrador unicamente puedes ingresar numeros enteros");
            }
        }
        return ent;
    }

    public static int calculador(int[]ent){
        int area = ent[0]*ent[1];
        return area;
    }
}
