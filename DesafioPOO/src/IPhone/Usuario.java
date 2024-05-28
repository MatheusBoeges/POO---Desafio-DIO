package IPhone;

public class Usuario {
	
	public static void main(String[] args) {
		
		App IPhone = new App();
		
		IPhone.tocarMusica();
		IPhone.pausarMusica();
		IPhone.selecionarMusica("Insane");
		
		IPhone.ligar("190");
		IPhone.atender();
		IPhone.iniciarCorreioVoz();
		
		IPhone.exibirPagina("www.safari.com");
		IPhone.adicionarNovaAba();
		IPhone.atualizarPagina();
		
	}

}
