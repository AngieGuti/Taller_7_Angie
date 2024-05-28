package uniandes.dpoo.taller7.interfaz2;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelInferior extends JPanel{
 
    private JLabel labelJugadas;
    private JLabel labelNumeroJugadas;
    private JLabel labelJugador;
    private JLabel labelNombreJugador;

    public PanelInferior() {
        labelJugadas = new JLabel("Jugadas:");
        labelJugadas.setHorizontalAlignment(SwingConstants.CENTER);

        labelNumeroJugadas = new JLabel("0");
        labelNumeroJugadas.setHorizontalAlignment(SwingConstants.CENTER);

        labelJugador = new JLabel("Jugador:");
        labelJugador.setHorizontalAlignment(SwingConstants.CENTER);

        labelNombreJugador = new JLabel(" ");
        labelNombreJugador.setHorizontalAlignment(SwingConstants.CENTER);

        add(labelJugadas);
        add(labelNumeroJugadas);
        add(labelJugador);
        add(labelNombreJugador);

        FlowLayout fl = new FlowLayout(); //Ayuda a organizar los elementos en el panel de izquierda a derecha
        setLayout(fl);
    }

}
