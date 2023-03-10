package co.edu.unbosque.model;

import java.util.List;

public class CajaDTO {

    private List<PokemonDTO> caja1;
    private List<PokemonDTO> caja2;
    private List<PokemonDTO> caja3;
    
    public CajaDTO(List<PokemonDTO> caja1, List<PokemonDTO> caja2, List<PokemonDTO> caja3) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.caja3 = caja3;
    }
    
    public List<PokemonDTO> getCaja1() {
        return caja1;
    }
    
    public List<PokemonDTO> getCaja2() {
        return caja2;
    }
    
    public List<PokemonDTO> getCaja3() {
        return caja3;
    }
    
    public void insertarPokemonEnBolsillo(EntrenadorDTO entrenador, PokemonDTO pokemon) {
        entrenador.getBolsillo().add(pokemon);
    }
    
    public void sacarPokemonDeBolsillo(EntrenadorDTO entrenador, PokemonDTO pokemon) {
        entrenador.getBolsillo().remove(pokemon);
    }
}
