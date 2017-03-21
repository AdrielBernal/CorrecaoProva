package packajo;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio2 extends JFrame {
	public Exercicio2() {
		super();
		MeuPainel jp = new MeuPainel();
		jp.setBackground(Color.WHITE);
		this.setContentPane(jp);
	}

	public static void main(String[] args) {
		Exercicio2 p2 = new Exercicio2();
		p2.setSize(415, 439);
		p2.setLocationRelativeTo(null);
		p2.setVisible(true);
	}
}
