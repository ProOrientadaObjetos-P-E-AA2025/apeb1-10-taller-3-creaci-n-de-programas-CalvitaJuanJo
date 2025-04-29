
package taller3_problema2;

public class Problema_2_EquivalenteHoraBase {
    
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public Problema_2_EquivalenteHoraBase(int horas) {
        this.horas = horas;
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24.0;
    }

    public String toString() {
        return String.format("""
                - Conversion del Tiempo -
                Horas: %d
                Minutos: %d
                Segundos: %d
                Días: %.2f
                """, horas, minutos, segundos, dias);
    }
}

