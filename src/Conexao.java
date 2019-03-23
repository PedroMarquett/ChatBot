import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao extends Observable {

	private String nome;
    private String mensagem;

    public Conexao(String nome) {
        this.nome = nome;
        new Thread(new Recebe()).start();
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getNome() {
        return nome;
    }
   

    public void envia(String texto) {
        new Thread(new Envia(texto)).start();
    }

    public void notifica(String mensagem) {
        this.mensagem = mensagem;
        setChanged();
        notifyObservers();
    }

    class Recebe implements Runnable {

        byte[] dadosReceber = new byte[255];
        boolean erro = false;

        @Override
        public void run() {
            
        }
    }

    class Envia implements Runnable {

        String texto;

        public Envia(String texto) {
            this.texto = texto;
        }

        @Override
        public void run() {

            byte[] dados = texto.getBytes();

        }
    }
}