package br.com.marcos.bellotti.pw3hasfood.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.marcos.bellotti.pw3hasfood.enums.DiaSemanaEnum;
import lombok.Getter;
import lombok.Setter;
	
	@Getter
	@Setter
	@Entity
	@Table(name="TBL_HORARIO_FUNCIONAMENTO")
	public class HorarioFuncionamento {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="ID_HORARIO")
		private Long id;
		
		@Enumerated(EnumType.STRING)
		@Column(name="TX_DIA_SEMANA")
		private DiaSemanaEnum segunda;
		
		@Column(name="HR_ABERTURA")
		private LocalTime abertura;
		
		@Column(name="HR_FECHAMENTO")
		private LocalTime fechamento;
		
		@ManyToOne
		@JoinColumn(name="ID_RESTAURANTE")
		private Restaurante restaurante;
	}
