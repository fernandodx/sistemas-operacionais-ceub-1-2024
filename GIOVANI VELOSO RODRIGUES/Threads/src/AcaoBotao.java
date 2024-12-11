import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {
		
		private JTextField primeiro;
		private JTextField segundo;
		private JLabel resultado;
		
		
		public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
			super();
			this.primeiro = primeiro;
			this.segundo = segundo;
			this.resultado = resultado;
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			BigInteger calculo = new BigInteger("0");
			
			long valor1 = Long.parseLong(primeiro.getText());
			long valor2 = Long.parseLong(segundo.getText());
			
			for(int i = 0 ; i < valor1; i++) {
				for(int j= 0 ; j < valor2; i++) {
					calculo = calculo.add(new BigInteger("1"));
				}
			}
			
		}
		
		
	}