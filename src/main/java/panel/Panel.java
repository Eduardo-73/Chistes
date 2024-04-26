/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panel;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author edu
 */
public class Panel extends JPanel {

    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 500;

    private JLabel lblLenguaje, lblCategoria, lblCantidad;
    private JComboBox cB;
    private JRadioButton rB;

    public Panel() {
        this.setLayout(new FlowLayout());
        this.setBackground(Color.DARK_GRAY);
        this.setSize(ANCHO_PANEL, ALTO_PANEL);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        lblLenguaje = new JLabel("");
        this.add(lblLenguaje);
    }
}
