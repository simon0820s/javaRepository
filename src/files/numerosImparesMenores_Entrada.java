package files;

import javax.swing.*;

public class numerosImparesMenores_Entrada {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"el objetivo de este programa es mostrar todos los impares y menores a la entrada");
        selecciónador(entrada());
    }
    public static int entrada(){
        int n=0;
        int firm=1;
        while(firm ==1) {
            String ent = JOptionPane.showInputDialog(null, "ingrese el numero a el cual quiere consultar");
            try {
                n = Integer.parseInt(ent);
                firm=JOptionPane.showConfirmDialog(null,"desea consultar el numero: "+ n);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "unicamente puedes ingresar numeros enteros");
            }
        }
        return n;
    }

    public static void selecciónador(int n){

        for (int i=0;i<n;i++){
            if (i%2!=0){
                System.out.print(" "+i);
            }
        }

    }
}
