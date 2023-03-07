package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.model.PokemonDTO;

public class View<Almacenamiento> extends JFrame implements ActionListener {
    private Almacenamiento almacenamiento;
    private JButton[] botonesPokemon;
    private JButton botonTransferir;
    private JLabel mensaje;

    public View(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
        this.botonesPokemon = new JButton[6];
        this.botonTransferir = new JButton("Transferir al PC");
        this.mensaje = new JLabel("");

        // Configuración de la ventana
        this.setTitle("Almacenamiento Pokémon");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 300));

        // Panel para mostrar los Pokémon
        JPanel panelPokemon = new JPanel();
        for (int i = 0; i < 6; i++) {
            botonesPokemon[i] = new JButton();
            botonesPokemon[i].setPreferredSize(new Dimension(80, 80));
            botonesPokemon[i].addActionListener(this);
            panelPokemon.add(botonesPokemon[i]);
        }

        // Panel para el botón de transferir
        JPanel panelBoton = new JPanel();
        botonTransferir.addActionListener(this);
        panelBoton.add(botonTransferir);

        // Panel para el mensaje
        JPanel panelMensaje = new JPanel();
        panelMensaje.add(mensaje);

        // Agregar los paneles a la ventana
        this.add(panelPokemon, BorderLayout.CENTER);
        this.add(panelBoton, BorderLayout.SOUTH);
        this.add(panelMensaje, BorderLayout.NORTH);

        // Actualizar la GUI con los Pokémon actuales
        actualizarPokemon();
        this.pack();
        this.setVisible(true);
    }

    public void actualizarPokemon() {
        PokemonDTO[] caja = View.getCaja();
        for (int i = 0; i < 6; i++) {
            if (caja[i] == null) {
                botonesPokemon[i].setText("");
                botonesPokemon[i].setIcon(null);
            } else {
                botonesPokemon[i].setText(caja[i].getNombre());
                // Aquí se podría agregar un icono del Pokémon en lugar del texto
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        this.mensaje.setText(mensaje);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Si se hace clic en un botón de Pokémon
        for (int i = 0; i < 6; i++) {
            if (e.getSource() == botonesPokemon[i]) {
                if (View.getCaja()[i] == null) {
                    mostrarMensaje("No hay ningún Pokémon en este espacio.");
                } else {
                    View.liberarPokemon(i);
                    actualizarPokemon();
                    mostrarMensaje("Se liberó al Pokémon.");
                }
            }
        }
        // Si se hace clic en el botón de transferir
        if (e.getSource() == botonTransferir) {
            // Aquí se llamaría al controlador para que inicie la transferencia
        }
    }




	private static <invalid> invalid[] getCaja() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void liberarPokemon(int i) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
   }