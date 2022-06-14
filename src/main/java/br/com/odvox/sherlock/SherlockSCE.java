package br.com.odvox.sherlock;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

import br.com.odvox.sherlock.model.Pergunta;
import br.com.odvox.sherlock.model.Resposta;

public class SherlockSCE extends SherlockMain {

	/**
	 * SERIAL.
	 */
	private static final long serialVersionUID = 5817695888772299098L;
	Locale locale;
	ResourceBundle rb;

	public static void main(String[] args) throws Exception {

		SherlockSCE sherlock = new SherlockSCE("pt","BR");

		Scanner sc = new Scanner(System.in);

		SherlockSCE.play(sherlock, sherlock.perguntasDoN1, sherlock.primeiraNivel1,
						sherlock.segundaNivel1, sherlock.terceiraNivel1, sc);
		sc.close();
	}
	
	public SherlockSCE(String idioma, String pais) {
		super(idioma, pais);
	}
	
	@Override
	public void configurarSherlock(String idioma, String pais) {
		carregarPerguntas(idioma, pais);

		carregarListaN1(perguntasDoN1);

		Random random = new Random();

		primeiraNivel1 = random.nextInt(13);
		segundaNivel1 = random.nextInt(13);
		terceiraNivel1 = random.nextInt(13);
		quartaNivel1 = random.nextInt(13);
		quintaNivel1 = random.nextInt(13);

		primeiraNivel1 = getRandomSafe(primeiraNivel1, segundaNivel1,
						terceiraNivel1, quartaNivel1, quintaNivel1, 1);
		segundaNivel1 = getRandomSafe(primeiraNivel1, segundaNivel1,
						terceiraNivel1, quartaNivel1, quintaNivel1, 2);
		terceiraNivel1 = getRandomSafe(primeiraNivel1, segundaNivel1,
						terceiraNivel1, quartaNivel1, quintaNivel1, 3);
		quartaNivel1 = getRandomSafe(primeiraNivel1, segundaNivel1,
						terceiraNivel1, quartaNivel1, quintaNivel1, 4);
		quintaNivel1 = getRandomSafe(primeiraNivel1, segundaNivel1,
						terceiraNivel1, quartaNivel1, quintaNivel1, 5);
	}
	
