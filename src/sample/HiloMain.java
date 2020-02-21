package sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloMain extends Thread {

    String nombre;
    Socket socket;

    public HiloMain (String nombre, Socket socket) {

        super(nombre);
        this.socket = socket ;

    }

    public void run(){

        ClaseMensaje nuevoMensaje = new ClaseMensaje();
        ObjectInputStream ois = null;

        try {

            ois = (ObjectInputStream) socket.getInputStream();
            nuevoMensaje = (ClaseMensaje) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(nuevoMensaje.getNickname()+" : "+nuevoMensaje.getMensaje());
    }
}