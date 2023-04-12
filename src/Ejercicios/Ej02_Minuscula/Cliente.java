package Ejercicios.Ej02_Minuscula;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Locale;

public class Cliente {
    public static void main(String[] args) {
        String Host = "localhost";
        int puerto = 6000; //puerto remoto
        Socket cliente = null; //conecta

        try {
            //ABRIR SOCKET
            cliente = new Socket(Host, puerto);
            InetAddress i = cliente.getInetAddress();
            //System.out.println("[Cliente] conectado");
            //System.out.println("[Cliente] Puerto local: " + Cliente.getLocalPort());
            //System.out.println("[Cliente] Puerto Remoto: " + Cliente.getPort());
            //System.out.println("[Cliente] Host Remoto: " + i.getHostName());
            //System.out.println("Cliente] IP Host Remoto: " + i.getHostAddress());

            DataInputStream dis = new DataInputStream(cliente.getInputStream());

            DataOutputStream dos = new DataOutputStream(cliente.getOutputStream());

            dos.writeUTF(dis.readUTF().toLowerCase(Locale.ROOT));

            //Cerrar recursos
            cliente.close(); //Cierra el socket
            dis.close();
            dos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
