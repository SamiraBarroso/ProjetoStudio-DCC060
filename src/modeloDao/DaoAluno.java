
package modeloDao;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAluno;
import modeloConection.ConexaoBD;

/**
 *
 * @author Samira
 */
public class DaoAluno {
    ConexaoBD conex = new ConexaoBD();
    BeansAluno mod = new BeansAluno();
    
    public void salvar(BeansAluno mod){
        conex.conexao();;
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO aluno (idAluno, nome,dataNascimento, cpf,"
                    + " rg,sexo,email,rua, numero, cidade, estado, pais,telefone) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,? )");
            pst.setInt(1, mod.getIdAluno());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getDataNasc());
            pst.setString(4, mod.getCpf());
            pst.setString(5,mod.getRg());
            pst.setString(6,mod.getSexo());
            pst.setString(7,mod.getEmail());
            pst.setString(8, mod.getRua());
            pst.setInt(9, mod.getNumero());
            pst.setString(10, mod.getCidade());
            pst.setString(11, mod.getEstado());
            pst.setString(12, mod.getPais());
            pst.setString(13, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno inserido com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir aluno! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
      
    public void editar(BeansAluno mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE aluno SET nome=?,dataNascimento=?,cpf=?,"
                    + "rg=?,sexo=?,email=?,rua=?,numero=?,cidade=?,estado=?,pais=?,telefone=?"
                    + " WHERE  idAluno=? ") ;                   
     
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getDataNasc());
            pst.setString(3, mod.getCpf());
            pst.setString(4,mod.getRg());
            pst.setString(5,mod.getSexo());
            pst.setString(6,mod.getEmail());
            pst.setString(7, mod.getRua());
            pst.setInt(8, mod.getNumero());
            pst.setString(9, mod.getCidade());
            pst.setString(10, mod.getEstado());
            pst.setString(11, mod.getPais());
            pst.setString(12, mod.getTelefone());
             pst.setInt(13, mod.getIdAluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno Alterado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Editar aluno! \n"+ex.getMessage());
        }  
        
        conex.desconecta();
    }
    
    public void excluir(BeansAluno mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM aluno WHERE idAluno=? ") ;                   
            
            pst.setInt(1, mod.getIdAluno());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Aluno Excluído com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Aluno! \n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    
    public BeansAluno buscaAluno(BeansAluno mod){
        conex.conexao();
        conex.executaSql("SELECT *FROM aluno WHERE nome like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setIdAluno(conex.rs.getInt("idAluno"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setDataNasc(conex.rs.getString("dataNascimento"));
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setRg(conex.rs.getString("rg"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setEmail(conex.rs.getString("email"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setEstado(conex.rs.getString("cidade"));
            mod.setPais(conex.rs.getString("sexo"));
            mod.setTelefone(conex.rs.getString("telefone"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Aluno nao Cadastrado!");
        }
        conex.desconecta();
        
        return mod;
    }
}
