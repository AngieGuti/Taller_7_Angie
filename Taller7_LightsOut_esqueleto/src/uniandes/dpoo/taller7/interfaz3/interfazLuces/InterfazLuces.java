package uniandes.dpoo.taller7.interfaz3.interfazLuces;

import javax.swing.JFrame;
import java.awt.BorderLayout;



import uniandes.dpoo.taller7.interfaz3.PanelSuperior;
import uniandes.dpoo.taller7.interfaz3.PanelOpcionesDerecha;
import uniandes.dpoo.taller7.interfaz3.PanelInferior;


public class InterfazLuces extends JFrame {
    private PanelSuperior panelSuperior;
    private PanelOpcionesDerecha panelOpcionesDerecha;
    private PanelInferior panelInferior;

    /*
    * Constructor de la clase InterfazLuces
     */ 
    public InterfazLuces() {
        setTitle("Lights_Out");
	    setSize(600, 600); //Dimensiones de la ventana
	    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Cierra la ventana pero no termina la ejecución del programa
        setLocationRelativeTo(null); //Centra la ventana en la pantalla
    
        setLayout(new BorderLayout()); //Establece el tipo de layout de la ventana
        
        panelSuperior = new PanelSuperior();
        add(panelSuperior, BorderLayout.NORTH);

        panelOpcionesDerecha = new PanelOpcionesDerecha();
        add(panelOpcionesDerecha, BorderLayout.EAST);

        panelInferior = new PanelInferior();
        add(panelInferior, BorderLayout.SOUTH);
    
}

public static void main(String[] args) {
    InterfazLuces interfaz = new InterfazLuces();
    interfaz.setVisible(true);
}
}