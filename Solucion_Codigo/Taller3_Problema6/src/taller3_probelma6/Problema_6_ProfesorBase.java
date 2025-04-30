package taller3_probelma6;

public class Problema_6_ProfesorBase {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Problema_6_ProfesorBase(String nom, String ape, double sueldo, String ced) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = sueldo;
        cedula = ced;
        sueldoTotal = sueldo + (sueldo * 0.2);
    }

    public String toString() {
        return String.format("Profesor: %s %s\nCedula: %s\nSueldo Basico: %.2f\nSueldo Total: %.2f",
                nombre, apellido, cedula, sueldoBasico, sueldoTotal);
    }
}

