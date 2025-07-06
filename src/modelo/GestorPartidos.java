package modelo;

public class GestorPartidos{

    private PartidoPolitico[] listaPartidos;
    private int cantidad;

    // constructor
    public GestorPartidos(int capacidad) {
        listaPartidos = new PartidoPolitico[capacidad];
        cantidad = 0;
    }

    // registrar
    public void registrarPartido(PartidoPolitico p) {
        if (cantidad < listaPartidos.length) {
            listaPartidos[cantidad] = p;
            cantidad++;
            System.out.println("Partido registrado: " + p.getNombre());
        } else {
            System.out.println("No se puede registrar. Lista llena.");
        }
    }

    // modificar
    public void modificarPartido(String nombreBuscar, String nuevoNombre, String nuevaSigla,
                                 String nuevoLogo, String nuevoRepresentante) {
        for (int i = 0; i < cantidad; i++) {
            if (listaPartidos[i].getNombre().equals(nombreBuscar)) {
                listaPartidos[i].setNombre(nuevoNombre);
                listaPartidos[i].setSigla(nuevaSigla);
                listaPartidos[i].setLogo(nuevoLogo);
                listaPartidos[i].setRepresentanteLegal(nuevoRepresentante);
                System.out.println("Partido modificado correctamente.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }

    // Eliminar
    public void eliminarPartido(String nombreBuscar) {
        for (int i = 0; i < cantidad; i++) {
            if (listaPartidos[i].getNombre().equals(nombreBuscar)) {
                // Desplazar a la izquierda
                for (int j = i; j < cantidad - 1; j++) {
                    listaPartidos[j] = listaPartidos[j + 1];
                }
                listaPartidos[cantidad - 1] = null;
                cantidad--;
                System.out.println("Partido eliminado correctamente.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }

    // mostrar
    public void mostrarPartidos() {
        System.out.println("=== Lista de partidos ===");
        if (cantidad == 0) {
            System.out.println("No hay partidos registrados.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                PartidoPolitico p = listaPartidos[i];
                System.out.println("Nombre: " + p.getNombre() +
                                   ", Sigla: " + p.getSigla() +
                                   ", Logo: " + p.getLogo() +
                                   ", Representante Legal: " + p.getRepresentanteLegal());
            }
        }
    }
}
