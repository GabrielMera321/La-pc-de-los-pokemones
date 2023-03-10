package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.CadenasException;
import co.edu.unbosque.model.EntrenadorDAO;
import co.edu.unbosque.model.EntrenadorDTO;
import co.edu.unbosque.model.PokemonDTO;
import co.edu.unbosque.vista.VentanaPrincipal;

public class Controller implements ActionListener {
	private VentanaPrincipal vp;
	private EntrenadorDTO ent;
	
	
	public Controller() {

		vp = new VentanaPrincipal();
		iniciar();
		
	}
	
	public void iniciar() {
		vp.getAgregar().addActionListener(this);
		vp.getAgregar().setActionCommand("Agregar");

		vp.getMostrar_todo().addActionListener(this);
		vp.getMostrar_todo().setActionCommand("Mostrar");

		vp.getBuscar_por_nombre().addActionListener(this);
		vp.getBuscar_por_nombre().setActionCommand("Buscar");

		vp.setVisible(true);
		
	}
	
		public String cadenas(String cadena) throws CadenasException {

			String cadenaCorrecta = "";
			if(cadena == null) {
				return cadena;
			}else {
				if (!cadena.isBlank()) {
					for (int i = 0; i < cadena.length(); i++) {
						if (Character.isDigit(cadena.charAt(i))) {
							throw new CadenasException("El campo no puede contener numeros.");
						} else {
							cadenaCorrecta = cadena;
						}
					}
				}else {
					throw new CadenasException("El campo no puede quedar en blanco");
				}
			}
		
			return cadenaCorrecta;
		}
 {
        // Crear un entrenador
        EntrenadorDTO ash = new EntrenadorDTO("Ash");

        // Crear algunos pokemones
        PokemonDTO pikachu = new PokemonDTO("Pikachu", "Chispitas", 5);
        PokemonDTO charmander = new PokemonDTO("Charmander", "Fénix", 7);
        PokemonDTO squirtle = new PokemonDTO("Squirtle", "Burbujas", 3);

        // Agregar los pokemones al bolsillo del entrenador
        EntrenadorDAO controlador = new EntrenadorDAO();
        controlador.agregarPokemon(ash, pikachu);
        controlador.agregarPokemon(ash, charmander);
        controlador.agregarPokemon(ash, squirtle);

        // Imprimir los pokemones en el bolsillo del entrenador
        controlador.imprimirBolsillo(ash);

        // Liberar un pokemon del bolsillo del entrenador
        controlador.liberarPokemon(ash, charmander);

        // Imprimir los pokemones en el bolsillo del entrenador después de liberar uno
        controlador.imprimirBolsillo(ash);
    }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}


