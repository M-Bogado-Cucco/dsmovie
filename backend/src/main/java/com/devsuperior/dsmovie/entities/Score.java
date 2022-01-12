package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score { //Score é uma classe de associação
	
	@EmbeddedId
	//chave composta é obrigatório dar o new para garantir que fique instanciado
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public Score() {
	}
	
	//método para informar um filme e associá-lo ao score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	//método para informar um usuário e associá-lo ao score
	public void setUser(User user) {
		id.setUser(user);
	}
	

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
