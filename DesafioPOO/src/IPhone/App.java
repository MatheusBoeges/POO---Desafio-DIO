package IPhone;

public class App implements ReprodutoMusical, AparelhoTelefonico, Internet {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando a musica :" + " " + "Chop suey - System of Down");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando a musica :" + " " + "Chop suey - System of Down");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a musica :" + " " + musica + "\n");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número : " + " " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação: " + " " + "Número desconhecido.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de Voz.\n");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " +  url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página atual.");
	}
	
}
