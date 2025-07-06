package modelo;

public class GestorActas {

    // atributos
    private ActaElectoral[] actas;
    private int cantidad;

    //constructor
    public GestorActas(int tamañoMaximo) {
        actas = new ActaElectoral[tamañoMaximo];
        cantidad = 0;
    }

    //registrar
    public boolean registrarActa(ActaElectoral nueva) {
        if (cantidad < actas.length) {
            actas[cantidad] = nueva;
            cantidad++;
            System.out.println("Acta registrada: " + nueva.getNumeroActa());
            return true;
        } else {
            System.out.println("No se puede registrar. Lista llena.");
            return false;
        }
    }

    //eliminar
    public boolean eliminarActa(String numeroActa) {
        for (int i = 0; i < cantidad; i++) {
            if (actas[i].getNumeroActa().equals(numeroActa)) {
                for (int j = i; j < cantidad - 1; j++) {
                    actas[j] = actas[j + 1];
                }
                actas[cantidad - 1] = null;
                cantidad--;
                System.out.println("Acta eliminada: " + numeroActa);
                return true;
            }
        }
        System.out.println("Acta no encontrada.");
        return false;
    }

    //listar
    public void listarActas() {
        System.out.println("=== Lista de actas ===");
        if (cantidad == 0) {
            System.out.println("No hay actas registradas.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                actas[i].mostrar();
            }
        }
    }

    // buscar
    public ActaElectoral buscarActa(String numeroActa) {
        for (int i = 0; i < cantidad; i++) {
            if (actas[i].getNumeroActa().equals(numeroActa)) {
                return actas[i];
            }
        }
        return null;
    }
}
