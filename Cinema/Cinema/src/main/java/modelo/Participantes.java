
package modelo;

public class Participantes {

    /**
     * @return the Autor
     */
    public Autor getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Filme
     */
    public Filmes getFilme() {
        return Filme;
    }

    /**
     * @param Filme the Filme to set
     */
    public void setFilme(Filmes Filme) {
        this.Filme = Filme;
    }

    private int CodParticipanteFilme;
    private String Personagem;
    private String Nome;
    private String TituloOriginal;
   
    private Autor Autor;
    private Filmes Filme;
    
    public int getCodParticipanteFilme() {
        return CodParticipanteFilme;
    }

    /**
     * @param CodParticipanteFilme the CodParticipanteFilme to set
     */
    public void setCodParticipanteFilme(int CodParticipanteFilme) {
        this.CodParticipanteFilme = CodParticipanteFilme;
    }

    /**
     * @return the Personagem
     */
    public String getPersonagem() {
        return Personagem;
    }

    /**
     * @param Personagem the Personagem to set
     */
    public void setPersonagem(String Personagem) {
        this.Personagem = Personagem;
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
     * @return the TituloOriginal
     */
    public String getTituloOriginal() {
        return TituloOriginal;
    }

    /**
     * @param TituloOriginal the TituloOriginal to set
     */
    public void setTituloOriginal(String TituloOriginal) {
        this.TituloOriginal = TituloOriginal;
    }


   
}
