package S05_04JoseCama;

public class cuentaB_04 {
    public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad no válida para depósito.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad no válida para retiro o saldo insuficiente.");
        }
    }
}
}
