package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton butGenerar;
	public static final String GENERAR = "Generar";
	public PanelResultados() {

		setLayout( new GridLayout(1,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Numeros a mostrar");
		border.setTitleColor(Color.BLACK);
		setBorder( border );

		butGenerar = new JButton("Generar");

		butGenerar.setActionCommand(GENERAR);

		add(butGenerar);

	}

	public static String getConvertir() {
		return GENERAR;
	}

	public JButton getButConvertir() {
		return butGenerar;
	}

	public void setButConvertir(JButton butConvertir) {
		this.butGenerar = butConvertir;
	}

	public void correcto(String string) {
		JOptionPane.showMessageDialog(null, string);
	}

	public void error(String string) {
		JOptionPane.showMessageDialog(null, string, string ,JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarInformacion(int i) {
		JOptionPane.showMessageDialog(null, i);
	}
}