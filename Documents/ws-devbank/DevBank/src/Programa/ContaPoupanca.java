package Programa;

public class ContaPoupanca extends Conta{
	@Override
	public String toString() {
		return "Conta Poupança agencia=" + agencia + ",  numero=" + numero + ", saldo=" + saldo + "";
	}
}
