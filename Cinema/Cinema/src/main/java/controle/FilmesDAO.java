
package controle;

import conexao.ConectarFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Filmes;

public class FilmesDAO {
    private Connection con;
    public FilmesDAO(){
    this.con = new ConectarFactory().getConection();
}
    
    public void cadastrarFilme(Filmes obj){
        try{
            String sql = "insert into filme (tituloOriginal, genero, duracao,impropriedade,origem,diretor)"
            + "values (?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getTituloOriginal());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDuracao());
            stmt.setString(4, obj.getImpropriedade());
            stmt.setString(5, obj.getOrigem());
            stmt.setString(6, obj.getDiretor());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
    }
  public List<Filmes> listarFilme(){
        
        try{
            List<Filmes> lista = new ArrayList<>();
            
            String sql= "select * from filme";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            
            while (rs.next()){
                Filmes obj = new Filmes();
                
                obj.setCodFilme(rs.getInt("CodFilme"));
                obj.setTituloOriginal(rs.getString("TituloOriginal"));
                obj.setGenero(rs.getString("Genero"));
                obj.setDuracao(rs.getString("Duracao"));
                obj.setImpropriedade(rs.getString("Impropriedade"));
                obj.setOrigem(rs.getString("Origem"));
                obj.setDiretor(rs.getString("Diretor"));
        
            lista.add(obj);
        }
            return lista;
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar os dados!" +erro);
            return null;
        }
        }
   

public void alterarFilme (Filmes obj){
try{
    String sql= "update filme set titulooriginal=?, genero=?, duracao=?, impropriedade=? , origem=?, diretor=? where codFilme=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setString(1, obj.getTituloOriginal());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDuracao());
            stmt.setString(4, obj.getImpropriedade());
            stmt.setString(5, obj.getOrigem());
            stmt.setString(6, obj.getDiretor());
        
            stmt.setInt(7, obj.getCodFilme());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro"+ erro);
        }
  
}

public void excluirFilmes (Filmes obj){
    try{
        String sql= "delete from filme where codFilme=?";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,obj.getCodFilme());
        
        stmt.execute();
        stmt.close();
        
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao efetuar o cadastro" + erro);
    }
}


public List<Filmes> buscaCinemaPorNome (String nomefantasia){
    try{
        List<Filmes> lista = new ArrayList<>();
        
        String sql = "select * from filme where titulooriginal like?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString (1,nomefantasia);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Filmes obj = new Filmes();
        

                obj.setCodFilme(rs.getInt("CodFilme"));
                obj.setTituloOriginal(rs.getString("TituloOriginal"));
                obj.setGenero(rs.getString("Genero"));
                obj.setDuracao(rs.getString("Duracao"));
                obj.setImpropriedade(rs.getString("Impropriedade"));
                obj.setOrigem(rs.getString("Origem"));
                obj.setDiretor(rs.getString("Diretor"));

                lista.add(obj);
        }

    return lista;
}
catch (SQLException erro){
    JOptionPane.showMessageDialog(null, "Erro ao listar!" +erro);
    return null;
}
    }
}
        
