package modelo;

public class ActaElectoral {

    private String Titulo;
    private String Fecha;
    private String Hora;
    private String Lugar;
    private String NumeroActa;
    private MiembroMesa[] miembros;
    private int TotalRegistrados;
    private int TotalVotantes;
    private int VotosBlanco;
    private int VotosNulos;
    private String Observaciones;
    private String FirmaResponsable;
    private boolean SelloOficial;

    public ActaElectoral(String titulo, String fecha, String hora, String lugar, String numeroActa, int maxMiembros) {
        this.Titulo = titulo;
        this.Fecha = fecha;
        this.Hora = hora;
        this.Lugar = lugar;
        this.NumeroActa = numeroActa;
        this.miembros = new MiembroMesa[maxMiembros];
        this.TotalRegistrados = 0;
        this.TotalVotantes = 0;
        this.VotosBlanco = 0;
        this.VotosNulos = 0;
        this.Observaciones = "";
        this.FirmaResponsable = "";
        this.SelloOficial = false;
    }

    public void agregarMiembro(MiembroMesa miembro, int posicion) {
        if (posicion >= 0 && posicion < miembros.length) {
            miembros[posicion] = miembro;
        }
    }

    public void registrarVotantes(int registrados, int votantes, int blancos, int nulos) {
        this.TotalRegistrados = registrados;
        this.TotalVotantes = votantes;
        this.VotosBlanco = blancos;
        this.VotosNulos = nulos;
    }

    public void agregarObservaciones(String obs) {
        this.Observaciones = obs;
    }

    public void firmar(String firma) {
        this.FirmaResponsable = firma;
        this.SelloOficial = true;
    }

    public String getTitulo() {
    return Titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public String getLugar() {
        return Lugar;
    }

}