	@Override
	public void carregarPerguntas(String idioma, String pais) {
		locale = new Locale(idioma, pais);
		rb = ResourceBundle.getBundle("sherlock", locale);
		super.rb = rb;

		String propertyPrimeiraPergunta = rb.getString("primeiraPergunta");
		String propertyPrimeiraPerguntaSentenca = rb.getString("primeiraPerguntaSentenca");
		String propertyPrimeiraPerguntaSentencaSemAcento = rb.getString("primeiraPerguntaSentencaSemAcento");
		String propertyPrimeiraPerguntaSentencaAcronimo = rb.getString("primeiraPerguntaSentencaAcronimo");
		String propertyPrimeiraPerguntaSentencaReduzida = rb.getString("primeiraPerguntaSentencaReduzida");
		String propertyPrimeiraPerguntaSentencaPlural = rb.getString("primeiraPerguntaSentencaPlural");
		String propertyPrimeiraPerguntaSentencaCompleta = rb.getString("primeiraPerguntaSentencaCompleta");
		String propertyPrimeiraPerguntaSentencaNumerica = rb.getString("primeiraPerguntaSentencaNumerica");
		String propertyPrimeiraPerguntaSentencaNegativa = rb.getString("primeiraPerguntaSentencaNegativa");
		String propertyPrimeiraPerguntaSentencaSimilar = rb.getString("primeiraPerguntaSentencaSimilar");
		String propertyPrimeiraPerguntaSentencaSimilarDois = rb.getString("primeiraPerguntaSentencaSimilarDois");
		String propertyPrimeiraPerguntaSentencaSimilarTres = rb.getString("primeiraPerguntaSentencaSimilarTres");
		String propertyPrimeiraPerguntaSentencaSimilarQuatro = rb.getString("primeiraPerguntaSentencaSimilarQuatro");
		String propertyPrimeiraPerguntaSentencaSimilarCinco = rb.getString("primeiraPerguntaSentencaSimilarCinco");
		String propertyPrimeiraPerguntaSentencaOrdemInversa = rb.getString("primeiraPerguntaSentencaOrdemInversa");
		String propertyPrimeiraPerguntaSentencaOrdemInversaSemAcento = rb.getString("primeiraPerguntaSentencaOrdemInversaSemAcento");
		
		
		String propertySegundaPergunta = rb.getString("segundaPergunta");
		String propertySegundaPerguntaSentenca = rb.getString("segundaPerguntaSentenca");
		String propertySegundaPerguntaSentencaSemAcento = rb.getString("segundaPerguntaSentencaSemAcento");
		String propertySegundaPerguntaSentencaAcronimo = rb.getString("segundaPerguntaSentencaAcronimo");
		String propertySegundaPerguntaSentencaReduzida = rb.getString("segundaPerguntaSentencaReduzida");
		String propertySegundaPerguntaSentencaPlural = rb.getString("segundaPerguntaSentencaPlural");
		String propertySegundaPerguntaSentencaCompleta = rb.getString("segundaPerguntaSentencaCompleta");
		String propertySegundaPerguntaSentencaNumerica = rb.getString("segundaPerguntaSentencaNumerica");
		String propertySegundaPerguntaSentencaNegativa = rb.getString("segundaPerguntaSentencaNegativa");
		String propertySegundaPerguntaSentencaSimilar = rb.getString("segundaPerguntaSentencaSimilar");
		String propertySegundaPerguntaSentencaSimilarDois = rb.getString("segundaPerguntaSentencaSimilarDois");
		String propertySegundaPerguntaSentencaSimilarTres = rb.getString("segundaPerguntaSentencaSimilarTres");
		String propertySegundaPerguntaSentencaSimilarQuatro = rb.getString("segundaPerguntaSentencaSimilarQuatro");
		String propertySegundaPerguntaSentencaSimilarCinco = rb.getString("segundaPerguntaSentencaSimilarCinco");
		String propertySegundaPerguntaSentencaOrdemInversa = rb.getString("segundaPerguntaSentencaOrdemInversa");
		String propertySegundaPerguntaSentencaOrdemInversaSemAcento = rb.getString("segundaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyTerceiraPergunta = rb.getString("terceiraPergunta");
		String propertyTerceiraPerguntaSentenca = rb.getString("terceiraPerguntaSentenca");
		String propertyTerceiraPerguntaSentencaSemAcento = rb.getString("terceiraPerguntaSentencaSemAcento");
		String propertyTerceiraPerguntaSentencaAcronimo = rb.getString("terceiraPerguntaSentencaAcronimo");
		String propertyTerceiraPerguntaSentencaReduzida = rb.getString("terceiraPerguntaSentencaReduzida");
		String propertyTerceiraPerguntaSentencaPlural = rb.getString("terceiraPerguntaSentencaPlural");
		String propertyTerceiraPerguntaSentencaCompleta = rb.getString("terceiraPerguntaSentencaCompleta");
		String propertyTerceiraPerguntaSentencaNumerica = rb.getString("terceiraPerguntaSentencaNumerica");
		String propertyTerceiraPerguntaSentencaNegativa = rb.getString("terceiraPerguntaSentencaNegativa");
		String propertyTerceiraPerguntaSentencaSimilar = rb.getString("terceiraPerguntaSentencaSimilar");
		String propertyTerceiraPerguntaSentencaSimilarDois = rb.getString("terceiraPerguntaSentencaSimilarDois");
		String propertyTerceiraPerguntaSentencaSimilarTres = rb.getString("terceiraPerguntaSentencaSimilarTres");
		String propertyTerceiraPerguntaSentencaSimilarQuatro = rb.getString("terceiraPerguntaSentencaSimilarQuatro");
		String propertyTerceiraPerguntaSentencaSimilarCinco = rb.getString("terceiraPerguntaSentencaSimilarCinco");
		String propertyTerceiraPerguntaSentencaOrdemInversa = rb.getString("terceiraPerguntaSentencaOrdemInversa");
		String propertyTerceiraPerguntaSentencaOrdemInversaSemAcento = rb.getString("terceiraPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyQuartaPergunta = rb.getString("quartaPergunta");
		String propertyQuartaPerguntaSentenca = rb.getString("quartaPerguntaSentenca");
		String propertyQuartaPerguntaSentencaSemAcento = rb.getString("quartaPerguntaSentencaSemAcento");
		String propertyQuartaPerguntaSentencaAcronimo = rb.getString("quartaPerguntaSentencaAcronimo");
		String propertyQuartaPerguntaSentencaReduzida = rb.getString("quartaPerguntaSentencaReduzida");
		String propertyQuartaPerguntaSentencaPlural = rb.getString("quartaPerguntaSentencaPlural");
		String propertyQuartaPerguntaSentencaCompleta = rb.getString("quartaPerguntaSentencaCompleta");
		String propertyQuartaPerguntaSentencaNumerica = rb.getString("quartaPerguntaSentencaNumerica");
		String propertyQuartaPerguntaSentencaNegativa = rb.getString("quartaPerguntaSentencaNegativa");
		String propertyQuartaPerguntaSentencaSimilar = rb.getString("quartaPerguntaSentencaSimilar");
		String propertyQuartaPerguntaSentencaSimilarDois = rb.getString("quartaPerguntaSentencaSimilarDois");
		String propertyQuartaPerguntaSentencaSimilarTres = rb.getString("quartaPerguntaSentencaSimilarTres");
		String propertyQuartaPerguntaSentencaSimilarQuatro = rb.getString("quartaPerguntaSentencaSimilarQuatro");
		String propertyQuartaPerguntaSentencaSimilarCinco = rb.getString("quartaPerguntaSentencaSimilarCinco");
		String propertyQuartaPerguntaSentencaOrdemInversa = rb.getString("quartaPerguntaSentencaOrdemInversa");
		String propertyQuartaPerguntaSentencaOrdemInversaSemAcento = rb.getString("quartaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyQuintaPergunta = rb.getString("quintaPergunta");
		String propertyQuintaPerguntaSentenca = rb.getString("quintaPerguntaSentenca");
		String propertyQuintaPerguntaSentencaSemAcento = rb.getString("quintaPerguntaSentencaSemAcento");
		String propertyQuintaPerguntaSentencaAcronimo = rb.getString("quintaPerguntaSentencaAcronimo");
		String propertyQuintaPerguntaSentencaReduzida = rb.getString("quintaPerguntaSentencaReduzida");
		String propertyQuintaPerguntaSentencaPlural = rb.getString("quintaPerguntaSentencaPlural");
		String propertyQuintaPerguntaSentencaCompleta = rb.getString("quintaPerguntaSentencaCompleta");
		String propertyQuintaPerguntaSentencaNumerica = rb.getString("quintaPerguntaSentencaNumerica");
		String propertyQuintaPerguntaSentencaNegativa = rb.getString("quintaPerguntaSentencaNegativa");
		String propertyQuintaPerguntaSentencaSimilar = rb.getString("quintaPerguntaSentencaSimilar");
		String propertyQuintaPerguntaSentencaSimilarDois = rb.getString("quintaPerguntaSentencaSimilarDois");
		String propertyQuintaPerguntaSentencaSimilarTres = rb.getString("quintaPerguntaSentencaSimilarTres");
		String propertyQuintaPerguntaSentencaSimilarQuatro = rb.getString("quintaPerguntaSentencaSimilarQuatro");
		String propertyQuintaPerguntaSentencaSimilarCinco = rb.getString("quintaPerguntaSentencaSimilarCinco");
		String propertyQuintaPerguntaSentencaOrdemInversa = rb.getString("quintaPerguntaSentencaOrdemInversa");
		String propertyQuintaPerguntaSentencaOrdemInversaSemAcento = rb.getString("quintaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertySextaPergunta = rb.getString("sextaPergunta");
		String propertySextaPerguntaSentenca = rb.getString("sextaPerguntaSentenca");
		String propertySextaPerguntaSentencaSemAcento = rb.getString("sextaPerguntaSentencaSemAcento");
		String propertySextaPerguntaSentencaAcronimo = rb.getString("sextaPerguntaSentencaAcronimo");
		String propertySextaPerguntaSentencaReduzida = rb.getString("sextaPerguntaSentencaReduzida");
		String propertySextaPerguntaSentencaPlural = rb.getString("sextaPerguntaSentencaPlural");
		String propertySextaPerguntaSentencaCompleta = rb.getString("sextaPerguntaSentencaCompleta");
		String propertySextaPerguntaSentencaNumerica = rb.getString("sextaPerguntaSentencaNumerica");
		String propertySextaPerguntaSentencaNegativa = rb.getString("sextaPerguntaSentencaNegativa");
		String propertySextaPerguntaSentencaSimilar = rb.getString("sextaPerguntaSentencaSimilar");
		String propertySextaPerguntaSentencaSimilarDois = rb.getString("sextaPerguntaSentencaSimilarDois");
		String propertySextaPerguntaSentencaSimilarTres = rb.getString("sextaPerguntaSentencaSimilarTres");
		String propertySextaPerguntaSentencaSimilarQuatro = rb.getString("sextaPerguntaSentencaSimilarQuatro");
		String propertySextaPerguntaSentencaSimilarCinco = rb.getString("sextaPerguntaSentencaSimilarCinco");
		String propertySextaPerguntaSentencaOrdemInversa = rb.getString("sextaPerguntaSentencaOrdemInversa");
		String propertySextaPerguntaSentencaOrdemInversaSemAcento = rb.getString("sextaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertySetimaPergunta = rb.getString("setimaPergunta");
		String propertySetimaPerguntaSentenca = rb.getString("setimaPerguntaSentenca");
		String propertySetimaPerguntaSentencaSemAcento = rb.getString("setimaPerguntaSentencaSemAcento");
		String propertySetimaPerguntaSentencaAcronimo = rb.getString("setimaPerguntaSentencaAcronimo");
		String propertySetimaPerguntaSentencaReduzida = rb.getString("setimaPerguntaSentencaReduzida");
		String propertySetimaPerguntaSentencaPlural = rb.getString("setimaPerguntaSentencaPlural");
		String propertySetimaPerguntaSentencaCompleta = rb.getString("setimaPerguntaSentencaCompleta");
		String propertySetimaPerguntaSentencaNumerica = rb.getString("setimaPerguntaSentencaNumerica");
		String propertySetimaPerguntaSentencaNegativa = rb.getString("setimaPerguntaSentencaNegativa");
		String propertySetimaPerguntaSentencaSimilar = rb.getString("setimaPerguntaSentencaSimilar");
		String propertySetimaPerguntaSentencaSimilarDois = rb.getString("setimaPerguntaSentencaSimilarDois");
		String propertySetimaPerguntaSentencaSimilarTres = rb.getString("setimaPerguntaSentencaSimilarTres");
		String propertySetimaPerguntaSentencaSimilarQuatro = rb.getString("setimaPerguntaSentencaSimilarQuatro");
		String propertySetimaPerguntaSentencaSimilarCinco = rb.getString("setimaPerguntaSentencaSimilarCinco");
		String propertySetimaPerguntaSentencaOrdemInversa = rb.getString("setimaPerguntaSentencaOrdemInversa");
		String propertySetimaPerguntaSentencaOrdemInversaSemAcento = rb.getString("setimaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyOitavaPergunta = rb.getString("oitavaPergunta");
		String propertyOitavaPerguntaSentenca = rb.getString("oitavaPerguntaSentenca");
		String propertyOitavaPerguntaSentencaSemAcento = rb.getString("oitavaPerguntaSentencaSemAcento");
		String propertyOitavaPerguntaSentencaAcronimo = rb.getString("oitavaPerguntaSentencaAcronimo");
		String propertyOitavaPerguntaSentencaReduzida = rb.getString("oitavaPerguntaSentencaReduzida");
		String propertyOitavaPerguntaSentencaPlural = rb.getString("oitavaPerguntaSentencaPlural");
		String propertyOitavaPerguntaSentencaCompleta = rb.getString("oitavaPerguntaSentencaCompleta");
		String propertyOitavaPerguntaSentencaNumerica = rb.getString("oitavaPerguntaSentencaNumerica");
		String propertyOitavaPerguntaSentencaNegativa = rb.getString("oitavaPerguntaSentencaNegativa");
		String propertyOitavaPerguntaSentencaSimilar = rb.getString("oitavaPerguntaSentencaSimilar");
		String propertyOitavaPerguntaSentencaSimilarDois = rb.getString("oitavaPerguntaSentencaSimilarDois");
		String propertyOitavaPerguntaSentencaSimilarTres = rb.getString("oitavaPerguntaSentencaSimilarTres");
		String propertyOitavaPerguntaSentencaSimilarQuatro = rb.getString("oitavaPerguntaSentencaSimilarQuatro");
		String propertyOitavaPerguntaSentencaSimilarCinco = rb.getString("oitavaPerguntaSentencaSimilarCinco");
		String propertyOitavaPerguntaSentencaOrdemInversa = rb.getString("oitavaPerguntaSentencaOrdemInversa");
		String propertyOitavaPerguntaSentencaOrdemInversaSemAcento = rb.getString("oitavaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyNonaPergunta = rb.getString("nonaPergunta");
		String propertyNonaPerguntaSentenca = rb.getString("nonaPerguntaSentenca");
		String propertyNonaPerguntaSentencaSemAcento = rb.getString("nonaPerguntaSentencaSemAcento");
		String propertyNonaPerguntaSentencaAcronimo = rb.getString("nonaPerguntaSentencaAcronimo");
		String propertyNonaPerguntaSentencaReduzida = rb.getString("nonaPerguntaSentencaReduzida");
		String propertyNonaPerguntaSentencaPlural = rb.getString("nonaPerguntaSentencaPlural");
		String propertyNonaPerguntaSentencaCompleta = rb.getString("nonaPerguntaSentencaCompleta");
		String propertyNonaPerguntaSentencaNumerica = rb.getString("nonaPerguntaSentencaNumerica");
		String propertyNonaPerguntaSentencaNegativa = rb.getString("nonaPerguntaSentencaNegativa");
		String propertyNonaPerguntaSentencaSimilar = rb.getString("nonaPerguntaSentencaSimilar");
		String propertyNonaPerguntaSentencaSimilarDois = rb.getString("nonaPerguntaSentencaSimilarDois");
		String propertyNonaPerguntaSentencaSimilarTres = rb.getString("nonaPerguntaSentencaSimilarTres");
		String propertyNonaPerguntaSentencaSimilarQuatro = rb.getString("nonaPerguntaSentencaSimilarQuatro");
		String propertyNonaPerguntaSentencaSimilarCinco = rb.getString("nonaPerguntaSentencaSimilarCinco");
		String propertyNonaPerguntaSentencaOrdemInversa = rb.getString("nonaPerguntaSentencaOrdemInversa");
		String propertyNonaPerguntaSentencaOrdemInversaSemAcento = rb.getString("nonaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyDecimaPergunta = rb.getString("decimaPergunta");
		String propertyDecimaPerguntaSentenca = rb.getString("decimaPerguntaSentenca");
		String propertyDecimaPerguntaSentencaSemAcento = rb.getString("decimaPerguntaSentencaSemAcento");
		String propertyDecimaPerguntaSentencaAcronimo = rb.getString("decimaPerguntaSentencaAcronimo");
		String propertyDecimaPerguntaSentencaReduzida = rb.getString("decimaPerguntaSentencaReduzida");
		String propertyDecimaPerguntaSentencaPlural = rb.getString("decimaPerguntaSentencaPlural");
		String propertyDecimaPerguntaSentencaCompleta = rb.getString("decimaPerguntaSentencaCompleta");
		String propertyDecimaPerguntaSentencaNumerica = rb.getString("decimaPerguntaSentencaNumerica");
		String propertyDecimaPerguntaSentencaNegativa = rb.getString("decimaPerguntaSentencaNegativa");
		String propertyDecimaPerguntaSentencaSimilar = rb.getString("decimaPerguntaSentencaSimilar");
		String propertyDecimaPerguntaSentencaSimilarDois = rb.getString("decimaPerguntaSentencaSimilarDois");
		String propertyDecimaPerguntaSentencaSimilarTres = rb.getString("decimaPerguntaSentencaSimilarTres");
		String propertyDecimaPerguntaSentencaSimilarQuatro = rb.getString("decimaPerguntaSentencaSimilarQuatro");
		String propertyDecimaPerguntaSentencaSimilarCinco = rb.getString("decimaPerguntaSentencaSimilarCinco");
		String propertyDecimaPerguntaSentencaOrdemInversa = rb.getString("decimaPerguntaSentencaOrdemInversa");
		String propertyDecimaPerguntaSentencaOrdemInversaSemAcento = rb.getString("decimaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyDecimaPrimeiraPergunta = rb.getString("decimaPrimeiraPergunta");
		String propertyDecimaPrimeiraPerguntaSentenca = rb.getString("decimaPrimeiraPerguntaSentenca");
		String propertyDecimaPrimeiraPerguntaSentencaSemAcento = rb.getString("decimaPrimeiraPerguntaSentencaSemAcento");
		String propertyDecimaPrimeiraPerguntaSentencaAcronimo = rb.getString("decimaPrimeiraPerguntaSentencaAcronimo");
		String propertyDecimaPrimeiraPerguntaSentencaReduzida = rb.getString("decimaPrimeiraPerguntaSentencaReduzida");
		String propertyDecimaPrimeiraPerguntaSentencaPlural = rb.getString("decimaPrimeiraPerguntaSentencaPlural");
		String propertyDecimaPrimeiraPerguntaSentencaCompleta = rb.getString("decimaPrimeiraPerguntaSentencaCompleta");
		String propertyDecimaPrimeiraPerguntaSentencaNumerica = rb.getString("decimaPrimeiraPerguntaSentencaNumerica");
		String propertyDecimaPrimeiraPerguntaSentencaNegativa = rb.getString("decimaPrimeiraPerguntaSentencaNegativa");
		String propertyDecimaPrimeiraPerguntaSentencaSimilar = rb.getString("decimaPrimeiraPerguntaSentencaSimilar");
		String propertyDecimaPrimeiraPerguntaSentencaSimilarDois = rb.getString("decimaPrimeiraPerguntaSentencaSimilarDois");
		String propertyDecimaPrimeiraPerguntaSentencaSimilarTres = rb.getString("decimaPrimeiraPerguntaSentencaSimilarTres");
		String propertyDecimaPrimeiraPerguntaSentencaSimilarQuatro = rb.getString("decimaPrimeiraPerguntaSentencaSimilarQuatro");
		String propertyDecimaPrimeiraPerguntaSentencaSimilarCinco = rb.getString("decimaPrimeiraPerguntaSentencaSimilarCinco");
		String propertyDecimaPrimeiraPerguntaSentencaOrdemInversa = rb.getString("decimaPrimeiraPerguntaSentencaOrdemInversa");
		String propertyDecimaPrimeiraPerguntaSentencaOrdemInversaSemAcento = rb.getString("decimaPrimeiraPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyDecimaSegundaPergunta = rb.getString("decimaSegundaPergunta");
		String propertyDecimaSegundaPerguntaSentenca = rb.getString("decimaSegundaPerguntaSentenca");
		String propertyDecimaSegundaPerguntaSentencaSemAcento = rb.getString("decimaSegundaPerguntaSentencaSemAcento");
		String propertyDecimaSegundaPerguntaSentencaAcronimo = rb.getString("decimaSegundaPerguntaSentencaAcronimo");
		String propertyDecimaSegundaPerguntaSentencaReduzida = rb.getString("decimaSegundaPerguntaSentencaReduzida");
		String propertyDecimaSegundaPerguntaSentencaPlural = rb.getString("decimaSegundaPerguntaSentencaPlural");
		String propertyDecimaSegundaPerguntaSentencaCompleta = rb.getString("decimaSegundaPerguntaSentencaCompleta");
		String propertyDecimaSegundaPerguntaSentencaNumerica = rb.getString("decimaSegundaPerguntaSentencaNumerica");
		String propertyDecimaSegundaPerguntaSentencaNegativa = rb.getString("decimaSegundaPerguntaSentencaNegativa");
		String propertyDecimaSegundaPerguntaSentencaSimilar = rb.getString("decimaSegundaPerguntaSentencaSimilar");
		String propertyDecimaSegundaPerguntaSentencaSimilarDois = rb.getString("decimaSegundaPerguntaSentencaSimilarDois");
		String propertyDecimaSegundaPerguntaSentencaSimilarTres = rb.getString("decimaSegundaPerguntaSentencaSimilarTres");
		String propertyDecimaSegundaPerguntaSentencaSimilarQuatro = rb.getString("decimaSegundaPerguntaSentencaSimilarQuatro");
		String propertyDecimaSegundaPerguntaSentencaSimilarCinco = rb.getString("decimaSegundaPerguntaSentencaSimilarCinco");
		String propertyDecimaSegundaPerguntaSentencaOrdemInversa = rb.getString("decimaSegundaPerguntaSentencaOrdemInversa");
		String propertyDecimaSegundaPerguntaSentencaOrdemInversaSemAcento = rb.getString("decimaSegundaPerguntaSentencaOrdemInversaSemAcento");
		
		String propertyDecimaTerceiraPergunta = rb.getString("decimaTerceiraPergunta");
		String propertyDecimaTerceiraPerguntaSentenca = rb.getString("decimaTerceiraPerguntaSentenca");
		String propertyDecimaTerceiraPerguntaSentencaSemAcento = rb.getString("decimaTerceiraPerguntaSentencaSemAcento");
		String propertyDecimaTerceiraPerguntaSentencaAcronimo = rb.getString("decimaTerceiraPerguntaSentencaAcronimo");
		String propertyDecimaTerceiraPerguntaSentencaReduzida = rb.getString("decimaTerceiraPerguntaSentencaReduzida");
		String propertyDecimaTerceiraPerguntaSentencaPlural = rb.getString("decimaTerceiraPerguntaSentencaPlural");
		String propertyDecimaTerceiraPerguntaSentencaCompleta = rb.getString("decimaTerceiraPerguntaSentencaCompleta");
		String propertyDecimaTerceiraPerguntaSentencaNumerica = rb.getString("decimaTerceiraPerguntaSentencaNumerica");
		String propertyDecimaTerceiraPerguntaSentencaNegativa = rb.getString("decimaTerceiraPerguntaSentencaNegativa");
		String propertyDecimaTerceiraPerguntaSentencaSimilar = rb.getString("decimaTerceiraPerguntaSentencaSimilar");
		String propertyDecimaTerceiraPerguntaSentencaSimilarDois = rb.getString("decimaTerceiraPerguntaSentencaSimilarDois");
		String propertyDecimaTerceiraPerguntaSentencaSimilarTres = rb.getString("decimaTerceiraPerguntaSentencaSimilarTres");
		String propertyDecimaTerceiraPerguntaSentencaSimilarQuatro = rb.getString("decimaTerceiraPerguntaSentencaSimilarQuatro");
		String propertyDecimaTerceiraPerguntaSentencaSimilarCinco = rb.getString("decimaTerceiraPerguntaSentencaSimilarCinco");
		String propertyDecimaTerceiraPerguntaSentencaOrdemInversa = rb.getString("decimaTerceiraPerguntaSentencaOrdemInversa");
		String propertyDecimaTerceiraPerguntaSentencaOrdemInversaSemAcento = rb.getString("decimaTerceiraPerguntaSentencaOrdemInversaSemAcento");

		primeiraPergunta.setNivel(1);
		primeiraPergunta.setResposta(new Resposta());
		primeiraPergunta.setPergunta(propertyPrimeiraPergunta);
		primeiraPergunta.getResposta().setSentenca(propertyPrimeiraPerguntaSentenca);
		primeiraPergunta.getResposta().setSentencaSemAcento(propertyPrimeiraPerguntaSentencaSemAcento);
		primeiraPergunta.getResposta().setSentencaAcronimo(propertyPrimeiraPerguntaSentencaAcronimo);
		primeiraPergunta.getResposta().setSentencaReduzida(propertyPrimeiraPerguntaSentencaReduzida);
		primeiraPergunta.getResposta().setSentencaPlural(propertyPrimeiraPerguntaSentencaPlural);
		primeiraPergunta.getResposta().setSentencaCompleta(propertyPrimeiraPerguntaSentencaCompleta);
		primeiraPergunta.getResposta().setSentencaNumerica(propertyPrimeiraPerguntaSentencaNumerica);
		primeiraPergunta.getResposta().setSentencaNegativa(propertyPrimeiraPerguntaSentencaNegativa);
		primeiraPergunta.getResposta().setSentencaSimilar(propertyPrimeiraPerguntaSentencaSimilar);
		primeiraPergunta.getResposta().setSentencaSimilarDois(propertyPrimeiraPerguntaSentencaSimilarDois);
		primeiraPergunta.getResposta().setSentencaSimilarTres(propertyPrimeiraPerguntaSentencaSimilarTres);
		primeiraPergunta.getResposta().setSentencaSimilarQuatro(propertyPrimeiraPerguntaSentencaSimilarQuatro);
		primeiraPergunta.getResposta().setSentencaSimilarCinco(propertyPrimeiraPerguntaSentencaSimilarCinco);
		primeiraPergunta.getResposta().setSentencaOrdemInversa(propertyPrimeiraPerguntaSentencaOrdemInversa);
		primeiraPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyPrimeiraPerguntaSentencaOrdemInversaSemAcento);

		segundaPergunta.setNivel(1);
		segundaPergunta.setResposta(new Resposta());
		segundaPergunta.setPergunta(propertySegundaPergunta);
		segundaPergunta.getResposta().setSentenca(propertySegundaPerguntaSentenca);
		segundaPergunta.getResposta().setSentencaSemAcento(propertySegundaPerguntaSentencaSemAcento);
		segundaPergunta.getResposta().setSentencaAcronimo(propertySegundaPerguntaSentencaAcronimo);
		segundaPergunta.getResposta().setSentencaReduzida(propertySegundaPerguntaSentencaReduzida);
		segundaPergunta.getResposta().setSentencaPlural(propertySegundaPerguntaSentencaPlural);
		segundaPergunta.getResposta().setSentencaCompleta(propertySegundaPerguntaSentencaCompleta);
		segundaPergunta.getResposta().setSentencaNumerica(propertySegundaPerguntaSentencaNumerica);
		segundaPergunta.getResposta().setSentencaNegativa(propertySegundaPerguntaSentencaNegativa);
		segundaPergunta.getResposta().setSentencaSimilar(propertySegundaPerguntaSentencaSimilar);
		segundaPergunta.getResposta().setSentencaSimilarDois(propertySegundaPerguntaSentencaSimilarDois);
		segundaPergunta.getResposta().setSentencaSimilarTres(propertySegundaPerguntaSentencaSimilarTres);
		segundaPergunta.getResposta().setSentencaSimilarQuatro(propertySegundaPerguntaSentencaSimilarQuatro);
		segundaPergunta.getResposta().setSentencaSimilarCinco(propertySegundaPerguntaSentencaSimilarCinco);
		segundaPergunta.getResposta().setSentencaOrdemInversa(propertySegundaPerguntaSentencaOrdemInversa);
		segundaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertySegundaPerguntaSentencaOrdemInversaSemAcento);

		terceiraPergunta.setNivel(1);
		terceiraPergunta.setResposta(new Resposta());
		terceiraPergunta.setPergunta(propertyTerceiraPergunta);
		terceiraPergunta.getResposta().setSentenca(propertyTerceiraPerguntaSentenca);
		terceiraPergunta.getResposta().setSentencaSemAcento(propertyTerceiraPerguntaSentencaSemAcento);
		terceiraPergunta.getResposta().setSentencaAcronimo(propertyTerceiraPerguntaSentencaAcronimo);
		terceiraPergunta.getResposta().setSentencaReduzida(propertyTerceiraPerguntaSentencaReduzida);
		terceiraPergunta.getResposta().setSentencaPlural(propertyTerceiraPerguntaSentencaPlural);
		terceiraPergunta.getResposta().setSentencaCompleta(propertyTerceiraPerguntaSentencaCompleta);
		terceiraPergunta.getResposta().setSentencaNumerica(propertyTerceiraPerguntaSentencaNumerica);
		terceiraPergunta.getResposta().setSentencaNegativa(propertyTerceiraPerguntaSentencaNegativa);
		terceiraPergunta.getResposta().setSentencaSimilar(propertyTerceiraPerguntaSentencaSimilar);
		terceiraPergunta.getResposta().setSentencaSimilarDois(propertyTerceiraPerguntaSentencaSimilarDois);
		terceiraPergunta.getResposta().setSentencaSimilarTres(propertyTerceiraPerguntaSentencaSimilarTres);
		terceiraPergunta.getResposta().setSentencaSimilarQuatro(propertyTerceiraPerguntaSentencaSimilarQuatro);
		terceiraPergunta.getResposta().setSentencaSimilarCinco(propertyTerceiraPerguntaSentencaSimilarCinco);
		terceiraPergunta.getResposta().setSentencaOrdemInversa(propertyTerceiraPerguntaSentencaOrdemInversa);
		terceiraPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyTerceiraPerguntaSentencaOrdemInversaSemAcento);

		quartaPergunta.setNivel(1);
		quartaPergunta.setResposta(new Resposta());
		quartaPergunta.setPergunta(propertyQuartaPergunta);
		quartaPergunta.getResposta().setSentenca(propertyQuartaPerguntaSentenca);
		quartaPergunta.getResposta().setSentencaSemAcento(propertyQuartaPerguntaSentencaSemAcento);
		quartaPergunta.getResposta().setSentencaAcronimo(propertyQuartaPerguntaSentencaAcronimo);
		quartaPergunta.getResposta().setSentencaReduzida(propertyQuartaPerguntaSentencaReduzida);
		quartaPergunta.getResposta().setSentencaPlural(propertyQuartaPerguntaSentencaPlural);
		quartaPergunta.getResposta().setSentencaCompleta(propertyQuartaPerguntaSentencaCompleta);
		quartaPergunta.getResposta().setSentencaNumerica(propertyQuartaPerguntaSentencaNumerica);
		quartaPergunta.getResposta().setSentencaNegativa(propertyQuartaPerguntaSentencaNegativa);
		quartaPergunta.getResposta().setSentencaSimilar(propertyQuartaPerguntaSentencaSimilar);
		quartaPergunta.getResposta().setSentencaSimilarDois(propertyQuartaPerguntaSentencaSimilarDois);
		quartaPergunta.getResposta().setSentencaSimilarTres(propertyQuartaPerguntaSentencaSimilarTres);
		quartaPergunta.getResposta().setSentencaSimilarQuatro(propertyQuartaPerguntaSentencaSimilarQuatro);
		quartaPergunta.getResposta().setSentencaSimilarCinco(propertyQuartaPerguntaSentencaSimilarCinco);
		quartaPergunta.getResposta().setSentencaOrdemInversa(propertyQuartaPerguntaSentencaOrdemInversa);
		quartaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyQuartaPerguntaSentencaOrdemInversaSemAcento);

		quintaPergunta.setNivel(1);
		quintaPergunta.setResposta(new Resposta());
		quintaPergunta.setPergunta(propertyQuintaPergunta);
		quintaPergunta.getResposta().setSentenca(propertyQuintaPerguntaSentenca);
		quintaPergunta.getResposta().setSentencaSemAcento(propertyQuintaPerguntaSentencaSemAcento);
		quintaPergunta.getResposta().setSentencaAcronimo(propertyQuintaPerguntaSentencaAcronimo);
		quintaPergunta.getResposta().setSentencaReduzida(propertyQuintaPerguntaSentencaReduzida);
		quintaPergunta.getResposta().setSentencaPlural(propertyQuintaPerguntaSentencaPlural);
		quintaPergunta.getResposta().setSentencaCompleta(propertyQuintaPerguntaSentencaCompleta);
		quintaPergunta.getResposta().setSentencaNumerica(propertyQuintaPerguntaSentencaNumerica);
		quintaPergunta.getResposta().setSentencaNegativa(propertyQuintaPerguntaSentencaNegativa);
		quintaPergunta.getResposta().setSentencaSimilar(propertyQuintaPerguntaSentencaSimilar);
		quintaPergunta.getResposta().setSentencaSimilarDois(propertyQuintaPerguntaSentencaSimilarDois);
		quintaPergunta.getResposta().setSentencaSimilarTres(propertyQuintaPerguntaSentencaSimilarTres);
		quintaPergunta.getResposta().setSentencaSimilarQuatro(propertyQuintaPerguntaSentencaSimilarQuatro);
		quintaPergunta.getResposta().setSentencaSimilarCinco(propertyQuintaPerguntaSentencaSimilarCinco);
		quintaPergunta.getResposta().setSentencaOrdemInversa(propertyQuintaPerguntaSentencaOrdemInversa);
		quintaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyQuintaPerguntaSentencaOrdemInversaSemAcento);

		sextaPergunta.setNivel(1);
		sextaPergunta.setResposta(new Resposta());
		sextaPergunta.setPergunta(propertySextaPergunta);
		sextaPergunta.getResposta().setSentenca(propertySextaPerguntaSentenca);
		sextaPergunta.getResposta().setSentencaSemAcento(propertySextaPerguntaSentencaSemAcento);
		sextaPergunta.getResposta().setSentencaAcronimo(propertySextaPerguntaSentencaAcronimo);
		sextaPergunta.getResposta().setSentencaReduzida(propertySextaPerguntaSentencaReduzida);
		sextaPergunta.getResposta().setSentencaPlural(propertySextaPerguntaSentencaPlural);
		sextaPergunta.getResposta().setSentencaCompleta(propertySextaPerguntaSentencaCompleta);
		sextaPergunta.getResposta().setSentencaNumerica(propertySextaPerguntaSentencaNumerica);
		sextaPergunta.getResposta().setSentencaNegativa(propertySextaPerguntaSentencaNegativa);
		sextaPergunta.getResposta().setSentencaSimilar(propertySextaPerguntaSentencaSimilar);
		sextaPergunta.getResposta().setSentencaSimilarDois(propertySextaPerguntaSentencaSimilarDois);
		sextaPergunta.getResposta().setSentencaSimilarTres(propertySextaPerguntaSentencaSimilarTres);
		sextaPergunta.getResposta().setSentencaSimilarQuatro(propertySextaPerguntaSentencaSimilarQuatro);
		sextaPergunta.getResposta().setSentencaSimilarCinco(propertySextaPerguntaSentencaSimilarCinco);
		sextaPergunta.getResposta().setSentencaOrdemInversa(propertySextaPerguntaSentencaOrdemInversa);
		sextaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertySextaPerguntaSentencaOrdemInversaSemAcento);

		setimaPergunta.setNivel(1);
		setimaPergunta.setResposta(new Resposta());
		setimaPergunta.setPergunta(propertySetimaPergunta);
		setimaPergunta.getResposta().setSentenca(propertySetimaPerguntaSentenca);
		setimaPergunta.getResposta().setSentencaSemAcento(propertySetimaPerguntaSentencaSemAcento);
		setimaPergunta.getResposta().setSentencaAcronimo(propertySetimaPerguntaSentencaAcronimo);
		setimaPergunta.getResposta().setSentencaReduzida(propertySetimaPerguntaSentencaReduzida);
		setimaPergunta.getResposta().setSentencaPlural(propertySetimaPerguntaSentencaPlural);
		setimaPergunta.getResposta().setSentencaCompleta(propertySetimaPerguntaSentencaCompleta);
		setimaPergunta.getResposta().setSentencaNumerica(propertySetimaPerguntaSentencaNumerica);
		setimaPergunta.getResposta().setSentencaNegativa(propertySetimaPerguntaSentencaNegativa);
		setimaPergunta.getResposta().setSentencaSimilar(propertySetimaPerguntaSentencaSimilar);
		setimaPergunta.getResposta().setSentencaSimilarDois(propertySetimaPerguntaSentencaSimilarDois);
		setimaPergunta.getResposta().setSentencaSimilarTres(propertySetimaPerguntaSentencaSimilarTres);
		setimaPergunta.getResposta().setSentencaSimilarQuatro(propertySetimaPerguntaSentencaSimilarQuatro);
		setimaPergunta.getResposta().setSentencaSimilarCinco(propertySetimaPerguntaSentencaSimilarCinco);
		setimaPergunta.getResposta().setSentencaOrdemInversa(propertySetimaPerguntaSentencaOrdemInversa);
		setimaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertySetimaPerguntaSentencaOrdemInversaSemAcento);

		oitavaPergunta.setNivel(1);
		oitavaPergunta.setResposta(new Resposta());
		oitavaPergunta.setPergunta(propertyOitavaPergunta);
		oitavaPergunta.getResposta().setSentenca(propertyOitavaPerguntaSentenca);
		oitavaPergunta.getResposta().setSentencaSemAcento(propertyOitavaPerguntaSentencaSemAcento);
		oitavaPergunta.getResposta().setSentencaAcronimo(propertyOitavaPerguntaSentencaAcronimo);
		oitavaPergunta.getResposta().setSentencaReduzida(propertyOitavaPerguntaSentencaReduzida);
		oitavaPergunta.getResposta().setSentencaPlural(propertyOitavaPerguntaSentencaPlural);
		oitavaPergunta.getResposta().setSentencaCompleta(propertyOitavaPerguntaSentencaCompleta);
		oitavaPergunta.getResposta().setSentencaNumerica(propertyOitavaPerguntaSentencaNumerica);
		oitavaPergunta.getResposta().setSentencaNegativa(propertyOitavaPerguntaSentencaNegativa);
		oitavaPergunta.getResposta().setSentencaSimilar(propertyOitavaPerguntaSentencaSimilar);
		oitavaPergunta.getResposta().setSentencaSimilarDois(propertyOitavaPerguntaSentencaSimilarDois);
		oitavaPergunta.getResposta().setSentencaSimilarTres(propertyOitavaPerguntaSentencaSimilarTres);
		oitavaPergunta.getResposta().setSentencaSimilarQuatro(propertyOitavaPerguntaSentencaSimilarQuatro);
		oitavaPergunta.getResposta().setSentencaSimilarCinco(propertyOitavaPerguntaSentencaSimilarCinco);
		oitavaPergunta.getResposta().setSentencaOrdemInversa(propertyOitavaPerguntaSentencaOrdemInversa);
		oitavaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyOitavaPerguntaSentencaOrdemInversaSemAcento);

		nonaPergunta.setNivel(1);
		nonaPergunta.setResposta(new Resposta());
		nonaPergunta.setPergunta(propertyNonaPergunta);
		nonaPergunta.getResposta().setSentenca(propertyNonaPerguntaSentenca);
		nonaPergunta.getResposta().setSentencaSemAcento(propertyNonaPerguntaSentencaSemAcento);
		nonaPergunta.getResposta().setSentencaAcronimo(propertyNonaPerguntaSentencaAcronimo);
		nonaPergunta.getResposta().setSentencaReduzida(propertyNonaPerguntaSentencaReduzida);
		nonaPergunta.getResposta().setSentencaPlural(propertyNonaPerguntaSentencaPlural);
		nonaPergunta.getResposta().setSentencaCompleta(propertyNonaPerguntaSentencaCompleta);
		nonaPergunta.getResposta().setSentencaNumerica(propertyNonaPerguntaSentencaNumerica);
		nonaPergunta.getResposta().setSentencaNegativa(propertyNonaPerguntaSentencaNegativa);
		nonaPergunta.getResposta().setSentencaSimilar(propertyNonaPerguntaSentencaSimilar);
		nonaPergunta.getResposta().setSentencaSimilarDois(propertyNonaPerguntaSentencaSimilarDois);
		nonaPergunta.getResposta().setSentencaSimilarTres(propertyNonaPerguntaSentencaSimilarTres);
		nonaPergunta.getResposta().setSentencaSimilarQuatro(propertyNonaPerguntaSentencaSimilarQuatro);
		nonaPergunta.getResposta().setSentencaSimilarCinco(propertyNonaPerguntaSentencaSimilarCinco);
		nonaPergunta.getResposta().setSentencaOrdemInversa(propertyNonaPerguntaSentencaOrdemInversa);
		nonaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyNonaPerguntaSentencaOrdemInversaSemAcento);

		decimaPergunta.setNivel(1);
		decimaPergunta.setResposta(new Resposta());
		decimaPergunta.setPergunta(propertyDecimaPergunta);
		decimaPergunta.getResposta().setSentenca(propertyDecimaPerguntaSentenca);
		decimaPergunta.getResposta().setSentencaSemAcento(propertyDecimaPerguntaSentencaSemAcento);
		decimaPergunta.getResposta().setSentencaAcronimo(propertyDecimaPerguntaSentencaAcronimo);
		decimaPergunta.getResposta().setSentencaReduzida(propertyDecimaPerguntaSentencaReduzida);
		decimaPergunta.getResposta().setSentencaPlural(propertyDecimaPerguntaSentencaPlural);
		decimaPergunta.getResposta().setSentencaCompleta(propertyDecimaPerguntaSentencaCompleta);
		decimaPergunta.getResposta().setSentencaNumerica(propertyDecimaPerguntaSentencaNumerica);
		decimaPergunta.getResposta().setSentencaNegativa(propertyDecimaPerguntaSentencaNegativa);
		decimaPergunta.getResposta().setSentencaSimilar(propertyDecimaPerguntaSentencaSimilar);
		decimaPergunta.getResposta().setSentencaSimilarDois(propertyDecimaPerguntaSentencaSimilarDois);
		decimaPergunta.getResposta().setSentencaSimilarTres(propertyDecimaPerguntaSentencaSimilarTres);
		decimaPergunta.getResposta().setSentencaSimilarQuatro(propertyDecimaPerguntaSentencaSimilarQuatro);
		decimaPergunta.getResposta().setSentencaSimilarCinco(propertyDecimaPerguntaSentencaSimilarCinco);
		decimaPergunta.getResposta().setSentencaOrdemInversa(propertyDecimaPerguntaSentencaOrdemInversa);
		decimaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyDecimaPerguntaSentencaOrdemInversaSemAcento);

		decimaPrimeiraPergunta.setNivel(1);
		decimaPrimeiraPergunta.setResposta(new Resposta());
		decimaPrimeiraPergunta.setPergunta(propertyDecimaPrimeiraPergunta);
		decimaPrimeiraPergunta.getResposta().setSentenca(propertyDecimaPrimeiraPerguntaSentenca);
		decimaPrimeiraPergunta.getResposta().setSentencaSemAcento(propertyDecimaPrimeiraPerguntaSentencaSemAcento);
		decimaPrimeiraPergunta.getResposta().setSentencaAcronimo(propertyDecimaPrimeiraPerguntaSentencaAcronimo);
		decimaPrimeiraPergunta.getResposta().setSentencaReduzida(propertyDecimaPrimeiraPerguntaSentencaReduzida);
		decimaPrimeiraPergunta.getResposta().setSentencaPlural(propertyDecimaPrimeiraPerguntaSentencaPlural);
		decimaPrimeiraPergunta.getResposta().setSentencaCompleta(propertyDecimaPrimeiraPerguntaSentencaCompleta);
		decimaPrimeiraPergunta.getResposta().setSentencaNumerica(propertyDecimaPrimeiraPerguntaSentencaNumerica);
		decimaPrimeiraPergunta.getResposta().setSentencaNegativa(propertyDecimaPrimeiraPerguntaSentencaNegativa);
		decimaPrimeiraPergunta.getResposta().setSentencaSimilar(propertyDecimaPrimeiraPerguntaSentencaSimilar);
		decimaPrimeiraPergunta.getResposta().setSentencaSimilarDois(propertyDecimaPrimeiraPerguntaSentencaSimilarDois);
		decimaPrimeiraPergunta.getResposta().setSentencaSimilarTres(propertyDecimaPrimeiraPerguntaSentencaSimilarTres);
		decimaPrimeiraPergunta.getResposta().setSentencaSimilarQuatro(propertyDecimaPrimeiraPerguntaSentencaSimilarQuatro);
		decimaPrimeiraPergunta.getResposta().setSentencaSimilarCinco(propertyDecimaPrimeiraPerguntaSentencaSimilarCinco);
		decimaPrimeiraPergunta.getResposta().setSentencaOrdemInversa(propertyDecimaPrimeiraPerguntaSentencaOrdemInversa);
		decimaPrimeiraPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyDecimaPrimeiraPerguntaSentencaOrdemInversaSemAcento);

