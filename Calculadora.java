import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora implements ADTCalculadora{
	private String MyStr;
	private MyStack<Integer> MySta;
	private Integer op1;
	private Integer op2;
	private Integer res;
	final String numeros = "123456789";
	
	public Calculadora() {
		MyStr = "";		
		op1 = 0;
		op2 = 0;
		MySta = new MyStack<Integer>();	
	}

	private String operacion;

	@Override
	public void readFile(String file) throws FileNotFoundException {
		File archivo = new File(file);
		 BufferedReader br = new BufferedReader(new FileReader(file));
	        String line = null;
	        StringBuilder sb = new StringBuilder();
	        try {
				while ((line = br.readLine()) != null) {
					sb.append(line);
				    //sb.append("\n");
				}
			} catch (IOException e) {
				
			}
	        operacion = sb.toString();

	}

	@Override
	public P calcular() throws Exception {
		for (int i=0;i<=(MyStr.length()-1);i++)
		{
			CharSequence MyChar = "" + MyStr.charAt(i);
			if (numeros.contains(MyChar))
				MySta.push(Integer.parseInt(MyChar.toString()));
			else 
			{
				String a = MyChar.toString();
				op1 = (Integer) MySta.pop();
				op2 = (Integer) MySta.pop();
				if(a.equals("+"))
					res = op1 + op2;
				if(a.equals("-"))
					res = op1 - op2;
				if(a.equals("*"))
					res = op1 * op2;
				if(a.equals("/"))
					res = op2 / op1;
				if(a.equals("^"))
					res = op2 ^ op1;
				MySta.push(res);
			}
		}
		return (P) MySta.peek();
	}
	
}
