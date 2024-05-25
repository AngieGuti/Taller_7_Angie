package uniandes.dpoo.taller7.interfaz2;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelOpcionesDerecha extends JPanel{

	private JButton botonNuevo;
	private JButton botonReiniciar;
	private JButton botonTop;
    private JButton botonCambiarJugador;

	
	public PanelOpcionesDerecha() {
		
		botonNuevo = new JButton("NUEVO");
		botonReiniciar = new JButton("REINICIAR");
		botonTop = new JButton("TOP-10");
        botonCambiarJugador = new JButton("CAMBIAR JUGADOR");
        
		add(botonNuevo);
		add(botonReiniciar);
		add(botonTop);
        add(botonCambiarJugador);
		
        FlowLayout fl = new FlowLayout(); //Ayuda a organizar los elementos en el panel de arriba a abajo}
        setLayout(fl);
	}
}
