package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;


public class ImplementarProfessor {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog("msg").toUpperCase();
	}
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
		}
	
	public static void main(String[] args) {
		Professor professor = new Professor ();
		Endereco endereco = new Endereco();
		ID id = new ID();
		professor.setId(Magica.i("ID"));
		professor.setNome(Magica.s("Nome"));
		professor.setFormacao(Magica.s("Formacao"));
		prefessor.setEndereco(endereco);
		endereco.setLogradouro(Magica.s);
		

	}

}
