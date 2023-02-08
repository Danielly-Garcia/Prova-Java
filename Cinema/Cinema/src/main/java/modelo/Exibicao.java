
package modelo;

public class Exibicao {

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

    /**
     * @return the Cinema
     */
    public Cinemas getCinema() {
        return Cinema;
    }

    /**
     * @param Cinema the Cinema to set
     */
    public void setCinema(Cinemas Cinema) {
        this.Cinema = Cinema;
    }

    private int CodExibicao;
    private String DataI;
    private String DataF;
    
    private Cinemas Cinema;
    private Filmes Filme;
    
    public int getCodExibicao() {
        return CodExibicao;
    }

    /**
     * @param CodExibicao the CodExibicao to set
     */
    public void setCodExibicao(int CodExibicao) {
        this.CodExibicao = CodExibicao;
    }

    /**
     * @return the DataI
     */
    public String getDataI() {
        return DataI;
    }

    /**
     * @param DataI the DataI to set
     */
    public void setDataI(String DataI) {
        this.DataI = DataI;
    }

    /**
     * @return the DataF
     */
    public String getDataF() {
        return DataF;
    }

    /**
     * @param DataF the DataF to set
     */
    public void setDataF(String DataF) {
        this.DataF = DataF;
    }

 
   
}
