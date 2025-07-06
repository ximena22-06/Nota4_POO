
package modelo;
import java.util.LinkedList;


public class GestorCandidato {
    private LinkedList<Candidato> listaCandidatos;

    // Constructor
    public GestorCandidato() {
        listaCandidatos = new LinkedList<>();
    }

    //reigstrar
    public void registrarCandidato(Candidato c) {
        // Verificar si ya existe un candidato con el mismo DNI
        for (Candidato candidatoExistente : listaCandidatos) {
            if (candidatoExistente.getDni() == c.getDni()) {
                System.out.println("Error: ya existe un candidato con ese DNI.");
                return;
            }
        }

        // Si no existe, agregarlo
        listaCandidatos.add(c);
        System.out.println("Candidato registrado: " + c.getNombre() + " " + c.getApellido());
    }

    // modificar
    public void modificarCandidato(int dniBuscar, String nuevoNombre, String nuevoApellido, PartidoPolitico nuevoPartido) {
        for (Candidato c : listaCandidatos) {
            if (c.getDni() == dniBuscar) {
                c.setNombre(nuevoNombre);
                c.setApellido(nuevoApellido);
                c.setPartido(nuevoPartido);
                System.out.println("Candidato modificado correctamente.");
                return;
            }
        }
        System.out.println("Candidato no encontrado.");
    }

    //eliminar por dni
    public void eliminarCandidato(int dniBuscar) {
        for (Candidato c : listaCandidatos) {
            if (c.getDni() == dniBuscar) {
                listaCandidatos.remove(c);
                System.out.println("Candidato eliminado correctamente.");
                return;
            }
        }
        System.out.println("Candidato no encontrado.");
    }

    // listar
    public void listarCandidatos() {
        System.out.println("==== Lista de candidatos ====");
        if (listaCandidatos.isEmpty()) {
            System.out.println("No hay candidatos registrados.");
        } else {
            for (Candidato c : listaCandidatos) {
                System.out.println("Nombre: " + c.getNombre() + " " + c.getApellido() +
                                   ", DNI: " + c.getDni() +
                                   ", Partido: " + c.getPartido().getNombre());
            }
        }
    }


}
