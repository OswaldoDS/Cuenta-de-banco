package org.generation.service;

import org.generation.excepciones.SaldoInsuficienteException;
import org.generation.model.CuentaBancaria;

public class CuentaBancariaService {

    //Creación de metodos
    // - Consultar saldo
    public Double consultarSaldo(CuentaBancaria cuentaBancaria) {
        return cuentaBancaria.getSaldo();
    }

    // - Deposito
    public void depositarSaldo(CuentaBancaria cuentaBancaria, Double deposito) {
        Double saldo = cuentaBancaria.getSaldo();
        cuentaBancaria.setSaldo(saldo + deposito);
    }

    // - Retirar dinero
    public void retirarSaldo(CuentaBancaria cuentaBancaria, Double retiro) throws SaldoInsuficienteException{
        try {
            if (retiro > cuentaBancaria.getSaldo()) {
                throw new SaldoInsuficienteException("Saldo Insuficiente...");
            }
            Double saldo = cuentaBancaria.getSaldo() - retiro;
            cuentaBancaria.setSaldo(saldo);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }


}
