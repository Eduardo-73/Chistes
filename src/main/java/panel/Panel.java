/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author edu
 */
public class Panel extends JPanel {

    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 500;

    private JButton generarChistes, cerrar;
    private JLabel lblLenguaje, lblCategoria, lblCantidad;
    private JComboBox cB;
    private JRadioButton cualquier, customizado;
    private JCheckBox prog, vari, osc, ret, esc, nav;
    private ButtonGroup grupo;
    private JTextField cantidadTexto;

    public Panel() {
        this.setLayout(new FlowLayout());
        this.setBackground(Color.DARK_GRAY);
        this.setSize(ANCHO_PANEL, ALTO_PANEL);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        lblLenguaje = new JLabel("Seleccione el idioma: ");
        lblLenguaje.setForeground(Color.white);
        this.add(lblLenguaje);
        String[] paises = {"es - español", "es - inglés", "de - alemán",
            "cs - checo", "fr - francés", "pt - portugués"};
        cB = new JComboBox(paises);
        this.add(cB);
        lblCategoria = new JLabel("Seleccione categoria/categorías: ");
        lblCategoria.setForeground(Color.white);
        this.add(lblCategoria);
        cualquier = new JRadioButton("Cualquier");
        cualquier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == cualquier) {
                    prog.setEnabled(false);
                    vari.setEnabled(false);
                    osc.setEnabled(false);
                    ret.setEnabled(false);
                    esc.setEnabled(false);
                    nav.setEnabled(false);
                }
            }
        });
        this.add(cualquier);
        customizado = new JRadioButton("Custom");
        customizado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == customizado) {
                    prog.setEnabled(true);
                    vari.setEnabled(true);
                    osc.setEnabled(true);
                    ret.setEnabled(true);
                    esc.setEnabled(true);
                    nav.setEnabled(true);
                }
            }
        });
        this.add(customizado);
        prog = new JCheckBox("Programación");
        prog.setEnabled(false);
        this.add(prog);
        vari = new JCheckBox("Varios");
        vari.setEnabled(false);
        this.add(vari);
        osc = new JCheckBox("Oscuro");
        osc.setEnabled(false);
        this.add(osc);
        ret = new JCheckBox("Pun");
        ret.setEnabled(false);
        this.add(ret);
        esc = new JCheckBox("Spooky");
        esc.setEnabled(false);
        this.add(esc);
        nav = new JCheckBox("Navidad");
        nav.setEnabled(false);
        this.add(nav);
        grupo = new ButtonGroup();
        grupo.add(cualquier);
        grupo.add(customizado);
        lblCantidad = new JLabel("Cantidad de chistes: ");
        lblCantidad.setForeground(Color.white);
        this.add(lblCantidad);
        cantidadTexto = new JTextField(2);
        this.add(cantidadTexto);
        String stringCantidad = cantidadTexto.getText();
        if (!stringCantidad.isEmpty()) {
            int cant = Integer.parseInt(stringCantidad);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Introduce una cantidad");
        }

    }
}
