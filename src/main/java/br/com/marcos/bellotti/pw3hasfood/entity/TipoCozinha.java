package br.com.marcos.bellotti.pw3hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

public class TipoCozinha {
	
	@Getter
	@Setter
	@Entity
	@Table(name="TBL_TIPO_COZINHA")
	public class Viagem {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="ID_TIPO_COZINHA")
		private Long id;
		
		@Column(name="TX_NOME")
		private String nome;
		
		@Column(name="DT_EXCLUSAO")
		private LocalDate exclusao;
		
	}

}
