package uniandes.dpoo.taller7.interfaz1.interfazLuces;

import javax.swing.JFrame;


public class InterfazLuces extends JFrame {
    
    /*
    * Constructor de la clase InterfazLuces
     */ 
    public InterfazLuces() {
        setTitle("Lights_Out");
	    setSize(700, 700); //Dimensiones de la ventana
        setResizable(false); //No se puede cambiar el tamaño de la ventana
	    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Cierra la ventana pero no termina la ejecución del programa
        setLocationRelativeTo(null); //Centra la ventana en la pantalla
    
}

public static void main(String[] args) {
    InterfazLuces interfaz = new InterfazLuces();
    interfaz.setVisible(true);
}

}