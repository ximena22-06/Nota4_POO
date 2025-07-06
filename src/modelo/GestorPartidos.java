
package modelo;
import java.util.LinkedList;

public class GestorPartidos {
    // Lista de partidos 
    private LinkedList<PartidoPolitico> listaPartidos;

    // constructor
    public GestorPartidos() {
        listaPartidos = new LinkedList<>();
    }

    // metodo registrar
    public void registrarPartido(PartidoPolitico p) {
        listaPartidos.add(p);
        System.out.println("Partido registrado: " + p.getNombre());
    }

    // metodo modificar
    public void modificarPartido(String nombreBuscar, String nuevoNombre, String nuevaSigla,
                                 String nuevoLogo, String nuevoRepresentante) {
        for (PartidoPolitico p : listaPartidos) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
                p.setNombre(nuevoNombre);
                p.setSigla(nuevaSigla);
                p.setLogo(nuevoLogo);
                p.setRepresentantelegal(nuevoRepresentante);
                System.out.println("Partido modificado correctamente.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }

    //metodo eliminar
    public void eliminarPartido(String nombreBuscar) {
        for (PartidoPolitico p : listaPartidos) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
                listaPartidos.remove(p);
                System.out.println("Partido eliminado correctamente.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }

// mostrar lista
    public void listarPartidos() {
        System.out.println("==== Lista de partidos ====");
        if (listaPartidos.isEmpty()) {
            System.out.println("No hay partidos registrados.");
        } else {
            for (PartidoPolitico p : listaPartidos) {
                System.out.println("Nombre: " + p.getNombre() +
                                   ", Sigla: " + p.getSigla() +
                                   ", Logo: " + p.getLogo() +
                                   ", Representante Legal: " + p.getRepresentantelegal());
            }
        }
    }

    
    
}
