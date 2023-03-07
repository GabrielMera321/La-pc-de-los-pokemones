package co.edu.unbosque.controller;

import java.io.*;
import java.net.*;

import co.edu.unbosque.model.PokemonDTO;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidorSocket = null;
        Socket socketCliente = null;

        try {
            servidorSocket = new ServerSocket(8888); // Puerto del servidor
        } catch (IOException e) {
            System.err.println("No se puede abrir el puerto: 8888.");
            System.exit(1);
        }

        // Espera por conexiones de clientes
        while (true) {
            try {
                socketCliente = servidorSocket.accept(); // Espera por una conexión
                System.out.println("Cliente conectado desde " + socketCliente.getInetAddress().getHostName() + ".");
            } catch (IOException e) {
                System.err.println("Error al aceptar la conexión.");
                System.exit(1);
            }

            // Crea un nuevo hilo para manejar la conexión con el cliente
            Thread t = new Thread(new ManejadorCliente(socketCliente));
            t.start();
        }
    }
}

// Clase para manejar la conexión con un cliente
class ManejadorCliente implements Runnable {
    private Socket socketCliente = null;

    public ManejadorCliente(Socket socketCliente) {
        this.socketCliente = socketCliente;
    }

    public void run() {
        try {
            // Obtiene los streams de entrada y salida del socket
            ObjectOutputStream salida = new ObjectOutputStream(socketCliente.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(socketCliente.getInputStream());

            // Lee el mensaje del cliente
            Object mensaje = entrada.readObject();

            // Maneja el mensaje según su tipo
            if (mensaje instanceof PokemonDTO) {
                // Aquí se podría guardar el Pokémon en la caja del entrenador
                salida.writeObject("Se ha guardado el Pokémon.");
            } else if (mensaje instanceof Integer) {
                // Aquí se podría enviar la caja solicitada al cliente
                salida.writeObject("Aquí está la caja solicitada.");
            }

            // Cierra los streams y el socket
            salida.close();
            entrada.close();
            socketCliente.close();
        } catch (Exception e) {
            System.err.println("Error al manejar la conexión con el cliente.");
        }
    }
}

