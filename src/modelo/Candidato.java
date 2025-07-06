
package modelo;

public class Candidato extends Persona implements Registro {
    private int dni;
    private PartidoPolitico partido;

    public Candidato(String nombre, String apellido, int dni, PartidoPolitico partido) {
        super(nombre, apellido);
        this.dni = dni;
        this.partido = partido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }
    
    //Interfaz
     @Override
    public void registrar() {
        System.out.println("Candidato registrado: " + nombre + " " + apellido);
    }

    @Override
    public void modificar() {
        System.out.println("Candidato modificado: " + nombre + " " + apellido);
    }

    @Override
    public void eliminar() {
        System.out.println("Candidato eliminado: " + nombre + " " + apellido);
    }
    
}
