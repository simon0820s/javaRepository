package relacionDeClases;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList inventario;
    public Catalogo(){
    }
    public void añadir_Inventario (ArrayList productos){
        this.inventario = productos;
    }
    public ArrayList getInventario(){
        ArrayList copia = new ArrayList();
        copia=inventario;
        return copia;
    }
}
