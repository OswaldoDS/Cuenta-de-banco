package org.generation.excepciones;

public class SaldoInsuficienteException extends Exception{
    // -- Excepción personalizada

    // -- Constructor
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
