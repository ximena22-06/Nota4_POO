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

    public MiembroMesa[] getMiembros() {
        return miembros;
    }

    public void agregarMiembro(MiembroMesa miembro, int posicion) {
        if (posicion >= 0 && posicion < miembros.length) {
            miembros[posicion] = miembro;
        }
    }

    public void asignarActa(ActaElectoral acta) {
        this.acta = acta;
    }

    public ActaElectoral getActa() {
        return acta;
    }
}


