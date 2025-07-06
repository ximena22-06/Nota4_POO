package modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operador operador = new Operador("admin", "1234");

        String usuario;
        String clave;
        int opcion = -1;

        String nombre;
        String sigla;
        String logo;
        String representante;
        String nombreEliminar;
        String nombreModificar;

        PartidoPolitico[] partidos = new PartidoPolitico[10];
        int cantidad = 0;

        System.out.print("Ingrese usuario:\t");
        usuario = sc.nextLine();

        System.out.print("Ingrese contraseña:\t");
        clave = sc.nextLine();

        if (!operador.autenticar(usuario, clave)) {
            System.out.println("Acceso denegado.");
            return;
        }

        System.out.println("Acceso permitido.");

        while (opcion != 0) {
            System.out.println("\t--- MENÚ DE PARTIDOS ---");
            System.out.println("\t1. Agregar partido");
            System.out.println("\t2. Eliminar partido");
            System.out.println("\t3. Listar partidos");
            System.out.println("\t4. Modificar partido");
            System.out.println("\t0. Salir");
            System.out.print("Seleccione una opción:\t");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar salto de línea pendiente
            } else {
                sc.nextLine(); // limpiar entrada inválida
                System.out.println("Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    if (cantidad < partidos.length) {
                        System.out.print("Nombre del partido:\t");
                        nombre = sc.nextLine();
                        System.out.print("Sigla:\t");
                        sigla = sc.nextLine();
                        System.out.print("Logo o símbolo:\t");
                        logo = sc.nextLine();
                        System.out.print("Representante legal:\t");
                        representante = sc.nextLine();

                        partidos[cantidad] = new PartidoPolitico(nombre, sigla, logo, representante);
                        partidos[cantidad].registrar(); // llamar método de interfaz
                        cantidad++;
                    } else {
                        System.out.println("No se puede agregar más partidos.");
                    }
                }
                case 2 -> {
                    System.out.print("Nombre del partido a eliminar:\t");
                    nombreEliminar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < cantidad; i++) {
                        if (partidos[i].getNombre().equalsIgnoreCase(nombreEliminar)) {
                            partidos[i].eliminar(); // llamar método de interfaz
                            for (int j = i; j < cantidad - 1; j++) {
                                partidos[j] = partidos[j + 1];
                            }
                            cantidad--;
                            encontrado = true;
                            System.out.println("Partido eliminado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Partido no encontrado.");
                    }
                }
                case 3 -> {
                    if (cantidad == 0) {
                        System.out.println("No hay partidos registrados.");
                    } else {
                        System.out.println("\tPARTIDOS REGISTRADOS:");
                        for (int i = 0; i < cantidad; i++) {
                            partidos[i].mostrar();
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Nombre del partido a modificar:\t");
                    nombreModificar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < cantidad; i++) {
                        if (partidos[i].getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.print("Nuevo nombre:\t");
                            nombre = sc.nextLine();
                            System.out.print("Nueva sigla:\t");
                            sigla = sc.nextLine();
                            System.out.print("Nuevo logo:\t");
                            logo = sc.nextLine();
                            System.out.print("Nuevo representante:\t");
                            representante = sc.nextLine();

                            partidos[i] = new PartidoPolitico(nombre, sigla, logo, representante);
                            partidos[i].modificar(); // llamar método de interfaz
                            encontrado = true;
                            System.out.println("Partido modificado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Partido no encontrado.");
                    }
                }
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        }

        
    }
}
