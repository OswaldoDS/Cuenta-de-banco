# Arquitectura Desacoplada para un Banco

Este proyecto permite realizar operaciones bancarias básicas.

## Requerimientos
1. Trabajar con el paradigma de POO.
2. Definir y manejar Excepciones.
3. Organizar el proyecto en Packages.
4. Los clientes nuevos tienen un saldo inicial de $0.00
5. Los clientes existentes tienen un saldo previo.
6. Las operaciones son:
   - Consultar saldo.
   - Retirar dinero (si el saldo es suficiente).
   - Depositar dinero.

---
**Organización de Packages**
1. *model*: `CuentaBancaria.java` y `BancoMain`.
2. *service*: `CuentaBancariaService.java`.
3. *excepciones*: `SaldoInsuficienteException.java`.