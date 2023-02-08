
package modelo;

public class Filmes {

    private int CodFilme;
    private String TituloOriginal;
    private String Genero;
    private String Duracao;
    private String Impropriedade;
    private String Origem;
    private String Diretor;
   
    public int getCodFilme() {
        return CodFilme;
    }

    
    public void setCodFilme(int CodFilme) {
        this.CodFilme = CodFilme;
    }

    public String getTituloOriginal() {
        return TituloOriginal;
    }

    public void setTituloOriginal(String TituloOriginal) {
        this.TituloOriginal = TituloOriginal;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDuracao() {
        return Duracao;
    }

    public void setDuracao(String Duracao) {
        this.Duracao = Duracao;
    }

  
    public String getImpropriedade() {
        return Impropriedade;
    }

  
    public void setImpropriedade(String Impropriedade) {
        this.Impropriedade = Impropriedade;
    }

  
    public String getOrigem() {
        return Origem;
    }

  
    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public String getDiretor() {
        return Diretor;
    }

    
    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }
     @Override 
  public String toString(){
return this.getTituloOriginal();
   
  }
}
