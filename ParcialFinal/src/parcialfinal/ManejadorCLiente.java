/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jcrom
 */
public class ManejadorCLiente implements Runnable {

    private Socket socketDelCliente;   

    public ManejadorCLiente(Socket socketDeCliente) {
        this.socketDelCliente = socketDeCliente;
    }

    @Override
    public void run() {
        try {
            InputStream is = socketDelCliente.getInputStream();
            OutputStream os = socketDelCliente.getOutputStream();

            BufferedReader Nombre = new BufferedReader(new InputStreamReader(is));
            BufferedReader numEntero = new BufferedReader(new InputStreamReader(is));
            PrintWriter writer = new PrintWriter(os, true);

            String nombre = Nombre.readLine();
            String numentero = numEntero.readLine();
            
            
            int num = Integer.parseInt(numentero);
            int cuadrado = num * num;
            LocalDateTime ldt = LocalDateTime.now();
            String fecha = ldt.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:m:ss"));

            writer.println("Bienvenido " + nombre + 
                    " el numero al cuadrado es " + cuadrado +
                    " Fecha y hora = " + fecha);
            socketDelCliente.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
