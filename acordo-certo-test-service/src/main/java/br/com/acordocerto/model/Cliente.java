package br.com.acordocerto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cliente {

	public Cliente() {}
	
	public Cliente(String email, String primeiroNome, String sobrenome, 
			String dataNascimento, String perfil, boolean status) {
		this.email = email;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.perfil = perfil;
		this.status = status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(max=100)
	private String email;
	
	private String perfil;
	
	private boolean status;

	@NotNull
	private String primeiroNome;
	
	@NotNull
	private String sobrenome;
	
	@NotNull(message = "Data é uma informação obrigatória.")
	private String dataNascimento;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
