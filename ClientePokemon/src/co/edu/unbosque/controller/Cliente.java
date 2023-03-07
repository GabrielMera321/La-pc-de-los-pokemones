package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import co.edu.unbosque.model.EntrenadorDTO;
import co.edu.unbosque.model.PokemonDTO;

public class Cliente {
    
	private static final String HOST = "localhost";
    private static final int PUERTO = 8888;

    {
        for (int i = 0; i < 4; i++) {
            Thread hilo = new Thread(() -> {
                try (Socket socket = new Socket(HOST, PUERTO);
                     ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                     ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

                    // La secuencia de acciones es la misma que en el ejemplo anterior
                    // Creamos un entrenador y algunos pokemons
                    EntrenadorDTO entrenador = new EntrenadorDTO("Ash Ketchum");
                    PokemonDTO pikachu = new PokemonDTO("Pikachu", "Pika", 10);
                    PokemonDTO charmander = new PokemonDTO("Charmander", "Char", 7);
                    entrenador.agregarPokemon(pikachu);
                    entrenador.agregarPokemon(charmander);

                    // Enviamos el entrenador al servidor
                    out.writeObject(entrenador);
                    out.flush();

                    // Recibimos la respuesta del servidor
                    String respuesta = (String) in.readObject();
                    System.out.println(respuesta);

                    // Pedimos al servidor la lista de pokemons
                    out.writeObject("LISTAR_POKEMONS");
                    out.flush();
                    ArrayList<PokemonDTO> pokemons = (ArrayList<PokemonDTO>) in.readObject();
                    System.out.println("Pokemons en el servidor:");
                    for (PokemonDTO pokemon : pokemons) {
                        System.out.println(pokemon.getNombre());
                    }

                    // Liberamos un pokemon
                    out.writeObject("LIBERAR_POKEMON");
                    out.writeObject(charmander);
                    out.flush();
                    respuesta = (String) in.readObject();
                    System.out.println(respuesta);

                    // Pedimos al servidor la lista de pokemons actualizada
                    out.writeObject("LISTAR_POKEMONS");
                    out.flush();
                    pokemons = (ArrayList<PokemonDTO>) in.readObject();
                    System.out.println("Pokemons en el servidor:");
                    for (PokemonDTO pokemon : pokemons) {
                        System.out.println(pokemon.getNombre());
                    }

                } catch (UnknownHostException e) {
                    System.err.println("Error: Host desconocido");
                    e.printStackTrace();
                } catch (IOException e) {
                    System.err.println("Error de entrada/salida");
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    System.err.println("Error: Clase no encontrada");
                    e.printStackTrace();
                }
            });
            hilo.start();
        }
    }

}

