package com.generation.starGames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Este campo não pode ser vazio")
	@Size(min = 3, max = 100, message = "O mínimo deste campo é 3 e o máximo é 100 caracteres")
	private String nome;
	
	@NotNull(message = "Este campo não pode ser vazio")
	private BigDecimal preco;
	
	private int idadeIndicativa;
	
	@NotNull(message = "Este campo não pode ser vazio")
	@Size(min = 3, max = 100, message = "O mínimo deste campo é 3 e o máximo é 100 caracteres")
	private String marca;
	
	@NotNull(message = "Este campo não pode ser vazio")
	private int estoque;
	
	private String tipoGame;
	

	//Foreign key 
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	//
	
	//Getters and Setters
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getIdadeIndicativa() {
		return idadeIndicativa;
	}

	public void setIdadeIndicativa(int idadeIndicativa) {
		this.idadeIndicativa = idadeIndicativa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	
	
	public String getTipoGame() {
		return tipoGame;
	}

	public void setTipoGame(String tipoGame) {
		this.tipoGame = tipoGame;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
