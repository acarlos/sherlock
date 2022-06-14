package br.com.odvox.sherlock.model;

import java.io.Serializable;

public class Resposta implements Serializable {

	/**
	 * SERIAL.
	 */
	private static final long serialVersionUID = 5117826556693798869L;

	private String sentenca = "";

	private String sentencaSemAcento = "";

	private String sentencaAcronimo = "";

	private String sentencaReduzida = "";

	private String sentencaPlural = "";

	private String sentencaCompleta = "";

	private String sentencaNumerica = "";
	
	private String sentencaNegativa = "";

	private String sentencaSimilar = "";

	private String sentencaSimilarDois = "";

	private String sentencaSimilarTres = "";

	private String sentencaSimilarQuatro = "";

	private String sentencaSimilarCinco = "";

	private String sentencaOrdemInversa = "";

	private String sentencaOrdemInversaSemAcento = "";

	public String getSentenca() {

		return this.sentenca;
	}

	public void setSentenca(String sentenca) {

		this.sentenca = sentenca;
	}

	public String getSentencaSemAcento() {

		return this.sentencaSemAcento;
	}

	public void setSentencaSemAcento(String sentencaSemAcento) {

		this.sentencaSemAcento = sentencaSemAcento;
	}

	public String getSentencaAcronimo() {

		return this.sentencaAcronimo;
	}

	public void setSentencaAcronimo(String sentencaAcronimo) {

		this.sentencaAcronimo = sentencaAcronimo;
	}

	public String getSentencaReduzida() {

		return this.sentencaReduzida;
	}

	public void setSentencaReduzida(String sentencaReduzida) {

		this.sentencaReduzida = sentencaReduzida;
	}

	/**
	 * @return the sentencaPlural
	 */
	public String getSentencaPlural() {

		return this.sentencaPlural;
	}

	/**
	 * @param sentencaPlural
	 *            the sentencaPlural to set
	 */
	public void setSentencaPlural(String sentencaPlural) {

		this.sentencaPlural = sentencaPlural;
	}

	public String getSentencaCompleta() {

		return this.sentencaCompleta;
	}

	public void setSentencaCompleta(String sentencaCompleta) {

		this.sentencaCompleta = sentencaCompleta;
	}

	public String getSentencaNumerica() {

		return this.sentencaNumerica;
	}

	public void setSentencaNumerica(String sentencaNumerica) {

		this.sentencaNumerica = sentencaNumerica;
	}
	
	public String getSentencaNegativa() {
		return sentencaNegativa;
	}

	public void setSentencaNegativa(String sentencaNegativa) {
		this.sentencaNegativa = sentencaNegativa;
	}

	public String getSentencaSimilar() {

		return this.sentencaSimilar;
	}

	public void setSentencaSimilar(String sentencaSimilar) {

		this.sentencaSimilar = sentencaSimilar;
	}

	public String getSentencaSimilarDois() {

		return this.sentencaSimilarDois;
	}

	public void setSentencaSimilarDois(String sentencaSimilarDois) {

		this.sentencaSimilarDois = sentencaSimilarDois;
	}

	/**
	 * @return the sentencaSimilarTres
	 */
	public String getSentencaSimilarTres() {

		return this.sentencaSimilarTres;
	}

	/**
	 * @param sentencaSimilarTres
	 *            the sentencaSimilarTres to set
	 */
	public void setSentencaSimilarTres(String sentencaSimilarTres) {

		this.sentencaSimilarTres = sentencaSimilarTres;
	}

	/**
	 * @return the sentencaSimilarQuatro
	 */
	public String getSentencaSimilarQuatro() {

		return this.sentencaSimilarQuatro;
	}

	/**
	 * @param sentencaSimilarQuatro
	 *            the sentencaSimilarQuatro to set
	 */
	public void setSentencaSimilarQuatro(String sentencaSimilarQuatro) {

		this.sentencaSimilarQuatro = sentencaSimilarQuatro;
	}

	/**
	 * @return the sentencaSimilarCinco
	 */
	public String getSentencaSimilarCinco() {

		return this.sentencaSimilarCinco;
	}

	/**
	 * @param sentencaSimilarCinco
	 *            the sentencaSimilarCinco to set
	 */
	public void setSentencaSimilarCinco(String sentencaSimilarCinco) {

		this.sentencaSimilarCinco = sentencaSimilarCinco;
	}

	/**
	 * @return the sentencaOrdemInversa
	 */
	public String getSentencaOrdemInversa() {

		return this.sentencaOrdemInversa;
	}

	/**
	 * @param sentencaOrdemInversa
	 *            the sentencaOrdemInversa to set
	 */
	public void setSentencaOrdemInversa(String sentencaOrdemInversa) {

		this.sentencaOrdemInversa = sentencaOrdemInversa;
	}

	/**
	 * @return the sentencaOrdemInversaSemAcento
	 */
	public String getSentencaOrdemInversaSemAcento() {

		return this.sentencaOrdemInversaSemAcento;
	}

	/**
	 * @param sentencaOrdemInversaSemAcento
	 *            the sentencaOrdemInversaSemAcento to set
	 */
	public void setSentencaOrdemInversaSemAcento(String sentencaOrdemInversaSemAcento) {

		this.sentencaOrdemInversaSemAcento = sentencaOrdemInversaSemAcento;
	}

}
