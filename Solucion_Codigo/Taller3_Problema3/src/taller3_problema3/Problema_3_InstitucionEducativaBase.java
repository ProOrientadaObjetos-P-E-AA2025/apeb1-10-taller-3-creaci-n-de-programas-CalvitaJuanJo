package taller3_problema3;

public class Problema_3_InstitucionEducativaBase {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoPorEstudiante;
    private double presupuesto;

    public Problema_3_InstitucionEducativaBase(String nombre, String tipo, int alumnos, int docentes, int sedes, double gasto) {
        this.nombre = nombre;
        this.tipoInstitucion = tipo;
        this.numeroAlumnos = alumnos;
        this.numeroDocentes = docentes;
        this.numeroSedes = sedes;
        this.gastoPorEstudiante = gasto;
        calcularPresupuesto();
    }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoPorEstudiante;
    }

    public String toString() {
        return String.format("""
                - Institucion Educativa -
                Nombre: %s
                Tipo: %s
                Numero de Alumnos: %d
                Numero de Docentes: %d
                Numero de Sedes: %d
                Gasto por Estudiante: %.2f
                Presupuesto Total: %.2f
                """, nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes, gastoPorEstudiante, presupuesto);
    }
}