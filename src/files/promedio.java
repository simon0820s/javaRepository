package files;

import javax.swing.*;

public class promedio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"el objetivo de este programa es calcular el promedio de 5 notas");
        JOptionPane.showMessageDialog(null,"el promedio de sus notas es: "+prom(entrada()));
    }
    public static double[] entrada(){
        double[]nts=new double[5];

        JOptionPane.showMessageDialog(null,"ingrese 5 numeros");

        for (int i=0;i<5;i++){
            String ent = JOptionPane.showInputDialog("#"+(i+1));
            try{
                double num=Double.parseDouble(ent);
                nts[i]=num;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"unicamente puede ingresar numeros enteros");
            }
        }
        return nts;
    }

    public static double prom(double[]entrada){
        double sumatoria=entrada[0];
        for (int i=1;i<5;i++){
            sumatoria+=entrada[i];
        }
        double div = sumatoria/entrada.length;

        return div;
    }
}
