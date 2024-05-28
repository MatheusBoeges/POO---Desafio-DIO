package IPhone;

public class App implements ReprodutoMusical{

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
	
	

}
