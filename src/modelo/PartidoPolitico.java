
package modelo;

public class PartidoPolitico implements Registro {
    private String nombre;
    private String sigla;
    private String logo;
    private String representantelegal;

    public PartidoPolitico(String nombre, String sigla, String logo, String representantelegal) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representantelegal = representantelegal;
    }

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

    public String getRepresentantelegal() {
        return representantelegal;
    }

    public void setRepresentantelegal(String representantelegal) {
        this.representantelegal = representantelegal;
    }
    
    //implementar interfaz
    @Override
    public void registrar(){
        System.out.println("Partido politico registrado: "+nombre);
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
