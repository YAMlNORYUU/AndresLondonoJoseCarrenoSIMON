package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;

	private PanelEntrada panelEntrada; 
	private PanelResultados panelResultados; 
	private PanelNumeros panelNumeros;
	public View(Controller control) {


		setSize(700,700); 
		setResizable(false); 
		setTitle("Simon"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout( new BorderLayout() );

		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);


		panelNumeros = new PanelNumeros();
		add(panelNumeros,BorderLayout.CENTER);

		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout. SOUTH);

		panelResultados.getButConvertir().addActionListener(control);

	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelNumeros getPanelNumeros() {
		return panelNumeros;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelNumeros(PanelNumeros panelNumeros) {
		this.panelNumeros = panelNumeros;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

}
