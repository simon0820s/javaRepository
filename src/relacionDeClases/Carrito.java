package relacionDeClases;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrito {
    private ArrayList pedido;

    public Carrito(){
    }
    public ArrayList pedido(ArrayList inventario){

        ArrayList pedido = new ArrayList();
        boolean bucle =true;
        int cantidad =0;
        String p = "";
        System.out.println("");
        System.out.println("Pedido:");
        System.out.println("");

        System.out.println("de cuantos productos consta el pedido ?");
        while(bucle==true){
            try{
                Scanner ent = new Scanner(System.in);
                cantidad= ent.nextInt();
            }
            catch (Exception e){
                System.out.println("En este campo unicamente puedes ingresar numeros enteros");
                System.out.println("");
            }
            for (int i =0;i<cantidad;i++){
                Scanner ent = new Scanner(System.in);
                System.out.println("ingrese el producto #"+(i+1));
                p = ent.nextLine();
                boolean existe = inventario.contains(p);
                if (existe){
                    pedido.add(p);
                }
                else {
                    i--;
                    System.out.println(p+" no existe en el inventario");
                    int verInventario =JOptionPane.showConfirmDialog(null,"desea ver el inventario?");
                    if (verInventario==0){
                        System.out.println(inventario);
                    }
                }
            }
            if (pedido.size()==cantidad){
                bucle=false;
            }
        }
        this.pedido=pedido;
        return pedido;
    }
    public ArrayList getPedido(){
        ArrayList copia =pedido;
        return copia;
    }
}
