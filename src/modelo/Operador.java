package modelo;

public class Operador {
    private String usuario;
    private String contraseña;

    public Operador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(String user, String pass) {
        if (this.usuario == null || this.contraseña == null) {
            return false;
        }
        return this.usuario.equals(user) && this.contraseña.equals(pass);
    }

}


