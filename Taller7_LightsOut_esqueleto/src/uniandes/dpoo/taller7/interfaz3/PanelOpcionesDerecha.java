package uniandes.dpoo.taller7.interfaz2;


import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelOpcionesDerecha extends JPanel{

	private JButton botonNuevo;
	private JButton botonReiniciar;
	private JButton botonTop;
    private JButton botonCambiarJugador;

	
	public PanelOpcionesDerecha() {
        BoxLayout box_l= new BoxLayout(this, BoxLayout.Y_AXIS); 
        setLayout(box_l); //Ayuda a organizar los elementos en el panel de arriba a abajo
		
		botonNuevo = new JButton("NUEVO");
		botonReiniciar = new JButton("REINICIAR");
		botonTop = new JButton("TOP-10");
        botonCambiarJugador = new JButton("CAMBIAR JUGADOR");
        
		//centrar los botones en el panel
		botonNuevo.setAlignmentX(CENTER_ALIGNMENT);
		botonReiniciar.setAlignmentX(CENTER_ALIGNMENT);
		botonTop.setAlignmentX(CENTER_ALIGNMENT);
		botonCambiarJugador.setAlignmentX(CENTER_ALIGNMENT);

		add(Box.createVerticalStrut(50)); //Espacio en blanco de 50 pixeles
		add(botonNuevo);
		add(Box.createVerticalStrut(20)); //Espacio entre los botones (20 pixeles)
		add(botonReiniciar);
		add(Box.createVerticalStrut(20));
		add(botonTop);
		add(Box.createVerticalStrut(20));
        add(botonCambiarJugador);
		
	}
}
