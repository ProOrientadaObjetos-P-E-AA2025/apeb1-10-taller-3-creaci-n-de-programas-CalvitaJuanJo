package taller3_problema8;

import java.util.Random;

public class Problema_8_ChequeBase {
    
    private String cliente;
    private String banco;
    private double valorCheque;
    private double comisionBanco;

    public Problema_8_ChequeBase(String cliente, String banco) {
        Random rand = new Random();
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = 100 + rand.nextDouble() * 10000;  // entre 100 y 10100
        this.comisionBanco = valorCheque * 0.00003;
    }

    public String toString() {
        return String.format("Cliente: %s\nBanco: %s\nValor del Cheque: %.2f\nComision del Banco: %.5f",
                cliente, banco, valorCheque, comisionBanco);
    }
}