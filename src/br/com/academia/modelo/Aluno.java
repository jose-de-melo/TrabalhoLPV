package br.com.academia.modelo;

public class Aluno {
	private long id;
	private String nome, cpf, whattsapp, sexo, altura, peso,email;
	private Data dataNascimento;
	
	public Aluno() {
	}

	public Aluno(String nome, String cpf, String whattsapp, String sexo, String altura, String peso, String email, Data dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.whattsapp = whattsapp;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getWhattsapp() {
		return whattsapp;
	}

	public void setWhattsapp(String whattsapp) {
		this.whattsapp = whattsapp;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", nome, email);
	}
}