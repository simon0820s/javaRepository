package files;

import javax.swing.*;
import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        int con = 0;
        System.out.println("ingrese un palindromo y la maquina verificara si en realidad este si lo es");
        while (con ==0) {
            comprovador(entrada());
            con = JOptionPane.showConfirmDialog(null,"desea intentarlo de nuevo?");
        }
    }


    public static String entrada(){
        Scanner ent = new Scanner(System.in);
        System.out.println("");
        System.out.println("ingrese la palabra");
        final String pal = ent.nextLine();
        return pal;
    }
    public static void comprovador(String pal){
        String inv ="";
        for (int i=pal.length()-1;i>=0;i--){
            inv += pal.charAt(i)+"";
        }
        if (inv.equals(pal)) System.out.println("efectivamente "+pal+" es un palindromo");
        else System.out.println("lamentablemente "+pal+" no es palindromo");
    }
}
