package objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entidades.Agencia;
import entidades.Cliente;
import entidades.Conta;
import entidades.Endereco;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader scan =  new BufferedReader(in);
		
	
		Endereco en1 = new Endereco("Rua João", "Travessa do Rato",57, "Bonsucesso", "Olinda", "Pernambuco", "53240-030");
		Endereco en2 = new Endereco("Rua João", "Travessa do Rato",100, "Bonsucesso", "Olinda", "Pernambuco", "53240-030");
		Agencia ag1 = new Agencia("Agencia Olinda", "3438-7964", en2);
		Cliente cl1 = new Cliente("Yuri", "078.456.421-64", en1);
		Cliente cl2 = new Cliente("Ewerton", "645.456.456-79", en1);
		Conta conta1 = new Conta(1,cl1,ag1,500.65);
		Conta conta2 = new Conta(2,cl2,ag1,1000.65);
	
		conta1.visualizar(conta1);
		conta2.visualizar(conta2);
		conta1.debitar(50.65,conta1);
		conta2.depositar(99.35,conta2);
		conta1.transferir(100, conta1, conta2);
		conta2.transferir(800, conta2, conta1);
		conta1.visualizar(conta1);
		conta2.visualizar(conta2);
		
	}


}
