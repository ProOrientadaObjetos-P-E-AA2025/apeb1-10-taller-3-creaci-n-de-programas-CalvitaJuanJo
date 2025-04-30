package taller3_problema5;

import java.util.Random;

public class Problema_5_EstudianteBase {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private String estado;

    public Problema_5_EstudianteBase(String nombre) {
        Random rand = new Random();
        this.nombre = nombre;
        this.nota1 = 5 + rand.nextDouble() * 5;  
        this.nota2 = 5 + rand.nextDouble() * 5;
        this.nota3 = 5 + rand.nextDouble() * 5;
        this.promedio = (nota1 + nota2 + nota3) / 3;
        this.estado = promedio >= 6.5 ? "Aprobado" : "Reprobado";
    }

    public String toString() {
        return String.format("Estudiante: %s\nNotas: %.2f, %.2f, %.2f\nPromedio: %.2f\nEstado: %s",
                nombre, nota1, nota2, nota3, promedio, estado);
    }
}