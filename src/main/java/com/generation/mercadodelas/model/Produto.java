package com.generation.mercadodelas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 255, message = "Nome deve conter no máximo 255 caracter!" ) 
	private String nome;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 5, max = 1000, message = "Descrição deve conter no mínimo 5 caracter e no máximo 1000 caracter!" )
	private String descricao;
	
	@NotNull(message = "O atributo preço é obrigatório!")
	private double preco;
	
	@NotBlank(message = "O atributo quantidade é obrigatório!")
	private int quantidade;
	
	@NotBlank(message = "O atributo foto é obrigatório!")
	@Size(max = 5000, message = "O link da foto não deve conter mais do que 5000 caracteres!")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
	
	
	

}
