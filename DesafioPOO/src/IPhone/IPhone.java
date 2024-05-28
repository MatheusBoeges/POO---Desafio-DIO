package IPhone;

public class IPhone implements ReprodutoMusical {
	
	public static void main(String[] args) {
		
	}
		
		@Override
		public void tocarMusica() {
			System.out.println("Tocando a música:" + " "  + "Insane");
		}
		
		@Override
		public void pausarMusica() {
			System.out.println("Pausando a música:" + " "  + "Insane");	
		}

}
