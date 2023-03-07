package co.edu.unbosque.controller;

import java.io.*;
import java.net.*;

import co.edu.unbosque.model.PokemonDTO;

public class Cliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String servidor = "localhost"; // Dirección IP del servidor
        int puerto = 8888; // Puerto del servidor
        Socket socketCliente = null;
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;
 

        try {
            socketCliente = new Socket(servidor, puerto); // Conecta con el servidor
            salida = new ObjectOutputStream(socketCliente.getOutputStream());
            entrada = new ObjectInputStream(socketCliente.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Dirección del servidor desconocida: " + servidor);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Error al conectarse al servidor: " + servidor);
            System.exit(1);
        }

        // Envía un mensaje al servidor
        PokemonDTO pokemon = new PokemonDTO("Pikachu", "Eléctrico", 25);
        salida.writeObject(pokemon);

        // Lee la respuesta del servidor
        Object respuesta = entrada.readInt();
    }
}
