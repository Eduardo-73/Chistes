/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panel;

import conexion_http.ConexionHTTP;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modelos2.Joke;
import modelos2.ListaChistes;
import serviciojson.JsonService;

/**
 *
 * @author edu
 */
public class Panel extends JPanel {

    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 500;

    private JButton btnGenerar, btnCerrar;
    private JLabel lblLenguaje, lblCategoria, lblCantidad;
    private JComboBox cB;
    private JRadioButton cualquier, customizado;
    private JCheckBox prog, vari, osc, ret, esc, nav;
    private ButtonGroup grupo;
    private JTextField cantidadTexto;
    private String categoria, idioma;
    private int cant;

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
        String[] paises = {"es - Español", "en - Inglés", "de - Alemán",
            "cs - Checo", "fr - Francés", "pt - Portugués"};
        cB = new JComboBox(paises);
        this.add(cB);
        lblCategoria = new JLabel("Seleccione categoria/categorías: ");
        lblCategoria.setForeground(Color.white);
        this.add(lblCategoria);
        cualquier = new JRadioButton("Any");
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
        prog = new JCheckBox("Programming");
        prog.setEnabled(false);
        this.add(prog);
        vari = new JCheckBox("Misc");
        vari.setEnabled(false);
        this.add(vari);
        osc = new JCheckBox("Dark");
        osc.setEnabled(false);
        this.add(osc);
        ret = new JCheckBox("Pun");
        ret.setEnabled(false);
        this.add(ret);
        esc = new JCheckBox("Spooky");
        esc.setEnabled(false);
        this.add(esc);
        nav = new JCheckBox("Christmas");
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
        cantidadTexto.setText("1");
        btnGenerar = new JButton("Generar chistes");
        this.add(btnGenerar);
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (prog.isSelected()) {
                    categoria = "Programming";
                } else if (vari.isSelected()) {
                    categoria = "Misc";
                } else if (osc.isSelected()) {
                    categoria = "Dark";
                } else if (ret.isSelected()) {
                    categoria = "Pun";
                } else if (esc.isSelected()) {
                    categoria = "Spooky";
                } else if (nav.isSelected()) {
                    categoria = "Christmas";
                } else if (cualquier.isSelected()) {
                    categoria = "Any";
                }
                String stringCantidad = cantidadTexto.getText();
                if (!stringCantidad.isEmpty()) {
                    cant = Integer.parseInt(stringCantidad);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Introduce una cantidad");
                }
                idioma = cB.getSelectedItem().toString();
                System.out.println(crearURL(categoria, idioma, cant));
                String url = crearURL(categoria, idioma, cant);
                try {
                    JOptionPane.showMessageDialog(null,
                            generarChistes(url));
                } catch (IOException ex) {
                    System.out.println("Error");;
                }
            }
        });
        btnCerrar = new JButton("Salir");
        this.add(btnCerrar);
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    private String crearURL(String categoria, String idioma,
            int cantidad) {
        String urlBase = "https://v2.jokeapi.dev/joke/";
        String[] s = idioma.split("\\s*-\\s*");
        String crear = urlBase + categoria + "?lang=" + s[0] + "&amount=" + cantidad;
        return crear;
    }

    private String generarChistes(String url) throws IOException {
        String fichero = ConexionHTTP.peticionHttpGet(url);
        ListaChistes chistes = (ListaChistes) JsonService.stringToPojo(fichero, ListaChistes.class);
        List<String> lista = new ArrayList();
        String mostrar = "";
        for (int i = 0; i < chistes.getJokes().size(); i++) {
            if (chistes.getJokes().get(i).getType().equals("twopart")) {
                lista.add(chistes.getJokes().get(i).getSetup() + " " + chistes.getJokes().get(i).getDelivery());
            } else {
                lista.add(chistes.getJokes().get(i).getJoke());
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            mostrar += (i + 1) + " --> " + lista.get(i);
        }
        return mostrar;
    }
}
