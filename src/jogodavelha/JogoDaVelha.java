package jogodavelha;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class JogoDaVelha extends JFrame{
	
	JButton[] bt = new JButton[9];
	boolean xo = false;
	boolean[] click = new boolean[9];
	
	public JogoDaVelha() {
		
		setVisible(true);
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(3);
		setLayout(null);
		setBounds(350,150,800,600);
		int cont = 0;
		
		for (int i=0; i < 3; i++) {
			for (int j =0; j < 3; j++) {
				bt[cont] = new JButton();
				add(bt[cont]);
				bt[cont].setBounds((100 * i)+50, (100 * j)+50, 95, 95);
				cont++;
			}
		}
		for (int i = 0; i < 9; i++) {
		click[i] = false;	
		}
		
		bt[0].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[0] == false) {
					click[0] = true;
					mudar(bt[0]);
				}
			}
		});
	}
	
	public void mudar(JButton btn) {
		if(xo) {
			btn.setText("O");
			xo = false;
		}else {
			btn.setText("X");
			xo = true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JogoDaVelha();
	}

}
