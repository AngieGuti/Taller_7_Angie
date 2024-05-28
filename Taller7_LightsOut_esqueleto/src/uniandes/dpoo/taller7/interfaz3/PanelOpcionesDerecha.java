package uniandes.dpoo.taller7.interfaz3;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelOpcionesDerecha extends JPanel{

	private JButton botonNuevo;
	private JButton botonReiniciar;
	private JButton botonTop;
    private JButton botonCambiarJugador;

	
	public PanelOpcionesDerecha() {
        GridLayout gl = new GridLayout(4,1, 0, 10);
		setLayout(gl); //Ayuda a organizar los elementos en el panel de arriba a abajo
		
		botonNuevo = new JButton("NUEVO");
		botonReiniciar = new JButton("REINICIAR");
		botonTop = new JButton("TOP-10");
        botonCambiarJugador = new JButton("CAMBIAR JUGADOR");
        
		botonNuevo.setBackground(Color.BLACK);
		botonReiniciar.setBackground(Color.BLACK);
		botonTop.setBackground(Color.BLACK);
		botonCambiarJugador.setBackground(Color.BLACK);
		
		botonNuevo.setForeground(Color.WHITE);
		botonReiniciar.setForeground(Color.WHITE);
		botonTop.setForeground(Color.WHITE);
		botonCambiarJugador.setForeground(Color.WHITE);
		
		add(botonNuevo);
		add(botonReiniciar);
		add(botonTop);
		add(botonCambiarJugador);
		
	}
}
