package Ejercicios.Ej04_UDPMayusculas;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {
    /*
     * Crea un programa cliente usando sockets UDP que envíe el texto escrito desde la entrada estándar al servidor.
     * El servidor le davolverá la cadena en mayúsculas. El proceso de entrada de datos finalizará cuando el cliente introduzca un asterisco.
     */

    public static void main(String[] args) {
        int port = 12345;// Puerto

        try {
            byte[] buffer = new byte[1024];
            DatagramSocket socketReceive = new DatagramSocket(port);
            DatagramPacket datagramReceive = new DatagramPacket(buffer, buffer.length);

            socketReceive.receive(datagramReceive);

            String cadena = new String(datagramReceive.getData()).trim();
            System.out.println("Recibido: " + cadena);
            /*
            InetAddress destino = InetAddress.getByName("localhost");
            DatagramPacket datagramSend = new DatagramPacket(cadena.toUpperCase().getBytes(), cadena.getBytes().length, destino, port);
            DatagramSocket socketSend = new DatagramSocket(12345);
            socketSend.send(datagramSend);

            //Cerrar recursos
            socketReceive.close();
            socketSend.close();
             */

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}