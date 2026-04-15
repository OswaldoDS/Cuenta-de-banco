package org.generation.model;

public class CuentaBancaria {
    //Atributos
    private Long idCuenta;
    private String cliente;
    private Double saldo;

    //Constructores
    //Clientes nuevos - con saldo inicial en 0
    public CuentaBancaria(Long idCuenta, String cliente) {
        this.idCuenta = idCuenta;
        this.cliente = cliente;
        this.saldo = 0d;
    }

    //Clientes existentes
    public CuentaBancaria(Long idCuenta, String cliente, Double saldo) {
        this.idCuenta = idCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    //Metodos
    public Long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria " +
                "idCuenta: " + idCuenta +
                ", cliente: " + cliente +
                ", saldo: $" + saldo;
    }
}
