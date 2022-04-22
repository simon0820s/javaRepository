package asignacionDeClase;

public class Vocalista {
    private int edad;
    private String origen;
    private float peso;
    private String nombre;
    private float estatura;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setOrigen(String origen){
        this.origen=origen;
    }
    public String getOrigen(){
        return origen;
    }

    public void setPeso(float peso){
        this.peso=peso;
    }
    public float getPeso(){
        return peso;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEstatura(float estatura){
        this.estatura=estatura;
    }
    public float getEstatura(){
        return estatura;
    }

    public void tocarMusica(String genero){
        System.out.println("el Vocalista produce "+genero);
    }
}
