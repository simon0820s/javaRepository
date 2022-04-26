package relacionDeClases;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Producto p = new Producto();
        Catalogo c= new Catalogo();
        Carrito car = new Carrito();
        c.añadir_Inventario(p.setProductos());
        //Inicializar el sistema

        car.pedido(c.getInventario());
        System.out.println(car.getPedido());
    }
}
