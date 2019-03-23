import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDB {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public MessageDB() {
        connection = ConexaoBanco.getConnection();
    }

    public Message select(Message m) throws SQLException {
        try {
            PreparedStatement stmt = this.connection
                            .prepareStatement("select Resposta from Palavra where Pergunta = ? ");

            stmt.setString(1, m.getPergunta());

            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
        		m.setResposta(rs.getString("Resposta"));
            } 

            return m;
            
            
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            connection.close();
        }
		return m;

    }
}