package files;

import java.util.Arrays;

public class matrizHoudini {
    public static void main(String[] args) {

        int m [][]={{2,3,5,0,1,5},{0,0,1,2,6,7},{2,2,3,3,4,2},{3,3,1,6,2,1},{4,2,3,4,2,1},{5,6,3,1,1,0}};
        int sc[]=new int[m.length];
        int sf=0;

        for(int c=0; c<m.length;c++){

            for (int f = 0; f <m[0].length; f++){
                System.out.print(m[c][f]+"   ");
                sf+=m[c][f];
                sc[c]+=m[c][f];
            }
            System.out.println("="+sf);
            System.out.println("");
            sf=0;
        }
        for (int i=0;i<m.length;i++){
            System.out.print("=   ");
        }
        System.out.println();
        for (int c: sc){
            System.out.print(c+"  ");

        }
    }
}
