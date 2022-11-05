package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labNumeros;
	private JLabel txt1, txt2, txt3, txt4;

	public PanelEntrada() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		setLayout(new GridLayout(1, 4));
		TitledBorder border = BorderFactory.createTitledBorder("Numeros de la secuencia");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labNumeros = new JLabel("Los numeros son:");
		txt1 = new JLabel("");
		txt1.setForeground(Color.BLACK);
		txt1.setBorder(blackline);
		txt1.setBackground(Color.WHITE);
		txt2 = new JLabel("");
		txt2.setForeground(Color.BLACK);
		txt2.setBackground(Color.WHITE);
		txt2.setBorder(blackline);
		txt3 = new JLabel("");
		txt3.setForeground(Color.BLACK);
		txt3.setBackground(Color.WHITE);
		txt3.setBorder(blackline);
		txt4 = new JLabel("");
		txt4.setForeground(Color.BLACK);
		txt4.setBackground(Color.WHITE);
		txt4.setBorder(blackline);

		add(labNumeros);

		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);

	}

	public JLabel getLabNumeros() {
		return labNumeros;
	}

	public void setLabNumeros(JLabel labNumeros) {
		this.labNumeros = labNumeros;
	}

	public JLabel getTxt1() {
		return txt1;
	}

	public void setTxt1(JLabel txt1) {
		this.txt1 = txt1;
	}

	public JLabel getTxt2() {
		return txt2;
	}

	public void setTxt2(JLabel txt2) {
		this.txt2 = txt2;
	}

	public JLabel getTxt3() {
		return txt3;
	}

	public void setTxt3(JLabel txt3) {
		this.txt3 = txt3;
	}

	public JLabel getTxt4() {
		return txt4;
	}

	public void setTxt4(JLabel txt4) {
		this.txt4 = txt4;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
