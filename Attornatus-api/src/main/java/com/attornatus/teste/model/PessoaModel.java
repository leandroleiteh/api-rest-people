package com.attornatus.teste.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_PESSOA")
public class PessoaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String dataNascimento;
	@Column(nullable = false, length = 70)
	private String endereco;
	@Column(nullable = false, length = 10)
	private String numeroCasa;
	@Column(nullable = false, length = 8)
	private String cep;
	@Column(nullable = false, length = 30)
	private String cidade;

}
