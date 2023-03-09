package co.edu.unbosque.controller;

import co.edu.unbosque.model.EntrenadorDAO;
import co.edu.unbosque.model.EntrenadorDTO;
import co.edu.unbosque.model.PokemonDTO;

public class Controller {
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
}


