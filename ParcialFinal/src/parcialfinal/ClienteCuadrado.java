/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialfinal;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteCuadrado {

    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 5000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Conectado al servidor.");    
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa un numero entero: ");
            int numero = scanner.nextInt();
            writer.println(nombre);
            writer.println(numero);         
            String respuesta1 = reader.readLine();
            String respuesta2 = reader.readLine();
            String respuesta3 = reader.readLine();
            System.out.println(respuesta1);
            System.out.println(respuesta2);
            System.out.println(respuesta3);
            System.out.println("Conexion cerrada.");
        } catch (IOException e) {
            System.out.println("Error en el cliente: " + e.getMessage());
        }
    }
}
