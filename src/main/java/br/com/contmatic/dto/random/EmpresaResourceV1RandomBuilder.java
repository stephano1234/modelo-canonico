package br.com.contmatic.dto.random;

import static br.com.contmatic.testes.utilidades.FuncoesRandomicas.cnpjValido;
import static br.com.contmatic.testes.utilidades.FuncoesRandomicas.cpfValido;
import static br.com.contmatic.testes.utilidades.FuncoesRandomicas.emailAleatorio;
import static br.com.contmatic.testes.utilidades.FuncoesRandomicas.generateStringBySizeAndRegex;
import static br.com.contmatic.testes.utilidades.FuncoesRandomicas.generateStringBySizeAndRegexWithSeparator;
import static org.apache.commons.lang3.RandomUtils.nextInt;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.commons.lang3.RandomUtils;
import org.joda.time.LocalDate;

import br.com.contmatic.dto.empresa.v1.CelularResource;
import br.com.contmatic.dto.empresa.v1.ContaBancariaResource;
import br.com.contmatic.dto.empresa.v1.EmailResource;
import br.com.contmatic.dto.empresa.v1.EmpresaResource;
import br.com.contmatic.dto.empresa.v1.EnderecoResource;
import br.com.contmatic.dto.empresa.v1.ResponsavelResource;
import br.com.contmatic.dto.empresa.v1.TelefoneFixoResource;

public class EmpresaResourceV1RandomBuilder {

	private static final int MAX_ELEMENTOS_ARRAY_GERADA = 10;

	private static final int TAMANHO_REGULAR = 100;

	private static final int CEP = 8;

	private static final int MAX_NUMERO_ENDERECO = 6;

	private static final int NUMERO_CELULAR = 9;

	private static final int NUMERO_TELEFONE_FIXO = 8;

	private static final int MAX_NUMERO_CONTA = 12;

	private static final int MAX_NUMERO_AGENCIA = 5;

	private static final int MAX_CODIGO_BANCO = 4;

	private static final String VALIDO_NOME = "[A-ZÁÉÍÓÚÃÕÀÂÊÔÇ&\\-ªº\\.']";

	private static final String VALIDO_COMPLEMENTO = "[A-ZÁÉÍÓÚÃÕÀÂÊÔÇ&\\-\\.)('ªº°,:\\/\\\\]";

	private static final String ESPACO = " ";

	public static final String APENAS_NUMERAL = "[0-9]";

	private static final String[] TIPO_GRAU_INSTRUCAO = { "ANALFABETO", "ATE_5_ANO_INCOMPLETO_ENSINO_FUNDAMENTAL",
			"O_5_ANO_COMPLETO_ENSINO_FUNDAMENTAL", "DO_6_AO_9_ANO_ENSINO_FUNDAMENTAL_INCOMPLETO",
			"ENSINO_FUNDAMENTAL_COMPLETO", "ENSINO_MEDIO_INCOMPLETO", "ENSINO_MEDIO_COMPLETO", "SUPERIOR_INCOMPLETO",
			"SUPERIOR_COMPLETO", "POS_GRADUACAO_ESPECIALIZACAO", "MESTRADO", "DOUTORADO" };

	private static final String[] TIPO_ESTADO_CIVIL = { "SOLTEIRO", "CASADO", "DIVORCIADO", "VIUVO", "OUTROS" };

	private static final String[] TIPO_SEXO = { "MASCULINO", "FEMININO" };

	private static final String[] TIPO_UF = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
			"MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	private static final String[] TIPO_CONTA = { "CONTA_CORRENTE", "CONTA_POUPANCA" };

	private static final String[] TIPO_EMPRESA = { "INDIVIDUAL", "MEI", "EIRELI", "SOCIEDADE", "SOCIEDADE_SIMPLES" };

	private static final String[] TIPO_PORTE_EMPRESA = { "ME", "EPP", "MEDIO", "GRANDE" };

	private static EmpresaResourceV1RandomBuilder instance;

	private EmpresaResourceV1RandomBuilder() {
	}

	public static EmpresaResourceV1RandomBuilder getInstance() {
		if (instance == null) {
			instance = new EmpresaResourceV1RandomBuilder();
		}
		return instance;
	}

	public static void closeBuilder() {
		instance = null;
	}

