package br.com.iveso.Treinamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Aplicacao {
	public static void main(String[] args) throws Exception {
		write();
	}
	
	public static void write() throws Exception {
		
		File file = new File("Arquivo.txt");
		
		PrintWriter pw = new PrintWriter(file);
		pw.println("Testando");
		pw.print("outro teste");
		pw.close();
		read.close();
		
	
	}
}
