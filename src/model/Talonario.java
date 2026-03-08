package model;

public class Talonario {

    private int numero;
    private String estudiante;
    private String concepto;
    private double monto;

    public Talonario(int numero, String estudiante, String concepto, double monto) {
        this.numero = numero;
        this.estudiante = estudiante;
        this.concepto = concepto;
        this.monto = monto;
    }

    public void mostrar() {
        System.out.println("----- TALONARIO UFG -----");
        System.out.println("Numero: " + numero);
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Concepto: " + concepto);
        System.out.println("Monto: $" + monto);
        System.out.println("-------------------------");
    }

}