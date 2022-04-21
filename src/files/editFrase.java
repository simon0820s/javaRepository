package files;

public class editFrase {
    public static void main(String[] args) {
        String resultado = "", frase = "cada pueblo o nación tiene el gobierno que se merece";
        frase = frase.toLowerCase();

        String vec[] = frase.split(" ");

        for (String pal:vec){
            resultado += (pal.charAt(0)+"").toUpperCase();
            resultado += pal.substring(1,pal.length())+" ";
        }
        System.out.println(resultado);
    }
}
