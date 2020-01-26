package br.com.classesabstratas;

import br.com.herancaepolimorfismo.Aluno;

public class Abstratas {

	public static void main(String[] args) {
		Aluno rebeca = new Aluno(" Rebeca Vitoria ", 2018, " 546398745", " rebecavitoria@gmail.com");
		System.out.println(rebeca);
		
		rebeca.outra_mensagem("Eu estou muito longe do meu papai " + rebeca.getNome());
	}
}
