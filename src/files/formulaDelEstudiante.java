package files;

public class formulaDelEstudiante {
    public static void main(String[] args) {
        double a=1,b=6,c=4,x1,x2;
        double temp=Math.pow(b,2)-4*a*c;
        if (temp>=0){
            if (2*a!=0){
                x1=-b - Math.sqrt(temp)/2*a;
                x2=-b + Math.sqrt(temp)/2*a;
                System.out.println("las raices son: "+x1+" y "+x2);
            }
            else {
                System.out.println("error division por 0");
            }
        }
        else {
            System.out.println("error raiz negativa");
        }
    }
}
