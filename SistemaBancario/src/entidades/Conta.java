package entidades;

import entidades.Cliente;

public class Conta {

	private int num;
	private Cliente cliente;
	private Agencia agencia;
	private double saldo;
	
	public Conta() {
		
	}
		
	public Conta(int num, Cliente cliente, Agencia agencia, double saldo) {
		super();
		this.num = num;
		this.cliente = cliente;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void visualizar(Conta x) {
		System.out.println("A conta de " + x.cliente.getNome() + " tem " + x.getSaldo() + " Reais");
	}
	
	public void depositar(double valor, Conta x) {
		this.saldo += valor;
		System.out.println("Após depositar R$" + valor + " a conta de " + x.cliente.getNome() + " tem " + x.getSaldo() + " Reais");
	}
	
	public void debitar(double valor, Conta x) {
		this.saldo -= valor;
		System.out.println("Após debitar R$" + valor + " a conta de " + x.cliente.getNome() + " tem " + x.getSaldo() + " Reais");
	}
	
	public void transferir(double valor, Conta x, Conta y) {
		x.debitar(valor, x);	
		y.depositar(valor, y);
		
		System.out.println(x.cliente.getNome() + " transferiu R$" + valor + " para a conta de " + y.cliente.getNome() );
	}
		
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
		
}
