package org.generation.model;

public class BancoMain {
    public static void main(String[] args) {
        //Instanciar objetos
        //Clientes nuevos
        CuentaBancaria leilani = new CuentaBancaria(56834L, "Lei López");
        CuentaBancaria gigi = new CuentaBancaria(6666L, "Gigi Zuñiga");
        CuentaBancaria miguel = new CuentaBancaria(68731L,"Migue Castro");

        //Clientes existentes
        CuentaBancaria antonio = new CuentaBancaria(22235L,"Antonio Martínez",122000d);
        CuentaBancaria eduardo = new CuentaBancaria(72852L,"Eduardo Villedas",120d);
        CuentaBancaria anaid = new CuentaBancaria(123456L,"Anaid González (Mtra. Miel)",1000000d);

        //Imprimir datos
        System.out.println(miguel);
        System.out.println(gigi);
        System.out.println(leilani);
        System.out.println();
        System.out.println(antonio);
        System.out.println(eduardo);
        System.out.println(anaid);

        //Probar metodos
    }
}
