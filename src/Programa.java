import javax.swing.JOptionPane;

public class Programa {

	//private decimal Valor;
	private String Tipo;
    
    public static void main(String[] args) {

        String  nome = (String)JOptionPane.showInputDialog("Digite seu nome","Digite");

        Conexao c = new Conexao(nome);
        
        JanelaChat j = new JanelaChat(c);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}