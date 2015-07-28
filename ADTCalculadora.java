import java.io.FileNotFoundException;


public interface ADTCalculadora<P> {
	public void readFile(String file) throws FileNotFoundException;
	public P calcular();
	
	
}
