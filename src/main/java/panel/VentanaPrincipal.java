/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panel;

import javax.swing.JFrame;

/**
 *
 * @author eduardo
 */
public class VentanaPrincipal extends JFrame{
    
    public static final int ANCHO_FRAME = 600;
    public static final int ALTO_FRAME = 200;
    
    private Panel panel;
    
    public VentanaPrincipal(){
        crearVentana();
        panel = new Panel();
        this.add(panel);
        this.setVisible(true);
    }
    
     private void crearVentana(){
        this.setBounds(600, 150, ANCHO_FRAME, ALTO_FRAME);
        this.setTitle("Chistes de Programación");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
