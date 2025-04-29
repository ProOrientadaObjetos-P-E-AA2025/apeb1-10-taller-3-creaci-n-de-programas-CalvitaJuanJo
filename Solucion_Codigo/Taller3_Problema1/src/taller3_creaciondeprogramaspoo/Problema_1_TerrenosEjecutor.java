package taller3_creaciondeprogramaspoo;

import java.util.Random;

public class Problema_1_TerrenosEjecutor {

    public static void main(String[] args) {
        
        Random random = new Random();
        Problema_1_TerrenoBase terreno = new Problema_1_TerrenoBase();

        terreno.setAncho(10 + random.nextDouble() * 20);      
        terreno.setLargo(15 + random.nextDouble() * 25);          
        terreno.setValorMetroCuadrado(50 + random.nextDouble() * 100); 

        terreno.calcularArea();
        terreno.calcularCostoTerreno();

        System.out.println(terreno.toString());
    }
}
    
    

