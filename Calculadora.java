import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora<P> implements ADTCalculadora<P>{
	private String MyStr;
	private Stack<Integer> MySta;
	private Integer op1;
	private Integer op2;
	private Integer res;
	final String numeros = "123456789";
	
	public Calculadora() {
		MyStr = "";		
		op1 = 0;
		op2 = 0;
		MySta = new Stack<Integer>();	
	}

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
				e.printStackTrace();
			}
	        MyStr = sb.toString();
	        MyStr = MyStr.trim().replace(" ", "");
	        System.out.println(MyStr);

	}

	@SuppressWarnings("unchecked")
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
				else
				if(a.equals("-"))
					res = op2 - op1;
				else
				if(a.equals("*"))
					res = op1 * op2;
				else
				if(a.equals("/"))
					res = op2 / op1;
				else
				if(a.equals("^"))
					res = op2 ^ op1;
				else
					throw new Exception("Se ingreso un caracter desconocido!");
				MySta.push(res);
			}
		}
		return (P) MySta.peek();
	}
	
}
