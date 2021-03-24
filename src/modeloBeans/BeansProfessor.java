
package modeloBeans;
import java.util.Date;

public class BeansProfessor {
    private int idUsuario;
    private Date dataNascimento;
    private String sex;
    private String rua; 
    private int numero;
    private String cidade;
    private String estado;
    private String pais;
    private Date dataContratacao;
    private String especialidade;
    private String Pesquisa;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the Pesquisa
     */
    public String getPesquisa() {
        return Pesquisa;
    }

    /**
     * @param Pesquisa the Pesquisa to set
     */
    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
    
    
}
