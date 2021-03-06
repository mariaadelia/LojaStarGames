package com.generation.starGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Este atributo não pode ser vazio")
	@Size(min = 2,max = 80, message = "Este atributo aceita no mínimo 2 máximo 80 caracteres.")
	private String nome;
	
	@NotNull(message = "Este atributo não pode ser vazio")
	@Size(min = 2,max = 100, message = "Este atributo aceita no mínimo 2 máximo 100 caracteres.")
	private String usuario;
	
	@NotNull(message = "Este atributo não pode ser vazio")
	@Size(min = 2,max = 100, message = "Este atributo aceita no mínimo 2 máximo 100 caracteres.")
	private String senha;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
