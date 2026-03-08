package main;

import java.util.Scanner;
import model.Talonario;
import service.TalonarioService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TalonarioService service = new TalonarioService();

        int opcion;

        do {

            System.out.println("===== SISTEMA TALONARIO =====");
            System.out.println("1. Crear Talonario");
            System.out.println("2. Mostrar Talonarios");
            System.out.println("3. Salir");

            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {

                case 1:

                    System.out.print("Numero: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Estudiante: ");
                    String estudiante = sc.nextLine();

                    System.out.print("Concepto: ");
                    String concepto = sc.nextLine();

                    System.out.print("Monto: ");
                    double monto = sc.nextDouble();

                    Talonario t = new Talonario(numero, estudiante, concepto, monto);

                    service.guardar(t);

                    System.out.println("Talonario guardado");

                    break;

                case 2:

                    service.mostrarTodos();

                    break;

                case 3:

                    System.out.println("Saliendo del sistema");

                    break;

                default:

                    System.out.println("Opcion incorrecta");

            }

        } while(opcion != 3);

    }

}