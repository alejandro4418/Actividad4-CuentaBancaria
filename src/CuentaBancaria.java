public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInfo(){
        System.out.println("Titular: "+ nombreTitular);
        System.out.println("Saldo: $"+ saldo);
    }

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito exitoso. Saldo Actual: $: "+ saldo);
        } else {
            System.out.println("Monto invalido");
        }
    }

    public void retirar(double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo Actual: $: "+ saldo);
        } else {
            System.out.println("Monto invalido");
        }
    }
}
