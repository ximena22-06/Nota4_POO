package modelo;

public class MiembroMesa extends Persona {

    private String tipo;

    public MiembroMesa(String nombre, String apellido, String tipo) {
        super(nombre, apellido);
        this.tipo = tipo;
    }

    //getters setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // mostrar
    public void mostrarInfoMiembro() {
        System.out.println("Miembro de Mesa");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Rol: " + tipo);
    }

}


