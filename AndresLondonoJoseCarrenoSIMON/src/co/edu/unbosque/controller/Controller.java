package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Simon;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Simon s;
	private View v;
	private int aux1, aux2, aux3, aux4;
	private int turno = 1, verifi = 0, fallo = 0, flp = 0;

	public Controller() {
		s = new Simon();
		v = new View(this);
		v.setVisible(true);
		funcionar();
		asignar();
	}

	public void verficiarSimon(int aux) {
		if (flp == 0) {
			if (turno == 1) {
				if (aux1 == aux) {
					v.getPanelEntrada().getTxt1().setText("" + aux1);
					comprobarGanador();
					turno++;
				} else {
					fallo++;

				}
			} else if (turno == 2) {
				if (aux2 == aux) {
					v.getPanelEntrada().getTxt2().setText("" + aux2);
					comprobarGanador();
					turno++;
				} else {
					fallo++;
				}

			} else if (turno == 3) {
				if (aux3 == aux) {
					v.getPanelEntrada().getTxt3().setText("" + aux3);
					comprobarGanador();
					turno++;
				} else {
					fallo++;

				}
			} else if (turno == 4) {
				if (aux4 == aux) {
					v.getPanelEntrada().getTxt4().setText("" + aux4);
					comprobarGanador();
					turno++;
				} else {
					fallo++;
				}
			}
			if (fallo == 1) {
				JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
				flp = 1;
				reinicio();
			}
		}
	}

	public void asignar() {
		v.getPanelNumeros().getBut1().addActionListener(this);
		v.getPanelNumeros().getBut2().addActionListener(this);
		v.getPanelNumeros().getBut3().addActionListener(this);
		v.getPanelNumeros().getBut4().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
		// TODO Auto-generated method stub
		if (comando.equals(v.getPanelResultados().GENERAR)) {

			aux1 = s.numerosAleatorios();
			v.getPanelEntrada().getTxt1().setText("" + aux1);
			//			System.out.println("" + aux1);
			aux2 = s.numerosAleatorios();
			v.getPanelEntrada().getTxt2().setText("" + aux2);
			//			System.out.println("" + aux2);
			aux3 = s.numerosAleatorios();
			v.getPanelEntrada().getTxt3().setText("" + aux3);
			//			System.out.println("" + aux3);
			aux4 = s.numerosAleatorios();
			v.getPanelEntrada().getTxt4().setText("" + aux4);
			//			System.out.println("" + aux4);
			turno = 1;
			flp = 0;


		}
		if (comando.equals("uno")) {
			verficiarSimon(1);
		} else if (comando.equals("dos")) {
			verficiarSimon(2);
		} else if (comando.equals("tres")) {
			verficiarSimon(3);
		} else if (comando.equals("cuatro")) {
			verficiarSimon(4);
		}

	}

	public void comprobarGanador() {
		if (flp == 0) {
			if (turno == 1) {

				if (v.getPanelEntrada().getTxt1().equals("")) {

				} else {
					verifi++;

				}
			} else if (turno == 2) {

				if (v.getPanelEntrada().getTxt2().equals("")) {

				} else {
					verifi++;
				}
			} else if (turno == 3) {

				if (v.getPanelEntrada().getTxt3().equals("")) {

				} else {
					verifi++;
				}
			} else if (turno == 4) {

				if (v.getPanelEntrada().getTxt4().equals("")) {

				} else {
					verifi++;

				}
			}

			if (verifi == 4) {
				JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE");
				flp = 1;
				reinicio();

			}
		}

	}

	private void reinicio() {
		v.getPanelEntrada().getTxt1().setText("");
		v.getPanelEntrada().getTxt2().setText("");
		v.getPanelEntrada().getTxt3().setText("");
		v.getPanelEntrada().getTxt4().setText("");
		turno = 1;
		verifi = 0;
		fallo = 0;
		aux1 = 0;
		aux2 = 0;
		aux3 = 0;
		aux4 = 0;

	}

	private static void delay(int tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void funcionar() {
		delay(5000);

		System.out.println("termina el dilay");
		turno = 1;
		verifi = 0;
		fallo = 0;
		v.getPanelEntrada().getTxt1().setText("");
		v.getPanelEntrada().getTxt2().setText("");
		v.getPanelEntrada().getTxt3().setText("");
		v.getPanelEntrada().getTxt4().setText("");
	}

}
