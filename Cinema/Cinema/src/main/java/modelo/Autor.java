
package modelo;

public class Autor {

    private int CodAutor;
    private String Nome;
    private String Nacionalidade;
    private String Sexo;
    private String Idade;
    
    public int getCodAutor() {
        return CodAutor;
    }

    /**
     * @param CodAutor the CodAutor to set
     */
    public void setCodAutor(int CodAutor) {
        this.CodAutor = CodAutor;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Nacionalidade
     */
    public String getNacionalidade() {
        return Nacionalidade;
    }

    /**
     * @param Nacionalidade the Nacionalidade to set
     */
    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Idade
     */
    public String getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(String Idade) {
        this.Idade = Idade;
    }
 @Override 
  public String toString(){
return this.getNome();
  }
  
}
