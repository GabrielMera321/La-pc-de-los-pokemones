package co.edu.unbosque.model;

public class EntrenadorDAO {

    public void agregarPokemon(EntrenadorDTO entrenador, PokemonDTO pokemon) {
        entrenador.agregarPokemon(pokemon);
    }

    public void liberarPokemon(EntrenadorDTO entrenador, PokemonDTO pokemon) {
        entrenador.liberarPokemon(pokemon);
    }

    public void imprimirBolsillo(EntrenadorDTO entrenador) {
        System.out.println("El entrenador " + entrenador.getNombre() + " tiene los siguientes pokemones:");
        for (PokemonDTO pokemon : entrenador.getBolsillo()) {
            System.out.println("- " + pokemon.getNombre() + " (" + pokemon.getMote() + "), nivel " + pokemon.getNivel() + ", ataques: " + pokemon.getAtaques());
        }
    }
}

