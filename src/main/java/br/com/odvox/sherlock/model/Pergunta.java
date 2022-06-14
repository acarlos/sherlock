package br.com.odvox.sherlock.model;

import java.io.Serializable;

public class Pergunta implements Serializable {

	/**
	 * SERIAL.
	 */
	private static final long serialVersionUID = -5625001732694903288L;

	private String pergunta;

	private Integer nivel;

	private Resposta resposta;

	public String getPergunta() {

		return this.pergunta;
	}

	public void setPergunta(String pergunta) {

		this.pergunta = pergunta;
	}

	public Integer getNivel() {

		return this.nivel;
	}

	public void setNivel(Integer nivel) {

		this.nivel = nivel;
	}

	public Resposta getResposta() {

		return this.resposta;
	}

	public void setResposta(Resposta resposta) {

		this.resposta = resposta;
	}

}
