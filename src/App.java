public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setEdad(15);
        persona.setNombre("Marco");
        persona.setTelefono(12345678);

        System.out.println(persona.getEdad() + " " + persona.getNombre() + " " + persona.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad =  edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre =  nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
