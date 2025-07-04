package parcialfinal;

import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SocketServer {

    public class ServidorCuadrado {

        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                System.out.println("Servidor escuchando en el puerto...");

                while (true) {
                    Socket socketCliente = serverSocket.accept();
                    System.out.println("Se a conectado un nuevo cliente desde: " + socketCliente.getInetAddress() + ":)");
                    new Thread(new ManejadorCLiente(socketCliente)).start();
                }

            } catch (IOException e) {
                System.out.println("Error en el servidor: " + e.getMessage() + ":(");
            }
        }
    }
}
