import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class InterfazGrafica {

		private JFrame frame;
		private JSlider slider;
		private JLabel label;
		private JTextField textField;
		private JFileChooser fc;
		private File file;
		private Calculadora calculadora;
		private JButton btnSeleccionarArchivo;
		private JButton buttonCalcular;
		private JTextArea textArea;
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						InterfazGrafica window = new InterfazGrafica();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public InterfazGrafica(){
			initialize();
		}
		public void initialize(){
			frame = new JFrame();
			frame.setBounds(100, 100, 622, 381);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblCalculadoraPostfix = new JLabel("Calculadora Postfix");
			lblCalculadoraPostfix.setFont(new Font("Tahoma", Font.BOLD, 50));
			lblCalculadoraPostfix.setBounds(10, 11, 586, 106);
			frame.getContentPane().add(lblCalculadoraPostfix);
			
			btnSeleccionarArchivo = new JButton("Seleccionar Archivo");
			btnSeleccionarArchivo.setBounds(422, 128, 174, 23);
			btnSeleccionarArchivo.addActionListener(new Evento());
			frame.getContentPane().add(btnSeleccionarArchivo);
			
			textField = new JTextField();
			textField.setBounds(20, 128, 378, 23);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			buttonCalcular = new JButton("Calcular");
			buttonCalcular.setBounds(20, 164, 174, 23);
			frame.getContentPane().add(buttonCalcular);
			
			JLabel lblResultados = new JLabel("Resultados:");
			lblResultados.setBounds(20, 199, 100, 21);
			frame.getContentPane().add(lblResultados);
			
			textArea = new JTextArea();
			textArea.setBounds(20, 218, 378, 113);
			frame.getContentPane().add(textArea);
			
			fc = new JFileChooser();
			
			
		}
		private class Evento implements ActionListener{

			

			

			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent a) {
			
				if(a.equals(btnSeleccionarArchivo)){
					int returnVal = fc.showOpenDialog(frame);
			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			            file = fc.getSelectedFile();
			            textField.setText(file.getAbsolutePath());
			        } 
				}else{
					try {
						calculadora.readFile(file.getAbsolutePath());
						textArea.setText((String) calculadora.calcular());
					} catch (FileNotFoundException e) {
					
					}
				}
			}
		}
}
