
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansModalidade;
import modeloConection.ConexaoBD;

/**
 *
 * @author Samira
 */
public class DaoModalidade {
     ConexaoBD conex = new ConexaoBD();
    BeansModalidade mod = new BeansModalidade();
    
    public void salvar(BeansModalidade mod){
        conex.conexao();;
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO modalidade(idModalidade,  descricao, observacao,valor)"
                    + " VALUES (?, ?, ?,? )");
            pst.setInt(1, mod.getIdModalidade());
            pst.setString(2,mod.getDescrição());
            pst.setString(3, mod.getObservacao());
            pst.setString(4, mod.getValor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Modalidade inserido com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Modalidade! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void editar(BeansModalidade mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE modalidade SET  descricao=?,observacao=?,"
                    + "valor=? WHERE  idModalidade=? ") ;                   
            
            pst.setString(1,mod.getDescrição());
            pst.setString(2, mod.getObservacao());
            pst.setString(3, mod.getValor());
            pst.setInt(4, mod.getIdModalidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Modalidade Alterado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Editar Modalidade! \n"+ex.getMessage());
        } 
        conex.desconecta();
    }
    
    public void excluir(BeansModalidade mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM modalidade WHERE idModalidade=? ") ;                   
            
            pst.setInt(1, mod.getIdModalidade());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Modalidade Excluído com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Modalidade! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    
    public BeansModalidade buscaModalidade(BeansModalidade mod){
        conex.conexao();
        conex.executaSql("SELECT *FROM modalidade WHERE idModalidade like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setIdModalidade(conex.rs.getInt("idModalidade"));
            mod.setDescrição(conex.rs.getString("descricao"));
            mod.setObservacao(conex.rs.getString("observacao"));
            mod.setValor(conex.rs.getString("valor"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Modalidade não Cadastrado!");
        }
        conex.desconecta();
        
        return mod;
    }
}