	public EmpresaResource build() {
		final EmpresaResource empresa = new EmpresaResource();
		empresa.setCnpj(cnpjValido());
		empresa.setRazaoSocial(
				generateStringBySizeAndRegexWithSeparator(nextInt(1, TAMANHO_REGULAR + 1), VALIDO_NOME, ESPACO));
		try {
			empresa.setDataAbertura(DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(LocalDate.now().minusDays(nextInt(1, 10000)).toString()));
		} catch (DatatypeConfigurationException e) {
			empresa.setDataAbertura(null);
		}
		int quantidadeCollection = nextInt(1, MAX_ELEMENTOS_ARRAY_GERADA);
		for (int i = 0; i < quantidadeCollection; i++) {
			ResponsavelResource responsavel = new ResponsavelResource();
			responsavel.setCpf(cpfValido());
			responsavel.setNome(
					generateStringBySizeAndRegexWithSeparator(nextInt(1, TAMANHO_REGULAR + 1), VALIDO_NOME, ESPACO));
			try {
				responsavel.setDataNascimento(DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(LocalDate.now().minusYears(nextInt(1, 30)).toString()));
			} catch (DatatypeConfigurationException e) {
				responsavel.setDataNascimento(null);
			}
			responsavel.setTipoGrauInstrucao(TIPO_GRAU_INSTRUCAO[nextInt(0, TIPO_GRAU_INSTRUCAO.length)]);
			responsavel.setTipoEstadoCivil(TIPO_ESTADO_CIVIL[nextInt(0, TIPO_ESTADO_CIVIL.length)]);
			responsavel.setTipoSexo(TIPO_SEXO[nextInt(0, TIPO_SEXO.length)]);
			empresa.getResponsaveis().add(responsavel);
		}
		quantidadeCollection = nextInt(1, MAX_ELEMENTOS_ARRAY_GERADA);
		for (int i = 0; i < quantidadeCollection; i++) {
			EnderecoResource endereco = new EnderecoResource();
			endereco.setCep(generateStringBySizeAndRegex(CEP, APENAS_NUMERAL));
			endereco.setNumero(RandomUtils.nextInt(0, 2) == 0
					? generateStringBySizeAndRegex(nextInt(1, MAX_NUMERO_ENDERECO + 1), APENAS_NUMERAL)
					: null);
			endereco.setComplemento(RandomUtils.nextInt(0, 2) == 0
					? generateStringBySizeAndRegex(nextInt(1, TAMANHO_REGULAR + 1), VALIDO_COMPLEMENTO)
					: null);
			endereco.setLogradouro(
					generateStringBySizeAndRegexWithSeparator(nextInt(1, TAMANHO_REGULAR + 1), VALIDO_NOME, ESPACO));
			endereco.setBairro(
					generateStringBySizeAndRegexWithSeparator(nextInt(1, TAMANHO_REGULAR + 1), VALIDO_NOME, ESPACO));
			endereco.setCidade(
					generateStringBySizeAndRegexWithSeparator(nextInt(1, TAMANHO_REGULAR + 1), VALIDO_NOME, ESPACO));
			endereco.setTipoUf(TIPO_UF[nextInt(0, TIPO_UF.length)]);
			empresa.getEnderecos().add(endereco);
		}
		quantidadeCollection = nextInt(0, MAX_ELEMENTOS_ARRAY_GERADA);
		for (int i = 0; i < quantidadeCollection; i++) {
			CelularResource celular = new CelularResource();
			celular.setNumero(generateStringBySizeAndRegex(NUMERO_CELULAR, APENAS_NUMERAL));
			empresa.getCelulares().add(celular);
		}
		quantidadeCollection = nextInt(0, MAX_ELEMENTOS_ARRAY_GERADA);
		for (int i = 0; i < quantidadeCollection; i++) {
			TelefoneFixoResource telefoneFixo = new TelefoneFixoResource();
			telefoneFixo.setNumero(generateStringBySizeAndRegex(NUMERO_TELEFONE_FIXO, APENAS_NUMERAL));
			empresa.getTelefonesFixos().add(telefoneFixo);
		}
		quantidadeCollection = nextInt(0, MAX_ELEMENTOS_ARRAY_GERADA);
		for (int i = 0; i < quantidadeCollection; i++) {
			EmailResource email = new EmailResource();
			email.setEndereco(emailAleatorio());
			empresa.getEmails().add(email);
		}
		quantidadeCollection = nextInt(0, MAX_ELEMENTOS_ARRAY_GERADA);
		for (int i = 0; i < quantidadeCollection; i++) {
			ContaBancariaResource contaBancaria = new ContaBancariaResource();
			contaBancaria.setNumero(generateStringBySizeAndRegex(nextInt(1, MAX_NUMERO_CONTA + 1), APENAS_NUMERAL));
			contaBancaria
					.setNumeroAgencia(generateStringBySizeAndRegex(nextInt(1, MAX_NUMERO_AGENCIA + 1), APENAS_NUMERAL));
			contaBancaria
					.setCodigoBanco(generateStringBySizeAndRegex(nextInt(1, MAX_CODIGO_BANCO + 1), APENAS_NUMERAL));
			contaBancaria.setTipoContaBancaria(TIPO_CONTA[nextInt(0, TIPO_CONTA.length)]);
			empresa.getContasBancarias().add(contaBancaria);
		}
		empresa.setTipoEmpresa(TIPO_EMPRESA[nextInt(0, TIPO_EMPRESA.length)]);
		empresa.setTipoPorteEmpresa(TIPO_PORTE_EMPRESA[nextInt(0, TIPO_PORTE_EMPRESA.length)]);
		return empresa;
	}

}
