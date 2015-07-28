/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carné: 14012
Diego Sosa. Carné: 14735
Julio González. Carné: 14096
30/07/2015
Hoja de Trabajo 2
*/

import java.io.FileNotFoundException;

public interface ADTCalculadora<P> {
	public void readFile(String file) throws FileNotFoundException, Exception;
	public P calcular() throws Exception;
	
	
}
