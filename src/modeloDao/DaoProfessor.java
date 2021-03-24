
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansProfessor;


/**
 *
 * @author Samira
 */
public class DaoProfessor {
    ConexaoBD conex = new ConexaoBD();
    BeansProfessor mod = new BeansProfessor();
    
    public void salvar(BeansProfessor mod){
        conex.conexao();;
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO professor (idUsuario, dataNascimento, sexo,"
                    + " rua, numero, cidade, estado, pais, dataContratacao, especialidade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )");
            pst.setInt(1, mod.getIdUsuario());
            pst.setDate(2, (Date) mod.getDataNascimento());
            pst.setString(3,mod.getSex());
            pst.setString(4, mod.getRua());
            pst.setInt(5, mod.getNumero());
            pst.setString(6, mod.getCidade());
            pst.setString(7, mod.getEstado());
            pst.setString(8, mod.getPais());
            pst.setDate(9, (Date) mod.getDataContratacao());
            pst.setString(10, mod.getEspecialidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor inserido com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Professor! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
      
    public void editar(BeansProfessor mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE professor SET dataNascimento=?,sexo=?,"
                    + "rua=?,numero=?,cidade=?,estado=?,pais=?, dataContratacao=?,especialidade=?"
                    + " WHERE  idUsuario=? ") ;                   
 
            pst.setDate(1, (Date) mod.getDataNascimento());
            pst.setString(2, mod.getSex());
            pst.setString(3, mod.getRua());
            pst.setInt(4, mod.getNumero());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEstado());
            pst.setString(7, mod.getPais());
            pst.setDate(8, (Date) mod.getDataContratacao());
            pst.setString(9, mod.getEspecialidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor Alterado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Editar Professor! \n"+ex.getMessage());
        }
        
        
        conex.desconecta();
    }
    
    public void excluir(BeansProfessor mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM professor WHERE idUsuario=? ") ;                   
            
            pst.setInt(1, mod.getIdUsuario());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Professor Excluído com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Professor! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    
//    public BeansProfessor buscaUsuario(BeansProfessor mod){
//        conex.conexao();
//        conex.executaSql("SELECT *FROM professor WHERE nome like '%"+mod.getPesquisa()+"%'");
//        try {
//            conex.rs.first();
//            mod.setIdUsuario(conex.rs.getInt("idUsuario"));
//            mod.setLogin(conex.rs.getString("login"));
//            mod.setNome(conex.rs.getString("nome"));
//            mod.setCpf(conex.rs.getString("cpf"));
//            mod.setRg(conex.rs.getString("rg"));
//            mod.setTelefone(conex.rs.getString("telefone"));
//            mod.setEmail(conex.rs.getString("email"));
//            
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "Usuário nao Cadastrado!");
//        }
//        conex.desconecta();
//        
//        return mod;
//    }
}
