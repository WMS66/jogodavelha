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
		bt[1].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[1] == false) {
					click[1] = true;
					mudar(bt[1]);
				}
			}
		});
		bt[2].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[2] == false) {
					click[2] = true;
					mudar(bt[2]);
				}
			}
		});
		bt[3].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[3] == false) {
					click[3] = true;
					mudar(bt[3]);
				}
			}
		});
		bt[4].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[4] == false) {
					click[4] = true;
					mudar(bt[4]);
				}
			}
		});
		bt[5].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[5] == false) {
					click[5] = true;
					mudar(bt[5]);
				}
			}
		});
		bt[6].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[6] == false) {
					click[6] = true;
					mudar(bt[6]);
				}
			}
		});
		bt[7].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[7] == false) {
					click[7] = true;
					mudar(bt[7]);
				}
			}
		});
		bt[8].addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[8] == false) {
					click[8] = true;
					mudar(bt[8]);
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
