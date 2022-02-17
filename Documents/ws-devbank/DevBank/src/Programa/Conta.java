package Programa;

public abstract class Conta implements IConta {
	private static  int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		}
	
	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo-=valor;
		} else {
			System.out.println("Operação Impossível");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo+=valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
			if(this.saldo >= valor) {
				this.sacar(valor);
				contaDestino.depositar(valor);
				}else {
			System.out.println("Sua conta não tem fundos suficiente");}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
