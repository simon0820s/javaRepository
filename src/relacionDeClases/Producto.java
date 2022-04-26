package relacionDeClases;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
    private String[] productos= new String[1];

    public Producto(){
    }

    public ArrayList setProductos(){
        ArrayList productos = new ArrayList();
        int c=0;
        boolean bucle = true;
        System.out.println("a continuación ingrese los productos iniciales para crear el inventario");
        System.out.println("");
        while (bucle == true) {
            try {
                Scanner cant = new Scanner(System.in);
                System.out.println("cuantos productos desea ingresar ?");
                c = cant.nextInt();
                bucle = false;
            } catch (Exception e) {
                System.out.println("en este campo unicamente puedes ingresar numeros enteros");
                System.out.println("");
            }
        }

        for (int i =0;i<c;i++){
                Scanner prod = new Scanner(System.in);
                System.out.println("ingrese el producto #" + (i+1));
                String p = prod.nextLine();
                productos.add(p);
        }
        return productos;
    }
}
