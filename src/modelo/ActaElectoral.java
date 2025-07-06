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
    private ResultadoCandidato[] resultados;
    private int cantidadResultados;


    public ActaElectoral(String titulo, String fecha, String hora, String lugar, String numeroActa, int maxMiembros) {
    this.Titulo = titulo;
    this.Fecha = fecha;
    this.Hora = hora;
    this.Lugar = lugar;
    this.NumeroActa = numeroActa;
    this.miembros = new MiembroMesa[maxMiembros];
    this.resultados = new ResultadoCandidato[10]; // inicializado
    this.cantidadResultados = 0;
    this.TotalRegistrados = 0;
    this.TotalVotantes = 0;
    this.VotosBlanco = 0;
    this.VotosNulos = 0;
    this.Observaciones = "";
    this.FirmaResponsable = "";
    this.SelloOficial = false;
}

    public ResultadoCandidato[] getResultados() {
        return resultados;
    }

    public void setResultados(ResultadoCandidato[] resultados) {
        this.resultados = resultados;
        this.cantidadResultados = 0;
    }

    public int getCantidadResultados() {
        return cantidadResultados;
    }

    public void setCantidadResultados(int cantidadResultados) {
        this.cantidadResultados = cantidadResultados;
    }
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        this.Hora = hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        this.Lugar = lugar;
    }

    public String getNumeroActa() {
        return NumeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.NumeroActa = numeroActa;
    }

    public MiembroMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getTotalRegistrados() {
        return TotalRegistrados;
    }

    public void setTotalRegistrados(int totalRegistrados) {
        this.TotalRegistrados = totalRegistrados;
    }

    public int getTotalVotantes() {
        return TotalVotantes;
    }

    public void setTotalVotantes(int totalVotantes) {
        this.TotalVotantes = totalVotantes;
    }

    public int getVotosBlanco() {
        return VotosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.VotosBlanco = votosBlanco;
    }

    public int getVotosNulos() {
        return VotosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.VotosNulos = votosNulos;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.Observaciones = observaciones;
    }

    public String getFirmaResponsable() {
        return FirmaResponsable;
    }

    public void setFirmaResponsable(String firmaResponsable) {
        this.FirmaResponsable = firmaResponsable;
    }

    public boolean isSelloOficial() {
        return SelloOficial;
    }

    public void setSelloOficial(boolean selloOficial) {
        this.SelloOficial = selloOficial;
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

    public void mostrar() {
        System.out.println("Número de acta: " + NumeroActa);
        System.out.println("Título: " + Titulo);
        System.out.println("Fecha: " + Fecha);
        System.out.println("Hora: " + Hora);
        System.out.println("Lugar: " + Lugar);
        System.out.println("Total Registrados: " + TotalRegistrados);
        System.out.println("Total Votantes: " + TotalVotantes);
        System.out.println("Votos en Blanco: " + VotosBlanco);
        System.out.println("Votos Nulos: " + VotosNulos);
        System.out.println("Observaciones: " + Observaciones);
        System.out.println("Firma Responsable: " + FirmaResponsable);
        System.out.println("Sello Oficial: " + (SelloOficial ? "Sí" : "No"));
    }
    public void agregarResultado(ResultadoCandidato r) {
        if (cantidadResultados < resultados.length) {
            resultados[cantidadResultados] = r;
            cantidadResultados++;
        } else {
            System.out.println("No se puede agregar más resultados.");
        }
        
    }
    public void mostrarResultados() {
    System.out.println("=== Resultados por candidato ===");
    if (cantidadResultados == 0) {
        System.out.println("No hay resultados registrados.");
    } else {
        for (int i = 0; i < cantidadResultados; i++) {
            resultados[i].mostrar();
        }
    }
}

}







