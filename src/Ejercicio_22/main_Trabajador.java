package Ejercicio_22;

import java.util.Scanner;

public class main_Trabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario basico por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Ingrese el numero de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        Trabajador trabajador = new Trabajador(nombre, salarioPorHora, horasTrabajadas);
        String resultado = trabajador.calcularSalarioMensual();

        System.out.println(resultado);
    }
}

