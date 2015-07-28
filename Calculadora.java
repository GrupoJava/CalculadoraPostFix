import java.io.FileNotFoundException;


public interface Calculadora<P> {
	public void readFile(String file) throws FileNotFoundException;
	public P calcular();
	
	
}
