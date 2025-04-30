package taller3_problema7;

public class Problema_7_AutomotorBase {
    
    private String cedulaDueño;
    private String marca;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema_7_AutomotorBase(String cedula, String marca, int año, double valor) {
        this.cedulaDueño = cedula;
        this.marca = marca;
        this.añoFabricacion = año;
        this.valorVehiculo = valor;

        int antiguedad = 2025 - añoFabricacion;
        this.valorMatricula = valor * 0.00002 * antiguedad;
    }

    public String toString() {
        return String.format("Dueno: %s\nMarca: %s\nAno: %d\nValor: %.2f\nMatricula: %.2f",
                cedulaDueño, marca, añoFabricacion, valorVehiculo, valorMatricula);
    }
}