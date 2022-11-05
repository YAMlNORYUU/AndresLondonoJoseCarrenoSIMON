package co.edu.unbosque.model;

public class Simon {

	private int a;

	public int numerosAleatorios() {
		for (int l = 0; l < 4; l++) {
			a = (int) Math.floor(Math.random() * (4));
			a += 1;
		}
		return a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
