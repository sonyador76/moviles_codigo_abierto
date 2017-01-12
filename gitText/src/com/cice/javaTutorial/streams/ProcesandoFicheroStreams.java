package com.cice.javaTutorial.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcesandoFicheroStreams {

	public static void main(String[] args) {

			try {
				Stream str = Files.lines(Paths.get("palabras2.txt")).filter(line->line.length()>10);//filtra que linea sea de mas de 10 caracteres
				str.forEach(line->System.out.println(line));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
