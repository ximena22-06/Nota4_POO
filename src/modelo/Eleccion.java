package modelo;

public class Eleccion {

    // stributos
    private String fecha;
    private String tipo; // municipal, nacional, referéndum
    private Candidato[] candidatos;
    private MesaElectoral[] mesas;
    private int cantidadCandidatos;
    private int cantidadMesas;

    // constructor
    public Eleccion(String fecha, String tipo, int maxCandidatos, int maxMesas) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = new Candidato[maxCandidatos];
        this.mesas = new MesaElectoral[maxMesas];
        this.cantidadCandidatos = 0;
        this.cantidadMesas = 0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }

    public int getCantidadCandidatos() {
        return cantidadCandidatos;
    }

    public void setCantidadCandidatos(int cantidadCandidatos) {
        this.cantidadCandidatos = cantidadCandidatos;
    }

    public int getCantidadMesas() {
        return cantidadMesas;
    }

    public void setCantidadMesas(int cantidadMesas) {
        this.cantidadMesas = cantidadMesas;
    }
    

    // metodos
    public void agregarCandidato(Candidato c) {
        if (cantidadCandidatos < candidatos.length) {
            candidatos[cantidadCandidatos] = c;
            cantidadCandidatos++;
            System.out.println("Candidato agregado a la elección.");
        } else {
            System.out.println("No se puede agregar más candidatos.");
        }
    }

    public void agregarMesa(MesaElectoral m) {
        if (cantidadMesas < mesas.length) {
            mesas[cantidadMesas] = m;
            cantidadMesas++;
            System.out.println("Mesa agregada a la elección.");
        } else {
            System.out.println("No se puede agregar más mesas.");
        }
    }
    public void mostrarInfo() {
        System.out.println("=== Elección ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Candidatos:");
        if (cantidadCandidatos == 0) {
            System.out.println("No hay candidatos registrados.");
        } else {    
            for (int i = 0; i < cantidadCandidatos; i++) {
                System.out.println("- " + candidatos[i].getNombre() + " " + candidatos[i].getApellido()
                    + " | Partido: " + candidatos[i].getPartido().getNombre());
            }
        }
        System.out.println("Mesas electorales:");
        for (int i = 0; i < cantidadMesas; i++) {
            System.out.println("- Mesa N°: " + mesas[i].getNumeroMesa());
        }
    }

}