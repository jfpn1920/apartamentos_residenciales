import java.util.Scanner;
public class apartamentos_residenciales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] numerosApartamentos = new String[10];
        String[] torres = new String[10];
        String[] propietarios = new String[10];
        String[] residentes = new String[10];
        String[] tipos = new String[10];
        String[] habitaciones = new String[10];
        String[] valoresMensuales = new String[10];
        String[] fechasRegistro = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //--------------------------------------------------//
        //--|menu_principal_de_apartamentos_residenciales|--//
        //--------------------------------------------------//
        do {
            System.out.println("menu principal de apartamentos residenciales");
            System.out.println("1) Registrar apartamento");
            System.out.println("2) Editar apartamento");
            System.out.println("3) Listar apartamentos");
            System.out.println("4) Buscar apartamento");
            System.out.println("5) Eliminar apartamento");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //---------------------------//
                //--|registrar_apartamento|--//
                //---------------------------//
                case 1:
                    if (total >= numerosApartamentos.length) {
                        System.out.println("No hay espacio para registrar mas apartamentos.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de apartamento residencial");
                    System.out.println("id del apartamento a registrar: " + id);
                    System.out.print("numero del apartamento: ");
                    numerosApartamentos[total] = entrada.nextLine();
                    System.out.print("torre: ");
                    torres[total] = entrada.nextLine();
                    System.out.print("nombre del propietario: ");
                    propietarios[total] = entrada.nextLine();
                    System.out.print("nombre del residente: ");
                    residentes[total] = entrada.nextLine();
                    System.out.print("tipo de apartamento: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("numero de habitaciones: ");
                    habitaciones[total] = entrada.nextLine();
                    System.out.print("valor mensual: ");
                    valoresMensuales[total] = entrada.nextLine();
                    System.out.print("fecha de registro: ");
                    fechasRegistro[total] = entrada.nextLine();
                    System.out.print("estado del apartamento: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Apartamento registrado correctamente.");
                    total++;
                    break;
                //------------------------//
                //--|editar_apartamento|--//
                //------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen apartamentos registrados.");
                        break;
                    }
                    System.out.println("Datos de los apartamentos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Numero: " + numerosApartamentos[i] + " | Torre: " + torres[i] + " | Propietario: " + propietarios[i] + " | Residente: " + residentes[i] + " | Tipo: " + tipos[i] + " | Habitaciones: " + habitaciones[i] + " | Valor mensual: " + valoresMensuales[i] + " | Fecha: " + fechasRegistro[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del apartamento: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del apartamento");
                        System.out.print("Nuevo numero del apartamento: ");
                        numerosApartamentos[posicion] = entrada.nextLine();
                        System.out.print("Nueva torre: ");
                        torres[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del propietario: ");
                        propietarios[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del residente: ");
                        residentes[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de apartamento: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo numero de habitaciones: ");
                        habitaciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo valor mensual: ");
                        valoresMensuales[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de registro: ");
                        fechasRegistro[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del apartamento: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Apartamento actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|listar_apartamentos|--//
                //-------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen apartamentos registrados.");
                    } else {
                        System.out.println("Lista de apartamentos residenciales");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Numero: " + numerosApartamentos[i] + " | Torre: " + torres[i] + " | Propietario: " + propietarios[i] + " | Residente: " + residentes[i] + " | Tipo: " + tipos[i] + " | Habitaciones: " + habitaciones[i] + " | Valor mensual: " + valoresMensuales[i] + " | Fecha: " + fechasRegistro[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //------------------------//
                //--|buscar_apartamento|--//
                //------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen apartamentos registrados.");
                        break;
                    }
                    System.out.println("busqueda de apartamento");
                    System.out.print("ingresa la id para buscar apartamento: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del apartamento encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Numero: " + numerosApartamentos[posicion] + " | Torre: " + torres[posicion] + " | Propietario: " + propietarios[posicion] + " | Residente: " + residentes[posicion] + " | Tipo: " + tipos[posicion] + " | Habitaciones: " + habitaciones[posicion] + " | Valor mensual: " + valoresMensuales[posicion] + " | Fecha: " + fechasRegistro[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------------//
                //--|eliminar_apartamento|--//
                //--------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen apartamentos registrados.");
                        break;
                    }
                    System.out.println("Datos de los apartamentos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Numero: " + numerosApartamentos[i] + " | Torre: " + torres[i] + " | Propietario: " + propietarios[i] + " | Residente: " + residentes[i] + " | Tipo: " + tipos[i] + " | Habitaciones: " + habitaciones[i] + " | Valor mensual: " + valoresMensuales[i] + " | Fecha: " + fechasRegistro[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del apartamento a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            numerosApartamentos[i] = numerosApartamentos[i + 1];
                            torres[i] = torres[i + 1];
                            propietarios[i] = propietarios[i + 1];
                            residentes[i] = residentes[i + 1];
                            tipos[i] = tipos[i + 1];
                            habitaciones[i] = habitaciones[i + 1];
                            valoresMensuales[i] = valoresMensuales[i + 1];
                            fechasRegistro[i] = fechasRegistro[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Apartamento eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen apartamentos registrados.");
                        break;
                    }
                    int ocupados = 0;
                    int disponibles = 0;
                    int enMantenimiento = 0;
                    int otrosEstados = 0;
                    int totalHabitaciones = 0;
                    double totalValores = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Ocupado")) {
                            ocupados++;
                        } else if (estados[i].equalsIgnoreCase("Disponible")) {
                            disponibles++;
                        } else if (estados[i].equalsIgnoreCase("En mantenimiento")) {
                            enMantenimiento++;
                        } else {
                            otrosEstados++;
                        }
                        totalHabitaciones += Integer.parseInt(habitaciones[i]);
                        totalValores += Double.parseDouble(valoresMensuales[i]);
                    }
                    String torreMayor = torres[0];
                    int cantidadTorreMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTorre = 0;
                        for (int j = 0; j < total; j++) {
                            if (torres[i].equalsIgnoreCase(torres[j])) {
                                cantidadTorre++;
                            }
                        }
                        if (cantidadTorre > cantidadTorreMayor) {
                            cantidadTorreMayor = cantidadTorre;
                            torreMayor = torres[i];
                        }
                    }
                    String tipoMayor = tipos[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tipos[i].equalsIgnoreCase(tipos[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoMayor = tipos[i];
                        }
                    }
                    double promedioValor = totalValores / total;
                    System.out.println("resumen de apartamentos residenciales");
                    System.out.println("Apartamentos registrados: " + total);
                    System.out.println("Torre con mas apartamentos: " + torreMayor);
                    System.out.println("Tipo de apartamento mas registrado: " + tipoMayor);
                    System.out.println("Total de habitaciones: " + totalHabitaciones);
                    System.out.println("Promedio del valor mensual: " + promedioValor);
                    System.out.println("Ocupados: " + ocupados);
                    System.out.println("Disponibles: " + disponibles);
                    System.out.println("En mantenimiento: " + enMantenimiento);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Apartamentos Residenciales.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}