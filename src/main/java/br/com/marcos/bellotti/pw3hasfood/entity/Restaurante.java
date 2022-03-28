package br.com.marcos.bellotti.pw3hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

	@Getter
	@Setter
	@Entity
	@Table(name="TBL_RESTAURANTE")
	public class Restaurante {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="ID_RESTAURANTE")
		private Long id;
		
		@Column(name="TX_CNPJ")
		private String cnpj;
		
		@Column(name="TX_NOME")
		private String nome;
		
		@Column(name="TX_DESCRICAO")
		private String descricao;
		
		@Column(name="DT_APROVACAO")
		private LocalDate aprovacao;
		
		@Column(name="VLR_ENTREGA")
		private Double entrega;
		
		@Column(name="NR_TEMPO_MIN_ENTREGA")
		private int minimo;
		
		@Column(name="NR_TEMPO_MAX_ENTREGA")
		private int maximo;
		
		@ManyToOne
		@JoinColumn(name="ID_TIPO_COZINHA")
		private TipoCozinha cozinha;
		
	}

