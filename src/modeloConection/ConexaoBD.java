
package modeloConection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/studio?zeroDateTimeBehavior=convertToNull";
    private String usuario = "root";
    private String senha = "senha25";
    public Connection con; 
    
    public void conexao() {
          
        try {
            System.setProperty("jdbc.Drivers", driver);
 
            // Class.forName(driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            stm = con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o BD: \n"+ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ExecutarSql: \n"+ex.getMessage());
        }
        
        
    }
    
    public void desconecta(){
         try {
            stm.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "BD Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD: \n"+ex.getMessage());
        }
    }
    
}
