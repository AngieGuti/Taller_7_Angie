package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class top10 extends JFrame { //ventana que muestra el top 10 de los jugadores
    private JPanel panelTop10;
    private JPanel panelOpciones;
    private Jpanel panelJugadasJugador;

    public top10() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        top10 interfaz = new top10();
        interfaz.setVisible(true);
    }

}
