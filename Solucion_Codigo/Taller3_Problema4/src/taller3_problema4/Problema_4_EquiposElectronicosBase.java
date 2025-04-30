package taller3_problema4;

public class Problema_4_EquiposElectronicosBase {
    
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCosto;
    private double costoFinal;
    private String direccionMac;
    private String imei;

    public Problema_4_EquiposElectronicosBase(String sistema, double tamaño, double costo, double iva, String mac, String imei) {
        this.sistemaOperativo = sistema;
        this.tamañoPantalla = tamaño;
        this.costoInicial = costo;
        this.ivaPorcentaje = iva;
        this.direccionMac = mac;
        this.imei = imei;
        this.ivaCosto = (costo * iva) / 100;
        this.costoFinal = costo + ivaCosto;
    }

    public String toString() {
        return String.format("""
                SO: %s
                Pantalla: %.2f”
                Costo Inicial: %.2f
                IVA: %.2f%%
                Costo IVA: %.2f
                Costo Final: %.2f
                MAC: %s
                IMEI: %s
                """, sistemaOperativo, tamañoPantalla, costoInicial, ivaPorcentaje, ivaCosto, costoFinal, direccionMac, imei);
    }
}