package com.br.packageObjectMobile;

import constants.Globals;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import screens.base.BaseScreen;
import suporte.Utils;

public class MobilePageObect extends BaseScreen {

	Globals globals = new Globals();

	public MobilePageObect(AppiumDriver<MobileElement> driver) throws Exception {
		super(driver);

	} 

	@iOSXCUITFindBy(iOSNsPredicate = "type == ")
	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.TextView[@text='Abrir minha conta Midway']")
	public MobileElement btnAbrirMinhaContaMidway;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public MobileElement btnPermitir;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Entrar']")
	public MobileElement btnEntrar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CPF']")
	public MobileElement inputLabelCPF;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nome Completo']")
	public MobileElement inputLabelNomeCompleto;

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
	public MobileElement inputTextCpf;

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
	public MobileElement inputTextNomeCompleto;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continuar']")
	public MobileElement btnContinuar;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[1]")
	public MobileElement inputTexComoQuerSerChamado;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[2]")
	public MobileElement inputTexCelular;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[3]")
	public MobileElement inputTexEmail;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[4]")
	public MobileElement inputTexDataNascimento;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]")
	public MobileElement touchId;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[1]")
	public MobileElement tokenInput1;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[2]")
	public MobileElement tokenInput2;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[3]")
	public MobileElement tokenInput3;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[4]")
	public MobileElement tokenInput4;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[5]")
	public MobileElement tokenInput5;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[6]")
	public MobileElement tokenInput6;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[1]")
	public MobileElement senhaInput1;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[2]")
	public MobileElement senhaInput2;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[3]")
	public MobileElement senhaInput3;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[4]")
	public MobileElement senhaInput4;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[5]")
	public MobileElement senhaInput5;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[6]")
	public MobileElement senhaInput6;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Aceitar Conta Simples']")
	public MobileElement btnAceitarContaSimples;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Entrar no aplicativo']")
	public MobileElement btnEntrarNoAplicativo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='come�ar']")
	public MobileElement btncomecarMigracaoConta;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='RG']")
	public MobileElement btnRG;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[1]")
	public MobileElement inputNumeroDocumento;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[2]")
	public MobileElement inputDataExpedicao;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[3]")
	public MobileElement inputOrgaoExpedidor;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[4]")
	public MobileElement inputEstadoExpedidor;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='S�O PAULO']")
	public MobileElement listaEstado;

	/**
	 * Metodo inicial do app para clicar no bot�o Minha conta
	 */

	// Bo�o Minha Conta
	public void clicarBotaoMinhaConta() throws InterruptedException {
		Thread.sleep(10000);
		btnAbrirMinhaContaMidway.click();
		Thread.sleep(1000);
//		btnPermitir.click();
		Thread.sleep(1000);

	}

	/**
	 * Metodo de preenchimento do campo CPF
	 */

	/* Metodo de clicar no botão Entrar da pagina inicial do App da Midway **/
	public void clicarBotaoEntrar() throws InterruptedException {
		Thread.sleep(1000);
		btnEntrar.click();
	}

	/**
	 * Metodo de preenchimento do campo CPF
	 */

	/* Metodo de preenchimento do campo CPF **/
	public void escreverCpf(String CPF) throws InterruptedException {

		Thread.sleep(1000);
		inputTextCpf.sendKeys(CPF);

	}

	/**
	 * M�todo ira fazer click do bot�o continuar
	 */

	// Bot�o Continuar
	public void clicarContinuar() throws InterruptedException {

		if (Globals.PLATAFORMA_IOS.equals("iOS")) {

			btnContinuar.click();
			Thread.sleep(1000);

		} else
			
		{ 
			Globals.PLATAFORMA.equals("Android");

			btnContinuar.click();

		}

	}

	/**
	 * M�todo ira fazer input do campo Nome
	 */

	// Campo Nome
	public void escreverNome(String NomeCompleto) throws InterruptedException {
		Thread.sleep(1000);
		inputTextNomeCompleto.sendKeys(NomeCompleto);
		btnContinuar.click();
		Thread.sleep(1000);

	}

	/**
	 * M�todo ira fazer input do campo Como quer ser Chamado
	 */

	// Campo Como quer ser Chamado
	public void escreverComoQuerSerChamado(String ComoQuerSerChamado) throws InterruptedException {

		inputTexComoQuerSerChamado.sendKeys(ComoQuerSerChamado);

	}

	/**
	 * M�todo ira fazer input do campo celular
	 */

	// Campo celular
	public void escreverCelular(String Celular) throws InterruptedException {

		inputTexCelular.sendKeys(Celular);

	}

	/**
	 * M�todo ira fazer input do campo e-mail
	 */

	// Campo E-mail
	public void escreverEmail(String Email) throws InterruptedException {

		inputTexEmail.sendKeys(Email);

	}

	/**
	 * M�todo ira escrever data de nascimento e fazer rolagem at� clicar no bot�o
	 * continuar
	 */

	// Campo Data de Nascimento
	public void escreverDataNascimento(String DataNascimento) throws Exception {

		inputTexDataNascimento.sendKeys(DataNascimento);
		Utils.swipeVerticalParaBaixo();
		btnContinuar.click();
	}

	/**
	 * M�todo que ira passar pela Biometria-Facial
	 */

	// Swipe FaceId
	public void swipeScreenFaceId() throws Exception {

		Utils.swipeBiometriaFacial();
//		btnPermitir.click();
		Thread.sleep(2000);
		btnContinuar.click();
		Thread.sleep(1000);
		touchId.click(); // botão da camera
		Thread.sleep(5000);
		btnContinuar.click();
		Thread.sleep(1000);
	}

	// Colocar a chamada da API de biomegtria

	/**
	 * M�todo para incluir primeiro campo do token
	 */

	// Primeiro campo Token
	public void inserirToken1(String token1) throws Exception {

		tokenInput1.sendKeys();
	}

	/**
	 * M�todo para incluir segundo campo do token
	 */

	// Segundo campo Token
	public void inserirToken2(String token2) throws Exception {

		tokenInput2.sendKeys();
	}

	/**
	 * M�todo para incluir terceiro campo do token
	 */

	// Terceiro campo Token
	public void inserirToken3(String token3) throws Exception {

		tokenInput3.sendKeys();
	}

	/**
	 * M�todo para incluir quarto campo do token
	 */

	// Quarto campo Token
	public void inserirToken4(String token4) throws Exception {

		tokenInput4.sendKeys();
	}

	/**
	 * M�todo para incluir quinto campo do token
	 */

	// Quinto campo Token
	public void inserirToken5(String token5) throws Exception {

		tokenInput5.sendKeys();
	}

	/**
	 * M�todo para incluir sexto campo do token
	 */

	// Sexto campo Token
	public void inserirToken6(String token6) throws Exception {

		tokenInput6.sendKeys();
	}

	/**
	 * M�todo para incluir primeiro campo da senha
	 */

	// Senha do Usu�rio primeiro campo
	public void inserirSenha1(String senha) throws Exception {

		senhaInput1.sendKeys(senha);

	}

	/**
	 * M�todo para incluir segundo campo da senha
	 */

	// Senha do Usu�rio segundo campo
	public void inserirSenha2(String senha) throws Exception {

		senhaInput2.sendKeys(senha);

	}

	/**
	 * M�todo para incluir terceiro campo da senha
	 */

	// Senha do Usu�rio terceiro campo
	public void inserirSenha3(String senha) throws Exception {

		senhaInput3.sendKeys(senha);

	}

	/**
	 * M�todo para incluir quarto campo da senha
	 */

	// Senha do Usu�rio quarto campo
	public void inserirSenha4(String senha) throws Exception {

		senhaInput4.sendKeys(senha);

	}

	/**
	 * M�todo para incluir quinto campo da senha
	 */

	// Senha do Usu�rio quinto campo
	public void inserirSenha5(String senha) throws Exception {

		senhaInput5.sendKeys(senha);

	}

	/**
	 * M�todo para incluir sexto campo da senha
	 */

	// Senha do Usu�rio sexto campo
	public void inserirSenha6(String senha) throws Exception {

		senhaInput5.sendKeys(senha);

	}

	/**
	 * M�todo para validar se senha � mesma que foi digitada na tela anterior
	 */

	// Inserir Senha novamente
	public void inserirSenhaNovamente(String senha) throws Exception {

		inserirSenha1(senha);
		inserirSenha2(senha);
		inserirSenha3(senha);
		inserirSenha4(senha);
		inserirSenha5(senha);
		inserirSenha6(senha);

	}

	/**
	 * M�todo para validar click bot�o Abrir minha Conta Midway
	 */

	// Bot�o Aceitar Conta Simples
	public void AceitarContaSimples() throws Exception {

		btnAbrirMinhaContaMidway.click();

	}

	/**
	 * M�todo para validar click bot�o continuar com conta-simples
	 */

	// Bot�o Continuar Conta Simples
	public void ContinuarContaSimples() throws Exception {

		btnContinuar.click();

	}

	/**
	 * M�todo para validar click bot�o Enntrar no Aplicativo
	 */

	// Bot�o Entrar no aplicativo
	public void EntrarNoAplicativo() throws Exception {

		btnEntrarNoAplicativo.click();
		Thread.sleep(10000);

	}

	/**
	 * M�todo para validar bot�o para fluxo de Migra��o de Conta-Pagamento para
	 * Conta-Corrente
	 */

	// Bot�o come�ar
	public void migracaoContaPagamento() throws Exception {

		btncomecarMigracaoConta.click();
		Utils.swipeMigracaoDeConta();

	}

	/**
	 * Metodo ira efetuar click no bot�o RG
	 */

	// Bot�o RH
	public void clicarBotaoRH() throws InterruptedException {

		btnRG.click();
	}

	/**
	 * Metodo ira inserir campo N�mero do documento
	 */

	// Campo N�mero do documento
	public void inserirNumeroDocumento(String NumeroDocumento) throws InterruptedException {

		inputNumeroDocumento.click();
		inputNumeroDocumento.sendKeys(NumeroDocumento);
	}

	/**
	 * Metodo ira inserir campo Data de expedi��o
	 */

	// Campo Data de expedi��o
	public void inserirDataExpedi��o(String data) throws InterruptedException {

		inputDataExpedicao.click();
		inputDataExpedicao.sendKeys(data);
	}

	/**
	 * Metodo ira inserir campo Estado expedidor
	 */

	// Campo Estado expedidor
	public void inserirEstadoExpedidor(String orgaoExpedidor) throws InterruptedException {

		inputOrgaoExpedidor.click();
		inputOrgaoExpedidor.sendKeys(orgaoExpedidor);
	}

	/**
	 * Metodo ira inserir campo �rg�o expedidor
	 * @throws Exception 
	 */

	// Campo Estado expedidor
	public void inputEstadoExpedidor(String estadoExpedidor) throws Exception {

		inputEstadoExpedidor.click();
		Utils.swipeVerticalParaBaixoLongo();
		listaEstado.click();

	}

}