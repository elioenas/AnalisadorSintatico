package br.com.analisadorlexico;

import java.io.File;

public class GeradorClassesJflex {

	public static void main(String[] args) {

		jflex.Main.generate(new File("especificacoes/MiniC.flex"));

	}
}
