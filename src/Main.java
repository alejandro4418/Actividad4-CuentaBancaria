//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaBancaria c1 = new CuentaBancaria("Alejandro", 56.89);
    c1.mostrarInfo();
    c1.depositar(26.8);
    c1.retirar(14.5);
    c1.mostrarInformacion();
}
