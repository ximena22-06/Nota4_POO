package modelo;

public class GestorElecciones {

    // ============================
    // Atributos
    // ============================
    private Eleccion[] listaElecciones;
    private int cantidad;

    // ============================
    // Constructor
    // ============================
    public GestorElecciones(int maxElecciones) {
        listaElecciones = new Eleccion[maxElecciones];
        cantidad = 0;
    }

    // ============================
    // Método registrar
    // ============================
    public void registrarEleccion(Eleccion e) {
        if (cantidad < listaElecciones.length) {
            listaElecciones[cantidad] = e;
            cantidad++;
            System.out.println("Elección registrada.");
        } else {
            System.out.println("No se puede registrar. Lista de elecciones llena.");
        }
    }

    // modificar
    public void modificarEleccion(String fechaBuscar, String nuevaFecha, String nuevoTipo) {
        for (int i = 0; i < cantidad; i++) {
            if (listaElecciones[i].getFecha().equals(fechaBuscar)) {
                listaElecciones[i].setFecha(nuevaFecha);
                listaElecciones[i].setTipo(nuevoTipo);
                System.out.println("Elección modificada correctamente.");
                return;
            }
        }
        System.out.println("Elección no encontrada.");
    }

    //eliminar
    public void eliminarEleccion(String fechaBuscar) {
        for (int i = 0; i < cantidad; i++) {
            if (listaElecciones[i].getFecha().equals(fechaBuscar)) {
                // Desplazar a la izquierda
                for (int j = i; j < cantidad - 1; j++) {
                    listaElecciones[j] = listaElecciones[j + 1];
                }
                listaElecciones[cantidad - 1] = null;
                cantidad--;
                System.out.println("Elección eliminada correctamente.");
                return;
            }
        }
        System.out.println("Elección no encontrada.");
    }

    // listar
    public void listarElecciones() {
        System.out.println("=== Lista de elecciones ===");
        if (cantidad == 0) {
            System.out.println("No hay elecciones registradas.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                listaElecciones[i].mostrarInfo();
            }
        }
    }
    
    public void mostrarResultadosElecciones() {
    if (cantidad == 0) {
        System.out.println("No hay elecciones registradas.");
    } else {
        for (int i = 0; i < cantidad; i++) {
            listaElecciones[i].mostrarInfo(); 
        }
    }
}

}

