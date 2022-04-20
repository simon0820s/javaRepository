package files;

import javax.swing.*;

public class multiplicadorDe3Numeros {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"el objetivo de este programa es: crear un arreglo y multiplicar todos los elementos en su interior");
        JOptionPane.showMessageDialog(null,"su multiplicación dio como resultado: "+multiplicador(entrada()));
    }
    public static int[] entrada(){
        int nums[]=new int[3];
        JOptionPane.showMessageDialog(null,"ingrese 3 numeros");

        for (int i=0;i<3;i++){
            String ent = JOptionPane.showInputDialog("#"+(i+1));
            try{
                int num = Integer.parseInt(ent);
                nums[i]=num;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"unicamente puede ingresar numeros enteros");
            }
        }
        return nums;
    }
    public static int multiplicador(int[]entrada){
        int multiplicador=entrada[0];
        for (int i=1;i<3;i++){
            multiplicador*=entrada[i];
        }
        return multiplicador;
    }
}
