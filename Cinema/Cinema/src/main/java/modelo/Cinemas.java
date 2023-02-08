
package modelo;
public class Cinemas {
    private int Codigo;
    private String NomeFantasia;
    private String Rua;
    private String Cidade;
    private String Bairro;
    private String Estado;
    private int Lotacao;
    
       public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

   
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEstado() {
        return Estado;
    }

  
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public int getLotacao() {
        return Lotacao;
    }

    public void setLotacao(int Lotacao) {
        this.Lotacao = Lotacao;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 @Override 
  public String toString(){
return this.getNomeFantasia();
  }
  }
