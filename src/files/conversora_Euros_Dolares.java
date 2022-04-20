package files;

import javax.swing.*;

public class conversora_Euros_Dolares {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"el objetivo de este programa es convertir dinero de Euros a Dolares");
        JOptionPane.showMessageDialog(null,"cabe aclarar que en este momento: 1 Euro equivale a: 1.08 Dolares");

        JOptionPane.showMessageDialog(null,"su converción dio como resultado: "+ convertir(entrada())+"$");

    }
    public static double entrada(){
        double eu=0;
        int confirm = 1;
        while (confirm==1) {
            String ent = JOptionPane.showInputDialog(null, "ingrese sus Euros:");
            try {
                eu = Double.parseDouble(ent);
                confirm = JOptionPane.showConfirmDialog(null,"desea realizar el cambio por: "+eu+"€ ?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "unicamente puedes ingresar numeros");
            }
        }
        return eu;
    }

    public static double convertir(double eu){
        double d=eu*1.08;
        return d;
    }
}
