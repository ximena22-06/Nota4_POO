
package modelo;

public class PartidoPolitico implements Registro {

    // atributos
    private String nombre;
    private String sigla;
    private String logo;
    private String representanteLegal;

    //constructor
    public PartidoPolitico(String nombre, String sigla, String logo, String representanteLegal) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
    }

    // getters setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    //mostrar
    public void mostrar() {
        System.out.println("\t" + nombre + "\t" + sigla + "\t" + representanteLegal);
    }

    // interfa
    @Override
    public void registrar() {
        System.out.println("Partido político registrado: " + nombre);
    }

    @Override
    public void modificar() {
        System.out.println("Partido político modificado: " + nombre);
    }

    @Override
    public void eliminar() {
        System.out.println("Partido político eliminado: " + nombre);
    }

}
