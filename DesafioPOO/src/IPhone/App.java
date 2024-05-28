package IPhone;

public class App implements ReprodutoMusical, AparelhoTelefonico{

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
		System.out.println("Selecionando a musica :" + " " + musica);
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número : " + " " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação: " + " " + "????");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de Voz.");
	}
	
	

}
