
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;

/**
 *
 * @author Samira
 */
public class DaoUsuario {
    
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void salvar(BeansUsuario mod){
        conex.conexao();;
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO usuario(idUsuario,  login, senha, nome, "
                    + "cpf, rg, email, telefone) VALUES (?, ?, ?, ?, ?, ?, ?, ? )");
            pst.setInt(1, mod.getIdUsuario());
            pst.setString(2,mod.getLogin() );
            pst.setString(3, mod.getSenha());
            pst.setString(4, mod.getNome());
            pst.setString(5, mod.getCpf());
            pst.setString(6, mod.getRg());
            pst.setString(7, mod.getEmail());
            pst.setString(8, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void editar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE usuario SET login=?,nome=?,"
                    + "cpf=?,rg=?,email=?,telefone=? WHERE  idUsuario=? ") ;                   
            
            pst.setString(1,mod.getLogin() );
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getRg());
            pst.setString(5, mod.getEmail());
            pst.setString(6, mod.getTelefone());
            pst.setInt(7, mod.getIdUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario Alterado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Editar Usuário! \n"+ex.getMessage());
        }
        
        
        conex.desconecta();
    }
    
    public void excluir(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM usuario WHERE idUsuario=? ") ;                   
            
            pst.setInt(1, mod.getIdUsuario());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario Excluído com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuário! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("SELECT *FROM usuario WHERE nome like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setIdUsuario(conex.rs.getInt("idUsuario"));
            mod.setLogin(conex.rs.getString("login"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setRg(conex.rs.getString("rg"));
            mod.setTelefone(conex.rs.getString("telefone"));
            mod.setEmail(conex.rs.getString("email"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Usuário nao Cadastrado!");
        }
        conex.desconecta();
        
        return mod;
    }
}
