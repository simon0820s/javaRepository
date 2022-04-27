package relacionDeClases;

import java.util.ArrayList;
import java.util.Collections;

public class Catalogo {
    private ArrayList inventario;
    public Catalogo(){
    }
    public void crear_Inventario (ArrayList productos){
        this.inventario=productos;
    }
    public void agregar_Inventario(ArrayList productos){
       for (int i=0;i<productos.size();i++){
           inventario.add(productos.get(i));
       }
    }
    public ArrayList getInventario(){
        ArrayList copia = new ArrayList();
        copia=inventario;
        return copia;
    }
}
