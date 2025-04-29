package taller3_creaciondeprogramaspoo;

public class Problema_1_TerrenoBase {
    
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    private double costoTerreno;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void calcularArea() {
        area = ancho * largo;
    }

    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public String toString() {
        return String.format("""
                --- Informacion del Terreno ---
                Ancho: %.2f m
                Largo: %.2f m
                Area: %.2f m²
                Valor por metro cuadrado: $%.2f
                Costo total del terreno: $%.2f
                """, ancho, largo, area, valorMetroCuadrado, costoTerreno);
    }
}


