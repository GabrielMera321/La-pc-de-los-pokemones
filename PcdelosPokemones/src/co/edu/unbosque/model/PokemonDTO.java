package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PokemonDTO {
    private String nombre;
    private String mote;
    private int nivel;
    private ArrayList<String> ataques;

    public PokemonDTO(String nombre, String mote, int nivel) {
        this.nombre = nombre;
        this.mote = mote;
        this.nivel = nivel;
        this.ataques = generarAtaquesAleatorios();
    }

    private ArrayList<String> generarAtaquesAleatorios() {
        ArrayList<String> ataquesPosibles = new ArrayList<>(
                Arrays.asList("Acua Jet", "Aerochorro", "Ataque Aéreo", "Ataque Rápido", "Bola Voltio",
                        "Canto", "Carga Dragón", "Chirrido", "Cola Dragón", "Descanso",
                        "Disparo Lodo", "Furia Dragon", "Giga Impacto", "Golpe Aéreo", "Hidrobomba",
                        "Hojas Navaja", "Llamarada", "Psíquico")
        );

        Collections.shuffle(ataquesPosibles);
        return new ArrayList<>(ataquesPosibles.subList(0, 4));
    }

    public String getNombre() {
        return nombre;
    }

    public String getMote() {
        return mote;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<String> getAtaques() {
        return ataques;
    }
}



