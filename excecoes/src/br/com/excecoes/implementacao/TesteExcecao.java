package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es: n�o s�o controladas pelo programador.
		// Existem dois tipo:
		// A-) Checked: o Java verifica antes da compila��o.
		// B-) Unchecked: s� ocorre ap�s a compila��o.
	try {
		int numero = Integer.parseInt("@");
		System.out.println("Resultado = " + (numero * 10));
		
		
		String email="";
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));
	
	}catch(NullPointerException e) {
		System.out.println("Objeto Nulo"); 
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("Coordenada invalida");
	}catch(NumberFormatException e) {
		System.out.println("N�mero inv�lido");
	}catch(Exception e ) {
		System.out.println("Deu Ruim");
		e.printStackTrace();
	}finally {
		System.out.println("At� logo");
	}
	
	
	
	

	}

}
