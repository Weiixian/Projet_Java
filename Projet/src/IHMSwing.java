import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IHMSwing {
	
	private static JFrame fenetre;

	private static JButton creuse;
	private static JButton pleine;
	private static JLabel resultat;
	
	public static void main(String[] args) {
		//Création de le fenête
		fenetre = new JFrame("IHM pour CLI");
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel north = new JPanel();
		fenetre.add(north, BorderLayout.NORTH);
		
		creuse = new JButton("Creuse (C)");
		Event instance =
		creuse.addActionListener(this);
		north.add(creuse);
		pleine = new JButton("Pleine (P)");
		north.add(pleine);
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3));
		fenetre.add(center, BorderLayout.CENTER);
		center.add(new JLabel("Valeur de l'indice(K)"));
		center.add(new JTextField(20));
		center.add(new JButton("+"));
		
		center.add(new JLabel("Valeur de alpha (A)"));
		center.add(new JTextField(20));
		center.add(new JButton("+"));
		
		center.add(new JLabel("Valeur de epsilon (E)"));
		center.add(new JTextField(20));
		center.add(new JButton("+"));
		
		JPanel south = new JPanel();
		fenetre.add(south, BorderLayout.SOUTH);
		
		resultat = new JLabel();
		resultat.setOpaque(true);
		resultat.setBackground(Color.WHITE);
		resultat.setLayout(new FlowLayout());
		south.add(resultat);
		
		fenetre.pack();
		fenetre.setVisible(true);
	}
	
	public static void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		
		if (source==creuse) {
			resultat.setText(resultat.getText() + " -C ");
			System.out.println("test");
		} else if (source == pleine) {
			resultat.setText(resultat.getText() + " -P ");
		}
		
		fenetre.repaint();
	}
	
}
