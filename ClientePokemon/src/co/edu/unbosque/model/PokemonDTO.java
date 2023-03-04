package co.edu.unbosque.model;

public class PokemonDTO {
    private String nombre;
    private int nivel;
    private int ataque;
    private int defensa;
    private int velocidad;

    public PokemonDTO(String nombre, int nivel, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}


