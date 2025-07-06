package modelo;

public class MesaElectoral {

    private int numeroMesa;
    private MiembroMesa[] miembros;
    private ActaElectoral acta;

    public MesaElectoral(int numeroMesa, int maxMiembros) {
        this.numeroMesa = numeroMesa;
        this.miembros = new MiembroMesa[maxMiembros];
        this.acta = null;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public MiembroMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public ActaElectoral getActa() {
        return acta;
    }

    public void setActa(ActaElectoral acta) {
        this.acta = acta;
    }
    
    //metodo agregar
    public void agregarMiembro(MiembroMesa miembro, int posicion) {
        if (posicion >= 0 && posicion < miembros.length) {
            miembros[posicion] = miembro;
            System.out.println("Miembro agregado correctamente en la posición " + (posicion + 1));
        } else {
            System.out.println("Posición inválida para agregar miembro.");
        }
    }
    // eliminar
    public void eliminarMiembro(int posicion) {
        if (posicion >= 0 && posicion < miembros.length) {
            miembros[posicion] = null;
            System.out.println("Miembro eliminado de la posición " + (posicion + 1));
        } else {
            System.out.println("Posición inválida para eliminar miembro.");
        }
    }

    public void asignarActa(ActaElectoral acta) {
        this.acta = acta;
        System.out.println("Acta asignada a la mesa.");
    }

    // mostrar
    public void mostrarInfo() {
        System.out.println("=== Mesa Electoral N° " + numeroMesa + " ===");
        System.out.println("Miembros:");
        for (int i = 0; i < miembros.length; i++) {
            if (miembros[i] != null) {
                System.out.println((i + 1) + ". " + miembros[i].getNombre() + " " + miembros[i].getApellido() +
                                   " - " + miembros[i].getTipo());
            } else {
                System.out.println((i + 1) + ". [Vacante]");
            }
        }
        if (acta != null) {
            System.out.println("Acta asignada: " + acta.getTitulo());
        } else {
            System.out.println("Sin acta asignada.");
        }
    }

}


