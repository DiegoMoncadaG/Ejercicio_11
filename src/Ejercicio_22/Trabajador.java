package Ejercicio_22;

public class Trabajador {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public Trabajador(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String calcularSalarioMensual() {
        double salarioMensual = salarioPorHora * horasTrabajadas;
        if (salarioMensual > 450000) {
            return "Nombre: " + nombre + "\nSalario Mensual: $" + salarioMensual;
        } else {
            return "Nombre: " + nombre;
        }
    }
}
