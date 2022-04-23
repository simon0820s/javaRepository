package restaurante;

public class Cliente {
    private int edad;
    private String sexo;
    private String nombre;
    private int visitas;
    private int id;

    public Cliente(int edad, String sexo, String nombre, int visitas){
        this.edad=edad;
        this.sexo=sexo;
        this.nombre=nombre;
        this.visitas=visitas;
        asignarId();
    }
    public void imprimirValores(){
        System.out.println("edad: "+edad);
        System.out.println("sexo: "+sexo);
        System.out.println("nombre: "+nombre);
        System.out.println("visitas: "+visitas);
    }
    public void asignarId(){
        this.id=(int)Math.round(Math.random()*1000);
        System.out.println(nombre+" su nuevo ID es: "+id);
    }

    public int getId(){
        return this.id;
    }
}
