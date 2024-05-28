package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JPanel;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.Font;


public class PanelSuperior extends JPanel{
    
    private JLabel tamanioLabel;
    private JLabel dificultadLabel;
    private JComboBox<String> tamanioComboBox;
    private ButtonGroup opcionesDificultad; //Necesario para que solo se pueda seleccionar un radio button a la vez
    private JRadioButton botonDificultadFacil;
    private JRadioButton botonDificultadMedia;
    private JRadioButton botonDificultadDura;


    public PanelSuperior() {
        Font font = new Font("Comic Sans MS", Font.BOLD,12);
        tamanioLabel = new JLabel("Tamaño del tablero:");
        tamanioLabel.setFont(font);

        dificultadLabel = new JLabel("Dificultad:");
		dificultadLabel.setFont(font);


        String[] tamanios = new String[] {"3x3", "5x5", "7x7", "9x9", "10x10"};
		tamanioComboBox = new JComboBox<>(tamanios);
		tamanioComboBox.setSelectedIndex(1);
        tamanioComboBox.setFont(font);

        opcionesDificultad = new ButtonGroup(); 

        botonDificultadFacil = new JRadioButton("Facil", true);
        botonDificultadFacil.setFont(font);
        opcionesDificultad.add(botonDificultadFacil);

        botonDificultadMedia = new JRadioButton("Media");
        botonDificultadFacil.setFont(font);
        opcionesDificultad.add(botonDificultadMedia);

        botonDificultadDura = new JRadioButton("Dificil");
        botonDificultadFacil.setFont(font);
        opcionesDificultad.add(botonDificultadDura);

        add(tamanioLabel);
        add(tamanioComboBox);
        add(dificultadLabel);
        add(botonDificultadFacil);
        add(botonDificultadMedia);
        add(botonDificultadDura);
        
        FlowLayout fl = new FlowLayout(); //Ayuda a organizar los elementos en el panel de izquierda a derecha
		setLayout(fl);
    }
}