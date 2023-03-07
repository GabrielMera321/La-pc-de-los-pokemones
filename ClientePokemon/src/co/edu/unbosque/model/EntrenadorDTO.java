package co.edu.unbosque.model;

import java.util.ArrayList;

public class EntrenadorDTO {
    private String nombre;
    private ArrayList<PokemonDTO> bolsillo;

    public EntrenadorDTO(String nombre) {
        this.nombre = nombre;
        this.bolsillo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<PokemonDTO> getBolsillo() {
        return bolsillo;
    }

    public void agregarPokemon(PokemonDTO pokemon) {
        if (bolsillo.size() < 6) {
            bolsillo.add(pokemon);
        } else {
            System.out.println("El bolsillo está lleno, no se puede agregar más pokemon.");
        }
    }

    public void liberarPokemon(PokemonDTO pokemon) {
        bolsillo.remove(pokemon);
    }
}

