package modelo;

public class MiembroMesa extends Persona {
    private String Tipo; 

    public MiembroMesa(String nombre, String apellido, String rol) {
        super(nombre, apellido); 
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String rol) {
        this.Tipo = rol;
    }

    public void mostrarInfo() {
        System.out.println("Miembro de Mesa");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Rol: " + Tipo);
    }
}


