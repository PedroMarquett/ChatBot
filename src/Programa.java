import javax.swing.JOptionPane;

public class Programa {

	//private decimal Valor;
	private String Tipo;
    
    public static void main(String[] args) {

        String  nome = (String)JOptionPane.showInputDialog("Digite seu nome","Digite");
        //int porta = Integer.parseInt(JOptionPane.showInputDialog("Informe a Porta","5000"));
        
        //Conexao c = new Conexao(ip, porta);
        Conexao c = new Conexao(nome);
        
        JanelaChat j = new JanelaChat(c);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}