package asignacionDeClase;

public class Program {
    public static void main(String[] args) {
        Vocalista e;
        e = new Vocalista();
        e.setOrigen("Rammstein");
        e.setEdad(59);
        e.setPeso(85);
        e.setNombre("Till Lindemann");
        e.setEstatura(1.84F);

        System.out.println("el Vocalista tiene: "+e.getEdad()+" años");
        System.out.println("el Vocalista viene de: "+e.getOrigen());
        System.out.println("el Vocalista pesa: "+e.getPeso()+" Kg");
        System.out.println("el Vocalista se llama: "+e.getNombre());
        System.out.println("el Vocalista mide: "+e.getEstatura()+" M");
        e.tocarMusica("Metal Industrial");
    }
}
