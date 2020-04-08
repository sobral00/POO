package entidades;

public class Agencia {
	
	private String nome, tel;
	private Endereco end;
	
	public Agencia() {
		
	}
	
	public Agencia(String nome, String tel, Endereco end) {
		super();
		this.nome = nome;
		this.tel = tel;
		this.end = end;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	
}
