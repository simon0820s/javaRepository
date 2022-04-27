package relacionDeClases;

import javax.swing.*;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        int confirm = 0;
        Producto p = new Producto();
        Catalogo c= new Catalogo();
        Carrito car = new Carrito();
        System.out.println("");
        System.out.println("a continuación ingrese algunos productos para inicializar el sistema y crear el inventario");
        c.crear_Inventario(p.setProductos());
        System.out.println("el inventario se ha creado correctamente: "+c.getInventario());
        //Inicializar el sistema
        while(confirm==0){
            hacerPedido(car,c);
            Inventariar(c,p);
            confirm=JOptionPane.showConfirmDialog(null,"desea que el programa continue ?");
        }
    }
    public static void Inventariar(Catalogo c,Producto p){
        int añadir,verInventario;
        añadir = JOptionPane.showConfirmDialog(null,"desea añadir mas productos al inventario?");
        if (añadir==0){
            c.agregar_Inventario(p.setProductos());
            System.out.println(p.getProductos()+" se han agregado correctamente");
            verInventario=JOptionPane.showConfirmDialog(null,"desea ver el inventario?");
            if (verInventario==0){
                System.out.println(c.getInventario());
            }
        }
        else {
            verInventario=JOptionPane.showConfirmDialog(null,"desea ver el inventario?");
            if (verInventario==0){
                System.out.println(c.getInventario());
            }
        }
    }

    public static void hacerPedido(Carrito car,Catalogo c){
        int pedir;
        pedir = JOptionPane.showConfirmDialog(null,"desea realizar un pedido ?");
        if (pedir==0) {
            car.pedido(c.getInventario());
            System.out.println("El pedido ha finalizado: "+car.getPedido());
        }
    }
}
