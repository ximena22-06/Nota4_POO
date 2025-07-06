package modelo;

public class GestorMiembrosMesa {

    //atributos
    private MiembroMesa[] listaMiembros;
    private int cantidad;

    // consturct
    public GestorMiembrosMesa(int maxMiembros) {
        listaMiembros = new MiembroMesa[maxMiembros];
        cantidad = 0;
    }

    // reigstrar
    public void registrarMiembro(MiembroMesa m) {
        if (cantidad < listaMiembros.length) {
            listaMiembros[cantidad] = m;
            cantidad++;
            System.out.println("Miembro registrado: " + m.getNombre() + " " + m.getApellido());
        } else {
            System.out.println("No se puede registrar. Lista de miembros llena.");
        }
    }

    // modificar buscando nombre apellido
    public void modificarMiembro(String nombreBuscar, String apellidoBuscar, String nuevoNombre, String nuevoApellido, String nuevoTipo) {
        for (int i = 0; i < cantidad; i++) {
            if (listaMiembros[i].getNombre().equals(nombreBuscar) && listaMiembros[i].getApellido().equals(apellidoBuscar)) {
                listaMiembros[i].setNombre(nuevoNombre);
                listaMiembros[i].setApellido(nuevoApellido);
                listaMiembros[i].setTipo(nuevoTipo);
                System.out.println("Miembro modificado correctamente.");
                return;
            }
        }
        System.out.println("Miembro no encontrado.");
    }

    // eliminar por nombre y apellido
    public void eliminarMiembro(String nombreBuscar, String apellidoBuscar) {
        for (int i = 0; i < cantidad; i++) {
            if (listaMiembros[i].getNombre().equals(nombreBuscar) && listaMiembros[i].getApellido().equals(apellidoBuscar)) {
                // moevr a la izquierda
                for (int j = i; j < cantidad - 1; j++) {
                    listaMiembros[j] = listaMiembros[j + 1];
                }
                listaMiembros[cantidad - 1] = null;
                cantidad--;
                System.out.println("Miembro eliminado correctamente.");
                return;
            }
        }
        System.out.println("Miembro no encontrado.");
    }

    //listar
    public void listarMiembros() {
        System.out.println("=== Lista de miembros de mesa ===");
        if (cantidad == 0) {
            System.out.println("No hay miembros registrados.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                MiembroMesa m = listaMiembros[i];
                System.out.println("Nombre: " + m.getNombre() + " " + m.getApellido() +
                                   ", Tipo: " + m.getTipo());
            }
        }
    }

}

