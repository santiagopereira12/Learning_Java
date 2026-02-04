package Clase3;

public class AccinesCuentaBancaria extends CuentaBancaria{

    public AccinesCuentaBancaria(String titular, double saldo) {
        super(titular, saldo);
    }

    public double depositar(double monto){
        return getSaldo() + monto;
    }

    public double retirar(double monto){
        return getSaldo() - monto;
    }

    public String mostrarSaldo(){
        return "Titular de la Cuenta: "+getTitular()+"\nEl estado de la cuenta es: "+getSaldo();
    }
}
