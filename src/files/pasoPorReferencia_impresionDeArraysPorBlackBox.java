package files;

import java.util.Arrays;

public class pasoPorReferencia_impresionDeArraysPorBlackBox {
    public static void main(String[] args) {
        int x[]= new int[]{1,2,3};
        StringBuilder str = null;
        imprimir(str);
        cambio(str);
        imprimir(str);
        System.out.println(Arrays.toString(x));
        cambioA(x);
        System.out.println(Arrays.toString(x));
    }

    public static void cambioA(int x []){
        x[0]=4;
        x[1]=3;
        x[2]=2;
    }
    public static void cambio(StringBuilder str){
        str = new StringBuilder();
        str.append("hola");
    }
    public static void imprimir(StringBuilder str){
        System.out.println(str);
    }
}
