import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora implements ADTCalculadora{

	@Override
	public void readFile(String file) throws FileNotFoundException {
		File archivo = new File(file);
		 BufferedReader br = new BufferedReader(new FileReader(file));
	        String line = null;
	        StringBuilder sb = new StringBuilder();
	        try {
				while ((line = br.readLine()) != null) {
				    sb.append(line);
				    sb.append("\n");
				}
			} catch (IOException e) {
				
			}
	        String text = sb.toString();

	}

	@Override
	public Object calcular() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
