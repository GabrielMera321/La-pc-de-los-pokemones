package co.edu.unbosque.controller;

import co.edu.unbosque.model.EntrenadorDTO;
import co.edu.unbosque.model.PokemonDTO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

    private static final int PUERTO = 8888;

    {
        try (ServerSocket serverSocket = new ServerSocket(PUERTO)) {
            System.out.println("Servidor iniciado en el puerto " + PUERTO);

            while (true) {
                // Aceptamos conexiones entrantes
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado desde " + socket.getInetAddress());

                // Creamos los flujos de entrada y salida
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

                // Manejamos la solicitud del cliente
                Thread thread = new Thread(() -> {
                    try {
                        while (true) {
                            // Esperamos a recibir un objeto del cliente
                            Object objeto = in.readObject();

                            if (objeto instanceof EntrenadorDTO) {
                                // Si el objeto es un entrenador, lo recibimos y respondemos con un mensaje de confirmación
                                EntrenadorDTO entrenador = (EntrenadorDTO) objeto;
                                System.out.println("Recibido entrenador: " + entrenador.getNombre());
                                out.writeObject("Entrenador " + entrenador.getNombre() + " recibido correctamente.");
                                out.flush();
                            } else if (objeto instanceof String) {
                                String accion = (String) objeto;

                                if (accion.equals("LISTAR_POKEMONS")) {
                                    // Si la acción es LISTAR_POKEMONS, devolvemos la lista de pokemons
                                    ArrayList<PokemonDTO> pokemons = new ArrayList<>();
                                    pokemons.add(new PokemonDTO("Pikachu", "Pika", 10));
                                    pokemons.add(new PokemonDTO("Squirtle", "Squirt", 8));
                                    pokemons.add(new PokemonDTO("Bulbasaur", "Bulba", 7));
                                    pokemons.add(new PokemonDTO("Charmander", "Char", 9));
                                    out.writeObject(pokemons);
                                    out.flush();
                                } else if (accion.equals("LIBERAR_POKEMON")) {
                                    // Si la acción es LIBERAR_POKEMON, liberamos el pokemon y respondemos con un mensaje de confirmación
                                    PokemonDTO pokemon = (PokemonDTO) in.readObject();
                                    System.out.println("Pokemon " + pokemon.getNombre() + " liberado.");
                                    out.writeObject("Pokemon " + pokemon.getNombre() + " liberado correctamente.");
                                    out.flush();
                                }
                            }
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            // Cerramos los flujos y el socket
                            out.close();
                            in.close();
                            socket.close();
                            System.out.println("Cliente desconectado.");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                // Iniciamos un nuevo hilo para manejar la conexión del cliente
                thread.start();
            }
        } catch (IOException e) {
            System.err.println("Error de entrada/salida en el servidor.");
            e.printStackTrace();
        }
    }
}

