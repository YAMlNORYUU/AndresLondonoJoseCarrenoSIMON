package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelNumeros extends JPanel{

	private static final long serialVersionUID = 1L;

	private JButton but1,but2,but3,but4;

	public PanelNumeros() {

		setLayout( new GridLayout(2,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Pulsa los botones de los numeros");
		border.setTitleColor(Color.BLACK);
		setBorder( border );


		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");

		but1.setActionCommand("uno");
		but2.setActionCommand("dos");
		but3.setActionCommand("tres");
		but4.setActionCommand("cuatro");


		add(but1);
		add(but2);
		add(but3);
		add(but4);

	}

	public JButton getBut1() {
		return but1;
	}

	public void setBut1(JButton but1) {
		this.but1 = but1;
	}

	public JButton getBut2() {
		return but2;
	}

	public void setBut2(JButton but2) {
		this.but2 = but2;
	}

	public JButton getBut3() {
		return but3;
	}

	public void setBut3(JButton but3) {
		this.but3 = but3;
	}

	public JButton getBut4() {
		return but4;
	}

	public void setBut4(JButton but4) {
		this.but4 = but4;
	}





}