		decimaSegundaPergunta.setNivel(1);
		decimaSegundaPergunta.setResposta(new Resposta());
		decimaSegundaPergunta.setPergunta(propertyDecimaSegundaPergunta);
		decimaSegundaPergunta.getResposta().setSentenca(propertyDecimaSegundaPerguntaSentenca);
		decimaSegundaPergunta.getResposta().setSentencaSemAcento(propertyDecimaSegundaPerguntaSentencaSemAcento);
		decimaSegundaPergunta.getResposta().setSentencaAcronimo(propertyDecimaSegundaPerguntaSentencaAcronimo);
		decimaSegundaPergunta.getResposta().setSentencaReduzida(propertyDecimaSegundaPerguntaSentencaReduzida);
		decimaSegundaPergunta.getResposta().setSentencaPlural(propertyDecimaSegundaPerguntaSentencaPlural);
		decimaSegundaPergunta.getResposta().setSentencaCompleta(propertyDecimaSegundaPerguntaSentencaCompleta);
		decimaSegundaPergunta.getResposta().setSentencaNumerica(propertyDecimaSegundaPerguntaSentencaNumerica);
		decimaSegundaPergunta.getResposta().setSentencaNegativa(propertyDecimaSegundaPerguntaSentencaNegativa);
		decimaSegundaPergunta.getResposta().setSentencaSimilar(propertyDecimaSegundaPerguntaSentencaSimilar);
		decimaSegundaPergunta.getResposta().setSentencaSimilarDois(propertyDecimaSegundaPerguntaSentencaSimilarDois);
		decimaSegundaPergunta.getResposta().setSentencaSimilarTres(propertyDecimaSegundaPerguntaSentencaSimilarTres);
		decimaSegundaPergunta.getResposta().setSentencaSimilarQuatro(propertyDecimaSegundaPerguntaSentencaSimilarQuatro);
		decimaSegundaPergunta.getResposta().setSentencaSimilarCinco(propertyDecimaSegundaPerguntaSentencaSimilarCinco);
		decimaSegundaPergunta.getResposta().setSentencaOrdemInversa(propertyDecimaSegundaPerguntaSentencaOrdemInversa);
		decimaSegundaPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyDecimaSegundaPerguntaSentencaOrdemInversaSemAcento);

		decimaTerceiraPergunta.setNivel(1);
		decimaTerceiraPergunta.setResposta(new Resposta());
		decimaTerceiraPergunta.setPergunta(propertyDecimaTerceiraPergunta);
		decimaTerceiraPergunta.getResposta().setSentenca(propertyDecimaTerceiraPerguntaSentenca);
		decimaTerceiraPergunta.getResposta().setSentencaSemAcento(propertyDecimaTerceiraPerguntaSentencaSemAcento);
		decimaTerceiraPergunta.getResposta().setSentencaAcronimo(propertyDecimaTerceiraPerguntaSentencaAcronimo);
		decimaTerceiraPergunta.getResposta().setSentencaReduzida(propertyDecimaTerceiraPerguntaSentencaReduzida);
		decimaTerceiraPergunta.getResposta().setSentencaPlural(propertyDecimaTerceiraPerguntaSentencaPlural);
		decimaTerceiraPergunta.getResposta().setSentencaCompleta(propertyDecimaTerceiraPerguntaSentencaCompleta);
		decimaTerceiraPergunta.getResposta().setSentencaNumerica(propertyDecimaTerceiraPerguntaSentencaNumerica);
		decimaTerceiraPergunta.getResposta().setSentencaNegativa(propertyDecimaTerceiraPerguntaSentencaNegativa);
		decimaTerceiraPergunta.getResposta().setSentencaSimilar(propertyDecimaTerceiraPerguntaSentencaSimilar);
		decimaTerceiraPergunta.getResposta().setSentencaSimilarDois(propertyDecimaTerceiraPerguntaSentencaSimilarDois);
		decimaTerceiraPergunta.getResposta().setSentencaSimilarTres(propertyDecimaTerceiraPerguntaSentencaSimilarTres);
		decimaTerceiraPergunta.getResposta().setSentencaSimilarQuatro(propertyDecimaTerceiraPerguntaSentencaSimilarQuatro);
		decimaTerceiraPergunta.getResposta().setSentencaSimilarCinco(propertyDecimaTerceiraPerguntaSentencaSimilarCinco);
		decimaTerceiraPergunta.getResposta().setSentencaOrdemInversa(propertyDecimaTerceiraPerguntaSentencaOrdemInversa);
		decimaTerceiraPergunta.getResposta().setSentencaOrdemInversaSemAcento(propertyDecimaTerceiraPerguntaSentencaOrdemInversaSemAcento);
	}
	
	@Override
	public void carregarListaN1(List<Pergunta> perguntasDoN1) {

		perguntasDoN1.add(primeiraPergunta);
		perguntasDoN1.add(segundaPergunta);
		perguntasDoN1.add(terceiraPergunta);
		perguntasDoN1.add(quartaPergunta);
		perguntasDoN1.add(quintaPergunta);
		perguntasDoN1.add(sextaPergunta);
		perguntasDoN1.add(setimaPergunta);
		perguntasDoN1.add(oitavaPergunta);
		perguntasDoN1.add(nonaPergunta);
		perguntasDoN1.add(decimaPergunta);
		perguntasDoN1.add(decimaPrimeiraPergunta);
		perguntasDoN1.add(decimaSegundaPergunta);
		perguntasDoN1.add(decimaTerceiraPergunta);
		
	}

}
