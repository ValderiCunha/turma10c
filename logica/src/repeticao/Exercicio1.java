package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String escolaridade="";
		int medio=0;
		int superior=0;
		int pos=0;
		do {
			escolaridade = JOptionPane.showInputDialog("Qual sua escolaridade?").toUpperCase();
			if (escolaridade.equals("medio")) {
				medio=medio+1;
			}else if (escolaridade.equals("superior")) {
				superior=superior+1;
			}else if (escolaridade.equals("pos")) {
				pos=pos+1;
			}

		}while(escolaridade.equals("medio") || escolaridade.equals("superior") || escolaridade.equals("pos"));
		System.out.println("Total ensino medio �: " + medio);
		System.out.println("Total ensino superior �: " + superior);
		System.out.println("Total de p�s graduado �: " + pos);
	}
}
