
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {
    
    private static final long serialVersionUID = -1L;
    
    private String pergunta;
    private String resposta;
    
    private static List<Message> lstMessage = new ArrayList<Message>();
    
    public Message (String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }
    
    public void setResposta(String resposta) {
        this.resposta =resposta;
    }

    public void Resposta(String resposta) {
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta =pergunta;
    }
    
    public static List<Message> getLstMessage() {
        return lstMessage;
    }
    
    public static void setLstResposta(Message msg) {
        lstMessage.add(msg);
    }    
}
